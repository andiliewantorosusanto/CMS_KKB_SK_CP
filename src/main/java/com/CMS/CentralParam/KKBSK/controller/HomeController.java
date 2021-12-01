package com.CMS.CentralParam.KKBSK.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.CMS.CentralParam.KKBSK.model.modelRateAsuransi;

import com.CMS.CentralParam.KKBSK.view.vwDataRateAsuransi;

@Controller
public class HomeController {


    @GetMapping("/home")
    public String sayHello(Model model, Principal principal,String role) {

        return "pages/dashboard/home";
    }
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String root() {
		return "redirect:/index";
	}


	// @RequestMapping(value = "/RateAsuransi/InputData", method = RequestMethod.GET)
	// public String RateAsuransiInputData() {
	// 	return "/pages/MasterParameter/RateAsuransi/InputData";
	// }

	// @RequestMapping(value = "/RateAsuransi/EditData", method = RequestMethod.GET)
	// public String RateAsuransiEditData() {
	// 	return "/pages/MasterParameter/RateAsuransi/EditData";
	// }

	// @RequestMapping(value = "/RateAsuransi/FormApprovalData", method = RequestMethod.GET)
	// public String RateAsuransiFormApprovalData() {
	// 	return "/pages/MasterParameter/RateAsuransi/FormApprovalData";
	// }
	
	// @RequestMapping(value = "/RateAsuransi/Data", method = RequestMethod.GET)
	// public String RateAsuransiData(Model model, modelRateAsuransi modelRateAsuransi, Principal principal) {
	// 	System.out.println("masuk rate");
	// 	String listDataRateAsuransi = rateAsuransiRepository.getDataRateAsuransi();
    //     model.addAttribute("listDataRateAsuransi", "listDataRateAsuransi");
	// 	return "/pages/MasterParameter/RateAsuransi/Data";
	// }

	//  // NOTE LIST DATA RATE ASURNSI
	//  @GetMapping(value = { "/RateAsuransi/Data" })
	//  public String getListDonePencairanSHF(String firstName,Model model, modelRateAsuransi modelRateAsuransi, Principal principal,
	// 		 String role) {
	// 	 List<vwDataRateAsuransi> listDataRateAsuransi = rateAsuransiRepository.getListDataRateAsuransi();
	// 	 model.addAttribute("listDataRateAsuransi", listDataRateAsuransi);
	// 	 return "/pages/MasterParameter/RateAsuransi/Data";
	//  }

	//  	 // NOTE LIST BUCKET APPROVAL RATE ASURANSI
	// 	  @GetMapping(value = { "/RateAsuransi/ApprovalData" })
	// 	  public String getListApprovalRateAsuransi(String firstName,Model model, modelRateAsuransi modelRateAsuransi, Principal principal,
	// 			  String role) {
	// 		  List<vwDataRateAsuransi> listDataRateAsuransi = rateAsuransiRepository.getListBucketApprovalRateAsuransi();
	// 		  model.addAttribute("listDataRateAsuransi", listDataRateAsuransi);
	// 		  return "/pages/MasterParameter/RateAsuransi/ApprovalData";
	// 	  }

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "/index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/login-error", method = RequestMethod.GET)
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		return "login";
	}
}
