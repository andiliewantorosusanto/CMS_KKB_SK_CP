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
import com.CMS.CentralParam.KKBSK.excel.RateKomponenPHExcelExporter;
import com.CMS.CentralParam.KKBSK.model.REQUEST.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.RESPON.DataRateKomponenPH;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponRateKomponenPH;
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
public class RateKomponenPHController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/RateKomponenPH/InputData", method = RequestMethod.GET)
	public String RateKomponenPHInputData(DataRateKomponenPH dataRateKomponenPH) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			return "/pages/MasterParameter/RateKomponenPH/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping("/RateKomponenPH/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponRateKomponenPH> respon = restTemplate.exchange(
			apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponRateKomponenPH.class);

        List<DataRateKomponenPH> listRateKomponenPH = respon.getBody().getDataRateKomponenPH();
         
        RateKomponenPHExcelExporter excelExporter = new RateKomponenPHExcelExporter(listRateKomponenPH);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/RateKomponenPH/ActionInputData")
	public String RateKomponenPHActionInputData(@Valid DataRateKomponenPH dataRateKomponenPH, BindingResult result,String action) {
		if (result.hasErrors()) {
            return "/pages/MasterParameter/RateKomponenPH/InputData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataRateKomponenPH)), 
				String.class
			);
			
			return "redirect:/RateKomponenPH/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/RateKomponenPH/ActionApprovalData")
	public String RateKomponenPHActionApprovalData(@Valid DataRateKomponenPH dataRateKomponenPH, BindingResult result,String action) {
		if (result.hasErrors()) {
            return "/pages/MasterParameter/RateKomponenPH/ApprovalData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+HelperConf.getAction(action)+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataRateKomponenPH)), 
				String.class
			);
			
			return "redirect:/RateKomponenPH/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/RateKomponenPH/ActionData")
	public String RateKomponenPHActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/RateKomponenPH/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@PostMapping(value = "/RateKomponenPH/ActionApproval")
	public String RateKomponenPHActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/RateKomponenPH/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@RequestMapping(value = "/RateKomponenPH/EditData/{id}", method = RequestMethod.GET)
	public String RateKomponenPHEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponRateKomponenPH> respon = restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponRateKomponenPH.class
			);

			model.addAttribute("dataRateKomponenPH",respon.getBody().getRateKomponenPH());
			return "/pages/MasterParameter/RateKomponenPH/EditData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/RateKomponenPH/Data" })
	public String getListRateKomponenPH(Model model) {
		try {
			ResponseEntity<ResponRateKomponenPH> respon = restTemplate.exchange(
					apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponRateKomponenPH.class);

			model.addAttribute("listDataRateKomponenPH", respon.getBody().getDataRateKomponenPH());
			return "/pages/MasterParameter/RateKomponenPH/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/RateKomponenPH/ApprovalData" })
	public String getListApprovalRateKomponenPH(Model model) {
		try {
			ResponseEntity<ResponRateKomponenPH> respon = restTemplate.exchange(
					apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponRateKomponenPH.class);

			model.addAttribute("listDataRateKomponenPH", respon.getBody().getDataRateKomponenPH());
			return "/pages/MasterParameter/RateKomponenPH/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/RateKomponenPH/FormApprovalData/{id}", method = RequestMethod.GET)
	public String RateKomponenPHFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponRateKomponenPH> respon = restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponRateKomponenPH.class
			);

			model.addAttribute("dataRateKomponenPH",respon.getBody().getRateKomponenPH());
			return "/pages/MasterParameter/RateKomponenPH/FormApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}