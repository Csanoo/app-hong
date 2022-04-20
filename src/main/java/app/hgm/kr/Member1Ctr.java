package main.java.app.hgm.kr;

import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import main.java.common.satelite.kr.FileUtil;
import main.java.common.satelite.kr.FileVO;
import main.java.common.satelite.kr.LeftMenuUtil;
import main.java.common.satelite.kr.Search;
import main.java.common.satelite.kr.SearchYtb;
import main.java.common.satelite.kr.SearchVO;
import main.java.common.satelite.kr.Crawler;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Member1Ctr {

	@Autowired
	private Member1Svc member1Svc;


}


