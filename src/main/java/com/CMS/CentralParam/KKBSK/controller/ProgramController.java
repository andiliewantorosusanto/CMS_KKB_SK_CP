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
import com.CMS.CentralParam.KKBSK.excel.ProgramExcelExporter;
import com.CMS.CentralParam.KKBSK.model.REQUEST.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.RESPON.DataProgram;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponProgram;
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
public class ProgramController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/Program/InputData", method = RequestMethod.GET)
	public String ProgramInputData(DataProgram dataProgram) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			return "/pages/MasterParameter/Program/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping("/Program/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponProgram> respon = restTemplate.exchange(
			apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponProgram.class);

        List<DataProgram> listProgram = respon.getBody().getDataProgram();
         
        ProgramExcelExporter excelExporter = new ProgramExcelExporter(listProgram);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/Program/ActionInputData")
	public String ProgramActionInputData(@Valid DataProgram dataProgram, BindingResult result,String action) {
		// if(dataProgram.getEndDate().before(dataProgram.getStartDate())) {
		// 	result.rejectValue("endBerlaku", "error.dataProgram", "End date must be greater than start date");
		// }

		if (result.hasErrors()) {
            return "/pages/MasterParameter/Program/InputData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataProgram)), 
				String.class
			);
			
			return "redirect:/Program/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/Program/ActionApprovalData")
	public String ProgramActionApprovalData(@Valid DataProgram dataProgram, BindingResult result,String action) {
		if (result.hasErrors()) {
            return "/pages/MasterParameter/Program/ApprovalData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+action+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataProgram)), 
				String.class
			);
			
			return "redirect:/Program/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/Program/ActionData")
	public String ProgramActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/Program/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@PostMapping(value = "/Program/ActionApproval")
	public String ProgramActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/Program/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@RequestMapping(value = "/Program/EditData/{id}", method = RequestMethod.GET)
	public String ProgramEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponProgram> respon = restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponProgram.class
			);

			model.addAttribute("dataProgram",respon.getBody().getDataProgram());
			return "/pages/MasterParameter/Program/EditData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/Program/Data" })
	public String getListProgram(Model model) {
		try {
			ResponseEntity<ResponProgram> respon = restTemplate.exchange(
					apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponProgram.class);

			model.addAttribute("listDataProgram", respon.getBody().getDataProgram());
			return "/pages/MasterParameter/Program/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/Program/ApprovalData" })
	public String getListApprovalProgram(Model model) {
		try {
			ResponseEntity<ResponProgram> respon = restTemplate.exchange(
					apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponProgram.class);

			model.addAttribute("listDataProgram", respon.getBody().getDataProgram());
			return "/pages/MasterParameter/Program/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/Program/FormApprovalData/{id}", method = RequestMethod.GET)
	public String ProgramFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponProgram> respon = restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponProgram.class
			);

			model.addAttribute("dataProgram",respon.getBody().getDataProgram());
			return "/pages/MasterParameter/Program/FormApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}