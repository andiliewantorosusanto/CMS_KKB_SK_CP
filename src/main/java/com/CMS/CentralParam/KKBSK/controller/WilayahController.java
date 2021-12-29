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
import com.CMS.CentralParam.KKBSK.excel.WilayahExcelExporter;
import com.CMS.CentralParam.KKBSK.model.data.Wilayah;
import com.CMS.CentralParam.KKBSK.model.request.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.response.ResponCekToken;
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
public class WilayahController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/Wilayah/InputData", method = RequestMethod.GET)
	public String WilayahInputData(Model model) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			model.addAttribute("wilayah", new Wilayah());
			
			return "/pages/MasterParameter/Wilayah/InputData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping("/Wilayah/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=Wilayah_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponWilayah> respon = restTemplate.exchange(
			apiBaseUrl+"api/wilayah/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponWilayah.class);

        List<Wilayah> listWilayah = respon.getBody().getDataWilayah();
         
        WilayahExcelExporter excelExporter = new WilayahExcelExporter(listWilayah);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/Wilayah/ActionInputData")
	public String WilayahActionInputData(@Valid Wilayah wilayah, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(wilayah.getEndBerlaku().before(wilayah.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.wilayah", "End date must be greater than start date");
			}
		}

		if (result.hasErrors()) {
			model.addAttribute("wilayah", wilayah);
            return "/pages/MasterParameter/Wilayah/InputData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/wilayah/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(wilayah)), 
				String.class
			);
			
			return "redirect:/Wilayah/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/Wilayah/ActionEditData")
	public String WilayahActionEditData(@Valid Wilayah wilayah, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(wilayah.getEndBerlaku().before(wilayah.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.wilayah", "End date must be greater than start date");
			}
		}

		if (result.hasErrors()) {
			model.addAttribute("wilayah", wilayah);
            return "/pages/MasterParameter/Wilayah/EditData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/wilayah/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(wilayah)), 
				String.class
			);
			
			return "redirect:/Wilayah/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/Wilayah/ActionApprovalData")
	public String WilayahActionApprovalData(Wilayah wilayah, BindingResult result,String action) {
		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/wilayah/"+action+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(wilayah)), 
				String.class
			);

			return "redirect:/Wilayah/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/Wilayah/ActionData")
	public String WilayahActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/wilayah/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/Wilayah/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/Wilayah/ActionApproval")
	public String WilayahActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/wilayah/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/Wilayah/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/Wilayah/EditData/{id}", method = RequestMethod.GET)
	public String WilayahEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponWilayah> respon = restTemplate.exchange(
				apiBaseUrl+"/api/wilayah/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponWilayah.class
			);

			model.addAttribute("wilayah",respon.getBody().getWilayah());
			
			return "/pages/MasterParameter/Wilayah/EditData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/Wilayah/Data" })
	public String getListWilayah(Model model) {
		try {
			ResponseEntity<ResponWilayah> respon = restTemplate.exchange(
					apiBaseUrl+"api/wilayah/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponWilayah.class);

			model.addAttribute("listWilayah", respon.getBody().getDataWilayah());

			return "/pages/MasterParameter/Wilayah/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/Wilayah/ApprovalData" })
	public String getListApprovalWilayah(Model model) {
		try {
			ResponseEntity<ResponWilayah> respon = restTemplate.exchange(
					apiBaseUrl+"api/wilayah/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponWilayah.class);

			model.addAttribute("listWilayah", respon.getBody().getDataWilayah());
			
			return "/pages/MasterParameter/Wilayah/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/Wilayah/FormApprovalData/{id}", method = RequestMethod.GET)
	public String WilayahFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponWilayah> respon = restTemplate.exchange(
				apiBaseUrl+"/api/wilayah/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponWilayah.class
			);
			model.addAttribute("wilayah",respon.getBody().getWilayah());

			return "/pages/MasterParameter/Wilayah/FormApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}