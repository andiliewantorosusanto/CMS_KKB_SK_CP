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
import com.CMS.CentralParam.KKBSK.excel.ClusterExcelExporter;
import com.CMS.CentralParam.KKBSK.model.data.Cluster;
import com.CMS.CentralParam.KKBSK.model.request.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.response.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.response.ResponProduk;
import com.CMS.CentralParam.KKBSK.model.response.ResponCluster;
import com.CMS.CentralParam.KKBSK.view.vwCluster;
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
public class ClusterController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/Cluster/InputData", method = RequestMethod.GET)
	public String ClusterInputData(Model model) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			ResponseEntity<ResponProduk> respon = restTemplate.exchange(
					apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponProduk.class);

			model.addAttribute("listProduk",respon.getBody().getDataProduk());
			model.addAttribute("cluster", new Cluster());
			
			return "/pages/MasterParameter/Cluster/InputData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping("/Cluster/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=Cluster_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponCluster> respon = restTemplate.exchange(
			apiBaseUrl+"api/cluster/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponCluster.class);

        List<vwCluster> listCluster = respon.getBody().getDataCluster();
         
        ClusterExcelExporter excelExporter = new ClusterExcelExporter(listCluster);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/Cluster/ActionInputData")
	public String ClusterActionInputData(@Valid Cluster cluster, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(cluster.getEndBerlaku().before(cluster.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.cluster", "End date must be greater than start date");
			}
		}

		if (result.hasErrors()) {
			ResponseEntity<ResponProduk> respon = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);

			model.addAttribute("listProduk",respon.getBody().getDataProduk());
			model.addAttribute("cluster", cluster);
            return "/pages/MasterParameter/Cluster/InputData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/cluster/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(cluster)), 
				String.class
			);
			
			return "redirect:/Cluster/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/Cluster/ActionEditData")
	public String ClusterActionEditData(@Valid Cluster cluster, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(cluster.getEndBerlaku().before(cluster.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.cluster", "End date must be greater than start date");
			}
		}

		if (result.hasErrors()) {
			ResponseEntity<ResponProduk> respon = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);

			model.addAttribute("listProduk",respon.getBody().getDataProduk());
			model.addAttribute("cluster", cluster);
            return "/pages/MasterParameter/Cluster/EditData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/cluster/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(cluster)), 
				String.class
			);
			
			return "redirect:/Cluster/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/Cluster/ActionApprovalData")
	public String ClusterActionApprovalData(Cluster cluster, BindingResult result,String action) {
		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/cluster/"+action+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(cluster)), 
				String.class
			);

			return "redirect:/Cluster/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/Cluster/ActionData")
	public String ClusterActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/cluster/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/Cluster/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/Cluster/ActionApproval")
	public String ClusterActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/cluster/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/Cluster/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/Cluster/EditData/{id}", method = RequestMethod.GET)
	public String ClusterEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponCluster> respon = restTemplate.exchange(
				apiBaseUrl+"/api/cluster/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponCluster.class
			);

			model.addAttribute("cluster",respon.getBody().getCluster());

			ResponseEntity<ResponProduk> responProduk = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);
			model.addAttribute("listProduk",responProduk.getBody().getDataProduk());
			
			return "/pages/MasterParameter/Cluster/EditData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/Cluster/Data" })
	public String getListCluster(Model model) {
		try {
			ResponseEntity<ResponCluster> respon = restTemplate.exchange(
					apiBaseUrl+"api/cluster/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponCluster.class);

			model.addAttribute("listCluster", respon.getBody().getDataCluster());

			return "/pages/MasterParameter/Cluster/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/Cluster/ApprovalData" })
	public String getListApprovalCluster(Model model) {
		try {
			ResponseEntity<ResponCluster> respon = restTemplate.exchange(
					apiBaseUrl+"api/cluster/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponCluster.class);

			model.addAttribute("listCluster", respon.getBody().getDataCluster());
			
			return "/pages/MasterParameter/Cluster/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/Cluster/FormApprovalData/{id}", method = RequestMethod.GET)
	public String ClusterFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponCluster> respon = restTemplate.exchange(
				apiBaseUrl+"/api/cluster/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponCluster.class
			);
			model.addAttribute("cluster",respon.getBody().getCluster());

			ResponseEntity<ResponProduk> responProduk = restTemplate.exchange(
				apiBaseUrl+"api/produk/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponProduk.class);
			model.addAttribute("listProduk",responProduk.getBody().getDataProduk());

			return "/pages/MasterParameter/Cluster/FormApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}