package main.java.app.hgm.member;

import main.java.app.hgm.product.ProductVO;
import main.java.edumgt.common.util.SearchVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

import main.java.app.hgm.course.CourseVO;
import main.java.app.hgm.course.CourseExample;
import org.springframework.web.util.WebUtils;
import main.java.app.hgm.product.ProductSvc;

@Controller
public class MemberCtr {

	@Autowired
	private MemberSvc memberSvc;

	@Autowired
	private ProductSvc productSvc;

	@RequestMapping(value = "/join")
	public String MainRegist1(HttpServletRequest request, SearchVO searchVO, ModelMap modelMap, HttpSession session) {
	//	modelMap.addAttribute("listsel", listsel);
		return "member/regist";

	}

	@RequestMapping(value = "/joinAgree")
	public String JoinAgree(HttpServletRequest request, SearchVO searchVO, ModelMap modelMap, HttpSession session) {
		return "member/joinAgree";

	}

	@RequestMapping(value = "/mypage/modify")
	public String modifyMember(MemberVO memberVO, HttpServletRequest request, SearchVO searchVO, ModelMap modelMap, HttpSession session) {
		String userid = "";
		if (session.getAttribute("USERID") != null) {
			userid = (String) session.getAttribute("USERID");
		}
		System.out.println("userid="+userid);
		memberVO = memberSvc.selectMemberRead(userid);
		memberVO.setId(userid);

		modelMap.addAttribute("mvo", memberVO);
		return "mypage/myMember";
	}


	@RequestMapping(value = "/logout")
	public String MainLogout(HttpSession session) {
		session.invalidate();
		return "member/login";

	}



	@RequestMapping(value = "/login")
	public String Login(MemberVO memberVO, HttpServletRequest request, SearchVO searchVO, ModelMap modelMap,
						HttpSession session) {

		return "member/login";
	}


	@ResponseBody
	@RequestMapping(value = "/member/logon")
	public String LoginAction(MemberVO memberVO, HttpServletRequest request, HttpServletResponse response, SearchVO searchVO, ModelMap modelMap,
							 HttpSession session) {
		String result = "FALSE";
		String userid = "";
		String userpw = "";
		if (request.getParameter("userid") != null) {
			userid = request.getParameter("userid");
		}

		if (request.getParameter("userpw") != null) {
			//userpw = utiletc.md5Encoding(request.getParameter("userpw"));
			//userpw = utiletc.getHexCode(userpw);
			userpw = request.getParameter("userpw");
		}

		MemberVO param = new MemberVO();
		param.setId(userid);
		param.setPasswd(userpw);


		memberVO = memberSvc.selectMemberLogin(param);
		System.out.println("name"+memberVO.getName());
		if(memberVO.getId() != "") {
			session.setAttribute("USERNAME", memberVO.getName());
			session.setAttribute("USERID", memberVO.getId());
			// 비회원 장바구니 회원장바구니로 이동


			result="TRUE";
		}
		return result;
	}

	@RequestMapping(value = "/member/updateMember")
	public String UpdateMember(MemberVO memberVO, HttpServletRequest request, SearchVO searchVO, ModelMap modelMap,
						 HttpSession session) {
		String userid = "";
		String userpw = "";
		String username = "";
		String email = "";
		String mobile = "";

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

		if (request.getParameter("hp") != null) {
			mobile = request.getParameter("hp");
		}

		MemberVO param = new MemberVO();
		param.setId(userid);
		param.setPasswd(userpw);
		param.setEmail(email);
		param.setHphone(mobile);
		param.setName(username);

		memberSvc.updateMember(param);

		return "mypage/myMember";
	}

	@RequestMapping(value = "/member/joinOk")
	public String JoinOk(MemberVO memberVO, HttpServletRequest request, SearchVO searchVO, ModelMap modelMap,
							  HttpSession session) {
		String userid = "";
		String userpw = "";
		String username = "";
		String email = "";
		String mobile = "";

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

		if (request.getParameter("hp") != null) {
			mobile = request.getParameter("hp");
		}

		MemberVO param = new MemberVO();
		param.setId(userid);
		param.setPasswd(userpw);
		param.setEmail(email);
		param.setHphone(mobile);
		param.setName(username);

		memberSvc.insertMemberJoin(param);

		return "member/joinOk";
	}

	@ResponseBody
	@RequestMapping(value = "/dupUserid")
	public Integer dupUserid(HttpServletRequest request, SearchVO searchVO , Map<String,Object> commandMap,  ModelMap modelMap) throws Exception{

		try {
			String userid = request.getParameter("userid");
			return memberSvc.selDupUserid(userid);

		} catch (Exception e) {
			//System.out.println(e.getMessage());
			return 0;
		}

	}
}


