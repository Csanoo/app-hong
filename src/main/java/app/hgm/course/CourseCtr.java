package main.java.app.hgm.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CourseCtr {

	@Autowired
	CourseSvc courseSvc;

	@RequestMapping(value = "/lecture/lecList")
	public String lecList(HttpServletRequest request, CourseExample courseExample, ModelMap modelMap, HttpSession session) {
		String userId = "";
		if ( request.getSession().getAttribute("USERID") != null ) {
			userId = (String)request.getSession().getAttribute("USERID");
		}
		String catcode = request.getParameter("catcode");
		String orderby = request.getParameter("orderby");
		courseExample.setOderby(orderby);
		courseExample.setUserid(userId);
		courseExample.setCatcode(catcode);
		courseExample.pageCalculate(courseSvc.countCourse(courseExample));
		List<CourseVO> courseList = courseSvc.selectCourse(courseExample);

		modelMap.addAttribute("courseList", courseList);
		modelMap.addAttribute("searchVO", courseExample);

		return "goods/lectureList";

	}

	@RequestMapping(value = "/affix/list")
	public String affixList(HttpServletRequest request, CourseExample courseExample, ModelMap modelMap, HttpSession session) {
		String userId = "";
		if ( request.getSession().getAttribute("USERID") != null ) {
			userId = (String)request.getSession().getAttribute("USERID");
		}
		String catcode = request.getParameter("catcode");
		System.out.println(userId);
		courseExample.setUserid(userId);
		courseExample.setCatcode(catcode);
		courseExample.pageCalculate(courseSvc.countCP(courseExample));
		List<CourseVO> courseList = courseSvc.selectCP(courseExample);

		modelMap.addAttribute("courseList", courseList);
		modelMap.addAttribute("searchVO", courseExample);

		return "goods/affixList";

	}

	@RequestMapping(value = "/book/list")
	public String bookList(HttpServletRequest request, CourseExample courseExample, ModelMap modelMap, HttpSession session) {

		String catcode = request.getParameter("catcode");
		courseExample.setCatcode(catcode);
		courseExample.pageCalculate(courseSvc.countBook(courseExample));
		List<CourseVO> courseList = courseSvc.selectBook(courseExample);

		modelMap.addAttribute("courseList", courseList);
		modelMap.addAttribute("searchVO", courseExample);

		return "goods/booklist";

	}

	@RequestMapping(value = "/mypage/myCourse")
	public String MyCourse(HttpServletRequest request, CourseExample courseExample, ModelMap modelMap, HttpSession session) {
		String userId = "";
		if ( request.getSession().getAttribute("USERID") != null ) {
			userId = (String)request.getSession().getAttribute("USERID");
		}
		System.out.println(userId);
		courseExample.setUserid(userId);
		courseExample.pageCalculate(courseSvc.countMyCourse(courseExample));
		List<CourseVO> courseList = courseSvc.selectMyCourse(courseExample);

		modelMap.addAttribute("courseList", courseList);
		modelMap.addAttribute("searchVO", courseExample);


		return "mypage/myCourse";

	}

	@RequestMapping(value = "/mypage/myReserve")
	public String MyReserve(HttpServletRequest request, CourseExample courseExample, ModelMap modelMap, HttpSession session) {
		String userId = "";
		if ( request.getSession().getAttribute("USERID") != null ) {
			userId = (String)request.getSession().getAttribute("USERID");
		}
		System.out.println(userId);
		courseExample.setUserid(userId);

		courseExample.pageCalculate(courseSvc.countMyReserve(courseExample));
		List<CourseVO> courseList = courseSvc.selectMyReserve(courseExample);

		modelMap.addAttribute("courseList", courseList);
		modelMap.addAttribute("searchVO", courseExample);


		return "mypage/myReserve";

	}

	@RequestMapping(value = "/mypage/myGoods")
	public String MyGoods(HttpServletRequest request, CourseExample courseExample, ModelMap modelMap, HttpSession session) {
		String userId = "";
		if ( request.getSession().getAttribute("USERID") != null ) {
			userId = (String)request.getSession().getAttribute("USERID");
		}

		courseExample.setUserid(userId);
		courseExample.pageCalculate(courseSvc.countMyGoods(courseExample));
		List<CourseVO> courseList = courseSvc.selectMyGoods(courseExample);

		modelMap.addAttribute("courseList", courseList);
		modelMap.addAttribute("searchVO", courseExample);


		return "mypage/myGoods";

	}

	@RequestMapping(value = "/mypage/myTest")
	public String MyTest(HttpServletRequest request, CourseExample courseExample, ModelMap modelMap, HttpSession session) {
		String userId = "";
		if ( request.getSession().getAttribute("USERID") != null ) {
			userId = (String)request.getSession().getAttribute("USERID");
		}

		courseExample.setUserid(userId);
		courseExample.pageCalculate(courseSvc.countMyTest(courseExample));
		List<CourseVO> courseList = courseSvc.selectMyTest(courseExample);

		modelMap.addAttribute("courseList", courseList);
		modelMap.addAttribute("searchVO", courseExample);


		return "mypage/myTest";

	}
}
