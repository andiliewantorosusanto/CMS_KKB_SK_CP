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
import com.CMS.CentralParam.KKBSK.excel.KomponenPHExcelExporter;
import com.CMS.CentralParam.KKBSK.model.REQUEST.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.RESPON.DataKomponenPH;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponKomponenPH;
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
public class KomponenPHController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/KomponenPH/InputData", method = RequestMethod.GET)
	public String KomponenPHInputData(DataKomponenPH dataKomponenPH) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			return "/pages/MasterParameter/KomponenPH/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping("/KomponenPH/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponKomponenPH> respon = restTemplate.exchange(
			apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponKomponenPH.class);

        List<DataKomponenPH> listKomponenPH = respon.getBody().getDataKomponenPH();
         
        KomponenPHExcelExporter excelExporter = new KomponenPHExcelExporter(listKomponenPH);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/KomponenPH/ActionInputData")
	public String KomponenPHActionInputData(@Valid DataKomponenPH dataKomponenPH, BindingResult result,String action) {
		// if(dataKomponenPH.getEndBerlaku().before(dataKomponenPH.getStartBerlaku())) {
		// 	result.rejectValue("endBerlaku", "error.dataKomponenPH", "End date must be greater than start date");
		// }

		if (result.hasErrors()) {
            return "/pages/MasterParameter/KomponenPH/InputData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataKomponenPH)), 
				String.class
			);
			
			return "redirect:/KomponenPH/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/KomponenPH/ActionApprovalData")
	public String KomponenPHActionApprovalData(@Valid DataKomponenPH dataKomponenPH, BindingResult result,String action) {
		if (result.hasErrors()) {
            return "/pages/MasterParameter/KomponenPH/ApprovalData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+action+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataKomponenPH)), 
				String.class
			);
			
			return "redirect:/KomponenPH/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/KomponenPH/ActionData")
	public String KomponenPHActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/KomponenPH/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@PostMapping(value = "/KomponenPH/ActionApproval")
	public String KomponenPHActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/KomponenPH/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@RequestMapping(value = "/KomponenPH/EditData/{id}", method = RequestMethod.GET)
	public String KomponenPHEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponKomponenPH> respon = restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponKomponenPH.class
			);

			model.addAttribute("dataKomponenPH",respon.getBody().getDataKomponenPH());
			return "/pages/MasterParameter/KomponenPH/EditData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/KomponenPH/Data" })
	public String getListKomponenPH(Model model) {
		try {
			ResponseEntity<ResponKomponenPH> respon = restTemplate.exchange(
					apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponKomponenPH.class);

			model.addAttribute("listDataKomponenPH", respon.getBody().getDataKomponenPH());
			return "/pages/MasterParameter/KomponenPH/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/KomponenPH/ApprovalData" })
	public String getListApprovalKomponenPH(Model model) {
		try {
			ResponseEntity<ResponKomponenPH> respon = restTemplate.exchange(
					apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponKomponenPH.class);

			model.addAttribute("listDataKomponenPH", respon.getBody().getDataKomponenPH());
			return "/pages/MasterParameter/KomponenPH/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/KomponenPH/FormApprovalData/{id}", method = RequestMethod.GET)
	public String KomponenPHFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponKomponenPH> respon = restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponKomponenPH.class
			);

			model.addAttribute("dataKomponenPH",respon.getBody().getDataKomponenPH());
			return "/pages/MasterParameter/KomponenPH/FormApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}