package com.CMS.CentralParam.KKBSK.controller;

import java.security.Principal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.CMS.CentralParam.KKBSK.config.HelperConf;
import com.CMS.CentralParam.KKBSK.model.modelBiayaFidusia;
import com.CMS.CentralParam.KKBSK.model.REQUEST.RequestInputRateBiayaFidusia;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponBiayaFidusia;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;

@Controller
public class BiayaFidusiaController {

	@Autowired
	RestTemplate restTemplate;

	public void myMethod(UsernamePasswordAuthenticationToken ok) {
		// NOTE CEK TOKEN
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
			ResponseEntity<ResponCekToken> respon = restTemplate.exchange("http://localhost:9098/api/helper/cekToken",
					HttpMethod.POST, entity, ResponCekToken.class);
			System.out.println("Code Token EXP : " + respon.getBody().getCode());
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}

	}

	@RequestMapping(value = "/BiayaFidusia/InputData", method = RequestMethod.GET)
	public String BiayaFidusiaInputData(Model model) {

		return "/pages/MasterParameter/BiayaFidusia/InputData";
	}

	// NOTE LIST DATA RATE Biaya Fidusia
	@GetMapping(value = { "/BiayaFidusia/Data" })
	public String getListDonePencairanSHF(String firstName, Model model, modelBiayaFidusia modelBiayaFidusia,
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

		System.out.println("API GET DATA RATE Biaya Fidusia HIT");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", token);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		try {
			ResponseEntity<ResponBiayaFidusia> respon = restTemplate.exchange(
					"http://localhost:9098/api/ratebiayafidusia/getalldata", HttpMethod.POST, entity,
					ResponBiayaFidusia.class);
			System.out.println("hasil respon : " + respon.getBody().getCode());
			// return respon.getBody();
			model.addAttribute("loginas", principal.getName());
			model.addAttribute("listDataBiayaFidusia", respon.getBody().getDatarateBiayaFidusia());
			return "/pages/MasterParameter/BiayaFidusia/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";

	}

	@PostMapping(value = "/BiayaFidusia/ActionInputData")
	public String RateAsuransiActionInputData(String firstName, Model model, Principal principal, String role,
			Authentication authentication, HttpSession session, UsernamePasswordAuthenticationToken ok, HelperConf help,
			String namaSkema, Integer startPh, Integer endPh,Integer biayaFidusia) throws JsonProcessingException, ParseException {
		System.out.println("Diakses Oleh : " + principal.getName());
		Object[] strObjects = ok.getAuthorities().toArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i < strObjects.length; i++) {
			sb.append(strObjects[i]);
		}

		String token = sb.toString();
		System.out.println("ini dia :" + token);
		HttpHeaders headersInputRateAsuransi = new HttpHeaders();
		headersInputRateAsuransi.setContentType(MediaType.APPLICATION_JSON);
		headersInputRateAsuransi.add("Authorization", token);

		RequestInputRateBiayaFidusia reqBiayaFidusia = new RequestInputRateBiayaFidusia(namaSkema, biayaFidusia,startPh, endPh);
		ObjectMapper objectMapper = new ObjectMapper();
		String reqNoRekeningString = objectMapper.writeValueAsString(reqBiayaFidusia);
		HttpEntity<String> entityNoRek = new HttpEntity(reqNoRekeningString, headersInputRateAsuransi);
		System.out.println("yang gue kirim : " + entityNoRek);
		ResponseEntity<String> responInputRateAsuransi = restTemplate
				.exchange("http://localhost:9098/api/ratebiayafidusia/input", HttpMethod.POST, entityNoRek, String.class);
		System.out.println("hasil : " + responInputRateAsuransi);
		System.out.println("API GET DATA Biaya Admin HIT!");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", token);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		try {
			ResponseEntity<ResponBiayaFidusia> respon = restTemplate.exchange(
					"http://localhost:9098/api/ratebiayafidusia/getalldata", HttpMethod.POST, entity,
					ResponBiayaFidusia.class);
			System.out.println("hasil respon : " + respon.getBody().getCode());
			// return respon.getBody();
			model.addAttribute("loginas", principal.getName());
			model.addAttribute("listDataBiayaFidusia", respon.getBody().getDatarateBiayaFidusia());
			return "/pages/MasterParameter/BiayaFidusia/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

}