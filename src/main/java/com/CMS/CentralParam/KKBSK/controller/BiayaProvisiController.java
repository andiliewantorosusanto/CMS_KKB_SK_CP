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
import com.CMS.CentralParam.KKBSK.model.modelBiayaProvisi;
import com.CMS.CentralParam.KKBSK.model.REQUEST.RequestInputRateBiayaProvisi;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponBiayaProvisi;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio.ResponListJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio.ResponListJenisPembiayaan;
import com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio.ResponListTipeAsuransi;
import com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio.ResponListWilayah;
import com.CMS.CentralParam.KKBSK.view.vwDataBiayaProvisi;
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
public class BiayaProvisiController {

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

	// @RequestMapping(value = "/BiayaProvisi/InputData", method =
	// RequestMethod.GET)
	// public String BiayaAdminInputData(Model model) {

	// return "/pages/MasterParameter/BiayaProvisi/InputData";

	@RequestMapping(value = "/BiayaProvisi/InputData", method = RequestMethod.GET)
	public String RateAsuransiInputData(Model model, String firstName, Principal principal, String role,
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

			// NOTE LIST JENIS PEMBIAYAAN
			ResponseEntity<ResponListJenisPembiayaan> respon = restTemplate.exchange(
					"http://localhost:9098/api/jenispembiayaan/getalldata", HttpMethod.POST, entity,
					ResponListJenisPembiayaan.class);
			// NOTE LIST JENIS KENDARAAN
			ResponseEntity<ResponListJenisKendaraan> responListKendaraan = restTemplate.exchange(
					"http://localhost:9098/api/jeniskendaraan/getalldata", HttpMethod.POST, entity,
					ResponListJenisKendaraan.class);
			// NOTE LIST Wilayah
			ResponseEntity<ResponListWilayah> responWilayah = restTemplate.exchange(
					"http://localhost:9098/api/wilayah/getalldata", HttpMethod.POST, entity, ResponListWilayah.class);

			System.out.println("hasil respon : " + respon.getBody().getCode());
			// return respon.getBody();
			model.addAttribute("loginas", principal.getName());
			model.addAttribute("listJenisPembiayaan", respon.getBody().getJenisPembiayaan());
			model.addAttribute("listJenisKendaraan", responListKendaraan.getBody().getJenisKendaraan());
			model.addAttribute("listJenisWilayah", responWilayah.getBody().getWilayah());
			return "/pages/MasterParameter/BiayaProvisi/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";

	}

	@PostMapping(value = "/BiayaProvisi/ActionInputData")
	public String RateAsuransiActionInputData(String firstName, Model model, Principal principal, String role,
			Authentication authentication, HttpSession session, UsernamePasswordAuthenticationToken ok, HelperConf help,
			String namaSkema, String startBerlaku, String endBerlaku, Integer jenisKendaraan, Integer jenisPembiayaan,
			Integer loanType, Integer cluster, Integer diskon, Integer tenor1, Integer tenor2, Integer tenor3,
			Integer tenor4, Integer tenor5, Integer tenor6, Integer tenor7, Integer tenor8, Integer tenor9,
			Integer tenor10, Integer tenor1persen, Integer tenor2persen, Integer tenor3persen, Integer tenor4persen,
			Integer tenor5persen, Integer tenor6persen, Integer tenor7persen, Integer tenor8persen,
			Integer tenor9persen, Integer tenor10persen) throws JsonProcessingException, ParseException {
		System.out.println("Diakses Oleh : " + principal.getName());
		Object[] strObjects = ok.getAuthorities().toArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i < strObjects.length; i++) {
			sb.append(strObjects[i]);
		}
		System.out.println("DATE S " + startBerlaku + "END" + endBerlaku);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(startBerlaku);
		Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(endBerlaku);

		String strDatestart = sdf.format(date1);
		String strDateend = sdf.format(date2);

		String token = sb.toString();
		System.out.println("ini dia :" + token);
		HttpHeaders headersInputRateAsuransi = new HttpHeaders();
		headersInputRateAsuransi.setContentType(MediaType.APPLICATION_JSON);
		headersInputRateAsuransi.add("Authorization", token);

		RequestInputRateBiayaProvisi reqNoRek = new RequestInputRateBiayaProvisi(namaSkema, strDatestart, strDateend,
				jenisKendaraan, jenisPembiayaan, loanType, 0, diskon, tenor1, tenor2, tenor3, tenor4, tenor5,
				tenor6, tenor7, tenor8, tenor9, tenor10, tenor1persen, tenor2persen, tenor3persen, tenor4persen,
				tenor5persen, tenor6persen, tenor7persen, tenor8persen, tenor9persen, tenor10persen);
		ObjectMapper objectMapper = new ObjectMapper();
		String reqNoRekeningString = objectMapper.writeValueAsString(reqNoRek);
		HttpEntity<String> entityNoRek = new HttpEntity(reqNoRekeningString, headersInputRateAsuransi);
		System.out.println("yang gue kirim : " + entityNoRek);
		ResponseEntity<String> responInputRateAsuransi = restTemplate
				.exchange("http://localhost:9098/api/biayaprovisi/input", HttpMethod.POST, entityNoRek, String.class);
		System.out.println("hasil : " + responInputRateAsuransi);
		System.out.println("API GET DATA RATE ASURANSI HIT!");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", token);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		try {
			ResponseEntity<ResponBiayaProvisi> respon = restTemplate.exchange(
					"http://localhost:9098/api/biayaprovisi/getalldata", HttpMethod.POST, entity,
					ResponBiayaProvisi.class);
			System.out.println("hasil respon : " + respon.getBody().getCode());
			// return respon.getBody();
			model.addAttribute("loginas", principal.getName());
			model.addAttribute("listDataBiayaProvisi", respon.getBody().getDataBiayaProvisi());
			return "/pages/MasterParameter/BiayaProvisi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	// NOTE LIST DATA RATE CP
	@GetMapping(value = { "/BiayaProvisi/Data" })
	public String getListDonePencairanSHF(String firstName, Model model, modelBiayaProvisi modelBiayaProvisi,
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

		System.out.println("API GET DATA RATE CP HIT");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", token);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		try {
			ResponseEntity<ResponBiayaProvisi> respon = restTemplate.exchange(
					"http://localhost:9098/api/biayaprovisi/getalldata", HttpMethod.POST, entity,
					ResponBiayaProvisi.class);
			System.out.println("hasil respon : " + respon.getBody().getCode());
			// return respon.getBody();
			model.addAttribute("loginas", principal.getName());
			model.addAttribute("listDataBiayaProvisi", respon.getBody().getDataBiayaProvisi());
			return "/pages/MasterParameter/BiayaProvisi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";

	}

}