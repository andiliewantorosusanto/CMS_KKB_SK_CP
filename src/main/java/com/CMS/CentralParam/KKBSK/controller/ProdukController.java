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
import com.CMS.CentralParam.KKBSK.excel.ProdukExcelExporter;
import com.CMS.CentralParam.KKBSK.model.data.Produk;
import com.CMS.CentralParam.KKBSK.model.request.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.response.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.response.ResponProduk;
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
public class ProdukController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/Produk/InputData", method = RequestMethod.GET)
	public String ProdukInputData(Model model) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			model.addAttribute("produk", new Produk());
			
			return "/pages/MasterParameter/Produk/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping("/Produk/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=Produk_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponProduk> respon = restTemplate.exchange(
			apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponProduk.class);

        List<Produk> listProduk = respon.getBody().getDataProduk();
         
        ProdukExcelExporter excelExporter = new ProdukExcelExporter(listProduk);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/Produk/ActionInputData")
	public String ProdukActionInputData(@Valid Produk produk, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(produk.getEndBerlaku().before(produk.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.produk", "End date must be greater than start date");
			}
		}

		if (result.hasErrors()) {
			model.addAttribute("produk", produk);
            return "/pages/MasterParameter/Produk/InputData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/produk/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(produk)), 
				String.class
			);
			
			return "redirect:/Produk/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/Produk/ActionEditData")
	public String ProdukActionEditData(@Valid Produk produk, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(produk.getEndBerlaku().before(produk.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.produk", "End date must be greater than start date");
			}
		}

		if (result.hasErrors()) {
			model.addAttribute("produk", produk);
            return "/pages/MasterParameter/Produk/EditData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/produk/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(produk)), 
				String.class
			);
			
			return "redirect:/Produk/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/Produk/ActionApprovalData")
	public String ProdukActionApprovalData(Produk produk, BindingResult result,String action) {
		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/produk/"+action+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(produk)), 
				String.class
			);

			return "redirect:/Produk/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/Produk/ActionData")
	public String ProdukActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/produk/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/Produk/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/Produk/ActionApproval")
	public String ProdukActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/produk/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/Produk/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/Produk/EditData/{id}", method = RequestMethod.GET)
	public String ProdukEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponProduk> respon = restTemplate.exchange(
				apiBaseUrl+"/api/produk/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponProduk.class
			);

			model.addAttribute("produk",respon.getBody().getProduk());
			
			return "/pages/MasterParameter/Produk/EditData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/Produk/Data" })
	public String getListProduk(Model model) {
		try {
			ResponseEntity<ResponProduk> respon = restTemplate.exchange(
					apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponProduk.class);

			model.addAttribute("listProduk", respon.getBody().getDataProduk());

			return "/pages/MasterParameter/Produk/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/Produk/ApprovalData" })
	public String getListApprovalProduk(Model model) {
		try {
			ResponseEntity<ResponProduk> respon = restTemplate.exchange(
					apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponProduk.class);

			model.addAttribute("listProduk", respon.getBody().getDataProduk());
			
			return "/pages/MasterParameter/Produk/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/Produk/FormApprovalData/{id}", method = RequestMethod.GET)
	public String ProdukFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponProduk> respon = restTemplate.exchange(
				apiBaseUrl+"/api/produk/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponProduk.class
			);
			model.addAttribute("produk",respon.getBody().getProduk());

			return "/pages/MasterParameter/Produk/FormApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}