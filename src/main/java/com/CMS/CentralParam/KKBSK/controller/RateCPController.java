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
import com.CMS.CentralParam.KKBSK.model.modelJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.modelTipeKonsumen;
import com.CMS.CentralParam.KKBSK.model.LDAP.ResponLoginBE;
import com.CMS.CentralParam.KKBSK.model.REQUEST.RequestInputRateCP;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponDataRateCP;
import com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio.ResponListTipeKonsumen;


import com.CMS.CentralParam.KKBSK.view.vwDataRateCP;
import com.CMS.CentralParam.KKBSK.view.vwTipeKonsumen;
import com.CMS.CentralParam.security.services.CustomerGrantAuthority;
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
public class RateCPController {


	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/RateCP/InputData", method = RequestMethod.GET)
	public String RateCPInputData(Model model, String firstName, Principal principal, String role,
			Authentication authentication, HttpSession session, UsernamePasswordAuthenticationToken ok,
			HelperConf help) {

		System.out.println("Diakses Oleh : " + principal.getName());
		Object[] strObjects = ok.getAuthorities().toArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i < strObjects.length; i++) {
			sb.append(strObjects[i]);
		}
		String token = sb.toString();
		System.out.println("ini dia :" + token);

		System.out.println("API GET DATA RATE ASURANSI HIT!");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", token);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		try {

			// NOTE LIST Tipe Konsumen
			ResponseEntity<ResponListTipeKonsumen> respon = restTemplate.exchange(
					"http://localhost:9098/api/tipekonsumen/getalldata", HttpMethod.POST, entity,
					ResponListTipeKonsumen.class);

			System.out.println("hasil respon : " + respon.getBody().getCode());
			// return respon.getBody();
			model.addAttribute("loginas", principal.getName());
			model.addAttribute("listTipeKonsumen", respon.getBody().getTipeKonsumen());
			return "/pages/MasterParameter/RateCP/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/RateCP/ActionInputData")
	public String RateCPActionInputData(String firstName, Model model, Principal principal, String role,
			Authentication authentication, HttpSession session, UsernamePasswordAuthenticationToken ok, HelperConf help,
			String nama_skema, Integer tipeKonsumen, String tenor1, String tenor2, String tenor3, String tenor4, String tenor5, String tenor6,
			String tenor7, String tenor8, String tenor9, String tenor10, String startBerlaku, String endBerlaku)
			throws JsonProcessingException, ParseException {
		System.out.println("Diakses Oleh : " + principal.getName());
		Object[] strObjects = ok.getAuthorities().toArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i < strObjects.length; i++) {
			sb.append(strObjects[i]);
		}
		System.out.println("DATE S "+startBerlaku + "END" + endBerlaku);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(startBerlaku);  
		Date date2=new SimpleDateFormat("yyyy-MM-dd").parse(endBerlaku);  

		String strDatestart = sdf.format(date1);
		String strDateend = sdf.format(date2);

		String token = sb.toString();
		System.out.println("ini dia :" + token);
		HttpHeaders headersInputRateCP = new HttpHeaders();
		headersInputRateCP.setContentType(MediaType.APPLICATION_JSON);
		headersInputRateCP.add("Authorization", token);

		RequestInputRateCP reqNoRek = new RequestInputRateCP(nama_skema, tipeKonsumen, strDatestart, strDateend, dtf.format(now),tenor1,
		tenor2, tenor3, tenor4, tenor5, tenor6, tenor7, tenor8, tenor9, tenor10);
		ObjectMapper objectMapper = new ObjectMapper();
		String reqNoRekeningString = objectMapper.writeValueAsString(reqNoRek);
		HttpEntity<String> entityNoRek = new HttpEntity(reqNoRekeningString, headersInputRateCP);
		System.out.println("yang gue kirim : " + entityNoRek);
		ResponseEntity<String> responInputRateCP = restTemplate
				.exchange("http://localhost:9098/api/ratecp/input", HttpMethod.POST, entityNoRek, String.class);
		System.out.println("hasil : " + responInputRateCP);
		System.out.println("API GET DATA RATE ASURANSI HIT!");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", token);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		try {
			ResponseEntity<ResponDataRateCP> respon = restTemplate.exchange(
					"http://localhost:9098/api/ratecp/getalldata", HttpMethod.POST, entity,
					ResponDataRateCP.class);
			System.out.println("hasil respon : " + respon.getBody().getCode());
			// return respon.getBody();
			model.addAttribute("loginas", principal.getName());
			model.addAttribute("listDataRateCP", respon.getBody().getDataRatecp());
			return "/pages/MasterParameter/RateCP/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
	@RequestMapping(value = "/RateCP/EditData", method = RequestMethod.GET)
	public String RateCPEditData() {
		return "/pages/MasterParameter/RateCP/EditData";
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
	@GetMapping(value = { "/RateCP/Data" })
	public String getListDonePencairanSHF(String firstName, Model model,
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

		System.out.println("API GET DATA RATE CP HIT!");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", token);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		try {
			ResponseEntity<ResponDataRateCP> respon = restTemplate.exchange(
				"http://localhost:9098/api/ratecp/getalldata", HttpMethod.POST, entity,
				ResponDataRateCP.class);
		System.out.println("hasil respon : " + respon.getBody().getCode());
		// return respon.getBody();
		model.addAttribute("loginas", principal.getName());
		model.addAttribute("listDataRateCP", respon.getBody().getDataRatecp());
		return "/pages/MasterParameter/RateCP/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
		
	}


	@RequestMapping(value = "/RateCP/FormApprovalData", method = RequestMethod.GET)
	public String RateCPFormApprovalData() {
		return "/pages/MasterParameter/RateCP/FormApprovalData";
	}

}