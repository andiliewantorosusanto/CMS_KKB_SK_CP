package com.CMS.CentralParam.KKBSK.controller;

import java.security.Principal;
import java.util.List;

import com.CMS.CentralParam.KKBSK.model.modelCluster;
import com.CMS.CentralParam.KKBSK.model.modelJenisKendaraan;
import com.CMS.CentralParam.KKBSK.model.modelJenisPembiayaan;
import com.CMS.CentralParam.KKBSK.model.modelTipeKonsumen;
import com.CMS.CentralParam.KKBSK.view.vwDataCluster;
import com.CMS.CentralParam.KKBSK.view.vwTipeKonsumen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClusterController {

	@RequestMapping(value = "/Cluster/InputData", method = RequestMethod.GET)
	public String ClusterInputData(Model model) {

		return "/pages/MasterParameter/Cluster/InputData";
	}

}