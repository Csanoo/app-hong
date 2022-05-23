package main.java.app.hgm.main;


import main.java.edumgt.common.util.SearchVO;
import main.java.edumgt.common.util.utiletc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class AppMainCtr {

	@Autowired
	private AppMainSvc appmainSvc;


	@RequestMapping(value = "/")
	public String Index(HttpServletResponse res, HttpServletRequest request, SearchVO searchVO, ModelMap modelMap, HttpSession session) {

		return "index";

	}
	

}
