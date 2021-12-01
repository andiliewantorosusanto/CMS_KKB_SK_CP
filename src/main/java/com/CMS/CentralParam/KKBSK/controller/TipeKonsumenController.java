package com.CMS.CentralParam.KKBSK.controller;

import java.security.Principal;
import java.text.ParseException;
import java.util.Arrays;

import javax.servlet.http.HttpSession;

import com.CMS.CentralParam.KKBSK.config.HelperConf;
import com.CMS.CentralParam.KKBSK.model.modelTipeKonsumen;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponTipeKonsumen;
import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
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

	@RequestMapping(value = "/TipeKonsumen/InputData", method = RequestMethod.GET)
	public String TipeKonsumenInputData(Model model,String firstName,
	Principal principal, String role, Authentication authentication, HttpSession session,
	UsernamePasswordAuthenticationToken ok, HelperConf help) {
		return "/pages/MasterParameter/TipeKonsumen/InputData";
	}

	@PostMapping(value = "/TipeKonsumen/ActionInputData")
	public String TipeKonsumenActionInputData(String firstName, Model model, Principal principal, String role,
			Authentication authentication, HttpSession session, UsernamePasswordAuthenticationToken ok, HelperConf help,
			String nama_skema, Integer wilayah, Integer jenisPembiayaan, Integer jenisKendaraan, Integer tipeAsuransi,
			Integer startOTR, Integer endOTR, Integer endyear, Integer startyear, String tenor1, String tenor2,
			String tenor3, String tenor4, String tenor5, String tenor6, String tenor7, String tenor8, String tenor9,
			String tenor10, String startBerlaku, String endBerlaku) throws JsonProcessingException, ParseException {

		return "/pages/expired/token";
	}

	@RequestMapping(value = "/TipeKonsumen/EditData", method = RequestMethod.GET)
	public String TipeKonsumenEditData() {
		return "/pages/MasterParameter/TipeKonsumen/EditData";
	}

	@GetMapping(value = { "/TipeKonsumen/Data" })
	public String getListTipeKonsumen(String firstName, Model model, modelTipeKonsumen modelTipeKonsumen,
			Principal principal, String role, Authentication authentication, HttpSession session,
			UsernamePasswordAuthenticationToken ok) {

		try {
			ResponseEntity<ResponTipeKonsumen> respon = restTemplate.exchange(
					apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(ok),
					ResponTipeKonsumen.class);

			model.addAttribute("loginas", principal.getName());
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