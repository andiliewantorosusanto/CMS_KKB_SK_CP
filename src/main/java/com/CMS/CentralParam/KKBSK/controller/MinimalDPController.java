package com.CMS.CentralParam.KKBSK.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.CMS.CentralParam.KKBSK.config.HelperConf;
import com.CMS.CentralParam.KKBSK.model.modelJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.modelMinimalDP;
import com.CMS.CentralParam.KKBSK.model.modelTipeKonsumen;
import com.CMS.CentralParam.KKBSK.model.LDAP.ResponLoginBE;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponMinimalDP;
import com.CMS.CentralParam.KKBSK.view.vwDataMinimalDP;
import com.CMS.CentralParam.KKBSK.view.vwTipeKonsumen;
import com.CMS.CentralParam.security.services.CustomerGrantAuthority;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;

@Controller
public class MinimalDPController {

	

	@Autowired
    RestTemplate restTemplate;

	@RequestMapping(value = "/MinimalDP/InputData", method = RequestMethod.GET)
	public String MinimalDPInputData(Model model) {
		return "/pages/MasterParameter/MinimalDP/InputData";
	}

	@RequestMapping(value = "/MinimalDP/EditData", method = RequestMethod.GET)
	public String MinimalDPEditData() {
		return "/pages/MasterParameter/MinimalDP/EditData";
	}

	 public void myMethod(UsernamePasswordAuthenticationToken ok) {
		//NOTE CEK TOKEN
		Object[] strObjects = ok.getAuthorities().toArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i < strObjects.length; i++) {
			sb.append(strObjects[i]);
		}
		String token = sb.toString();
		System.out.println("ini dia :" + token);
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", token);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		try {
			ResponseEntity<ResponCekToken> respon = restTemplate.exchange(
				"http://localhost:9098/api/helper/cekToken", HttpMethod.POST, entity,
				ResponCekToken.class);
		System.out.println("Code Token EXP : " + respon.getBody().getCode());
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
	
	  }
	  
	// NOTE LIST DATA RATE CP
	@GetMapping(value = { "/MinimalDP/Data" })
	public String getListDonePencairanSHF(String firstName, Model model, modelMinimalDP modelMinimalDP,
			Principal principal, String role, Authentication authentication, HttpSession session,
			UsernamePasswordAuthenticationToken ok, HelperConf help) {

		System.out.println("Diakses Oleh : " + principal.getName());
		Object[] strObjects = ok.getAuthorities().toArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i < strObjects.length; i++) {
			sb.append(strObjects[i]);
		}
		String token = sb.toString();
		System.out.println("ini dia :" + token);

		System.out.println("API GET DATA RATE MINIMAL DP HIT!");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", token);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		try {
			ResponseEntity<ResponMinimalDP> respon = restTemplate.exchange(
				"http://localhost:9098/api/rateminimaldp/getalldata", HttpMethod.POST, entity,
				ResponMinimalDP.class);
		System.out.println("hasil respon : " + respon.getBody().getCode());
		// return respon.getBody();
		model.addAttribute("loginas", principal.getName());
		model.addAttribute("listDataMinimalDP", respon.getBody().getDataRateMinimalDP());
		return "/pages/MasterParameter/MinimalDP/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
		
	}

	@RequestMapping(value = "/MinimalDP/FormApprovalData", method = RequestMethod.GET)
	public String MinimalDPFormApprovalData() {
		return "/pages/MasterParameter/MinimalDP/FormApprovalData";
	}

}