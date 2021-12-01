package com.CMS.CentralParam.KKBSK.controller;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.CMS.CentralParam.KKBSK.config.HelperConf;
import com.CMS.CentralParam.KKBSK.model.modelPerluasanAsuransi;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponRatePerluasanAsuransi;
import com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio.ResponListJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio.ResponListJenisPembiayaan;
import com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio.ResponListTipeAsuransi;
import com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio.ResponListWilayah;

import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
public class PerluasanAsuransi {

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


	@RequestMapping(value = "/RatePerluasanAsuransi/InputData", method = RequestMethod.GET)
	public String RateAsuransiInputData(Model model,String firstName,
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

		System.out.println("API GET DATA RATE ASURANSI HIT!");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", token);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		try {

			//NOTE LIST JENIS PEMBIAYAAN
			ResponseEntity<ResponListJenisPembiayaan> respon = restTemplate.exchange(
					"http://localhost:9098/api/jenispembiayaan/getalldata", HttpMethod.POST, entity,
					ResponListJenisPembiayaan.class);
			//NOTE LIST JENIS KENDARAAN
			ResponseEntity<ResponListJenisKendaraan> responListKendaraan = restTemplate.exchange(
				"http://localhost:9098/api/jeniskendaraan/getalldata", HttpMethod.POST, entity,
				ResponListJenisKendaraan.class);
			//NOTE LIST Wilayah
			ResponseEntity<ResponListWilayah> responWilayah = restTemplate.exchange(
				"http://localhost:9098/api/wilayah/getalldata", HttpMethod.POST, entity,
				ResponListWilayah.class);
			//NOTE LIST Tipe Asuransi
			ResponseEntity<ResponListTipeAsuransi> responTipeAsuransi = restTemplate.exchange(
				"http://localhost:9098/api/tipeasuransi/getalldata", HttpMethod.POST, entity,
				ResponListTipeAsuransi.class);


			System.out.println("hasil respon : " + respon.getBody().getCode());
			// return respon.getBody();
			model.addAttribute("loginas", principal.getName());
			model.addAttribute("listJenisPembiayaan", respon.getBody().getJenisPembiayaan());
			model.addAttribute("listJenisKendaraan", responListKendaraan.getBody().getJenisKendaraan());
			model.addAttribute("listJenisWilayah", responWilayah.getBody().getWilayah());
			model.addAttribute("listTipeAsuransi", responTipeAsuransi.getBody().getTipeAsuransi());
			return "/pages/MasterParameter/PerluasanAsuransi/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";

	}


	// NOTE LIST DATA RATE CP
	@GetMapping(value = { "/RatePerluasanAsuransi/Data" })
	public String getListDonePencairanSHF(String firstName, Model model, modelPerluasanAsuransi modelPerluasanAsuransi,
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

		System.out.println("API GET DATA RATE PERLUASAN ASURANSI HIT!");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", token);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		try {
			ResponseEntity<ResponRatePerluasanAsuransi> respon = restTemplate.exchange(
				"http://localhost:9098/api/rateperluasanasuransi/getalldata", HttpMethod.POST, entity,
				ResponRatePerluasanAsuransi.class);
		System.out.println("hasil respon : " + respon.getBody().getCode());
		// return respon.getBody();
		model.addAttribute("loginas", principal.getName());
		model.addAttribute("listDataRatePerluasanAsuransi", respon.getBody().getDatarateperluasanasuransi());
		return "/pages/MasterParameter/PerluasanAsuransi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
		
	}
}