package com.CMS.CentralParam.KKBSK.controller;

import java.security.Principal;
import java.util.List;

import com.CMS.CentralParam.KKBSK.model.modelTipeAsuransi;
import com.CMS.CentralParam.KKBSK.model.modelJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.modelJenisPembiayaan;
import com.CMS.CentralParam.KKBSK.model.modelTipeAsuransi;

import com.CMS.CentralParam.KKBSK.view.vwDataTipeAsuransi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TipeAsuransiController {


	@RequestMapping(value = "/TipeAsuransi/InputData", method = RequestMethod.GET)
	public String TipeAsuransiInputData(Model model) {

		
		return "/pages/MasterParameter/TipeAsuransi/InputData";
	}

	@RequestMapping(value = "/TipeAsuransi/EditData", method = RequestMethod.GET)
	public String TipeAsuransiEditData(Model model) {

		return "/pages/MasterParameter/TipeAsuransi/EditData";
	}

}