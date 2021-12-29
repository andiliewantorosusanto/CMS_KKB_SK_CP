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
import com.CMS.CentralParam.KKBSK.model.data.BiayaProvisi;
import com.CMS.CentralParam.KKBSK.model.form.BiayaProvisiForm;
import com.CMS.CentralParam.KKBSK.model.request.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.response.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.response.ResponJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.response.ResponJenisPembiayaan;
import com.CMS.CentralParam.KKBSK.model.response.ResponBiayaProvisi;
import com.CMS.CentralParam.KKBSK.view.vwBiayaProvisi;
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
	public String BiayaProvisiInputData(Model model) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			

			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());

			BiayaProvisiForm biayaProvisiForm = new BiayaProvisiForm();
			biayaProvisiForm.setJenisKendaraan(0);
			biayaProvisiForm.setLoanType(0);

			model.addAttribute("biayaProvisi", biayaProvisiForm);

			return "/pages/MasterParameter/BiayaProvisi/InputData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
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
        String headerValue = "attachment; filename=BiayaProvisi_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponBiayaProvisi> respon = restTemplate.exchange(
			apiBaseUrl+"api/biayaprovisi/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponBiayaProvisi.class);

        List<vwBiayaProvisi> listBiayaProvisi = respon.getBody().getDataBiayaProvisi();
         
        BiayaProvisiExcelExporter excelExporter = new BiayaProvisiExcelExporter(listBiayaProvisi);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/BiayaProvisi/ActionInputData")
	public String BiayaProvisiActionInputData(@Valid BiayaProvisiForm biayaProvisi, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(biayaProvisi.getEndBerlaku().before(biayaProvisi.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.biayaProvisi", "End date must be greater than start date");
			}
			if(biayaProvisi.getJenisPembiayaan().size() == 0) {
				result.rejectValue("jenisPembiayaan", "error.biayaProvisi", "You must choose Jenis Pembiayaan");
			}
		}

		if (result.hasErrors()) {


			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());
			model.addAttribute("biayaProvisi", biayaProvisi);
            return "/pages/MasterParameter/BiayaProvisi/InputData";
        }


		try {
			biayaProvisi.getJenisPembiayaan().forEach((jenisPembiayaan) -> {
				BiayaProvisi temp = new BiayaProvisi(null, 
				biayaProvisi.getNamaSkema(), biayaProvisi.getStartBerlaku(), biayaProvisi.getEndBerlaku(), biayaProvisi.getLoanType(), biayaProvisi.getJenisKendaraan(), jenisPembiayaan, 
				biayaProvisi.getTenor1(), biayaProvisi.getTenor2(), biayaProvisi.getTenor3(), biayaProvisi.getTenor4(), biayaProvisi.getTenor5(), biayaProvisi.getTenor6(), biayaProvisi.getTenor7(), biayaProvisi.getTenor8(), biayaProvisi.getTenor9(), biayaProvisi.getTenor10(), 
				biayaProvisi.getTenor1Persen(), biayaProvisi.getTenor2Persen(), biayaProvisi.getTenor3Persen(), biayaProvisi.getTenor4Persen(), biayaProvisi.getTenor5Persen(), 
				biayaProvisi.getTenor6Persen(), biayaProvisi.getTenor7Persen(), biayaProvisi.getTenor8Persen(), biayaProvisi.getTenor9Persen(), biayaProvisi.getTenor10Persen(), 
				null, null, null, null, null, null, null, null);
				try {
					restTemplate.exchange(
						apiBaseUrl+"/api/biayaprovisi/"+HelperConf.getAction(action), 
						HttpMethod.POST, 
						HelperConf.getHeader(objectMapper.writeValueAsString(temp)), 
						String.class
					);
				} catch (Exception e) {
					
				}

			});

			
			return "redirect:/BiayaProvisi/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/BiayaProvisi/ActionEditData")
	public String BiayaProvisiActionEditData(@Valid BiayaProvisi biayaProvisi, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(biayaProvisi.getEndBerlaku().before(biayaProvisi.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.biayaProvisi", "End date must be greater than start date");
			}
		}

		if (result.hasErrors()) {


			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());
			model.addAttribute("biayaProvisi", biayaProvisi);
            return "/pages/MasterParameter/BiayaProvisi/EditData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/biayaprovisi/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(biayaProvisi)), 
				String.class
			);
			
			return "redirect:/BiayaProvisi/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/BiayaProvisi/ActionApprovalData")
	public String BiayaProvisiActionApprovalData(BiayaProvisi biayaProvisi, BindingResult result,String action) {
		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/biayaprovisi/"+action+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(biayaProvisi)), 
				String.class
			);

			return "redirect:/BiayaProvisi/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
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
			System.out.println("Error : "+e.toString());
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
			System.out.println("Error : "+e.toString());
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

			model.addAttribute("biayaProvisi",respon.getBody().getBiayaProvisi());



			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());
			
			return "/pages/MasterParameter/BiayaProvisi/EditData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
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

			model.addAttribute("listBiayaProvisi", respon.getBody().getDataBiayaProvisi());

			return "/pages/MasterParameter/BiayaProvisi/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
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

			model.addAttribute("listBiayaProvisi", respon.getBody().getDataBiayaProvisi());
			
			return "/pages/MasterParameter/BiayaProvisi/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
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
			model.addAttribute("biayaProvisi",respon.getBody().getBiayaProvisi());



			ResponseEntity<ResponJenisPembiayaan> responJenisPembiayaan = restTemplate.exchange(
				apiBaseUrl+"api/jenispembiayaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisPembiayaan.class);
			model.addAttribute("listJenisPembiayaan",responJenisPembiayaan.getBody().getDataJenisPembiayaan());

			ResponseEntity<ResponJenisKendaraan> responJenisKendaraan = restTemplate.exchange(
				apiBaseUrl+"api/jeniskendaraan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponJenisKendaraan.class);
			model.addAttribute("listJenisKendaraan",responJenisKendaraan.getBody().getDataJenisKendaraan());

			return "/pages/MasterParameter/BiayaProvisi/FormApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}