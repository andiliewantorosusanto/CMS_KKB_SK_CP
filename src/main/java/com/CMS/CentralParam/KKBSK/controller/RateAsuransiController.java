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
import com.CMS.CentralParam.KKBSK.model.modelJenisPembiayaan;
import com.CMS.CentralParam.KKBSK.model.modelRateAsuransi;
import com.CMS.CentralParam.KKBSK.model.modelTipeAsuransi;
import com.CMS.CentralParam.KKBSK.model.modelTipeKonsumen;
import com.CMS.CentralParam.KKBSK.model.modelWilayah;
import com.CMS.CentralParam.KKBSK.model.LDAP.ResponLoginBE;
import com.CMS.CentralParam.KKBSK.model.REQUEST.RequestInputRateAsuransi;
import com.CMS.CentralParam.KKBSK.model.REQUEST.SettingRateAsuransi;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponRateAsuransi;
import com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio.ResponListJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio.ResponListJenisPembiayaan;
import com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio.ResponListTipeAsuransi;
import com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio.ResponListWilayah;


import com.CMS.CentralParam.KKBSK.view.vwDataRateAsuransi;
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
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RateAsuransiController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/RateAsuransi/InputData", method = RequestMethod.GET)
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
			return "/pages/MasterParameter/RateAsuransi/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";

	}

	// @PostMapping("/ActionInputData") // //new annotation since 4.3
	// public ModelAndView RateAsuransiActionInputData2(String firstName, Model
	// model, modelRateAsuransi modelRateAsuransi,
	// Principal principal, String role, Authentication authentication, HttpSession
	// session,
	// UsernamePasswordAuthenticationToken ok, HelperConf hel) {
	// System.out.println("Approved!");
	// penggunaanService.updateStatusApproved2("Approved", idPenggunaan, idDocsup2);
	// penggunaanService.updateApprova2(idPenggunaan, appid, otr);
	// return new ModelAndView("redirect:/penggunaan/listDetailMaker2/?firstName=" +
	// principal.getName());
	// }

	@PostMapping(value = "/RateAsuransi/ActionInputData")
	public String RateAsuransiActionInputData(String firstName, Model model, Principal principal, String role,
			Authentication authentication, HttpSession session, UsernamePasswordAuthenticationToken ok, HelperConf help,
			String nama_skema, Integer wilayah, Integer jenisPembiayaan, Integer jenisKendaraan, Integer tipeAsuransi,
			Integer startOTR, Integer endOTR, Integer endyear, Integer startyear, String tenor1, String tenor2,
			String tenor3, String tenor4, String tenor5, String tenor6, String tenor7, String tenor8, String tenor9,
			String tenor10, String startBerlaku, String endBerlaku) throws JsonProcessingException, ParseException {
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

		RequestInputRateAsuransi reqNoRek = new RequestInputRateAsuransi(nama_skema, wilayah, startOTR, endOTR, tipeAsuransi,
		strDatestart, strDateend, dtf.format(now), null, jenisKendaraan, jenisPembiayaan, startyear, endyear, tenor1,
		tenor2, tenor3, tenor4, tenor5, tenor6, tenor7, tenor8, tenor9, tenor10);
		ObjectMapper objectMapper = new ObjectMapper();
		String reqNoRekeningString = objectMapper.writeValueAsString(reqNoRek);
		HttpEntity<String> entityNoRek = new HttpEntity(reqNoRekeningString, headersInputRateAsuransi);
		System.out.println("yang gue kirim : " + entityNoRek);
		ResponseEntity<String> responInputRateAsuransi = restTemplate
				.exchange("http://localhost:9098/api/rateasuransi/input", HttpMethod.POST, entityNoRek, String.class);
		System.out.println("hasil : " + responInputRateAsuransi);
		System.out.println("API GET DATA RATE ASURANSI HIT!");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", token);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		try {
			ResponseEntity<ResponRateAsuransi> respon = restTemplate.exchange(
					"http://localhost:9098/api/rateasuransi/getalldata", HttpMethod.POST, entity,
					ResponRateAsuransi.class);
			System.out.println("hasil respon : " + respon.getBody().getCode());
			// return respon.getBody();
			model.addAttribute("loginas", principal.getName());
			model.addAttribute("listDataRateAsuransi", respon.getBody().getDataRateAsuransi());
			return "/pages/MasterParameter/RateAsuransi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/RateAsuransi/EditData", method = RequestMethod.GET)
	public String RateAsuransiEditData() {
		return "/pages/MasterParameter/RateAsuransi/EditData";
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
	@GetMapping(value = { "/RateAsuransi/Data" })
	public String getListDonePencairanSHF(String firstName, Model model, modelRateAsuransi modelRateAsuransi,
			Principal principal, String role, Authentication authentication, HttpSession session,
			UsernamePasswordAuthenticationToken ok, HelperConf help) {
		//List<vwDataRateAsuransi> listDataRateAsuransi = RateAsuransiRepository.getListDataRateAsuransi();
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
			ResponseEntity<ResponRateAsuransi> respon = restTemplate.exchange(
					"http://localhost:9098/api/rateasuransi/getalldata", HttpMethod.POST, entity,
					ResponRateAsuransi.class);
			System.out.println("hasil respon : " + respon.getBody().getCode());
			// return respon.getBody();
			model.addAttribute("loginas", principal.getName());
			model.addAttribute("listDataRateAsuransi", respon.getBody().getDataRateAsuransi());
			return "/pages/MasterParameter/RateAsuransi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";

	}

	// NOTE LIST BUCKET APPROVAL RATE ASURANSI
	@GetMapping(value = { "/rateasuransi/approvaldata" })
	public String getListApprovalRateAsuransi(String firstName, Model model, modelRateAsuransi modelRateAsuransi,
			Principal principal) {
		//List<vwDataRateAsuransi> listDataRateAsuransi = RateAsuransiRepository.getListBucketApprovalRateAsuransi();
		String NIP = principal.getName();
		//String roleUser = userRepository.cekRole(NIP);
		//model.addAttribute("rolenya", roleUser);
		//model.addAttribute("listDataRateAsuransi", listDataRateAsuransi);
		return "/pages/MasterParameter/RateAsuransi/ApprovalData";
	}

	@RequestMapping(value = "/RateAsuransi/FormApprovalData", method = RequestMethod.GET)
	public String RateAsuransiFormApprovalData() {
		return "/pages/MasterParameter/RateAsuransi/FormApprovalData";
	}

}