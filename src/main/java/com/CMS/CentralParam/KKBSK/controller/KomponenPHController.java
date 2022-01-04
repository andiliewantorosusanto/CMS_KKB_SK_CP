package com.CMS.CentralParam.KKBSK.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.CMS.CentralParam.KKBSK.config.HelperConf;
import com.CMS.CentralParam.KKBSK.excel.KomponenPHExcelExporter;
import com.CMS.CentralParam.KKBSK.model.data.KomponenPH;
import com.CMS.CentralParam.KKBSK.model.form.JenisKomponenForm;
import com.CMS.CentralParam.KKBSK.model.form.KomponenPHForm;
import com.CMS.CentralParam.KKBSK.model.request.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.response.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.response.ResponJenisPembiayaan;
import com.CMS.CentralParam.KKBSK.model.response.ResponTipeKonsumen;
import com.CMS.CentralParam.KKBSK.model.response.ResponKomponenPH;
import com.CMS.CentralParam.KKBSK.view.vwKomponenPH;
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
public class KomponenPHController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/KomponenPH/InputData", method = RequestMethod.GET)
	public String KomponenPHInputData(Model model) {
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

			KomponenPHForm komponenPHForm = new KomponenPHForm();
			komponenPHForm.setTipeKonsumen(0);

			ArrayList<String> jenises = new ArrayList<String>();
			jenises.add("Biaya Admin");
			jenises.add("Biaya Asuransi");
			jenises.add("Biaya CP");
			jenises.add("Biaya Fidusia");
			jenises.add("Biaya Polis Asuransi Kendaraan");
			jenises.add("Biaya Polis CP");
			jenises.add("Biaya Provisi");

			int id = 1;
			ArrayList<JenisKomponenForm> jenisKomponenForms = new ArrayList<JenisKomponenForm>();
			for (String jen : jenises) {
				JenisKomponenForm jenisKomponenForm = new JenisKomponenForm(id++, jen, 0, 0);
				jenisKomponenForms.add(jenisKomponenForm);
			}
			komponenPHForm.setJenisKomponenForms(jenisKomponenForms);


			model.addAttribute("komponenPH", komponenPHForm);

			return "pages/MasterParameter/KomponenPH/InputData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@GetMapping("/KomponenPH/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=KomponenPH_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponKomponenPH> respon = restTemplate.exchange(
			apiBaseUrl+"api/komponenph/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponKomponenPH.class);

        List<vwKomponenPH> listKomponenPH = respon.getBody().getDataKomponenPH();
         
        KomponenPHExcelExporter excelExporter = new KomponenPHExcelExporter(listKomponenPH);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/KomponenPH/ActionInputData")
	public String KomponenPHActionInputData(@Valid KomponenPHForm komponenPH, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(komponenPH.getJenisPembiayaan().size() == 0) {
				result.rejectValue("jenisPembiayaan", "error.komponenPH", "You must choose Jenis Pembiayaan");
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

			model.addAttribute("komponenPH", komponenPH);
            return "pages/MasterParameter/KomponenPH/InputData";
        }


		try {
			komponenPH.getJenisKomponenForms().forEach( (jenisKomponen) -> {
				komponenPH.getJenisPembiayaan().forEach((jenisPembiayaan) -> {
					KomponenPH temp = new KomponenPH(null, 
					komponenPH.getNamaSkema(), jenisKomponen.getJenis(), jenisKomponen.getAddm(), jenisKomponen.getAddb(), komponenPH.getTipeKonsumen(), jenisPembiayaan, 
					null, null, null, null, null, null, null, null);
					try {
						restTemplate.exchange(
							apiBaseUrl+"/api/komponenph/"+HelperConf.getAction(action), 
							HttpMethod.POST, 
							HelperConf.getHeader(objectMapper.writeValueAsString(temp)), 
							String.class
						);
					} catch (Exception e) {
						
					}
	
				});
			});
			

			
			return "redirect:/KomponenPH/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@PostMapping(value = "/KomponenPH/ActionEditData")
	public String KomponenPHActionEditData(@Valid KomponenPH komponenPH, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {

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

			model.addAttribute("komponenPH", komponenPH);
            return "pages/MasterParameter/KomponenPH/EditData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/komponenph/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(komponenPH)), 
				String.class
			);
			
			return "redirect:/KomponenPH/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@PostMapping(value = "/KomponenPH/ActionApprovalData")
	public String KomponenPHActionApprovalData(KomponenPH komponenPH, BindingResult result,String action) {
		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/komponenph/"+action+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(komponenPH)), 
				String.class
			);

			return "redirect:/KomponenPH/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@PostMapping(value = "/KomponenPH/ActionData")
	public String KomponenPHActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/komponenph/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/KomponenPH/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@PostMapping(value = "/KomponenPH/ActionApproval")
	public String KomponenPHActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/komponenph/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/KomponenPH/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@RequestMapping(value = "/KomponenPH/EditData/{id}", method = RequestMethod.GET)
	public String KomponenPHEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponKomponenPH> respon = restTemplate.exchange(
				apiBaseUrl+"/api/komponenph/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponKomponenPH.class
			);

			model.addAttribute("komponenPH",respon.getBody().getKomponenPH());

			System.out.println("Komponen-PH : "+respon.getBody().getKomponenPH());

			ResponseEntity<ResponTipeKonsumen> responTipeKonsumen = restTemplate.exchange(
				apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeKonsumen.class);
			model.addAttribute("listTipeKonsumen",responTipeKonsumen.getBody().getDataTipeKonsumen());

			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());
			
			return "pages/MasterParameter/KomponenPH/EditData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@GetMapping(value = { "/KomponenPH/Data" })
	public String getListKomponenPH(Model model) {
		try {
			ResponseEntity<ResponKomponenPH> respon = restTemplate.exchange(
					apiBaseUrl+"api/komponenph/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponKomponenPH.class);

			model.addAttribute("listKomponenPH", respon.getBody().getDataKomponenPH());

			return "pages/MasterParameter/KomponenPH/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@GetMapping(value = { "/KomponenPH/ApprovalData" })
	public String getListApprovalKomponenPH(Model model) {
		try {
			ResponseEntity<ResponKomponenPH> respon = restTemplate.exchange(
					apiBaseUrl+"api/komponenph/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponKomponenPH.class);

			model.addAttribute("listKomponenPH", respon.getBody().getDataKomponenPH());
			
			return "pages/MasterParameter/KomponenPH/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	@RequestMapping(value = "/KomponenPH/FormApprovalData/{id}", method = RequestMethod.GET)
	public String KomponenPHFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponKomponenPH> respon = restTemplate.exchange(
				apiBaseUrl+"/api/komponenph/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponKomponenPH.class
			);
			model.addAttribute("komponenPH",respon.getBody().getKomponenPH());

			ResponseEntity<ResponTipeKonsumen> responTipeKonsumen = restTemplate.exchange(
				apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeKonsumen.class);
			model.addAttribute("listTipeKonsumen",responTipeKonsumen.getBody().getDataTipeKonsumen());

			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			return "pages/MasterParameter/KomponenPH/FormApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "pages/expired/token";
	}

	
}