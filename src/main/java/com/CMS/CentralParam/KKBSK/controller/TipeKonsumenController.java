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
import com.CMS.CentralParam.KKBSK.excel.TipeKonsumenExcelExporter;
import com.CMS.CentralParam.KKBSK.model.REQUEST.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.RESPON.DataProduk;
import com.CMS.CentralParam.KKBSK.model.RESPON.DataTipeKonsumen;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponProduk;
import com.CMS.CentralParam.KKBSK.model.RESPON.ResponTipeKonsumen;
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
public class TipeKonsumenController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/TipeKonsumen/InputData", method = RequestMethod.GET)
	public String TipeKonsumenInputData(DataTipeKonsumen dataTipeKonsumen,Model model) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			ResponseEntity<ResponProduk> respon = restTemplate.exchange(
					apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponProduk.class);

			model.addAttribute("listDataProduk",respon.getBody().getDataProduk());

			return "/pages/MasterParameter/TipeKonsumen/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping("/TipeKonsumen/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=TipeKonsumen_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponTipeKonsumen> respon = restTemplate.exchange(
			apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponTipeKonsumen.class);

        List<DataTipeKonsumen> listTipeKonsumen = respon.getBody().getDataTipeKonsumen();
         
        TipeKonsumenExcelExporter excelExporter = new TipeKonsumenExcelExporter(listTipeKonsumen);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/TipeKonsumen/ActionInputData")
	public String TipeKonsumenActionInputData(@Valid DataTipeKonsumen dataTipeKonsumen, BindingResult result,String action,Model model) {
		if (result.hasErrors()) {
			ResponseEntity<ResponProduk> respon = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);

			model.addAttribute("listDataProduk",respon.getBody().getDataProduk());

            return "/pages/MasterParameter/TipeKonsumen/InputData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataTipeKonsumen)), 
				String.class
			);
			
			return "redirect:/TipeKonsumen/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/TipeKonsumen/ActionApprovalData")
	public String TipeKonsumenActionApprovalData(@Valid DataTipeKonsumen dataTipeKonsumen, BindingResult result,String action) {
		if (result.hasErrors()) {
			
            return "/pages/MasterParameter/TipeKonsumen/ApprovalData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+HelperConf.getAction(action)+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataTipeKonsumen)), 
				String.class
			);
			
			return "redirect:/TipeKonsumen/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/TipeKonsumen/ActionData")
	public String TipeKonsumenActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/TipeKonsumen/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@PostMapping(value = "/TipeKonsumen/ActionApproval")
	public String TipeKonsumenActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/TipeKonsumen/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@RequestMapping(value = "/TipeKonsumen/EditData/{id}", method = RequestMethod.GET)
	public String TipeKonsumenEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponTipeKonsumen> respon = restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponTipeKonsumen.class
			);

			model.addAttribute("dataTipeKonsumen",respon.getBody().getTipeKonsumen());

			ResponseEntity<ResponProduk> responProduk = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);
			model.addAttribute("listDataProduk",responProduk.getBody().getDataProduk());
			
			return "/pages/MasterParameter/TipeKonsumen/EditData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/TipeKonsumen/Data" })
	public String getListTipeKonsumen(Model model) {
		try {
			ResponseEntity<ResponTipeKonsumen> respon = restTemplate.exchange(
					apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponTipeKonsumen.class);

			model.addAttribute("listDataTipeKonsumen", respon.getBody().getDataTipeKonsumen());

			System.out.println(respon.getBody().getDataTipeKonsumen().get(1).toString());
			return "/pages/MasterParameter/TipeKonsumen/Data";
		} catch (Exception e) {
			System.out.println(e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/TipeKonsumen/ApprovalData" })
	public String getListApprovalTipeKonsumen(Model model) {
		try {
			ResponseEntity<ResponTipeKonsumen> respon = restTemplate.exchange(
					apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponTipeKonsumen.class);

			model.addAttribute("listDataTipeKonsumen", respon.getBody().getDataTipeKonsumen());
			
			return "/pages/MasterParameter/TipeKonsumen/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/TipeKonsumen/FormApprovalData/{id}", method = RequestMethod.GET)
	public String TipeKonsumenFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponTipeKonsumen> respon = restTemplate.exchange(
				apiBaseUrl+"/api/tipekonsumen/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponTipeKonsumen.class
			);
			model.addAttribute("dataTipeKonsumen",respon.getBody().getTipeKonsumen());

			ResponseEntity<ResponProduk> responProduk = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);
			model.addAttribute("listDataProduk",responProduk.getBody().getDataProduk());

			return "/pages/MasterParameter/TipeKonsumen/FormApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}