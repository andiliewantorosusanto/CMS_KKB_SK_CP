package com.CMS.CentralParam.KKBSK.controller;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.CMS.CentralParam.KKBSK.config.HelperConf;
import com.CMS.CentralParam.KKBSK.model.modelCluster;
import com.CMS.CentralParam.KKBSK.model.modelJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.modelJenisPembiayaan;
import com.CMS.CentralParam.KKBSK.model.modelKomponenPH;
import com.CMS.CentralParam.KKBSK.model.modelTipeKonsumen;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponKomponenPH;
import com.CMS.CentralParam.KKBSK.view.vwDataCluster;
import com.CMS.CentralParam.KKBSK.view.vwTipeKonsumen;

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
public class RateKomponenPHController {

    @Autowired
    RestTemplate restTemplate;

	@RequestMapping(value = "/KomponenPH/InputData", method = RequestMethod.GET)
	public String KomponenPHInputData(Model model) {

		return "/pages/MasterParameter/KomponenPH/InputData";
	}


	// NOTE LIST DATA RATE CP
	@GetMapping(value = { "/KomponenPH/Data" })
	public String getListDonePencairanSHF(String firstName, Model model, modelKomponenPH modelKomponenPH,
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

		System.out.println("API GET DATA RATE KOMPONEN PH HIT");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", token);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		try {
			ResponseEntity<ResponKomponenPH> respon = restTemplate.exchange(
				"http://localhost:9098/api/ratekomponenph/getalldata", HttpMethod.POST, entity,
				ResponKomponenPH.class);
		System.out.println("hasil respon : " + respon.getBody().getCode());
		// return respon.getBody();
		model.addAttribute("loginas", principal.getName());
		model.addAttribute("listDataKomponenPH", respon.getBody().getDatarateKomponenPH());
		return "/pages/MasterParameter/KomponenPH/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
		
	}

}