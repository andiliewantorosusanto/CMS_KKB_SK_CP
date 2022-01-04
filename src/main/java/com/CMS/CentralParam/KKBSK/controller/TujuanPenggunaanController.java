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
import com.CMS.CentralParam.KKBSK.excel.TujuanPenggunaanExcelExporter;
import com.CMS.CentralParam.KKBSK.model.data.TujuanPenggunaan;
import com.CMS.CentralParam.KKBSK.model.request.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.response.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.response.ResponProduk;
import com.CMS.CentralParam.KKBSK.model.response.ResponTujuanPenggunaan;
import com.CMS.CentralParam.KKBSK.view.vwTujuanPenggunaan;
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
public class TujuanPenggunaanController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/TujuanPenggunaan/InputData", method = RequestMethod.GET)
	public String TujuanPenggunaanInputData(Model model) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			ResponseEntity<ResponProduk> respon = restTemplate.exchange(
					apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponProduk.class);

			model.addAttribute("listProduk",respon.getBody().getDataProduk());
			model.addAttribute("tujuanPenggunaan", new TujuanPenggunaan());
			
			return "pages/MasterParameter/TujuanPenggunaan/InputData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@GetMapping("/TujuanPenggunaan/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=TujuanPenggunaan_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponTujuanPenggunaan> respon = restTemplate.exchange(
			apiBaseUrl+"api/tujuanpenggunaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponTujuanPenggunaan.class);

        List<vwTujuanPenggunaan> listTujuanPenggunaan = respon.getBody().getDataTujuanPenggunaan();
         
        TujuanPenggunaanExcelExporter excelExporter = new TujuanPenggunaanExcelExporter(listTujuanPenggunaan);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/TujuanPenggunaan/ActionInputData")
	public String TujuanPenggunaanActionInputData(@Valid TujuanPenggunaan tujuanPenggunaan, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(tujuanPenggunaan.getEndBerlaku().before(tujuanPenggunaan.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.tujuanPenggunaan", "End date must be greater than start date");
			}
		}

		if (result.hasErrors()) {
			ResponseEntity<ResponProduk> respon = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);

			model.addAttribute("listProduk",respon.getBody().getDataProduk());
			model.addAttribute("tujuanPenggunaan", tujuanPenggunaan);
            return "pages/MasterParameter/TujuanPenggunaan/InputData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/tujuanpenggunaan/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(tujuanPenggunaan)), 
				String.class
			);
			
			return "redirect:/TujuanPenggunaan/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@PostMapping(value = "/TujuanPenggunaan/ActionEditData")
	public String TujuanPenggunaanActionEditData(@Valid TujuanPenggunaan tujuanPenggunaan, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(tujuanPenggunaan.getEndBerlaku().before(tujuanPenggunaan.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.tujuanPenggunaan", "End date must be greater than start date");
			}
		}

		if (result.hasErrors()) {
			ResponseEntity<ResponProduk> respon = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);

			model.addAttribute("listProduk",respon.getBody().getDataProduk());
			model.addAttribute("tujuanPenggunaan", tujuanPenggunaan);
            return "pages/MasterParameter/TujuanPenggunaan/EditData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/tujuanpenggunaan/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(tujuanPenggunaan)), 
				String.class
			);
			
			return "redirect:/TujuanPenggunaan/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@PostMapping(value = "/TujuanPenggunaan/ActionApprovalData")
	public String TujuanPenggunaanActionApprovalData(TujuanPenggunaan tujuanPenggunaan, BindingResult result,String action) {
		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/tujuanpenggunaan/"+action+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(tujuanPenggunaan)), 
				String.class
			);

			return "redirect:/TujuanPenggunaan/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@PostMapping(value = "/TujuanPenggunaan/ActionData")
	public String TujuanPenggunaanActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/tujuanpenggunaan/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/TujuanPenggunaan/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@PostMapping(value = "/TujuanPenggunaan/ActionApproval")
	public String TujuanPenggunaanActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/tujuanpenggunaan/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/TujuanPenggunaan/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@RequestMapping(value = "/TujuanPenggunaan/EditData/{id}", method = RequestMethod.GET)
	public String TujuanPenggunaanEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponTujuanPenggunaan> respon = restTemplate.exchange(
				apiBaseUrl+"/api/tujuanpenggunaan/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponTujuanPenggunaan.class
			);

			model.addAttribute("tujuanPenggunaan",respon.getBody().getTujuanPenggunaan());

			ResponseEntity<ResponProduk> responProduk = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);
			model.addAttribute("listProduk",responProduk.getBody().getDataProduk());
			
			return "pages/MasterParameter/TujuanPenggunaan/EditData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@GetMapping(value = { "/TujuanPenggunaan/Data" })
	public String getListTujuanPenggunaan(Model model) {
		try {
			ResponseEntity<ResponTujuanPenggunaan> respon = restTemplate.exchange(
					apiBaseUrl+"api/tujuanpenggunaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponTujuanPenggunaan.class);

			model.addAttribute("listTujuanPenggunaan", respon.getBody().getDataTujuanPenggunaan());
			return "pages/MasterParameter/TujuanPenggunaan/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@GetMapping(value = { "/TujuanPenggunaan/ApprovalData" })
	public String getListApprovalTujuanPenggunaan(Model model) {
		try {
			ResponseEntity<ResponTujuanPenggunaan> respon = restTemplate.exchange(
					apiBaseUrl+"api/tujuanpenggunaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponTujuanPenggunaan.class);

			model.addAttribute("listTujuanPenggunaan", respon.getBody().getDataTujuanPenggunaan());
			
			return "pages/MasterParameter/TujuanPenggunaan/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@RequestMapping(value = "/TujuanPenggunaan/FormApprovalData/{id}", method = RequestMethod.GET)
	public String TujuanPenggunaanFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponTujuanPenggunaan> respon = restTemplate.exchange(
				apiBaseUrl+"/api/tujuanpenggunaan/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponTujuanPenggunaan.class
			);
			model.addAttribute("tujuanPenggunaan",respon.getBody().getTujuanPenggunaan());

			ResponseEntity<ResponProduk> responProduk = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);
			model.addAttribute("listProduk",responProduk.getBody().getDataProduk());

			return "pages/MasterParameter/TujuanPenggunaan/FormApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	
}