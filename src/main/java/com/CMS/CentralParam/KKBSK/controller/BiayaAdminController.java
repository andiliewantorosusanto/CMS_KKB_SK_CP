package com.CMS.CentralParam.KKBSK.controller;

import java.security.Principal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.http.HttpSession;

import com.CMS.CentralParam.KKBSK.config.HelperConf;
import com.CMS.CentralParam.KKBSK.model.modelBiayaAdmin;
import com.CMS.CentralParam.KKBSK.model.REQUEST.RequestInputRateBiayaAdmin;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponBiayaAdmin;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCluster;
import com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio.ResponListJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio.ResponListJenisPembiayaan;
import com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio.ResponListTipeKonsumen;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
public class BiayaAdminController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/BiayaAdmin/InputData", method = RequestMethod.GET)
	public String RateBungaInputData(Model model, String firstName, Principal principal, String role,
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
			// NOTE LIST CLUSTER
			ResponseEntity<ResponCluster> responListCluster = restTemplate.exchange(
					"http://localhost:9098/api/cluster/getalldata", HttpMethod.POST, entity, ResponCluster.class);

			// NOTE LIST CLUSTER
			ResponseEntity<ResponListTipeKonsumen> responListTipeKonsumen = restTemplate.exchange(
					"http://localhost:9098/api/tipekonsumen/getalldata", HttpMethod.POST, entity,
					ResponListTipeKonsumen.class);

			System.out.println("hasil respon : " + respon.getBody().getCode());
			// return respon.getBody();
			model.addAttribute("loginas", principal.getName());
			model.addAttribute("listJenisPembiayaan", respon.getBody().getJenisPembiayaan());
			model.addAttribute("listJenisKendaraan", responListKendaraan.getBody().getJenisKendaraan());
			model.addAttribute("listCluster", responListCluster.getBody().getCluster());
			model.addAttribute("listTipeKonsumen", responListTipeKonsumen.getBody().getTipeKonsumen());
			return "/pages/MasterParameter/BiayaAdmin/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/BiayaAdmin/ActionInputData")
	public String RateAsuransiActionInputData(String firstName, Model model, Principal principal, String role,
			Authentication authentication, HttpSession session, UsernamePasswordAuthenticationToken ok, HelperConf help,
			String skema, Integer wilayah,Integer tipeKonsumen, Integer jenisPembiayaan, Integer npwp, Integer cluster, Integer jenisKendaraan, Integer tipeAsuransi,
			Integer startOTR, Integer endOTR, Integer endyear, Integer startyear, Integer tenor1, Integer tenor2,
			Integer tenor3, Integer tenor4, Integer tenor5, Integer tenor6, Integer tenor7, Integer tenor8, Integer tenor9,
			Integer tenor10, String startBerlaku, String endBerlaku) throws JsonProcessingException, ParseException {
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

		RequestInputRateBiayaAdmin reqBiayaAdmin = new RequestInputRateBiayaAdmin(skema, tipeKonsumen,
				jenisKendaraan, jenisPembiayaan, cluster, npwp, strDatestart, strDateend, tenor1, tenor2, tenor3,
				tenor4, tenor5, tenor6, tenor7, tenor8, tenor9, tenor10);
		ObjectMapper objectMapper = new ObjectMapper();
		String reqNoRekeningString = objectMapper.writeValueAsString(reqBiayaAdmin);
		HttpEntity<String> entityNoRek = new HttpEntity(reqNoRekeningString, headersInputRateAsuransi);
		System.out.println("yang gue kirim : " + entityNoRek);
		ResponseEntity<String> responInputRateAsuransi = restTemplate
				.exchange("http://localhost:9098/api/ratebiayaadmin/input", HttpMethod.POST, entityNoRek, String.class);
		System.out.println("hasil : " + responInputRateAsuransi);
		System.out.println("API GET DATA Biaya Admin HIT!");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", token);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		try {
			ResponseEntity<ResponBiayaAdmin> respon = restTemplate.exchange(
					"http://localhost:9098/api/ratebiayaadmin/getalldata", HttpMethod.POST, entity,
					ResponBiayaAdmin.class);
			System.out.println("hasil respon : " + respon.getBody().getCode());
			// return respon.getBody();
			model.addAttribute("loginas", principal.getName());
			model.addAttribute("listDataBiayaAdmin", respon.getBody().getDataratebiayaadmin());
			return "/pages/MasterParameter/BiayaAdmin/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/BiayaAdmin/EditData", method = RequestMethod.GET)
	public String BiayaAdminEditData() {
		return "/pages/MasterParameter/BiayaAdmin/EditData";
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

	// NOTE LIST DATA RATE CP
	@GetMapping(value = { "/BiayaAdmin/Data" })
	public String getListDonePencairanSHF(String firstName, Model model, modelBiayaAdmin modelBiayaAdmin,
			Principal principal, String role, Authentication authentication, HttpSession session,
			UsernamePasswordAuthenticationToken ok, HelperConf help) {
		System.out.println("Diakses Oleh :" + principal.getName());
		Object[] strObjects = ok.getAuthorities().toArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i < strObjects.length; i++) {
			sb.append(strObjects[i]);
		}
		String token = sb.toString();
		System.out.println("ini dia :" + token);
		System.out.println("role  : " + authentication.getPrincipal());
		System.out.println("role  : " + authentication.getAuthorities());
		System.out.println("API GET DATA RATE CP HIT!");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", token);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		try {
			ResponseEntity<ResponBiayaAdmin> respon = restTemplate.exchange(
					"http://localhost:9098/api/ratebiayaadmin/getalldata", HttpMethod.POST, entity,
					ResponBiayaAdmin.class);
			System.out.println("hasil respon : " + respon.getBody().getCode());
			// return respon.getBody();
			model.addAttribute("loginas", principal.getName());
			model.addAttribute("listDataBiayaAdmin", respon.getBody().getDataratebiayaadmin());
			return "/pages/MasterParameter/BiayaAdmin/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";

	}

	// NOTE LIST BUCKET APPROVAL RATE ASURANSI
	@GetMapping(value = { "/BiayaAdmin/approvaldata" })
	public String getListApprovalBiayaAdmin(String firstName, Model model, modelBiayaAdmin modelBiayaAdmin,
			Principal principal) {

		return "/pages/MasterParameter/BiayaAdmin/ApprovalData";
	}

	@RequestMapping(value = "/BiayaAdmin/FormApprovalData", method = RequestMethod.GET)
	public String BiayaAdminFormApprovalData() {
		return "/pages/MasterParameter/BiayaAdmin/FormApprovalData";
	}

}