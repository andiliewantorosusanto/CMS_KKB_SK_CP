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
import com.CMS.CentralParam.KKBSK.excel.BiayaFidusiaExcelExporter;
import com.CMS.CentralParam.KKBSK.model.data.BiayaFidusia;
import com.CMS.CentralParam.KKBSK.model.request.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.response.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.response.ResponBiayaFidusia;
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
public class BiayaFidusiaController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/BiayaFidusia/InputData", method = RequestMethod.GET)
	public String BiayaFidusiaInputData(Model model) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			model.addAttribute("biayaFidusia", new BiayaFidusia());
			
			return "pages/MasterParameter/BiayaFidusia/InputData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@GetMapping("/BiayaFidusia/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=BiayaFidusia_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponBiayaFidusia> respon = restTemplate.exchange(
			apiBaseUrl+"api/biayafidusia/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponBiayaFidusia.class);

        List<BiayaFidusia> listBiayaFidusia = respon.getBody().getDataBiayaFidusia();
         
        BiayaFidusiaExcelExporter excelExporter = new BiayaFidusiaExcelExporter(listBiayaFidusia);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/BiayaFidusia/ActionInputData")
	public String BiayaFidusiaActionInputData(@Valid BiayaFidusia biayaFidusia, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(biayaFidusia.getEndPh() < biayaFidusia.getStartPh() ) {
				result.rejectValue("endPh", "error.biayaFidusia", "End Ph must be greater than start ph");
			}
		}

		if (result.hasErrors()) {
			model.addAttribute("biayaFidusia", biayaFidusia);
            return "pages/MasterParameter/BiayaFidusia/InputData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/biayafidusia/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(biayaFidusia)), 
				String.class
			);
			
			return "redirect:/BiayaFidusia/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@PostMapping(value = "/BiayaFidusia/ActionEditData")
	public String BiayaFidusiaActionEditData(@Valid BiayaFidusia biayaFidusia, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(biayaFidusia.getEndPh() < biayaFidusia.getStartPh() ) {
				result.rejectValue("endPh", "error.biayaFidusia", "End Ph must be greater than start ph");
			}
		}

		if (result.hasErrors()) {
			model.addAttribute("biayaFidusia", biayaFidusia);
            return "pages/MasterParameter/BiayaFidusia/EditData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/biayafidusia/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(biayaFidusia)), 
				String.class
			);
			
			return "redirect:/BiayaFidusia/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@PostMapping(value = "/BiayaFidusia/ActionApprovalData")
	public String BiayaFidusiaActionApprovalData(BiayaFidusia biayaFidusia, BindingResult result,String action) {
		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/biayafidusia/"+action+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(biayaFidusia)), 
				String.class
			);

			return "redirect:/BiayaFidusia/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@PostMapping(value = "/BiayaFidusia/ActionData")
	public String BiayaFidusiaActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/biayafidusia/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/BiayaFidusia/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@PostMapping(value = "/BiayaFidusia/ActionApproval")
	public String BiayaFidusiaActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/biayafidusia/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/BiayaFidusia/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@RequestMapping(value = "/BiayaFidusia/EditData/{id}", method = RequestMethod.GET)
	public String BiayaFidusiaEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponBiayaFidusia> respon = restTemplate.exchange(
				apiBaseUrl+"/api/biayafidusia/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponBiayaFidusia.class
			);

			model.addAttribute("biayaFidusia",respon.getBody().getBiayaFidusia());
			
			return "pages/MasterParameter/BiayaFidusia/EditData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@GetMapping(value = { "/BiayaFidusia/Data" })
	public String getListBiayaFidusia(Model model) {
		try {
			ResponseEntity<ResponBiayaFidusia> respon = restTemplate.exchange(
					apiBaseUrl+"api/biayafidusia/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponBiayaFidusia.class);

			model.addAttribute("listBiayaFidusia", respon.getBody().getDataBiayaFidusia());

			return "pages/MasterParameter/BiayaFidusia/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@GetMapping(value = { "/BiayaFidusia/ApprovalData" })
	public String getListApprovalBiayaFidusia(Model model) {
		try {
			ResponseEntity<ResponBiayaFidusia> respon = restTemplate.exchange(
					apiBaseUrl+"api/biayafidusia/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponBiayaFidusia.class);

			model.addAttribute("listBiayaFidusia", respon.getBody().getDataBiayaFidusia());
			
			return "pages/MasterParameter/BiayaFidusia/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@RequestMapping(value = "/BiayaFidusia/FormApprovalData/{id}", method = RequestMethod.GET)
	public String BiayaFidusiaFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponBiayaFidusia> respon = restTemplate.exchange(
				apiBaseUrl+"/api/biayafidusia/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponBiayaFidusia.class
			);
			model.addAttribute("biayaFidusia",respon.getBody().getBiayaFidusia());

			return "pages/MasterParameter/BiayaFidusia/FormApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	
}