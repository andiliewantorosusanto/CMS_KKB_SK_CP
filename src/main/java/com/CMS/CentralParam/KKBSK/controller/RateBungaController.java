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
import com.CMS.CentralParam.KKBSK.excel.RateBungaExcelExporter;
import com.CMS.CentralParam.KKBSK.model.data.RateBunga;
import com.CMS.CentralParam.KKBSK.model.form.RateBungaForm;
import com.CMS.CentralParam.KKBSK.model.request.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.response.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.response.ResponCluster;
import com.CMS.CentralParam.KKBSK.model.response.ResponJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.response.ResponJenisPembiayaan;
import com.CMS.CentralParam.KKBSK.model.response.ResponTipeKonsumen;
import com.CMS.CentralParam.KKBSK.model.response.ResponRateBunga;
import com.CMS.CentralParam.KKBSK.view.vwRateBunga;
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
public class RateBungaController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/RateBunga/InputData", method = RequestMethod.GET)
	public String RateBungaInputData(Model model) {
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

			RateBungaForm rateBungaForm = new RateBungaForm();
			rateBungaForm.setLoanType(0);
			rateBungaForm.setJenisKendaraan(0);

			model.addAttribute("rateBunga", rateBungaForm);

			return "/pages/MasterParameter/RateBunga/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping("/RateBunga/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=RateBunga_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponRateBunga> respon = restTemplate.exchange(
			apiBaseUrl+"api/ratebunga/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponRateBunga.class);

        List<vwRateBunga> listRateBunga = respon.getBody().getDataRateBunga();
         
        RateBungaExcelExporter excelExporter = new RateBungaExcelExporter(listRateBunga);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/RateBunga/ActionInputData")
	public String RateBungaActionInputData(@Valid RateBungaForm rateBunga, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(rateBunga.getEndBerlaku().before(rateBunga.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.rateBunga", "End date must be greater than start date");
			}
			if(rateBunga.getCluster().size() == 0) {
				result.rejectValue("cluster", "error.rateBunga", "You must choose Cluster");
			}
			if(rateBunga.getJenisPembiayaan().size() == 0) {
				result.rejectValue("jenisPembiayaan", "error.rateBunga", "You must choose Jenis Pembiayaan");
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
			model.addAttribute("rateBunga", rateBunga);
            return "/pages/MasterParameter/RateBunga/InputData";
        }


		try {
			rateBunga.getCluster().forEach((cluster) -> {
				rateBunga.getJenisPembiayaan().forEach((jenisPembiayaan) -> {
					// RateBunga temp = new RateBunga(null, 
					// rateBunga.getNamaSkema(), rateBunga.getTipeKonsumen(), rateBunga.getJenisKendaraan(), jenisPembiayaan, cluster, rateBunga.getDiskonNpwp(), 
					// rateBunga.getTenor1(), rateBunga.getTenor2(), rateBunga.getTenor3(), rateBunga.getTenor4(), rateBunga.getTenor5(), rateBunga.getTenor6(), rateBunga.getTenor7(), rateBunga.getTenor8(), rateBunga.getTenor9(), rateBunga.getTenor10(),
					// rateBunga.getStartBerlaku(), rateBunga.getEndBerlaku(), null, null, null, null, null, null, null, null);

					// try {
					// 	restTemplate.exchange(
					// 		apiBaseUrl+"/api/ratebunga/"+HelperConf.getAction(action), 
					// 		HttpMethod.POST, 
					// 		HelperConf.getHeader(objectMapper.writeValueAsString(temp)), 
					// 		String.class
					// 	);
					// } catch (Exception e) {
						
					// }

				});
			});

			
			return "redirect:/RateBunga/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/RateBunga/ActionEditData")
	public String RateBungaActionEditData(@Valid RateBunga rateBunga, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(rateBunga.getEndBerlaku().before(rateBunga.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.rateBunga", "End date must be greater than start date");
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
			model.addAttribute("rateBunga", rateBunga);
            return "/pages/MasterParameter/RateBunga/EditData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/ratebunga/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(rateBunga)), 
				String.class
			);
			
			return "redirect:/RateBunga/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/RateBunga/ActionApprovalData")
	public String RateBungaActionApprovalData(RateBunga rateBunga, BindingResult result,String action) {
		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/ratebunga/"+action+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(rateBunga)), 
				String.class
			);

			return "redirect:/RateBunga/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/RateBunga/ActionData")
	public String RateBungaActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/ratebunga/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/RateBunga/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/RateBunga/ActionApproval")
	public String RateBungaActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/ratebunga/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/RateBunga/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/RateBunga/EditData/{id}", method = RequestMethod.GET)
	public String RateBungaEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponRateBunga> respon = restTemplate.exchange(
				apiBaseUrl+"/api/ratebunga/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponRateBunga.class
			);

			model.addAttribute("rateBunga",respon.getBody().getRateBunga());

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
			
			return "/pages/MasterParameter/RateBunga/EditData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/RateBunga/Data" })
	public String getListRateBunga(Model model) {
		try {
			ResponseEntity<ResponRateBunga> respon = restTemplate.exchange(
					apiBaseUrl+"api/ratebunga/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponRateBunga.class);

			model.addAttribute("listRateBunga", respon.getBody().getDataRateBunga());

			return "/pages/MasterParameter/RateBunga/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/RateBunga/ApprovalData" })
	public String getListApprovalRateBunga(Model model) {
		try {
			ResponseEntity<ResponRateBunga> respon = restTemplate.exchange(
					apiBaseUrl+"api/ratebunga/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponRateBunga.class);

			model.addAttribute("listRateBunga", respon.getBody().getDataRateBunga());
			
			return "/pages/MasterParameter/RateBunga/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/RateBunga/FormApprovalData/{id}", method = RequestMethod.GET)
	public String RateBungaFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponRateBunga> respon = restTemplate.exchange(
				apiBaseUrl+"/api/ratebunga/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponRateBunga.class
			);
			model.addAttribute("rateBunga",respon.getBody().getRateBunga());

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

			return "/pages/MasterParameter/RateBunga/FormApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}