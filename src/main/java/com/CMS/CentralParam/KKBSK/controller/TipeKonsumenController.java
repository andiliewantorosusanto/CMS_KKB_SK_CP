package com.CMS.CentralParam.KKBSK.controller;

import java.security.Principal;
import java.text.ParseException;

import com.CMS.CentralParam.KKBSK.config.HelperConf;
import com.CMS.CentralParam.KKBSK.model.modelTipeKonsumen;
import com.CMS.CentralParam.KKBSK.model.RESPON.DataTipeKonsumen;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponTipeKonsumen;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
public class TipeKonsumenController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/TipeKonsumen/InputData", method = RequestMethod.GET)
	public String TipeKonsumenInputData(DataTipeKonsumen dataTipeKonsumen) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			return "/pages/MasterParameter/TipeKonsumen/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/TipeKonsumen/ActionInputData")
	public String TipeKonsumenActionInputData(DataTipeKonsumen dataTipeKonsumen,String action) throws JsonProcessingException, ParseException {
		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+HelperConf.getAction(true,action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataTipeKonsumen)), 
				String.class
			);
			
			return "redirect:/TipeKonsumen/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/TipeKonsumen/EditData", method = RequestMethod.GET)
	public String TipeKonsumenEditData() {
		return "/pages/MasterParameter/TipeKonsumen/EditData";
	}

	@GetMapping(value = { "/TipeKonsumen/Data" })
	public String getListTipeKonsumen(Model model) {
		try {
			ResponseEntity<ResponTipeKonsumen> respon = restTemplate.exchange(
					apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponTipeKonsumen.class);

			model.addAttribute("listDataTipeKonsumen", respon.getBody().getDataTipeKonsumen());
			return "/pages/MasterParameter/TipeKonsumen/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/TipeKonsumen/approvaldata" })
	public String getListApprovalTipeKonsumen(String firstName, Model model, modelTipeKonsumen modelTipeKonsumen,
			Principal principal) {

		return "/pages/MasterParameter/TipeKonsumen/ApprovalData";
	}

	@RequestMapping(value = "/TipeKonsumen/FormApprovalData", method = RequestMethod.GET)
	public String TipeKonsumenFormApprovalData() {
		return "/pages/MasterParameter/TipeKonsumen/FormApprovalData";
	}

}