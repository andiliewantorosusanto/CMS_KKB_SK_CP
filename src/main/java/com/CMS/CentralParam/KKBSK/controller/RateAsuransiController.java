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
import com.CMS.CentralParam.KKBSK.model.REQUEST.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.RESPON.DataRateAsuransi;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponRateAsuransi;
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
	public String RateAsuransiInputData(DataRateAsuransi dataRateAsuransi) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
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
        String headerValue = "attachment; filename=users_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponRateAsuransi> respon = restTemplate.exchange(
			apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponRateAsuransi.class);

        List<DataRateAsuransi> listRateAsuransi = respon.getBody().getDataRateAsuransi();
         
        RateAsuransiExcelExporter excelExporter = new RateAsuransiExcelExporter(listRateAsuransi);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/RateAsuransi/ActionInputData")
	public String RateAsuransiActionInputData(@Valid DataRateAsuransi dataRateAsuransi, BindingResult result,String action) {
		if (result.hasErrors()) {
            return "/pages/MasterParameter/RateAsuransi/InputData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+HelperConf.getAction(action), 
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
	public String RateAsuransiActionApprovalData(@Valid DataRateAsuransi dataRateAsuransi, BindingResult result,String action) {
		if (result.hasErrors()) {
            return "/pages/MasterParameter/RateAsuransi/ApprovalData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+HelperConf.getAction(action)+"Data", 
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
				apiBaseUrl+"/api/tipekonsumen/"+action, 
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
				apiBaseUrl+"/api/tipekonsumen/"+action, 
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
				apiBaseUrl+"/api/tipekonsumen/"+id, 
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
					apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
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
					apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
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
				apiBaseUrl+"/api/tipekonsumen/"+id, 
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