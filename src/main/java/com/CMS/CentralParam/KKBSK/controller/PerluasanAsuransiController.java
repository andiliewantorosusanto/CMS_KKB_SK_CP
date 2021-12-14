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
import com.CMS.CentralParam.KKBSK.model.REQUEST.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.RESPON.DataPerluasanAsuransi;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponPerluasanAsuransi;
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
	public String PerluasanAsuransiInputData(DataPerluasanAsuransi dataPerluasanAsuransi) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			return "/pages/MasterParameter/PerluasanAsuransi/InputData";
		} catch (Exception e) {
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
        String headerValue = "attachment; filename=users_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponPerluasanAsuransi> respon = restTemplate.exchange(
			apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponPerluasanAsuransi.class);

        List<DataPerluasanAsuransi> listPerluasanAsuransi = respon.getBody().getDataPerluasanAsuransi();
         
        PerluasanAsuransiExcelExporter excelExporter = new PerluasanAsuransiExcelExporter(listPerluasanAsuransi);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/PerluasanAsuransi/ActionInputData")
	public String PerluasanAsuransiActionInputData(@Valid DataPerluasanAsuransi dataPerluasanAsuransi, BindingResult result,String action) {
		if (result.hasErrors()) {
            return "/pages/MasterParameter/PerluasanAsuransi/InputData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataPerluasanAsuransi)), 
				String.class
			);
			
			return "redirect:/PerluasanAsuransi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/PerluasanAsuransi/ActionApprovalData")
	public String PerluasanAsuransiActionApprovalData(@Valid DataPerluasanAsuransi dataPerluasanAsuransi, BindingResult result,String action) {
		if (result.hasErrors()) {
            return "/pages/MasterParameter/PerluasanAsuransi/ApprovalData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+HelperConf.getAction(action)+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataPerluasanAsuransi)), 
				String.class
			);
			
			return "redirect:/PerluasanAsuransi/Data";
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
				apiBaseUrl+"/api/tipekonsumen/"+action, 
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
				apiBaseUrl+"/api/tipekonsumen/"+action, 
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
				apiBaseUrl+"/api/tipekonsumen/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponPerluasanAsuransi.class
			);

			model.addAttribute("dataPerluasanAsuransi",respon.getBody().getDataPerluasanAsuransi());
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
					apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponPerluasanAsuransi.class);

			model.addAttribute("listDataPerluasanAsuransi", respon.getBody().getDataPerluasanAsuransi());
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
					apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponPerluasanAsuransi.class);

			model.addAttribute("listDataPerluasanAsuransi", respon.getBody().getDataPerluasanAsuransi());
			return "/pages/MasterParameter/PerluasanAsuransi/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/PerluasanAsuransi/FormApprovalData/{id}", method = RequestMethod.GET)
	public String PerluasanAsuransiFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponPerluasanAsuransi> respon = restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponPerluasanAsuransi.class
			);

			model.addAttribute("dataPerluasanAsuransi",respon.getBody().getDataPerluasanAsuransi());
			return "/pages/MasterParameter/PerluasanAsuransi/FormApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}