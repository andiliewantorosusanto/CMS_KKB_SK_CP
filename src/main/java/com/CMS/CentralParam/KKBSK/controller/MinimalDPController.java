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
import com.CMS.CentralParam.KKBSK.excel.MinimalDPExcelExporter;
import com.CMS.CentralParam.KKBSK.model.REQUEST.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.RESPON.DataMinimalDP;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponMinimalDP;
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
public class MinimalDPController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/MinimalDP/InputData", method = RequestMethod.GET)
	public String MinimalDPInputData(DataMinimalDP dataMinimalDP) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			return "/pages/MasterParameter/MinimalDP/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping("/MinimalDP/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponMinimalDP> respon = restTemplate.exchange(
			apiBaseUrl+"api/minimaldp/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponMinimalDP.class);

        List<DataMinimalDP> listMinimalDP = respon.getBody().getDataMinimalDP();
         
        MinimalDPExcelExporter excelExporter = new MinimalDPExcelExporter(listMinimalDP);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/MinimalDP/ActionInputData")
	public String MinimalDPActionInputData(@Valid DataMinimalDP dataMinimalDP, BindingResult result,String action) {
		if (result.hasErrors()) {
            return "/pages/MasterParameter/MinimalDP/InputData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/minimaldp/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataMinimalDP)), 
				String.class
			);
			
			return "redirect:/MinimalDP/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/MinimalDP/ActionApprovalData")
	public String MinimalDPActionApprovalData(@Valid DataMinimalDP dataMinimalDP, BindingResult result,String action) {
		if (result.hasErrors()) {
            return "/pages/MasterParameter/MinimalDP/ApprovalData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/minimaldp/"+HelperConf.getAction(action)+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataMinimalDP)), 
				String.class
			);
			
			return "redirect:/MinimalDP/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/MinimalDP/ActionData")
	public String MinimalDPActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/minimaldp/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/MinimalDP/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@PostMapping(value = "/MinimalDP/ActionApproval")
	public String MinimalDPActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/minimaldp/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/MinimalDP/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@RequestMapping(value = "/MinimalDP/EditData/{id}", method = RequestMethod.GET)
	public String MinimalDPEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponMinimalDP> respon = restTemplate.exchange(
				apiBaseUrl+"/api/minimaldp/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponMinimalDP.class
			);

			model.addAttribute("dataMinimalDP",respon.getBody().getDataMinimalDP());
			return "/pages/MasterParameter/MinimalDP/EditData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/MinimalDP/Data" })
	public String getListMinimalDP(Model model) {
		try {
			ResponseEntity<ResponMinimalDP> respon = restTemplate.exchange(
					apiBaseUrl+"api/minimaldp/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponMinimalDP.class);

			model.addAttribute("listDataMinimalDP", respon.getBody().getDataMinimalDP());
			return "/pages/MasterParameter/MinimalDP/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/MinimalDP/ApprovalData" })
	public String getListApprovalMinimalDP(Model model) {
		try {
			ResponseEntity<ResponMinimalDP> respon = restTemplate.exchange(
					apiBaseUrl+"api/minimaldp/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponMinimalDP.class);

			model.addAttribute("listDataMinimalDP", respon.getBody().getDataMinimalDP());
			return "/pages/MasterParameter/MinimalDP/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/MinimalDP/FormApprovalData/{id}", method = RequestMethod.GET)
	public String MinimalDPFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponMinimalDP> respon = restTemplate.exchange(
				apiBaseUrl+"/api/minimaldp/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponMinimalDP.class
			);

			model.addAttribute("dataMinimalDP",respon.getBody().getDataMinimalDP());
			return "/pages/MasterParameter/MinimalDP/FormApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}