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
import com.CMS.CentralParam.KKBSK.excel.MinimalDPExcelExporter;
import com.CMS.CentralParam.KKBSK.model.data.MinimalDP;
import com.CMS.CentralParam.KKBSK.model.form.MinimalDPForm;
import com.CMS.CentralParam.KKBSK.model.request.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.response.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.response.ResponCluster;
import com.CMS.CentralParam.KKBSK.model.response.ResponJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.response.ResponJenisPembiayaan;
import com.CMS.CentralParam.KKBSK.model.response.ResponTipeKonsumen;
import com.CMS.CentralParam.KKBSK.model.response.ResponTujuanPenggunaan;
import com.CMS.CentralParam.KKBSK.model.response.ResponMinimalDP;
import com.CMS.CentralParam.KKBSK.model.response.ResponProduk;
import com.CMS.CentralParam.KKBSK.view.vwMinimalDP;
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
public class MinimalDPController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/MinimalDP/InputData", method = RequestMethod.GET)
	public String MinimalDPInputData(Model model) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			ResponseEntity<ResponProduk> responProduk = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);
			model.addAttribute("listProduk",responProduk.getBody().getDataProduk());

			ResponseEntity<ResponTujuanPenggunaan> responTujuanPenggunaan = restTemplate.exchange(
				apiBaseUrl+"api/tujuanpenggunaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTujuanPenggunaan.class);
			model.addAttribute("listTujuanPenggunaan",responTujuanPenggunaan.getBody().getDataTujuanPenggunaan());

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

			MinimalDPForm minimalDPForm = new MinimalDPForm();
			minimalDPForm.setTipeKonsumen(0);
			minimalDPForm.setJenisKendaraan(0);
			minimalDPForm.setLoanType(0);
			minimalDPForm.setTujuanPenggunaan(0);
			

			model.addAttribute("minimalDP", minimalDPForm);

			return "/pages/MasterParameter/MinimalDP/InputData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping("/MinimalDP/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=MinimalDP_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponMinimalDP> respon = restTemplate.exchange(
			apiBaseUrl+"api/minimaldp/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponMinimalDP.class);

        List<vwMinimalDP> listMinimalDP = respon.getBody().getDataMinimalDP();
         
        MinimalDPExcelExporter excelExporter = new MinimalDPExcelExporter(listMinimalDP);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/MinimalDP/ActionInputData")
	public String MinimalDPActionInputData(@Valid MinimalDPForm minimalDP, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(minimalDP.getCluster().size() == 0) {
				result.rejectValue("cluster", "error.minimalDP", "You must choose Cluster");
			}
			if(minimalDP.getJenisPembiayaan().size() == 0) {
				result.rejectValue("jenisPembiayaan", "error.minimalDP", "You must choose Jenis Pembiayaan");
			}
		}

		if (result.hasErrors()) {
			System.out.print(result.hasErrors());
			ResponseEntity<ResponProduk> responProduk = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);
			model.addAttribute("listProduk",responProduk.getBody().getDataProduk());

			ResponseEntity<ResponTujuanPenggunaan> responTujuanPenggunaan = restTemplate.exchange(
				apiBaseUrl+"api/tujuanpenggunaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTujuanPenggunaan.class);
			model.addAttribute("listTujuanPenggunaan",responTujuanPenggunaan.getBody().getDataTujuanPenggunaan());

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
			model.addAttribute("minimalDP", minimalDP);
            return "/pages/MasterParameter/MinimalDP/InputData";
        }


		try {
			minimalDP.getCluster().forEach((cluster) -> {
				minimalDP.getJenisPembiayaan().forEach((jenisPembiayaan) -> {
					minimalDP.getProduk().forEach((produk) -> {
						MinimalDP temp = new MinimalDP(null, 
						minimalDP.getNamaSkema(), minimalDP.getLoanType(), produk, minimalDP.getTujuanPenggunaan(), minimalDP.getTipeKonsumen(), minimalDP.getJenisKendaraan(), jenisPembiayaan, cluster,minimalDP.getMinimalDp(), 
						null, null, null, null, null, null, null, null);
						try {
							restTemplate.exchange(
								apiBaseUrl+"/api/minimaldp/"+HelperConf.getAction(action), 
								HttpMethod.POST, 
								HelperConf.getHeader(objectMapper.writeValueAsString(temp)), 
								String.class
							);
						} catch (Exception e) {
							
						}
					});
				});
			});

			
			return "redirect:/MinimalDP/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/MinimalDP/ActionEditData")
	public String MinimalDPActionEditData(@Valid MinimalDP minimalDP, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {

		}

		if (result.hasErrors()) {
			ResponseEntity<ResponProduk> responProduk = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);
			model.addAttribute("listProduk",responProduk.getBody().getDataProduk());

			ResponseEntity<ResponTujuanPenggunaan> responTujuanPenggunaan = restTemplate.exchange(
				apiBaseUrl+"api/tujuanpenggunaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTujuanPenggunaan.class);
			model.addAttribute("listTujuanPenggunaan",responTujuanPenggunaan.getBody().getDataTujuanPenggunaan());

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
			model.addAttribute("minimalDP", minimalDP);
            return "/pages/MasterParameter/MinimalDP/EditData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/minimaldp/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(minimalDP)), 
				String.class
			);
			
			return "redirect:/MinimalDP/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/MinimalDP/ActionApprovalData")
	public String MinimalDPActionApprovalData(MinimalDP minimalDP, BindingResult result,String action) {
		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/minimaldp/"+action+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(minimalDP)), 
				String.class
			);

			return "redirect:/MinimalDP/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/MinimalDP/ActionData")
	public String MinimalDPActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/minimaldp/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/MinimalDP/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/MinimalDP/ActionApproval")
	public String MinimalDPActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/minimaldp/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/MinimalDP/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/MinimalDP/EditData/{id}", method = RequestMethod.GET)
	public String MinimalDPEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponMinimalDP> respon = restTemplate.exchange(
				apiBaseUrl+"/api/minimaldp/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponMinimalDP.class
			);

			System.out.println(respon.getBody().getMinimalDP().toString());
			model.addAttribute("minimalDP",respon.getBody().getMinimalDP());

			ResponseEntity<ResponProduk> responProduk = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);
			model.addAttribute("listProduk",responProduk.getBody().getDataProduk());

			ResponseEntity<ResponTujuanPenggunaan> responTujuanPenggunaan = restTemplate.exchange(
				apiBaseUrl+"api/tujuanpenggunaan/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTujuanPenggunaan.class);
			model.addAttribute("listTujuanPenggunaan",responTujuanPenggunaan.getBody().getDataTujuanPenggunaan());
			
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
			
			return "/pages/MasterParameter/MinimalDP/EditData";
		} catch (Exception e) {
			System.out.println("err"+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/MinimalDP/Data" })
	public String getListMinimalDP(Model model) {
		try {
			ResponseEntity<ResponMinimalDP> respon = restTemplate.exchange(
					apiBaseUrl+"api/minimaldp/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponMinimalDP.class);

			model.addAttribute("listMinimalDP", respon.getBody().getDataMinimalDP());

			return "/pages/MasterParameter/MinimalDP/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/MinimalDP/ApprovalData" })
	public String getListApprovalMinimalDP(Model model) {
		try {
			ResponseEntity<ResponMinimalDP> respon = restTemplate.exchange(
					apiBaseUrl+"api/minimaldp/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponMinimalDP.class);

			model.addAttribute("listMinimalDP", respon.getBody().getDataMinimalDP());
			
			return "/pages/MasterParameter/MinimalDP/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/MinimalDP/FormApprovalData/{id}", method = RequestMethod.GET)
	public String MinimalDPFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponMinimalDP> respon = restTemplate.exchange(
				apiBaseUrl+"/api/minimaldp/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponMinimalDP.class
			);
			model.addAttribute("minimalDP",respon.getBody().getMinimalDP());

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

			return "/pages/MasterParameter/MinimalDP/FormApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}