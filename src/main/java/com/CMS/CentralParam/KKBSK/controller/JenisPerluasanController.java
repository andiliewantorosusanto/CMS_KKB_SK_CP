package com.CMS.CentralParam.KKBSK.controller;

import java.security.Principal;
import java.util.List;

import com.CMS.CentralParam.KKBSK.model.modelJenisPerluasan;
import com.CMS.CentralParam.KKBSK.model.modelTipeKonsumen;

import com.CMS.CentralParam.KKBSK.view.vwDataJenisPerluasan;
import com.CMS.CentralParam.KKBSK.view.vwTipeKonsumen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JenisPerluasanController {


	@RequestMapping(value = "/JenisPerluasan/FormApprovalData", method = RequestMethod.GET)
	public String JenisPerluasanFormApprovalData() {
		return "/pages/MasterParameter/JenisPerluasan/FormApprovalData";
	}
	
}