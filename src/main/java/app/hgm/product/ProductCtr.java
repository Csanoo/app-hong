package main.java.app.hgm.product;

import main.java.app.hgm.bbs.BbsSvc;
import main.java.app.hgm.bbs.bbs;
import main.java.app.hgm.bbs.bbsExample;
import main.java.app.hgm.chapter.ChapterVO;
import main.java.app.hgm.member.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;

@Controller
public class ProductCtr {

	@Autowired
	private ProductSvc productSvc;

	@Autowired
	private BbsSvc bbsSvc;



	@RequestMapping(value = "/goods/detail")
	public String LectureList(HttpServletRequest request,ProductVO productVO, ModelMap modelMap, HttpSession session, bbsExample bExample) {
		String leccode = request.getParameter("leccode");
		productVO = productSvc.selectlecDetail(leccode);
		modelMap.addAttribute("pvo", productVO);
		List<ChapterVO> chapterVOList = productSvc.selChapterList(leccode);
		modelMap.addAttribute("clist",chapterVOList);
		bExample.setCode2("review");
		bExample.setLeccode(leccode);

		bExample.pageCalculate( bbsSvc.countByReview(bExample) );
		List<bbs> rvList = bbsSvc.selectByReview(bExample);
		modelMap.addAttribute("rvlist",rvList);
		return "goods/lectureDetail";
	}

	@RequestMapping(value = "/goods/detailp")
	public String prdDetail(HttpServletRequest request,ProductVO productVO, ModelMap modelMap, HttpSession session, bbsExample bExample) {
		String prdcode = request.getParameter("leccode");
		productVO = productSvc.selectprdDetail(prdcode);
		modelMap.addAttribute("pvo", productVO);
		List<ChapterVO> chapterVOList = productSvc.selChapterList(prdcode);
		modelMap.addAttribute("clist",chapterVOList);
		bExample.setCode2("review");
		bExample.setLeccode(prdcode);

		bExample.pageCalculate( bbsSvc.countByReview(bExample) );
		List<bbs> rvList = bbsSvc.selectByReview(bExample);
		modelMap.addAttribute("rvlist",rvList);
		return "goods/prdDetail";
	}

	@RequestMapping(value = "/order/cart")
	public String basketList(ProductVO cartVO, ModelMap modelMap,HttpServletRequest request) {
		Cookie cookie = WebUtils.getCookie(request, "cartCookie");
		String ckValue = cookie.getValue();
		cartVO.setUniq_id(ckValue);
		List<?> listview = productSvc.selCartList(cartVO);

		modelMap.addAttribute("listview", listview);
		modelMap.addAttribute("cartVO", cartVO);
		return "goods/cart";
	}


	//장바구니
	@ResponseBody
	@RequestMapping(value = {"/cart"}, method = {RequestMethod.POST})
	public int cart(HttpSession session, HttpServletRequest request, HttpServletResponse response, ProductVO cartVO) throws Exception {
		Cookie cookie = WebUtils.getCookie(request, "cartCookie");
		String prdtype = request.getParameter("prdtype");
		String prdcode = request.getParameter("prdCode");
		//비회원장바구니 첫 클릭시 쿠키생성
		if (cookie == null ) {
			String ckid = RandomStringUtils.random(6, true, true);
			Cookie cartCookie = new Cookie("cartCookie", ckid);
			cartCookie.setPath("/");
			cartCookie.setMaxAge(60 * 60 * 24 * 1);
			response.addCookie(cartCookie);
			cartVO.setUniq_id(ckid);
			cartVO.setPrdtype(prdtype);
			cartVO.setPrdcode(prdcode);

			if(productSvc.cartCheck(cartVO) != 0) {
				return 2;
			}
			this.productSvc.cartInsert(cartVO);

			//비회원 장바구니 쿠키생성 후 상품추가
		} else if (cookie != null ) {

			String ckValue = cookie.getValue();
			cartVO.setUniq_id(ckValue);
			cartVO.setPrdtype(prdtype);
			cartVO.setPrdcode(prdcode);
			//장바구니 중복제한
			if(productSvc.cartCheck(cartVO) != 0) {
				return 2;
			}
			//쿠키 시간 재설정해주기
			cookie.setPath("/");
			cookie.setMaxAge(60 * 60 * 24 * 1);
			response.addCookie(cookie);
			productSvc.cartInsert(cartVO);

			//회원 장바구니 상품추가
		}
		return 1;
	}


	//장바구니
	@ResponseBody
	@RequestMapping(value = {"/order"}, method = {RequestMethod.POST})
	public String order(HttpSession session, HttpServletRequest request, HttpServletResponse response, ProductVO cartVO) throws Exception {
		String uniq_id = request.getParameter("uniq_id");
		cartVO.setUniq_id(uniq_id);
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMDDHHmm");
		Date date = new Date();
		String strDt = dateFormat.format(date);
		String oid = strDt+uniq_id;
		cartVO.setOrderid(oid);
		this.productSvc.orderInsert(cartVO);

		return oid;
	}

	@RequestMapping(value = "/order/settle")
	public String settle(ProductVO cartVO, ModelMap modelMap,HttpServletRequest request) {

		String order_id = request.getParameter("order_id");
		System.out.println("order_id="+order_id);
		String uniq_id = request.getParameter("uniq_id");
		cartVO.setOrderid(order_id);
		cartVO.setUniq_id(uniq_id);
		List<?> listview = productSvc.selOrderList(cartVO);

		modelMap.addAttribute("listview", listview);
		modelMap.addAttribute("cartVO", cartVO);
		return "goods/settle";
	}

	@RequestMapping(value = "/lecture/detail")
	public String productRead(HttpServletRequest request, ProductVO faqinfo, ModelMap modelMap) {
		String sn = request.getParameter("leccode");
		faqinfo = productSvc.selectlecDetail(sn);
		modelMap.addAttribute("faqinfo", faqinfo);
		return "goods/lecturedetail";
	}
	
	@RequestMapping(value = "/basketOne")
	public String basketOne(HttpServletRequest request, ProductVO faqinfo, ModelMap modelMap) {
		String sn = request.getParameter("sn");
		faqinfo = productSvc.selBookSellOne(sn);
		modelMap.addAttribute("faqinfo", faqinfo);
		return "product/form2";
	}
}
