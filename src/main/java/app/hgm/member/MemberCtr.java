package main.java.app.hgm.member;

import main.java.app.hgm.kr.BannerVO;
import main.java.app.hgm.kr.ProjectVO;
import main.java.common.satelite.kr.*;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Controller
public class MemberCtr {

	@Autowired
	private MemberSvc memberSvc;


	@RequestMapping(value = "/regist")
	public String MainRegist1(HttpServletRequest request, SearchVO searchVO, ModelMap modelMap, HttpSession session) {
		List<?> listsel  = memberSvc.selectCode2SelList();
		modelMap.addAttribute("listsel", listsel);
		return "member1/Register";

	}

	@RequestMapping(value = "/mypage")
	public String MainStat1(MemberVO mvo, HttpServletRequest request, SearchVO searchVO, ModelMap modelMap, HttpSession session) {

		
		String USERID = "";
		if ( request.getSession().getAttribute("USERID") != null ) {
			USERID = (String)request.getSession().getAttribute("USERID");
		}
		String USERTYPE = "";
		if ( request.getSession().getAttribute("USERTYPE") != null ) {
			USERTYPE = (String)request.getSession().getAttribute("USERTYPE");
		}
		
		if ( USERTYPE.equals("SA") ) {USERID="";
		mvo = memberSvc.selectMainStat(USERID);
		}else {
			mvo = memberSvc.selectMainStat2(USERID);
		}
		
		modelMap.addAttribute("mvo", mvo);
		
		return "member1/LoginList";

	}

	@RequestMapping(value = "/logout")
	public String MainLogout(HttpSession session) {
		session.invalidate();
		return "member1/LoginForm";

	}

	@RequestMapping(value = "/regist2")
	public String MainRegist2(MemberVO mvo, HttpServletRequest request, SearchVO searchVO, ModelMap modelMap, HttpSession session) {

		String userid = "";
		String userpw = "";
		String username = "";
		String email = "";
		String mobile = "";
		String usertype = "";
		String state = "";
		if (request.getParameter("userid") != null) {
			userid = request.getParameter("userid");
		}

		if (request.getParameter("userpw") != null) {
			userpw = request.getParameter("userpw");
		}

		if (request.getParameter("username") != null) {
			username = request.getParameter("username");
		}

		if (request.getParameter("email") != null) {
			email = request.getParameter("email");
		}

		if (request.getParameter("usertype") != null) {
			usertype = request.getParameter("usertype");
		}

		if (request.getParameter("state") != null) {
			state = request.getParameter("state");
		}

		MemberVO param = new MemberVO();
		param.setUserid(userid);
		param.setUserpw(userpw);
		param.setEmail(email);
		param.setMobile(mobile);
		param.setUsername(username);
		param.setUsertype(usertype);
		param.setState(state);

		memberSvc.insertMember1One(param);


		return "redirect:memberList";

	}
	
	@RequestMapping(value = "/memberSave")
	public String memberSave(MemberVO mvo, HttpServletRequest request, SearchVO searchVO,
							 ModelMap modelMap, HttpSession session) {

		String userid = "";
		String userpw = "";
		String username = "";
		String email = "";
		String mobile = "";
		String usertype = "";
		String uptuser = (String)request.getSession().getAttribute("USERID");

		if (request.getParameter("userid") != null) {
			userid = request.getParameter("userid");
		}
		
		if (request.getParameter("usertype") != null) {
			usertype = request.getParameter("usertype");
		}

		if (request.getParameter("userpw") != null) {
			userpw = request.getParameter("userpw");
		}

		if (request.getParameter("username") != null) {
			username = request.getParameter("username");
		}

		if (request.getParameter("email") != null) {
			email = request.getParameter("email");
		}

		if (request.getParameter("mobile") != null) {
			mobile = request.getParameter("mobile");
		}

		String menu01 = request.getParameter("menu01");
		String menu02 = request.getParameter("menu02");
		String menu03 = request.getParameter("menu03");
		String menu04 = request.getParameter("menu04");

		String state = request.getParameter("state");
		MemberVO param = new MemberVO();
		param.setUserid(userid);
		param.setUserpw(userpw);
		param.setEmail(email);
		param.setMobile(mobile);
		param.setUsername(username);
		param.setUsertype(usertype);
		param.setState(state);
		param.setUptuser(uptuser);
		param.setMenu01(menu01);
		param.setMenu02(menu02);
		param.setMenu03(menu03);
		param.setMenu04(menu04);

		memberSvc.updateMember1One(param);
		String userIng = "";
		userIng = (String)request.getSession().getAttribute("USERID");

		if(userid.equals(userIng)){
			return "redirect:logout";
		}
			searchVO.pageCalculate( memberSvc.selectMember1Count(searchVO) ); // startRow, endRow

		List<?> listview  = memberSvc.selectMember1List(searchVO);

		
		searchVO.setAction("memberList");
		modelMap.addAttribute("listview", listview);
		modelMap.addAttribute("searchVO", searchVO);




		return "redirect:memberList";

	}
	@ResponseBody
	@RequestMapping(value = "/login")
	public String Login(MemberVO mvo, HttpServletRequest request, SearchVO searchVO, ModelMap modelMap,
						HttpSession session) {

		return "main/index";
	}

	@ResponseBody
	@RequestMapping(value = "/logon")
	public String LoginAction(MemberVO mvo, HttpServletRequest request, SearchVO searchVO, ModelMap modelMap,
							 HttpSession session) {

		String userid = "";
		String userpw = "";
		if (request.getParameter("userid") != null) {
			userid = request.getParameter("userid");
		}

		if (request.getParameter("userpw") != null) {
			userpw = request.getParameter("userpw");
		}

		MemberVO param = new MemberVO();
		param.setUserid(userid);
		param.setUserpw(userpw);

		mvo = memberSvc.selectMember1One(param);

		if (mvo != null) {
				String menuval ="00";
				String menu01 = mvo.getMenu01();
				String menu02 = mvo.getMenu02();
				String menu03 = mvo.getMenu03();
				String menu04 = mvo.getMenu04();
				session.setAttribute("USERNAME", mvo.getUsername());
				session.setAttribute("USERTYPE", mvo.getUsertype());
				session.setAttribute("USERID", mvo.getUserid());

				modelMap.addAttribute("mvo", mvo);

				LeftMenuUtil lmu = new LeftMenuUtil();
				//lmu.setUserProgram("ADMINLOGIN", mvo.getUserid());


				String USERID = "";
				if ( request.getSession().getAttribute("USERID") != null ) {
					USERID = (String)request.getSession().getAttribute("USERID");
				}
				String USERTYPE = "";
				if ( request.getSession().getAttribute("USERTYPE") != null ) {
					USERTYPE = (String)request.getSession().getAttribute("USERTYPE");
				}

				if ( USERTYPE.equals("SA") ) {USERID="";
					mvo = memberSvc.selectMainStat(USERID);
					modelMap.addAttribute("mvo", mvo);
					session.setAttribute("menu01", "Y");
					session.setAttribute("menu02", "Y");
					session.setAttribute("menu03", "Y");
					session.setAttribute("menu04", "Y");
					return "01";
				}else {
					session.setAttribute("menu01", menu01);
					session.setAttribute("menu02", menu02);
					session.setAttribute("menu03", menu03);
					session.setAttribute("menu04", menu04);
					mvo = memberSvc.selectMainStat2(USERID);
					modelMap.addAttribute("mvo", mvo);

					System.out.println(menu04);
					System.out.println(menu03);
					System.out.println(menu02);
					System.out.println(menu01);
					if(menu04.equals("Y")){
						menuval = "04";
					}
					if(menu03.equals("Y")){
						menuval = "03";
					}
					if(menu02.equals("Y")){
						menuval = "02";
					}
					if(menu01.equals("Y")){
						menuval = "01";
					}
					return menuval;
				}

		} else {
			return "FALSE";
		}
	}


	@RequestMapping(value = "/usertypeList")
	public String usertypeList(HttpServletRequest request, SearchVO searchVO, ModelMap modelMap, HttpSession session) {

		searchVO.pageCalculate( memberSvc.selectMemberCodeCount(searchVO) );
		List<?> listGrade  = memberSvc.selectMemberCode(searchVO);
		List<?> listsel  = memberSvc.selectCode2SelList();
		modelMap.addAttribute("listGrade", listGrade);
		modelMap.addAttribute("searchVO", searchVO);
		modelMap.addAttribute("listsel", listsel);
		return "member1/usertypelist";
	}

	@RequestMapping(value = "/usertypeRead")
	public String usertypeRead(HttpServletRequest request, SearchVO searchVO, ModelMap modelMap, HttpSession session) {

		String sn = "";
		if ( request.getParameter("sn")!= null) {
			sn = request.getParameter("sn");
		}
		MemberVO mvo = new MemberVO();
		mvo = memberSvc.selectCode1One(sn);
		modelMap.addAttribute("mvo", mvo);


		return "member1/usertypeRead";

	}

	@RequestMapping(value = "/loginList")
	public String loginList(HttpServletRequest request, SearchVO searchVO, ModelMap modelMap, MemberVO memberVO) {

		String userid = "";
		userid = request.getParameter("userid");
		searchVO.setUserid(userid);

		searchVO.setDisplayRowCount(10);
		searchVO.pageCalculate( memberSvc.selectLoginCount(searchVO) );
		List<MemberVO> loginlist = memberSvc.loginHistory(searchVO);
		modelMap.addAttribute("loginlist", loginlist);
		modelMap.addAttribute("searchVO", searchVO);
		return "member1/loginhistory";

	}

	@RequestMapping(value = "/usertypeSave")
	public String usertypeSave(MemberVO mvo, HttpServletRequest request, SearchVO searchVO, ModelMap modelMap, HttpSession session) {
		mvo.setCode1("USER");
		mvo.setCode1memo("회원");
		String USERID = "";
		if ( request.getSession().getAttribute("USERID") != null ) {
			USERID = (String)request.getSession().getAttribute("USERID");
		}
		System.out.println(USERID);
		mvo.setUserid(USERID);
		memberSvc.insertUserType(mvo);

		return "redirect:usertypeList";

	}

	@RequestMapping(value = "/userTypeForm")
	public String userTypeForm(HttpServletRequest request, SearchVO searchVO, ModelMap modelMap, HttpSession session) {

		String code1 = "";
		if ( request.getParameter("code1") != null) {
			code1 = request.getParameter("code1");
		}

		List<?> listsel  = memberSvc.selectCode1SelList();

		modelMap.addAttribute("listsel", listsel);

		modelMap.addAttribute("code1", code1);


		return "member1/usertypeForm";

	}

	@RequestMapping(value = "/userTypeDelete")
	public String userTypeDelete(HttpServletRequest request) {

		String sn = "";
		if ( request.getParameter("sn") != null) {
			sn = request.getParameter("sn");
		}
		memberSvc.deleteCode1One(sn);
		return "redirect:usertypeList";


	}


	@ResponseBody
	@RequestMapping(value = "/dupUserid")
	public Integer dupUserid(HttpServletRequest request, SearchVO searchVO , Map<String,Object> commandMap, ProjectVO projectInfo, ModelMap modelMap) throws Exception{

		try {
			String userid = request.getParameter("userid");
			return memberSvc.selDupUserid(userid);

		} catch (Exception e) {
			//System.out.println(e.getMessage());
			return 0;
		}

	}
}


