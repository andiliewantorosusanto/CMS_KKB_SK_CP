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
import com.CMS.CentralParam.KKBSK.excel.ProgramExcelExporter;
import com.CMS.CentralParam.KKBSK.model.data.Program;
import com.CMS.CentralParam.KKBSK.model.form.ProgramForm;
import com.CMS.CentralParam.KKBSK.model.request.RequestMassSubmit;
import com.CMS.CentralParam.KKBSK.model.response.ResponCekToken;
import com.CMS.CentralParam.KKBSK.model.response.ResponCluster;
import com.CMS.CentralParam.KKBSK.model.response.ResponJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.response.ResponJenisPembiayaan;
import com.CMS.CentralParam.KKBSK.model.response.ResponTipeKonsumen;
import com.CMS.CentralParam.KKBSK.model.response.ResponProgram;
import com.CMS.CentralParam.KKBSK.view.vwProgram;
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
public class ProgramController {

    @Autowired
	RestTemplate restTemplate;
	
	@Value("${apiBaseUrl}")
	private String apiBaseUrl;

	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/Program/InputData", method = RequestMethod.GET)
	public String ProgramInputData(Model model) {
		try {
			restTemplate.exchange(apiBaseUrl+"api/helper/cekToken",HttpMethod.POST, HelperConf.getHeader(), ResponCekToken.class);

			ProgramForm ProgramForm = new ProgramForm();

			model.addAttribute("Program", ProgramForm);

			return "/pages/MasterParameter/Program/InputData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping("/Program/Export/Excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=Program_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
		ResponseEntity<ResponProgram> respon = restTemplate.exchange(
			apiBaseUrl+"api/Program/getalldata", HttpMethod.POST, HelperConf.getHeader(),
			ResponProgram.class);

        List<vwProgram> listProgram = respon.getBody().getDataProgram();
         
        ProgramExcelExporter excelExporter = new ProgramExcelExporter(listProgram);
         
        excelExporter.export(response);    
    }  
	
	@PostMapping(value = "/Program/ActionInputData")
	public String ProgramActionInputData(@Valid ProgramForm Program, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(Program.getEndBerlaku().before(Program.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.Program", "End date must be greater than start date");
			}
		}

		if (result.hasErrors()) {

			model.addAttribute("Program", Program);
            return "/pages/MasterParameter/Program/InputData";
        }


		try {
			// Program temp = new Program(null, 
			// Program.getNamaSkema(), Program.getTipeKonsumen(), Program.getJenisKendaraan(), jenisPembiayaan, cluster, Program.getDiskonNpwp(), 
			// Program.getTenor1(), Program.getTenor2(), Program.getTenor3(), Program.getTenor4(), Program.getTenor5(), Program.getTenor6(), Program.getTenor7(), Program.getTenor8(), Program.getTenor9(), Program.getTenor10(),
			// Program.getStartBerlaku(), Program.getEndBerlaku(), null, null, null, null, null, null, null, null);

			// try {
			// 	restTemplate.exchange(
			// 		apiBaseUrl+"/api/Program/"+HelperConf.getAction(action), 
			// 		HttpMethod.POST, 
			// 		HelperConf.getHeader(objectMapper.writeValueAsString(temp)), 
			// 		String.class
			// 	);
			// } catch (Exception e) {
				
			// }

			
			return "redirect:/Program/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/Program/ActionEditData")
	public String ProgramActionEditData(@Valid Program Program, BindingResult result,String action,Model model) {
		if(!result.hasErrors()) {
			if(Program.getEndBerlaku().before(Program.getStartBerlaku())) {
				result.rejectValue("endBerlaku", "error.Program", "End date must be greater than start date");
			}
		}

		if (result.hasErrors()) {

			model.addAttribute("Program", Program);
            return "/pages/MasterParameter/Program/EditData";
        }


		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/Program/"+HelperConf.getAction(action), 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(Program)), 
				String.class
			);
			
			return "redirect:/Program/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/Program/ActionApprovalData")
	public String ProgramActionApprovalData(Program Program, BindingResult result,String action) {
		try {
			restTemplate.exchange(
				apiBaseUrl+"/api/Program/"+action+"Data", 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(Program)), 
				String.class
			);

			return "redirect:/Program/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/Program/ActionData")
	public String ProgramActionData(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/Program/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/Program/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@PostMapping(value = "/Program/ActionApproval")
	public String ProgramActionApproval(@RequestParam("ids") String ids,String action) {
		try {			
			RequestMassSubmit requestMassSubmit = new RequestMassSubmit(ids);
			restTemplate.exchange(
				apiBaseUrl+"/api/Program/"+action, 
				HttpMethod.POST, 
				HelperConf.getHeader(objectMapper.writeValueAsString(requestMassSubmit)), 
				String.class
			);
			return "redirect:/Program/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/Program/EditData/{id}", method = RequestMethod.GET)
	public String ProgramEditData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponProgram> respon = restTemplate.exchange(
				apiBaseUrl+"/api/Program/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponProgram.class
			);

			model.addAttribute("Program",respon.getBody().getProgram());
			
			return "/pages/MasterParameter/Program/EditData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/Program/Data" })
	public String getListProgram(Model model) {
		try {
			ResponseEntity<ResponProgram> respon = restTemplate.exchange(
					apiBaseUrl+"api/Program/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponProgram.class);

			model.addAttribute("listProgram", respon.getBody().getDataProgram());

			return "/pages/MasterParameter/Program/Data";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@GetMapping(value = { "/Program/ApprovalData" })
	public String getListApprovalProgram(Model model) {
		try {
			ResponseEntity<ResponProgram> respon = restTemplate.exchange(
					apiBaseUrl+"api/Program/getalldata", HttpMethod.POST, HelperConf.getHeader(),
					ResponProgram.class);

			model.addAttribute("listProgram", respon.getBody().getDataProgram());
			
			return "/pages/MasterParameter/Program/ApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	@RequestMapping(value = "/Program/FormApprovalData/{id}", method = RequestMethod.GET)
	public String ProgramFormApprovalData(@PathVariable @NotNull Integer id,Model model) {
		try {
			ResponseEntity<ResponProgram> respon = restTemplate.exchange(
				apiBaseUrl+"/api/Program/"+id, 
				HttpMethod.GET,
				HelperConf.getHeader(), 
				ResponProgram.class
			);
			model.addAttribute("Program",respon.getBody().getProgram());

			return "/pages/MasterParameter/Program/FormApprovalData";
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "/pages/expired/token";
	}

	
}