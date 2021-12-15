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
import com.CMS.CentralParam.KKBSK.excel.BiayaProvisiExcelExporter;
import com.CMS.CentralParam.KKBSK.model.REQUEST.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.RESPON.DataBiayaProvisi;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponJenisPembiayaan;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponBiayaProvisi;
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
public class BiayaProvisiController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/BiayaProvisi/InputData", method = RequestMethod.GET)
	public String BiayaProvisiInputData(DataBiayaProvisi dataBiayaProvisi,Model model) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listDataJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listDataJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());

			return "/pages/MasterParameter/BiayaProvisi/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping("/BiayaProvisi/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponBiayaProvisi> respon = restTemplate.exchange(
			apiBaseUrl+"api/biayaprovisi/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponBiayaProvisi.class);

        List<DataBiayaProvisi> listBiayaProvisi = respon.getBody().getDataBiayaProvisi();
         
        BiayaProvisiExcelExporter excelExporter = new BiayaProvisiExcelExporter(listBiayaProvisi);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/BiayaProvisi/ActionInputData")
	public String BiayaProvisiActionInputData(@Valid DataBiayaProvisi dataBiayaProvisi, BindingResult result,String action,Model model) {
		if (result.hasErrors()) {
			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listDataJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listDataJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());

            return "/pages/MasterParameter/BiayaProvisi/InputData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/biayaprovisi/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataBiayaProvisi)), 
				String.class
			);
			
			return "redirect:/BiayaProvisi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/BiayaProvisi/ActionApprovalData")
	public String BiayaProvisiActionApprovalData(@Valid DataBiayaProvisi dataBiayaProvisi, BindingResult result,String action) {
		if (result.hasErrors()) {
            return "/pages/MasterParameter/BiayaProvisi/ApprovalData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/biayaprovisi/"+HelperConf.getAction(action)+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataBiayaProvisi)), 
				String.class
			);
			
			return "redirect:/BiayaProvisi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/BiayaProvisi/ActionData")
	public String BiayaProvisiActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/biayaprovisi/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/BiayaProvisi/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@PostMapping(value = "/BiayaProvisi/ActionApproval")
	public String BiayaProvisiActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/biayaprovisi/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/BiayaProvisi/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@RequestMapping(value = "/BiayaProvisi/EditData/{id}", method = RequestMethod.GET)
	public String BiayaProvisiEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponBiayaProvisi> respon = restTemplate.exchange(
				apiBaseUrl+"/api/biayaprovisi/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponBiayaProvisi.class
			);

			model.addAttribute("dataBiayaProvisi",respon.getBody().getDataBiayaProvisi());

			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listDataJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listDataJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());
			
			return "/pages/MasterParameter/BiayaProvisi/EditData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/BiayaProvisi/Data" })
	public String getListBiayaProvisi(Model model) {
		try {
			ResponseEntity<ResponBiayaProvisi> respon = restTemplate.exchange(
					apiBaseUrl+"api/biayaprovisi/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponBiayaProvisi.class);

			model.addAttribute("listDataBiayaProvisi", respon.getBody().getDataBiayaProvisi());

			return "/pages/MasterParameter/BiayaProvisi/Data";
		} catch (Exception e) {
			System.out.print(e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/BiayaProvisi/ApprovalData" })
	public String getListApprovalBiayaProvisi(Model model) {
		try {
			ResponseEntity<ResponBiayaProvisi> respon = restTemplate.exchange(
					apiBaseUrl+"api/biayaprovisi/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponBiayaProvisi.class);

			model.addAttribute("listDataBiayaProvisi", respon.getBody().getDataBiayaProvisi());
			return "/pages/MasterParameter/BiayaProvisi/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/BiayaProvisi/FormApprovalData/{id}", method = RequestMethod.GET)
	public String BiayaProvisiFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponBiayaProvisi> respon = restTemplate.exchange(
				apiBaseUrl+"/api/biayaprovisi/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponBiayaProvisi.class
			);

			model.addAttribute("dataBiayaProvisi",respon.getBody().getDataBiayaProvisi());

			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listDataJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listDataJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());
			
			return "/pages/MasterParameter/BiayaProvisi/FormApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}