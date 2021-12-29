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
import com.CMS.CentralParam.KKBSK.model.form.BiayaAdminForm;
import com.CMS.CentralParam.KKBSK.model.request.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.response.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.response.ResponCluster;
import com.CMS.CentralParam.KKBSK.model.response.ResponJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.response.ResponJenisPembiayaan;
import com.CMS.CentralParam.KKBSK.model.response.ResponTipeKonsumen;
import com.CMS.CentralParam.KKBSK.model.response.ResponBiayaAdmin;
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
	public String BiayaAdminInputData(Model model) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			ResponseEntity<ResponTipeKonsumen> responTipeKonsumen = restTemplate.exchange(
				apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeKonsumen.class);
			model.addAttribute("listTipeKonsumen",responTipeKonsumen.getBody().getDataTipeKonsumen());

			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());

			ResponseEntity<ResponCluster> responCluster = restTemplate.exchange(
				apiBaseUrl+"api/cluster/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponCluster.class);
			model.addAttribute("listCluster",responCluster.getBody().getDataCluster());

			BiayaAdminForm biayaAdminForm = new BiayaAdminForm();
			biayaAdminForm.setTipeKonsumen(0);
			biayaAdminForm.setJenisKendaraan(0);
			biayaAdminForm.setDiskonNpwp(0);

			model.addAttribute("biayaAdmin", biayaAdminForm);

			return "/pages/MasterParameter/BiayaAdmin/InputData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
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
	public String BiayaAdminActionInputData(@Valid BiayaAdminForm biayaAdmin, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(biayaAdmin.getEndBerlaku().before(biayaAdmin.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.biayaAdmin", "End date must be greater than start date");
			}
			if(biayaAdmin.getCluster().size() == 0) {
				result.rejectValue("cluster", "error.biayaAdmin", "You must choose Cluster");
			}
			if(biayaAdmin.getJenisPembiayaan().size() == 0) {
				result.rejectValue("jenisPembiayaan", "error.biayaAdmin", "You must choose Jenis Pembiayaan");
			}
		}

		if (result.hasErrors()) {
			ResponseEntity<ResponTipeKonsumen> responTipeKonsumen = restTemplate.exchange(
				apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeKonsumen.class);
			model.addAttribute("listTipeKonsumen",responTipeKonsumen.getBody().getDataTipeKonsumen());

			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());

			ResponseEntity<ResponCluster> responCluster = restTemplate.exchange(
				apiBaseUrl+"api/cluster/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponCluster.class);
			model.addAttribute("listCluster",responCluster.getBody().getDataCluster());
			model.addAttribute("biayaAdmin", biayaAdmin);
            return "/pages/MasterParameter/BiayaAdmin/InputData";
        }


		try {
			biayaAdmin.getCluster().forEach((cluster) -> {
				biayaAdmin.getJenisPembiayaan().forEach((jenisPembiayaan) -> {
					BiayaAdmin temp = new BiayaAdmin(null, 
					biayaAdmin.getNamaSkema(), biayaAdmin.getTipeKonsumen(), biayaAdmin.getJenisKendaraan(), jenisPembiayaan, cluster, biayaAdmin.getDiskonNpwp(), 
					biayaAdmin.getTenor1(), biayaAdmin.getTenor2(), biayaAdmin.getTenor3(), biayaAdmin.getTenor4(), biayaAdmin.getTenor5(), biayaAdmin.getTenor6(), biayaAdmin.getTenor7(), biayaAdmin.getTenor8(), biayaAdmin.getTenor9(), biayaAdmin.getTenor10(),
					biayaAdmin.getStartBerlaku(), biayaAdmin.getEndBerlaku(), null, null, null, null, null, null, null, null);

					try {
						restTemplate.exchange(
							apiBaseUrl+"/api/biayaadmin/"+HelperConf.getAction(action), 
							HttpMethod.POST, 
							HelperConf.getHeader(objectMapper.writeValueAsString(temp)), 
							String.class
						);
					} catch (Exception e) {
						
					}

				});
			});

			
			return "redirect:/BiayaAdmin/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/BiayaAdmin/ActionEditData")
	public String BiayaAdminActionEditData(@Valid BiayaAdmin biayaAdmin, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(biayaAdmin.getEndBerlaku().before(biayaAdmin.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.biayaAdmin", "End date must be greater than start date");
			}
		}

		if (result.hasErrors()) {
			ResponseEntity<ResponTipeKonsumen> responTipeKonsumen = restTemplate.exchange(
				apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeKonsumen.class);
			model.addAttribute("listTipeKonsumen",responTipeKonsumen.getBody().getDataTipeKonsumen());

			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());

			ResponseEntity<ResponCluster> responCluster = restTemplate.exchange(
				apiBaseUrl+"api/cluster/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponCluster.class);
			model.addAttribute("listCluster",responCluster.getBody().getDataCluster());
			model.addAttribute("biayaAdmin", biayaAdmin);
            return "/pages/MasterParameter/BiayaAdmin/EditData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/biayaadmin/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(biayaAdmin)), 
				String.class
			);
			
			return "redirect:/BiayaAdmin/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/BiayaAdmin/ActionApprovalData")
	public String BiayaAdminActionApprovalData(BiayaAdmin biayaAdmin, BindingResult result,String action) {
		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/biayaadmin/"+action+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(biayaAdmin)), 
				String.class
			);

			return "redirect:/BiayaAdmin/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
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
			System.out.println("Error : "+e.toString());
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
			System.out.println("Error : "+e.toString());
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

			model.addAttribute("biayaAdmin",respon.getBody().getBiayaAdmin());

			ResponseEntity<ResponTipeKonsumen> responTipeKonsumen = restTemplate.exchange(
				apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeKonsumen.class);
			model.addAttribute("listTipeKonsumen",responTipeKonsumen.getBody().getDataTipeKonsumen());

			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());

			ResponseEntity<ResponCluster> responCluster = restTemplate.exchange(
				apiBaseUrl+"api/cluster/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponCluster.class);
			model.addAttribute("listCluster",responCluster.getBody().getDataCluster());
			
			return "/pages/MasterParameter/BiayaAdmin/EditData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
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

			model.addAttribute("listBiayaAdmin", respon.getBody().getDataBiayaAdmin());

			return "/pages/MasterParameter/BiayaAdmin/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
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

			model.addAttribute("listBiayaAdmin", respon.getBody().getDataBiayaAdmin());
			
			return "/pages/MasterParameter/BiayaAdmin/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
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
			model.addAttribute("biayaAdmin",respon.getBody().getBiayaAdmin());

			ResponseEntity<ResponTipeKonsumen> responTipeKonsumen = restTemplate.exchange(
				apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeKonsumen.class);
			model.addAttribute("listTipeKonsumen",responTipeKonsumen.getBody().getDataTipeKonsumen());

			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());

			ResponseEntity<ResponCluster> responCluster = restTemplate.exchange(
				apiBaseUrl+"api/cluster/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponCluster.class);
			model.addAttribute("listCluster",responCluster.getBody().getDataCluster());

			return "/pages/MasterParameter/BiayaAdmin/FormApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}