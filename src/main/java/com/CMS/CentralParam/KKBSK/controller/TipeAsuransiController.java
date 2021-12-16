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
import com.CMS.CentralParam.KKBSK.excel.TipeAsuransiExcelExporter;
import com.CMS.CentralParam.KKBSK.model.REQUEST.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.RESPON.DataTipeAsuransi;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponTipeAsuransi;
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
public class TipeAsuransiController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/TipeAsuransi/InputData", method = RequestMethod.GET)
	public String TipeAsuransiInputData(DataTipeAsuransi dataTipeAsuransi) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			return "/pages/MasterParameter/TipeAsuransi/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping("/TipeAsuransi/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponTipeAsuransi> respon = restTemplate.exchange(
			apiBaseUrl+"api/tipeasuransi/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponTipeAsuransi.class);

        List<DataTipeAsuransi> listTipeAsuransi = respon.getBody().getDataTipeAsuransi();
         
        TipeAsuransiExcelExporter excelExporter = new TipeAsuransiExcelExporter(listTipeAsuransi);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/TipeAsuransi/ActionInputData")
	public String TipeAsuransiActionInputData(@Valid DataTipeAsuransi dataTipeAsuransi, BindingResult result,String action) {
		if(dataTipeAsuransi.getEndBerlaku().before(dataTipeAsuransi.getStartBerlaku())) {
			result.rejectValue("endBerlaku", "error.dataTipeAsuransi", "End date must be greater than start date");
		}
		if (result.hasErrors()) {
            return "/pages/MasterParameter/TipeAsuransi/InputData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/tipeasuransi/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataTipeAsuransi)), 
				String.class
			);
			
			return "redirect:/TipeAsuransi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/TipeAsuransi/ActionApprovalData")
	public String TipeAsuransiActionApprovalData(@Valid DataTipeAsuransi dataTipeAsuransi, BindingResult result,String action) {
		if (result.hasErrors()) {
            return "/pages/MasterParameter/TipeAsuransi/ApprovalData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/tipeasuransi/"+action+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataTipeAsuransi)), 
				String.class
			);
			
			return "redirect:/TipeAsuransi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/TipeAsuransi/ActionData")
	public String TipeAsuransiActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/tipeasuransi/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/TipeAsuransi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@PostMapping(value = "/TipeAsuransi/ActionApproval")
	public String TipeAsuransiActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/tipeasuransi/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/TipeAsuransi/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@RequestMapping(value = "/TipeAsuransi/EditData/{id}", method = RequestMethod.GET)
	public String TipeAsuransiEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponTipeAsuransi> respon = restTemplate.exchange(
				apiBaseUrl+"/api/tipeasuransi/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponTipeAsuransi.class
			);

			model.addAttribute("dataTipeAsuransi",respon.getBody().getTipeAsuransi());
			return "/pages/MasterParameter/TipeAsuransi/EditData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/TipeAsuransi/Data" })
	public String getListTipeAsuransi(Model model) {
		try {
			ResponseEntity<ResponTipeAsuransi> respon = restTemplate.exchange(
					apiBaseUrl+"api/tipeasuransi/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponTipeAsuransi.class);

			model.addAttribute("listDataTipeAsuransi", respon.getBody().getDataTipeAsuransi());
			System.out.println("data :"+respon.getBody().getDataTipeAsuransi().get(1).toString());

			return "/pages/MasterParameter/TipeAsuransi/Data";
		} catch (Exception e) {
			System.out.println("error :"+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/TipeAsuransi/ApprovalData" })
	public String getListApprovalTipeAsuransi(Model model) {
		try {
			ResponseEntity<ResponTipeAsuransi> respon = restTemplate.exchange(
					apiBaseUrl+"api/tipeasuransi/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponTipeAsuransi.class);

			model.addAttribute("listDataTipeAsuransi", respon.getBody().getDataTipeAsuransi());
			return "/pages/MasterParameter/TipeAsuransi/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/TipeAsuransi/FormApprovalData/{id}", method = RequestMethod.GET)
	public String TipeAsuransiFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponTipeAsuransi> respon = restTemplate.exchange(
				apiBaseUrl+"/api/tipeasuransi/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponTipeAsuransi.class
			);

			model.addAttribute("dataTipeAsuransi",respon.getBody().getTipeAsuransi());
			return "/pages/MasterParameter/TipeAsuransi/FormApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}