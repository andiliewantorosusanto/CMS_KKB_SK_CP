package com.CMS.CentralParam.KKBSK.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.CMS.CentralParam.KKBSK.config.HelperConf;
import com.CMS.CentralParam.KKBSK.excel.JenisPerluasanExcelExporter;
import com.CMS.CentralParam.KKBSK.model.REQUEST.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.RESPON.DataJenisPerluasan;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponJenisPerluasan;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponProduk;
import com.fasterxml.jackson.databind.ObjectMapper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class JenisPerluasanController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/JenisPerluasan/InputData", method = RequestMethod.GET)
	public String JenisPerluasanInputData(DataJenisPerluasan dataJenisPerluasan,Model model) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			ResponseEntity<ResponProduk> responProduk = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);
			model.addAttribute("listDataProduk",responProduk.getBody().getDataProduk());

			return "/pages/MasterParameter/JenisPerluasan/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping("/JenisPerluasan/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=JenisPerluasan_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponJenisPerluasan> respon = restTemplate.exchange(
			apiBaseUrl+"api/jenisperluasan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponJenisPerluasan.class);

        List<DataJenisPerluasan> listJenisPerluasan = respon.getBody().getDataJenisPerluasan();
         
        JenisPerluasanExcelExporter excelExporter = new JenisPerluasanExcelExporter(listJenisPerluasan);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/JenisPerluasan/ActionInputData")
	public String JenisPerluasanActionInputData(@Valid DataJenisPerluasan dataJenisPerluasan, BindingResult result,String action) {
		if (result.hasErrors()) {
            return "/pages/MasterParameter/JenisPerluasan/InputData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/jenisperluasan/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataJenisPerluasan)), 
				String.class
			);
			
			return "redirect:/JenisPerluasan/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/JenisPerluasan/ActionApprovalData")
	public String JenisPerluasanActionApprovalData(@Valid DataJenisPerluasan dataJenisPerluasan, BindingResult result,String action,Model model) {
		if (result.hasErrors()) {
			ResponseEntity<ResponProduk> responProduk = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);
			model.addAttribute("listDataProduk",responProduk.getBody().getDataProduk());

            return "/pages/MasterParameter/JenisPerluasan/ApprovalData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/jenisperluasan/"+HelperConf.getAction(action)+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataJenisPerluasan)), 
				String.class
			);
			
			return "redirect:/JenisPerluasan/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/JenisPerluasan/ActionData")
	public String JenisPerluasanActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/jenisperluasan/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/JenisPerluasan/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@PostMapping(value = "/JenisPerluasan/ActionApproval")
	public String JenisPerluasanActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/jenisperluasan/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/JenisPerluasan/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@RequestMapping(value = "/JenisPerluasan/EditData/{id}", method = RequestMethod.GET)
	public String JenisPerluasanEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponJenisPerluasan> respon = restTemplate.exchange(
				apiBaseUrl+"/api/jenisperluasan/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponJenisPerluasan.class
			);

			model.addAttribute("dataJenisPerluasan",respon.getBody().getJenisPerluasan());

			
			ResponseEntity<ResponProduk> responProduk = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);
			model.addAttribute("listDataProduk",responProduk.getBody().getDataProduk());
			return "/pages/MasterParameter/JenisPerluasan/EditData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/JenisPerluasan/Data" })
	public String getListJenisPerluasan(Model model) {
		try {
			ResponseEntity<ResponJenisPerluasan> respon = restTemplate.exchange(
					apiBaseUrl+"api/jenisperluasan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponJenisPerluasan.class);

			model.addAttribute("listDataJenisPerluasan", respon.getBody().getDataJenisPerluasan());
			System.out.println(respon.getBody().getDataJenisPerluasan().get(1).toString());
			return "/pages/MasterParameter/JenisPerluasan/Data";
		} catch (Exception e) {

			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/JenisPerluasan/ApprovalData" })
	public String getListApprovalJenisPerluasan(Model model) {
		try {
			ResponseEntity<ResponJenisPerluasan> respon = restTemplate.exchange(
					apiBaseUrl+"api/jenisperluasan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponJenisPerluasan.class);

			model.addAttribute("listDataJenisPerluasan", respon.getBody().getDataJenisPerluasan());
			return "/pages/MasterParameter/JenisPerluasan/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/JenisPerluasan/FormApprovalData/{id}", method = RequestMethod.GET)
	public String JenisPerluasanFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponJenisPerluasan> respon = restTemplate.exchange(
				apiBaseUrl+"/api/jenisperluasan/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponJenisPerluasan.class
			);

			model.addAttribute("dataJenisPerluasan",respon.getBody().getJenisPerluasan());

			
			ResponseEntity<ResponProduk> responProduk = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);
			model.addAttribute("listDataProduk",responProduk.getBody().getDataProduk());

			return "/pages/MasterParameter/JenisPerluasan/FormApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}