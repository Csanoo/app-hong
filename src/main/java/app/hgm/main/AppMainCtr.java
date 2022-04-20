package main.java.app.hgm.main;

import main.java.app.hgm.kr.ProjectSvc;
import main.java.app.hgm.kr.ProjectVO;
import main.java.common.satelite.kr.FileUtil;
import main.java.common.satelite.kr.FileVO;
import main.java.common.satelite.kr.SearchVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class AppMainCtr {

	@Autowired
	private AppMainSvc appmainSvc;
	private ProjectSvc projectSvc;


	@RequestMapping(value = "/")
	public String Index(HttpServletRequest request, SearchVO searchVO, ModelMap modelMap, HttpSession session) {

		return "main/index";

	}
	

}
