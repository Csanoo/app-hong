package main.java.app.hgm.chapter;

import main.java.edumgt.common.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class ChapterCtr {
	@Autowired
	private ChapterSvc chapterSvc;

	@RequestMapping(value = "/aquaplay")
	public String aquaplay(HttpServletRequest request, ChapterExample example, 
			ModelMap modelMap,HttpSession session) {

		String mp4url = "0";
		if (request.getParameter("mp4url") != null) {
			mp4url = request.getParameter("mp4url");

		}
		
		String type = "1";
		if (request.getParameter("type") != null) {
			type = request.getParameter("type");

		}
		
		String leccode = "";
		if (request.getParameter("leccode") != null) {
			leccode = request.getParameter("leccode");

		}
		String movcode = "";
		if (request.getParameter("movcode") != null) {
			movcode = request.getParameter("movcode");

		}

		String rtn = "";
		
		
		if (type.equals("1")) {rtn = "aqua/player_win";}
		else {rtn = "aqua/player_html5";}
		
		modelMap.addAttribute("mp4url", mp4url);
		modelMap.addAttribute("leccode", leccode);
		modelMap.addAttribute("movcode", movcode);
		modelMap.addAttribute("userid", session.getAttribute("USERID"));

		
		return rtn;
	}

	@RequestMapping(value = "/chapterList")
	public String chapterList(HttpServletRequest request, ChapterExample example, ModelMap modelMap) {

		String code2 = "0";
		if (request.getParameter("code2") != null) {
			code2 = request.getParameter("code2");

		}

		example.setCosn(code2);

		example.pageCalculate(chapterSvc.countAllChapter(example));
		List<ChapterVO> chapterList = chapterSvc.selectAllChapter(example);

		modelMap.addAttribute("chapterList", chapterList);

		List<ChapterVO> courseList = chapterSvc.selListCourseHong2();

		modelMap.addAttribute("courseList", courseList);

		modelMap.addAttribute("searchVO", example);

		return "chapter/list";
	}

	@RequestMapping(value = "/chapterExcel")
	public String chapterExcel(HttpServletRequest request, ChapterExample example, ModelMap modelMap) {

		String code2 = "0";
		if (request.getParameter("code2") != null) {
			code2 = request.getParameter("code2");

		}

		example.setCosn(code2);

		example.pageCalculate(chapterSvc.countAllChapter(example));
		List<ChapterVO> chapterList = chapterSvc.selectAllChapter(example);

		modelMap.addAttribute("chapterList", chapterList);

		List<ChapterVO> courseList = chapterSvc.selListCourse();

		modelMap.addAttribute("courseList", courseList);

		modelMap.addAttribute("searchVO", example);

		return "chapter/excel";
	}

	@RequestMapping(value = "/chapterForm")
	public String chapterForm(HttpServletRequest request, ChapterExample example, ModelMap modelMap, ChapterVO cvo) {

		String code2 = "0";
		if (request.getParameter("code2") != null) {
			code2 = request.getParameter("code2");

		}

		String warning = "";
		if (request.getParameter("warning") != null) {
			warning = request.getParameter("warning");

		}

		ChapterVO courseinfo = chapterSvc.selCourseTitle(Integer.parseInt(code2));
		modelMap.addAttribute("courseinfo", courseinfo);

		cvo.setSn(0);

		modelMap.addAttribute("cvo", cvo);
		modelMap.addAttribute("warning", warning);

		return "chapter/cform";
	}

	@RequestMapping(value = "/chapterSave")
	public String chapterSave(HttpServletRequest request, ChapterExample example, ModelMap modelMap, ChapterVO cvo,
			RedirectAttributes redirect) {

		String sn = "0";
		if (request.getParameter("sn") != null) {
			sn = request.getParameter("sn");
		}

		FileUtil fs = new FileUtil();

		@SuppressWarnings("unused")
		ChapterVO cvotemp;
		cvotemp = chapterSvc.selectChapterOneOrd(cvo);

		// if ( cvotemp == null ) {

		if (!cvo.getChpimg1file().isEmpty() && (cvo.getChpimg1file().getSize() > 10)) {
			cvo.setChpimg1(fs.saveImgFile(request, cvo.getChpimg1file(), cvo.getChpimg1()));
		}

		if (!cvo.getChpimg2file().isEmpty() && (cvo.getChpimg2file().getSize() > 10)) {
			cvo.setChpimg2(fs.saveImgFile(request, cvo.getChpimg2file(), cvo.getChpimg2()));
		}

		if ("0".equals(sn)) {
			chapterSvc.insertChapter(cvo);
		} else {
			chapterSvc.updateChapter(cvo);
		}

		redirect.addAttribute("code2", cvo.getCoid());

		return "redirect:chapterList";

		/*
		 * } else {
		 * 
		 * redirect.addAttribute("code2", cvo.getCoid());
		 * redirect.addAttribute("warning", "ORD"); return "redirect:chapterForm"; }
		 * 
		 */

	}

	@RequestMapping(value = "/chapterSave2")
	public String chapterSave2(HttpServletRequest request, ChapterExample example, ModelMap modelMap, ChapterVO cvo,
			RedirectAttributes redirect) {

		String sn = "0";
		if (request.getParameter("sn") != null) {
			sn = request.getParameter("sn");
		}

		FileUtil fs = new FileUtil();

		ChapterVO cvotemp;
		cvotemp = chapterSvc.selectChapterOneOrd(cvo);

		if (cvotemp == null) {

			if (!cvo.getChpimg1file().isEmpty() && (cvo.getChpimg1file().getSize() > 10)) {
				cvo.setChpimg1(fs.saveImgFile(request, cvo.getChpimg1file(), cvo.getChpimg1()));
			}

			if (!cvo.getChpimg2file().isEmpty() && (cvo.getChpimg2file().getSize() > 10)) {
				cvo.setChpimg2(fs.saveImgFile(request, cvo.getChpimg2file(), cvo.getChpimg2()));
			}

			if ("0".equals(sn)) {
				chapterSvc.insertChapter(cvo);
			} else {
				chapterSvc.updateChapter(cvo);
			}

			redirect.addAttribute("code2", cvo.getCoid());

			return "redirect:chapterList";

		} else {

			redirect.addAttribute("code2", cvo.getCoid());
			redirect.addAttribute("warning", "ORD");
			return "redirect:chapterForm";
		}

	}

	@RequestMapping(value = "/chapterDelete")
	public String chapterDelete(HttpServletRequest request, ChapterExample example, ModelMap modelMap, ChapterVO cvo,
			RedirectAttributes redirect) {

		@SuppressWarnings("unused")
		String sn = "0";
		if (request.getParameter("sn") != null) {
			sn = request.getParameter("sn");
		}

		chapterSvc.deleteChapter(cvo);

		redirect.addAttribute("code2", cvo.getCoid());
		return "redirect:chapterList";

	}

	@RequestMapping(value = "/chapterRead")
	public String chapterRead(HttpServletRequest request, ChapterExample example, ModelMap modelMap, ChapterVO cvo) {

		String sn = "0";
		if (request.getParameter("sn") != null) {
			sn = request.getParameter("sn");
		}

		@SuppressWarnings("unused")
		String code2 = "0";
		if (request.getParameter("code2") != null) {
			code2 = request.getParameter("code2");

		}

		cvo = chapterSvc.selectChapterOne(Integer.parseInt(sn));
		cvo.setSn(Integer.parseInt(sn));

		ChapterVO courseinfo = chapterSvc.selCourseTitle(Integer.parseInt(cvo.getCoid()));
		modelMap.addAttribute("courseinfo", courseinfo);

		modelMap.addAttribute("cvo", cvo);

		return "chapter/cform";
	}
}
