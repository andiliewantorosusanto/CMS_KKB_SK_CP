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
import com.CMS.CentralParam.KKBSK.excel.JenisKendaraanExcelExporter;
import com.CMS.CentralParam.KKBSK.model.data.JenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.request.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.response.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.response.ResponJenisKendaraan;
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
public class JenisKendaraanController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/JenisKendaraan/InputData", method = RequestMethod.GET)
	public String JenisKendaraanInputData(Model model) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			model.addAttribute("jenisKendaraan", new JenisKendaraan());
			
			return "pages/MasterParameter/JenisKendaraan/InputData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@GetMapping("/JenisKendaraan/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=JenisKendaraan_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponJenisKendaraan> respon = restTemplate.exchange(
			apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponJenisKendaraan.class);

        List<JenisKendaraan> listJenisKendaraan = respon.getBody().getDataJenisKendaraan();
         
        JenisKendaraanExcelExporter excelExporter = new JenisKendaraanExcelExporter(listJenisKendaraan);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/JenisKendaraan/ActionInputData")
	public String JenisKendaraanActionInputData(@Valid JenisKendaraan jenisKendaraan, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(jenisKendaraan.getEndBerlaku().before(jenisKendaraan.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.jenisKendaraan", "End date must be greater than start date");
			}
		}

		if (result.hasErrors()) {
			model.addAttribute("jenisKendaraan", jenisKendaraan);
            return "pages/MasterParameter/JenisKendaraan/InputData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/jeniskendaraan/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(jenisKendaraan)), 
				String.class
			);
			
			return "redirect:/JenisKendaraan/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@PostMapping(value = "/JenisKendaraan/ActionEditData")
	public String JenisKendaraanActionEditData(@Valid JenisKendaraan jenisKendaraan, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(jenisKendaraan.getEndBerlaku().before(jenisKendaraan.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.jenisKendaraan", "End date must be greater than start date");
			}
		}

		if (result.hasErrors()) {
			model.addAttribute("jenisKendaraan", jenisKendaraan);
            return "pages/MasterParameter/JenisKendaraan/EditData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/jeniskendaraan/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(jenisKendaraan)), 
				String.class
			);
			
			return "redirect:/JenisKendaraan/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@PostMapping(value = "/JenisKendaraan/ActionApprovalData")
	public String JenisKendaraanActionApprovalData(JenisKendaraan jenisKendaraan, BindingResult result,String action) {
		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/jeniskendaraan/"+action+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(jenisKendaraan)), 
				String.class
			);

			return "redirect:/JenisKendaraan/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@PostMapping(value = "/JenisKendaraan/ActionData")
	public String JenisKendaraanActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/jeniskendaraan/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/JenisKendaraan/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@PostMapping(value = "/JenisKendaraan/ActionApproval")
	public String JenisKendaraanActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/jeniskendaraan/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/JenisKendaraan/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@RequestMapping(value = "/JenisKendaraan/EditData/{id}", method = RequestMethod.GET)
	public String JenisKendaraanEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponJenisKendaraan> respon = restTemplate.exchange(
				apiBaseUrl+"/api/jeniskendaraan/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponJenisKendaraan.class
			);

			model.addAttribute("jenisKendaraan",respon.getBody().getJenisKendaraan());
			
			return "pages/MasterParameter/JenisKendaraan/EditData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@GetMapping(value = { "/JenisKendaraan/Data" })
	public String getListJenisKendaraan(Model model) {
		try {
			ResponseEntity<ResponJenisKendaraan> respon = restTemplate.exchange(
					apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponJenisKendaraan.class);

			model.addAttribute("listJenisKendaraan", respon.getBody().getDataJenisKendaraan());

			return "pages/MasterParameter/JenisKendaraan/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@GetMapping(value = { "/JenisKendaraan/ApprovalData" })
	public String getListApprovalJenisKendaraan(Model model) {
		try {
			ResponseEntity<ResponJenisKendaraan> respon = restTemplate.exchange(
					apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponJenisKendaraan.class);

			model.addAttribute("listJenisKendaraan", respon.getBody().getDataJenisKendaraan());
			
			return "pages/MasterParameter/JenisKendaraan/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@RequestMapping(value = "/JenisKendaraan/FormApprovalData/{id}", method = RequestMethod.GET)
	public String JenisKendaraanFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponJenisKendaraan> respon = restTemplate.exchange(
				apiBaseUrl+"/api/jeniskendaraan/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponJenisKendaraan.class
			);
			model.addAttribute("jenisKendaraan",respon.getBody().getJenisKendaraan());

			return "pages/MasterParameter/JenisKendaraan/FormApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	
}