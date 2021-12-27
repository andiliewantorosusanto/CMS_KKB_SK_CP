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
import com.CMS.CentralParam.KKBSK.excel.RateCPExcelExporter;
import com.CMS.CentralParam.KKBSK.model.data.RateCP;
import com.CMS.CentralParam.KKBSK.model.request.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.response.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.response.ResponRateCP;
import com.CMS.CentralParam.KKBSK.model.response.ResponTipeKonsumen;
import com.CMS.CentralParam.KKBSK.view.vwRateCP;
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
public class RateCPController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/RateCP/InputData", method = RequestMethod.GET)
	public String RateCPInputData(Model model) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);
			
			ResponseEntity<ResponTipeKonsumen> responTipeKonsumen = restTemplate.exchange(
				apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeKonsumen.class);
			model.addAttribute("listTipeKonsumen",responTipeKonsumen.getBody().getDataTipeKonsumen());

			RateCP rateCPForm = new RateCP();
			rateCPForm.setTipeKonsumen(0);

			model.addAttribute("rateCP", rateCPForm);

			return "/pages/MasterParameter/RateCP/InputData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping("/RateCP/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=RateCP_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponRateCP> respon = restTemplate.exchange(
			apiBaseUrl+"api/ratecp/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponRateCP.class);

        List<vwRateCP> listRateCP = respon.getBody().getDataRateCP();
         
        RateCPExcelExporter excelExporter = new RateCPExcelExporter(listRateCP);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/RateCP/ActionInputData")
	public String RateCPActionInputData(@Valid RateCP rateCP, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(rateCP.getEndBerlaku().before(rateCP.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.rateCP", "End date must be greater than start date");
			}
		}

		if (result.hasErrors()) {
			ResponseEntity<ResponTipeKonsumen> responTipeKonsumen = restTemplate.exchange(
				apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeKonsumen.class);
			model.addAttribute("listTipeKonsumen",responTipeKonsumen.getBody().getDataTipeKonsumen());
			model.addAttribute("rateCP", rateCP);
            return "/pages/MasterParameter/RateCP/InputData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/ratecp/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(rateCP)), 
				String.class
			);
			return "redirect:/RateCP/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/RateCP/ActionEditData")
	public String RateCPActionEditData(@Valid RateCP rateCP, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(rateCP.getEndBerlaku().before(rateCP.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.rateCP", "End date must be greater than start date");
			}
		}

		if (result.hasErrors()) {
			ResponseEntity<ResponTipeKonsumen> responTipeKonsumen = restTemplate.exchange(
				apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeKonsumen.class);
			model.addAttribute("listTipeKonsumen",responTipeKonsumen.getBody().getDataTipeKonsumen());

			model.addAttribute("rateCP", rateCP);
            return "/pages/MasterParameter/RateCP/EditData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/ratecp/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(rateCP)), 
				String.class
			);
			
			return "redirect:/RateCP/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/RateCP/ActionApprovalData")
	public String RateCPActionApprovalData(RateCP rateCP, BindingResult result,String action) {
		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/ratecp/"+action+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(rateCP)), 
				String.class
			);

			return "redirect:/RateCP/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/RateCP/ActionData")
	public String RateCPActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/ratecp/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/RateCP/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/RateCP/ActionApproval")
	public String RateCPActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/ratecp/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/RateCP/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/RateCP/EditData/{id}", method = RequestMethod.GET)
	public String RateCPEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponRateCP> respon = restTemplate.exchange(
				apiBaseUrl+"/api/ratecp/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponRateCP.class
			);

			model.addAttribute("rateCP",respon.getBody().getRateCP());

			ResponseEntity<ResponTipeKonsumen> responTipeKonsumen = restTemplate.exchange(
				apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeKonsumen.class);
			model.addAttribute("listTipeKonsumen",responTipeKonsumen.getBody().getDataTipeKonsumen());
			
			return "/pages/MasterParameter/RateCP/EditData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/RateCP/Data" })
	public String getListRateCP(Model model) {
		try {
			ResponseEntity<ResponRateCP> respon = restTemplate.exchange(
					apiBaseUrl+"api/ratecp/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponRateCP.class);

			model.addAttribute("listRateCP", respon.getBody().getDataRateCP());

			return "/pages/MasterParameter/RateCP/Data";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/RateCP/ApprovalData" })
	public String getListApprovalRateCP(Model model) {
		try {
			ResponseEntity<ResponRateCP> respon = restTemplate.exchange(
					apiBaseUrl+"api/ratecp/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponRateCP.class);

			model.addAttribute("listRateCP", respon.getBody().getDataRateCP());
			
			return "/pages/MasterParameter/RateCP/ApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/RateCP/FormApprovalData/{id}", method = RequestMethod.GET)
	public String RateCPApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponRateCP> respon = restTemplate.exchange(
				apiBaseUrl+"/api/ratecp/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponRateCP.class
			);
			model.addAttribute("rateCP",respon.getBody().getRateCP());

			ResponseEntity<ResponTipeKonsumen> responTipeKonsumen = restTemplate.exchange(
				apiBaseUrl+"api/tipekonsumen/getalldata", HttpMethod.POST, HelperConf.getHeader(),
				ResponTipeKonsumen.class);
			model.addAttribute("listTipeKonsumen",responTipeKonsumen.getBody().getDataTipeKonsumen());

			return "/pages/MasterParameter/RateCP/FormApprovalData";
		} catch (Exception e) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}