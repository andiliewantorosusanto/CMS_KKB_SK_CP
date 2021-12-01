package com.CMS.CentralParam.KKBSK.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.CMS.CentralParam.KKBSK.config.HelperConf;
import com.CMS.CentralParam.KKBSK.model.modelJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.modelProgram;
import com.CMS.CentralParam.KKBSK.model.modelTipeKonsumen;
import com.CMS.CentralParam.KKBSK.model.LDAP.ResponLoginBE;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponAllSkema;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponProgram;
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
public class ProgramController {

	@Autowired
    RestTemplate restTemplate;

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
	@GetMapping(value = { "/Program/Data" })
	public String getListDonePencairanSHF(String firstName, Model model, modelProgram modelProgram,
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

		System.out.println("API GET DATA RATE BUNGA HIT!");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", token);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		try {
			ResponseEntity<ResponProgram> respon = restTemplate.exchange(
				"http://localhost:9098/api/program/getalldata", HttpMethod.POST, entity,
				ResponProgram.class);
		System.out.println("hasil respon : " + respon.getBody().getCode());
		// return respon.getBody();
		model.addAttribute("loginas", principal.getName());
		model.addAttribute("listDataProgram", respon.getBody().getDataProgram());
		return "/pages/MasterParameter/Program/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
		
	}
	  

	@RequestMapping(value = "/Program/InputData", method = RequestMethod.GET)
	public String ProgramInputData(Model model,Principal principal, String role, Authentication authentication, HttpSession session,
	UsernamePasswordAuthenticationToken ok, HelperConf help) {
		System.out.println("Diakses Oleh : " + principal.getName());
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
			ResponseEntity<ResponAllSkema> respon = restTemplate.exchange(
				"http://localhost:9098/api/program/getskema", HttpMethod.POST, entity,
				ResponAllSkema.class);

		model.addAttribute("skemaRateBunga", respon.getBody().getDataSkemaRateBunga());
		model.addAttribute("skemaRateAsuransi", respon.getBody().getDataSkemaRateAsuransi());
		model.addAttribute("skemaRateCP", respon.getBody().getDataSkemaRateCP());
		model.addAttribute("skemaBiayaAdmin", respon.getBody().getDataSkemaBiayaAdmin());
		model.addAttribute("skemaMinimalDP", respon.getBody().getDataSkemaMinimalDP());
		model.addAttribute("skemaRatePerluasan", respon.getBody().getDataSkemaRatePerluasan());
		model.addAttribute("skemaBiayaProvisi", respon.getBody().getDataSkemaBiayaProvisi());
		model.addAttribute("skemaBiayaFidusia", respon.getBody().getDataSkemaBiayaFidusia());
		model.addAttribute("skemaKomponenPH", respon.getBody().getDataSkemaKomponenPH());
		model.addAttribute("skemaUsiaKendaraanLunas", respon.getBody().getDataSkemaUsiaKendaraanLunas());
		return "/pages/MasterParameter/Program/InputData";
	}

}