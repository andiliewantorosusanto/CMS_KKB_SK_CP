package com.CMS.CentralParam.KKBSK.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.CMS.CentralParam.KKBSK.config.HelperConf;
import com.CMS.CentralParam.KKBSK.excel.RateAsuransiExcelExporter;
import com.CMS.CentralParam.KKBSK.model.data.RateAsuransi;
import com.CMS.CentralParam.KKBSK.model.request.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.response.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.response.ResponJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.response.ResponJenisPembiayaan;
import com.CMS.CentralParam.KKBSK.model.response.ResponRateAsuransi;
import com.CMS.CentralParam.KKBSK.model.response.ResponTipeAsuransi;
import com.CMS.CentralParam.KKBSK.model.response.ResponWilayah;
import com.fasterxml.jackson.databind.ObjectMapper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class RateAsuransiController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/RateAsuransi/InputData", method = RequestMethod.GET)
	public String RateAsuransiInputData(RateAsuransi dataRateAsuransi,Model model) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			ResponseEntity<ResponWilayah> responWilayah = restTemplate.exchange(
				apiBaseUrl+"api/wilayah/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponWilayah.class);
			model.addAttribute("listDataWilayah",responWilayah.getBody().getDataWilayah());

			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listDataJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listDataJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());

			ResponseEntity<ResponTipeAsuransi> responTipeAsuransi = restTemplate.exchange(
				apiBaseUrl+"api/tipeasuransi/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeAsuransi.class);
			model.addAttribute("listDataTipeAsuransi",responTipeAsuransi.getBody().getDataTipeAsuransi());

			return "/pages/MasterParameter/RateAsuransi/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping("/RateAsuransi/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=RateAsuransi_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponRateAsuransi> respon = restTemplate.exchange(
			apiBaseUrl+"api/rateasuransi/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponRateAsuransi.class);

        List<RateAsuransi> listRateAsuransi = respon.getBody().getDataRateAsuransi();
         
        RateAsuransiExcelExporter excelExporter = new RateAsuransiExcelExporter(listRateAsuransi);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/RateAsuransi/ActionInputData")
	public String RateAsuransiActionInputData(@Valid RateAsuransi dataRateAsuransi, BindingResult result,String action) {
		if(dataRateAsuransi.getEndBerlaku().before(dataRateAsuransi.getStartBerlaku())) {
			result.rejectValue("endBerlaku", "error.dataRateAsuransi", "End date must be greater than start date");
		}
		
		if (result.hasErrors()) {
            return "/pages/MasterParameter/RateAsuransi/InputData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/rateasuransi/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataRateAsuransi)), 
				String.class
			);
			
			return "redirect:/RateAsuransi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/RateAsuransi/ActionApprovalData")
	public String RateAsuransiActionApprovalData(@Valid RateAsuransi dataRateAsuransi, BindingResult result,String action) {
		if (result.hasErrors()) {
            return "/pages/MasterParameter/RateAsuransi/ApprovalData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/rateasuransi/"+action+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataRateAsuransi)), 
				String.class
			);
			
			return "redirect:/RateAsuransi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/RateAsuransi/ActionData")
	public String RateAsuransiActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/rateasuransi/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/RateAsuransi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@PostMapping(value = "/RateAsuransi/ActionApproval")
	public String RateAsuransiActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/rateasuransi/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/RateAsuransi/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@RequestMapping(value = "/RateAsuransi/EditData/{id}", method = RequestMethod.GET)
	public String RateAsuransiEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponRateAsuransi> respon = restTemplate.exchange(
				apiBaseUrl+"/api/rateasuransi/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponRateAsuransi.class
			);

			model.addAttribute("dataRateAsuransi",respon.getBody().getDataRateAsuransi());
			return "/pages/MasterParameter/RateAsuransi/EditData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/RateAsuransi/Data" })
	public String getListRateAsuransi(Model model) {
		try {
			ResponseEntity<ResponRateAsuransi> respon = restTemplate.exchange(
					apiBaseUrl+"api/rateasuransi/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponRateAsuransi.class);

			model.addAttribute("listDataRateAsuransi", respon.getBody().getDataRateAsuransi());
			
			return "/pages/MasterParameter/RateAsuransi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/RateAsuransi/ApprovalData" })
	public String getListApprovalRateAsuransi(Model model) {
		try {
			ResponseEntity<ResponRateAsuransi> respon = restTemplate.exchange(
					apiBaseUrl+"api/rateasuransi/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponRateAsuransi.class);

			model.addAttribute("listDataRateAsuransi", respon.getBody().getDataRateAsuransi());
			return "/pages/MasterParameter/RateAsuransi/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/RateAsuransi/FormApprovalData/{id}", method = RequestMethod.GET)
	public String RateAsuransiFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponRateAsuransi> respon = restTemplate.exchange(
				apiBaseUrl+"/api/rateasuransi/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponRateAsuransi.class
			);

			model.addAttribute("dataRateAsuransi",respon.getBody().getDataRateAsuransi());
			return "/pages/MasterParameter/RateAsuransi/FormApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}