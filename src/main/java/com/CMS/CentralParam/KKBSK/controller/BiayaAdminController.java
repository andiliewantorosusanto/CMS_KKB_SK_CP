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
import com.CMS.CentralParam.KKBSK.excel.BiayaAdminExcelExporter;
import com.CMS.CentralParam.KKBSK.model.data.BiayaAdmin;
import com.CMS.CentralParam.KKBSK.model.request.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.response.ResponBiayaAdmin;
import com.CMS.CentralParam.KKBSK.model.response.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.response.ResponCluster;
import com.CMS.CentralParam.KKBSK.model.response.ResponJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.response.ResponJenisPembiayaan;
import com.CMS.CentralParam.KKBSK.model.response.ResponTipeKonsumen;
import com.CMS.CentralParam.KKBSK.view.vwBiayaAdmin;
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
public class BiayaAdminController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/BiayaAdmin/InputData", method = RequestMethod.GET)
	public String BiayaAdminInputData(BiayaAdmin dataBiayaAdmin,Model model) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			ResponseEntity<ResponTipeKonsumen> responTipeKonsumen = restTemplate.exchange(
				apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeKonsumen.class);
			model.addAttribute("listDataTipeKonsumen",responTipeKonsumen.getBody().getDataTipeKonsumen());

			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listDataJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listDataJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());

			ResponseEntity<ResponCluster> responCluster = restTemplate.exchange(
				apiBaseUrl+"api/cluster/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponCluster.class);
			model.addAttribute("listDataCluster",responCluster.getBody().getDataCluster());
			
			return "/pages/MasterParameter/BiayaAdmin/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping("/BiayaAdmin/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=BiayaAdmin_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponBiayaAdmin> respon = restTemplate.exchange(
			apiBaseUrl+"api/biayaadmin/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponBiayaAdmin.class);

        List<vwBiayaAdmin> listBiayaAdmin = respon.getBody().getDataBiayaAdmin();
         
        BiayaAdminExcelExporter excelExporter = new BiayaAdminExcelExporter(listBiayaAdmin);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/BiayaAdmin/ActionInputData")
	public String BiayaAdminActionInputData(@Valid BiayaAdmin dataBiayaAdmin, BindingResult result,String action,Model model) {
		if(dataBiayaAdmin.getEndBerlaku().before(dataBiayaAdmin.getStartBerlaku())) {
			result.rejectValue("endBerlaku", "error.dataBiayaAdmin", "End date must be greater than start date");
		}

		if (result.hasErrors()) {
			ResponseEntity<ResponTipeKonsumen> responTipeKonsumen = restTemplate.exchange(
				apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeKonsumen.class);
			model.addAttribute("listDataTipeKonsumen",responTipeKonsumen.getBody().getDataTipeKonsumen());

			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listDataJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listDataJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());

			ResponseEntity<ResponCluster> responCluster = restTemplate.exchange(
				apiBaseUrl+"api/cluster/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponCluster.class);
			model.addAttribute("listDataCluster",responCluster.getBody().getDataCluster());

            return "/pages/MasterParameter/BiayaAdmin/InputData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/biayaadmin/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataBiayaAdmin)), 
				String.class
			);
			
			return "redirect:/BiayaAdmin/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/BiayaAdmin/ActionApprovalData")
	public String BiayaAdminActionApprovalData(@Valid BiayaAdmin dataBiayaAdmin, BindingResult result,String action) {
		if (result.hasErrors()) {
            return "/pages/MasterParameter/BiayaAdmin/ApprovalData";
        }

		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/biayaadmin/"+action+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(dataBiayaAdmin)), 
				String.class
			);
			
			return "redirect:/BiayaAdmin/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/BiayaAdmin/ActionData")
	public String BiayaAdminActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/biayaadmin/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/BiayaAdmin/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@PostMapping(value = "/BiayaAdmin/ActionApproval")
	public String BiayaAdminActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/biayaadmin/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/BiayaAdmin/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}
	@RequestMapping(value = "/BiayaAdmin/EditData/{id}", method = RequestMethod.GET)
	public String BiayaAdminEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponBiayaAdmin> respon = restTemplate.exchange(
				apiBaseUrl+"/api/biayaadmin/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponBiayaAdmin.class
			);

			model.addAttribute("dataBiayaAdmin",respon.getBody().getBiayaAdmin());

			ResponseEntity<ResponTipeKonsumen> responTipeKonsumen = restTemplate.exchange(
				apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeKonsumen.class);
			model.addAttribute("listDataTipeKonsumen",responTipeKonsumen.getBody().getDataTipeKonsumen());

			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listDataJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listDataJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());

			ResponseEntity<ResponCluster> responCluster = restTemplate.exchange(
				apiBaseUrl+"api/cluster/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponCluster.class);
			model.addAttribute("listDataCluster",responCluster.getBody().getDataCluster());
			return "/pages/MasterParameter/BiayaAdmin/EditData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/BiayaAdmin/Data" })
	public String getListBiayaAdmin(Model model) {
		try {
			ResponseEntity<ResponBiayaAdmin> respon = restTemplate.exchange(
					apiBaseUrl+"api/biayaadmin/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponBiayaAdmin.class);

			model.addAttribute("listDataBiayaAdmin", respon.getBody().getDataBiayaAdmin());
			return "/pages/MasterParameter/BiayaAdmin/Data";
		} catch (Exception e) {
			System.out.println(e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/BiayaAdmin/ApprovalData" })
	public String getListApprovalBiayaAdmin(Model model) {
		try {
			ResponseEntity<ResponBiayaAdmin> respon = restTemplate.exchange(
					apiBaseUrl+"api/biayaadmin/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponBiayaAdmin.class);

			model.addAttribute("listDataBiayaAdmin", respon.getBody().getDataBiayaAdmin());
			return "/pages/MasterParameter/BiayaAdmin/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/BiayaAdmin/FormApprovalData/{id}", method = RequestMethod.GET)
	public String BiayaAdminFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponBiayaAdmin> respon = restTemplate.exchange(
				apiBaseUrl+"/api/biayaadmin/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponBiayaAdmin.class
			);

			model.addAttribute("dataBiayaAdmin",respon.getBody().getBiayaAdmin());

			ResponseEntity<ResponTipeKonsumen> responTipeKonsumen = restTemplate.exchange(
				apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeKonsumen.class);
			model.addAttribute("listDataTipeKonsumen",responTipeKonsumen.getBody().getDataTipeKonsumen());

			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listDataJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listDataJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());

			ResponseEntity<ResponCluster> responCluster = restTemplate.exchange(
				apiBaseUrl+"api/cluster/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponCluster.class);
			model.addAttribute("listDataCluster",responCluster.getBody().getDataCluster());

			return "/pages/MasterParameter/BiayaAdmin/FormApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}