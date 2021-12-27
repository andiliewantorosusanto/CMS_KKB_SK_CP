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
import com.CMS.CentralParam.KKBSK.excel.PerluasanAsuransiExcelExporter;
import com.CMS.CentralParam.KKBSK.model.data.PerluasanAsuransi;
import com.CMS.CentralParam.KKBSK.model.request.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.response.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.response.ResponJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.response.ResponJenisPerluasan;
import com.CMS.CentralParam.KKBSK.model.response.ResponWilayah;
import com.CMS.CentralParam.KKBSK.model.response.ResponPerluasanAsuransi;
import com.CMS.CentralParam.KKBSK.model.response.ResponTipeAsuransi;
import com.CMS.CentralParam.KKBSK.view.vwPerluasanAsuransi;
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
public class PerluasanAsuransiController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/PerluasanAsuransi/InputData", method = RequestMethod.GET)
	public String PerluasanAsuransiInputData(Model model) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			ResponseEntity<ResponWilayah> responWilayah = restTemplate.exchange(
				apiBaseUrl+"api/wilayah/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponWilayah.class);
			model.addAttribute("listWilayah",responWilayah.getBody().getDataWilayah());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());

			ResponseEntity<ResponTipeAsuransi> responTipeAsuransi = restTemplate.exchange(
				apiBaseUrl+"api/tipeasuransi/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeAsuransi.class);
			model.addAttribute("listTipeAsuransi",responTipeAsuransi.getBody().getDataTipeAsuransi());

			ResponseEntity<ResponJenisPerluasan> responJenisPerluasan = restTemplate.exchange(
				apiBaseUrl+"api/jenisperluasan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPerluasan.class);
			model.addAttribute("listJenisPerluasan",responJenisPerluasan.getBody().getDataJenisPerluasan());

			PerluasanAsuransi perluasanAsuransiForm = new PerluasanAsuransi();
			perluasanAsuransiForm.setWilayah(0);
			perluasanAsuransiForm.setJenisKendaraan(0);
			perluasanAsuransiForm.setTipeAsuransi(0);
			perluasanAsuransiForm.setJenisPerluasan(responJenisPerluasan.getBody().getDataJenisPerluasan().get(0).getId());

			model.addAttribute("perluasanAsuransi", perluasanAsuransiForm);

			return "/pages/MasterParameter/PerluasanAsuransi/InputData";
		} catch (Exception e) {
			System.out.println("Err :" + e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping("/PerluasanAsuransi/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=PerluasanAsuransi_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponPerluasanAsuransi> respon = restTemplate.exchange(
			apiBaseUrl+"api/perluasanasuransi/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponPerluasanAsuransi.class);

        List<vwPerluasanAsuransi> listPerluasanAsuransi = respon.getBody().getDataPerluasanAsuransi();
         
        PerluasanAsuransiExcelExporter excelExporter = new PerluasanAsuransiExcelExporter(listPerluasanAsuransi);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/PerluasanAsuransi/ActionInputData")
	public String PerluasanAsuransiActionInputData(@Valid PerluasanAsuransi perluasanAsuransi, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(perluasanAsuransi.getEndBerlaku().before(perluasanAsuransi.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.perluasanAsuransi", "End date must be greater than start date");
			}
		}

		if (result.hasErrors()) {
			ResponseEntity<ResponWilayah> responWilayah = restTemplate.exchange(
				apiBaseUrl+"api/wilayah/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponWilayah.class);
			model.addAttribute("listWilayah",responWilayah.getBody().getDataWilayah());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());

			ResponseEntity<ResponTipeAsuransi> responTipeAsuransi = restTemplate.exchange(
				apiBaseUrl+"api/tipeasuransi/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeAsuransi.class);
			model.addAttribute("listTipeAsuransi",responTipeAsuransi.getBody().getDataTipeAsuransi());

			ResponseEntity<ResponJenisPerluasan> responJenisPerluasan = restTemplate.exchange(
				apiBaseUrl+"api/jenisperluasan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPerluasan.class);
			model.addAttribute("listJenisPerluasan",responJenisPerluasan.getBody().getDataJenisPerluasan());
			model.addAttribute("perluasanAsuransi", perluasanAsuransi);
            return "/pages/MasterParameter/PerluasanAsuransi/InputData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/perluasanasuransi/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(perluasanAsuransi)), 
				String.class
			);
			return "redirect:/PerluasanAsuransi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/PerluasanAsuransi/ActionEditData")
	public String PerluasanAsuransiActionEditData(@Valid PerluasanAsuransi perluasanAsuransi, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(perluasanAsuransi.getEndBerlaku().before(perluasanAsuransi.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.perluasanAsuransi", "End date must be greater than start date");
			}
		}

		if (result.hasErrors()) {
			ResponseEntity<ResponWilayah> responWilayah = restTemplate.exchange(
				apiBaseUrl+"api/wilayah/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponWilayah.class);
			model.addAttribute("listWilayah",responWilayah.getBody().getDataWilayah());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());

			ResponseEntity<ResponTipeAsuransi> responTipeAsuransi = restTemplate.exchange(
				apiBaseUrl+"api/tipeasuransi/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeAsuransi.class);
			model.addAttribute("listTipeAsuransi",responTipeAsuransi.getBody().getDataTipeAsuransi());

			ResponseEntity<ResponJenisPerluasan> responJenisPerluasan = restTemplate.exchange(
				apiBaseUrl+"api/jenisperluasan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPerluasan.class);
			model.addAttribute("listJenisPerluasan",responJenisPerluasan.getBody().getDataJenisPerluasan());
			model.addAttribute("perluasanAsuransi", perluasanAsuransi);
            return "/pages/MasterParameter/PerluasanAsuransi/EditData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/perluasanasuransi/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(perluasanAsuransi)), 
				String.class
			);
			
			return "redirect:/PerluasanAsuransi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/PerluasanAsuransi/ActionApprovalData")
	public String PerluasanAsuransiActionApprovalData(PerluasanAsuransi perluasanAsuransi, BindingResult result,String action) {
		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/perluasanasuransi/"+action+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(perluasanAsuransi)), 
				String.class
			);

			return "redirect:/PerluasanAsuransi/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/PerluasanAsuransi/ActionData")
	public String PerluasanAsuransiActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/perluasanasuransi/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/PerluasanAsuransi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/PerluasanAsuransi/ActionApproval")
	public String PerluasanAsuransiActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/perluasanasuransi/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/PerluasanAsuransi/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/PerluasanAsuransi/EditData/{id}", method = RequestMethod.GET)
	public String PerluasanAsuransiEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponPerluasanAsuransi> respon = restTemplate.exchange(
				apiBaseUrl+"/api/perluasanasuransi/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponPerluasanAsuransi.class
			);
			System.out.println("testing");
			System.out.println("test : " + respon.getBody().getPerluasanAsuransi());
			model.addAttribute("perluasanAsuransi",respon.getBody().getPerluasanAsuransi());

			ResponseEntity<ResponWilayah> responWilayah = restTemplate.exchange(
				apiBaseUrl+"api/wilayah/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponWilayah.class);
			model.addAttribute("listWilayah",responWilayah.getBody().getDataWilayah());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());

			ResponseEntity<ResponTipeAsuransi> responTipeAsuransi = restTemplate.exchange(
				apiBaseUrl+"api/tipeasuransi/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeAsuransi.class);
			model.addAttribute("listTipeAsuransi",responTipeAsuransi.getBody().getDataTipeAsuransi());

			ResponseEntity<ResponJenisPerluasan> responJenisPerluasan = restTemplate.exchange(
				apiBaseUrl+"api/jenisperluasan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPerluasan.class);
			model.addAttribute("listJenisPerluasan",responJenisPerluasan.getBody().getDataJenisPerluasan());
			
			return "/pages/MasterParameter/PerluasanAsuransi/EditData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/PerluasanAsuransi/Data" })
	public String getListPerluasanAsuransi(Model model) {
		try {
			ResponseEntity<ResponPerluasanAsuransi> respon = restTemplate.exchange(
					apiBaseUrl+"api/perluasanasuransi/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponPerluasanAsuransi.class);

			model.addAttribute("listPerluasanAsuransi", respon.getBody().getDataPerluasanAsuransi());

			return "/pages/MasterParameter/PerluasanAsuransi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/PerluasanAsuransi/ApprovalData" })
	public String getListApprovalPerluasanAsuransi(Model model) {
		try {
			ResponseEntity<ResponPerluasanAsuransi> respon = restTemplate.exchange(
					apiBaseUrl+"api/perluasanasuransi/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponPerluasanAsuransi.class);

			model.addAttribute("listPerluasanAsuransi", respon.getBody().getDataPerluasanAsuransi());
			
			return "/pages/MasterParameter/PerluasanAsuransi/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/PerluasanAsuransi/FormApprovalData/{id}", method = RequestMethod.GET)
	public String PerluasanAsuransiApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponPerluasanAsuransi> respon = restTemplate.exchange(
				apiBaseUrl+"/api/perluasanasuransi/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponPerluasanAsuransi.class
			);
			model.addAttribute("perluasanAsuransi",respon.getBody().getPerluasanAsuransi());

			ResponseEntity<ResponWilayah> responWilayah = restTemplate.exchange(
				apiBaseUrl+"api/wilayah/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponWilayah.class);
			model.addAttribute("listWilayah",responWilayah.getBody().getDataWilayah());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());

			ResponseEntity<ResponTipeAsuransi> responTipeAsuransi = restTemplate.exchange(
				apiBaseUrl+"api/tipeasuransi/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeAsuransi.class);
			model.addAttribute("listTipeAsuransi",responTipeAsuransi.getBody().getDataTipeAsuransi());

			ResponseEntity<ResponJenisPerluasan> responJenisPerluasan = restTemplate.exchange(
				apiBaseUrl+"api/jenisperluasan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPerluasan.class);
			model.addAttribute("listJenisPerluasan",responJenisPerluasan.getBody().getDataJenisPerluasan());

			return "/pages/MasterParameter/PerluasanAsuransi/FormApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}