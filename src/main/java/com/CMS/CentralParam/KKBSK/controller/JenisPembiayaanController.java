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
import com.CMS.CentralParam.KKBSK.excel.JenisPembiayaanExcelExporter;
import com.CMS.CentralParam.KKBSK.model.REQUEST.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.RESPON.DataJenisPembiayaan;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponJenisPembiayaan;
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
public class JenisPembiayaanController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/JenisPembiayaan/InputData", method = RequestMethod.GET)
	public String JenisPembiayaanInputData(DataJenisPembiayaan dataJenisPembiayaan,Model model) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);

			ResponseEntity<ResponProduk> responProduk = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);
			model.addAttribute("listDataProduk",responProduk.getBody().getDataProduk());

			return "/pages/MasterParameter/JenisPembiayaan/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping("/JenisPembiayaan/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponJenisPembiayaan> respon = restTemplate.exchange(
			apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponJenisPembiayaan.class);

        List<DataJenisPembiayaan> listJenisPembiayaan = respon.getBody().getDataJenisPembiayaan();
         
        JenisPembiayaanExcelExporter excelExporter = new JenisPembiayaanExcelExporter(listJenisPembiayaan);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/JenisPembiayaan/ActionInputData")
	public String JenisPembiayaanActionInputData(@Valid DataJenisPembiayaan dataJenisPembiayaan, BindingResult result,String action,Model model) {
		if (result.hasErrors()) {
			ResponseEntity<ResponProduk> responProduk = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);
			model.addAttribute("listDataProduk",responProduk.getBody().getDataProduk());

            return "/pages/MasterParameter/JenisPembiayaan/InputData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/jenispembiayaan/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataJenisPembiayaan)), 
				String.class
			);
			
			return "redirect:/JenisPembiayaan/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/JenisPembiayaan/ActionApprovalData")
	public String JenisPembiayaanActionApprovalData(@Valid DataJenisPembiayaan dataJenisPembiayaan, BindingResult result,String action) {
		if (result.hasErrors()) {
            return "/pages/MasterParameter/JenisPembiayaan/ApprovalData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/jenispembiayaan/"+HelperConf.getAction(action)+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataJenisPembiayaan)), 
				String.class
			);
			
			return "redirect:/JenisPembiayaan/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/JenisPembiayaan/ActionData")
	public String JenisPembiayaanActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/jenispembiayaan/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/JenisPembiayaan/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@PostMapping(value = "/JenisPembiayaan/ActionApproval")
	public String JenisPembiayaanActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/jenispembiayaan/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/JenisPembiayaan/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@RequestMapping(value = "/JenisPembiayaan/EditData/{id}", method = RequestMethod.GET)
	public String JenisPembiayaanEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponJenisPembiayaan> respon = restTemplate.exchange(
				apiBaseUrl+"/api/jenispembiayaan/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponJenisPembiayaan.class
			);

			model.addAttribute("dataJenisPembiayaan",respon.getBody().getJenisPembiayaan());

			ResponseEntity<ResponProduk> responProduk = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);
			model.addAttribute("listDataProduk",responProduk.getBody().getDataProduk());
			return "/pages/MasterParameter/JenisPembiayaan/EditData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/JenisPembiayaan/Data" })
	public String getListJenisPembiayaan(Model model) {
		try {
			ResponseEntity<ResponJenisPembiayaan> respon = restTemplate.exchange(
					apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponJenisPembiayaan.class);

			model.addAttribute("listDataJenisPembiayaan", respon.getBody().getDataJenisPembiayaan());
			return "/pages/MasterParameter/JenisPembiayaan/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/JenisPembiayaan/ApprovalData" })
	public String getListApprovalJenisPembiayaan(Model model) {
		try {
			ResponseEntity<ResponJenisPembiayaan> respon = restTemplate.exchange(
					apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponJenisPembiayaan.class);

			model.addAttribute("listDataJenisPembiayaan", respon.getBody().getDataJenisPembiayaan());
			return "/pages/MasterParameter/JenisPembiayaan/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/JenisPembiayaan/FormApprovalData/{id}", method = RequestMethod.GET)
	public String JenisPembiayaanFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponJenisPembiayaan> respon = restTemplate.exchange(
				apiBaseUrl+"/api/jenispembiayaan/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponJenisPembiayaan.class
			);

			model.addAttribute("dataJenisPembiayaan",respon.getBody().getJenisPembiayaan());

			ResponseEntity<ResponProduk> responProduk = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);
			model.addAttribute("listDataProduk",responProduk.getBody().getDataProduk());
			return "/pages/MasterParameter/JenisPembiayaan/FormApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}