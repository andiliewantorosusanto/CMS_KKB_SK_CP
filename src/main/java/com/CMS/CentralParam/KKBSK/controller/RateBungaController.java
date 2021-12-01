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
import com.CMS.CentralParam.KKBSK.model.modelRateBunga;
import com.CMS.CentralParam.KKBSK.model.modelTipeKonsumen;
import com.CMS.CentralParam.KKBSK.model.LDAP.ResponLoginBE;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCluster;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponDataRateBunga;
import com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio.ResponListJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio.ResponListJenisPembiayaan;
import com.CMS.CentralParam.KKBSK.view.vwDataRateBunga;
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;

@Controller
public class RateBungaController {


	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/RateBunga/EditData", method = RequestMethod.GET)
	public String RateBungaEditData() {
		return "/pages/MasterParameter/RateBunga/EditData";
	}

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

	@RequestMapping(value = "/RateBunga/InputData", method = RequestMethod.GET)
	public String RateBungaInputData(Model model,String firstName,
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
					//NOTE LIST CLUSTER
			ResponseEntity<ResponCluster> responListCluster = restTemplate.exchange(
				"http://localhost:9098/api/cluster/getalldata", HttpMethod.POST, entity,
				ResponCluster.class);
			

			System.out.println("hasil respon : " + respon.getBody().getCode());
			// return respon.getBody();
			model.addAttribute("loginas", principal.getName());
			model.addAttribute("listJenisPembiayaan", respon.getBody().getJenisPembiayaan());
			model.addAttribute("listJenisKendaraan", responListKendaraan.getBody().getJenisKendaraan());
			model.addAttribute("listCluster", responListCluster.getBody().getCluster());
			return "/pages/MasterParameter/RateBunga/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";

	}

	@PostMapping(value = "/RateBunga/ActionInputData")
	public String RateAsuransiActionInputData(String firstName, Model model, Principal principal, String role,
			Authentication authentication, HttpSession session, UsernamePasswordAuthenticationToken ok, HelperConf help,
			String nama_skema, Integer wilayah, Integer jenisPembiayaan, Integer jenisKendaraan, Integer tipeAsuransi,
			Integer startOTR, Integer endOTR, Integer endyear, Integer startyear, String tenor1, String tenor2,
			String tenor3, String tenor4, String tenor5, String tenor6, String tenor7, String tenor8, String tenor9,
			String tenor10, String startBerlaku, String endBerlaku) throws ParseException {
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
		HttpHeaders headersInputRateAsuransi = new HttpHeaders();
		headersInputRateAsuransi.setContentType(MediaType.APPLICATION_JSON);
		headersInputRateAsuransi.add("Authorization", token);
		return token;

	}
	  
	// NOTE LIST DATA RATE CP
	@GetMapping(value = { "/RateBunga/Data" })
	public String getListDonePencairanSHF(String firstName, Model model, modelRateBunga modelRateBunga,
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
			ResponseEntity<ResponDataRateBunga> respon = restTemplate.exchange(
				"http://localhost:9098/api/ratebunga/getalldata", HttpMethod.POST, entity,
				ResponDataRateBunga.class);
		System.out.println("hasil respon : " + respon.getBody().getCode());
		// return respon.getBody();
		model.addAttribute("loginas", principal.getName());
		model.addAttribute("listDataRateBunga", respon.getBody().getDataRateBunga());
		return "/pages/MasterParameter/RateBunga/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
		
	}

	// NOTE LIST BUCKET APPROVAL RATE ASURANSI
	@GetMapping(value = { "/RateBunga/ApprovalData" })
	public String getListApprovalRateAsuransi(String firstName, Model model, modelRateBunga modelRateBunga,
			Principal principal) {

		return "/pages/MasterParameter/RateBunga/ApprovalData";
	}

	@RequestMapping(value = "/RateBunga/FormApprovalData", method = RequestMethod.GET)
	public String RateBungaFormApprovalData() {
		return "/pages/MasterParameter/RateBunga/FormApprovalData";
	}

}