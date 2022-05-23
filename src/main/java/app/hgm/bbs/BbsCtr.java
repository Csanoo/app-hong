package main.java.app.hgm.bbs;

import main.java.app.hgm.chapter.ChapterSvc;
import main.java.app.hgm.chapter.ChapterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
//import com.ultarischool.usercode.UsercodeVO;


@Controller
public class BbsCtr {

	@Autowired
	private BbsSvc bbsSvc;

	@Autowired
	ChapterSvc chapterSvc;
	
	/* 관리자 전체 게시물 리스트 */
	@RequestMapping(value = "/bbsList", method = {RequestMethod.GET, RequestMethod.POST})
	public String bbsList(bbs bbs,HttpServletRequest request,bbsExample example, ModelMap modelMap) {
		
		List<?> code2List = bbsSvc.selBbsType();
		modelMap.addAttribute("code2List", code2List);

		example.pageCalculate( bbsSvc.countByExample(example) );
		List<?> listview  = bbsSvc.selectByExample(example);

		modelMap.addAttribute("listview", listview);
		modelMap.addAttribute("searchVO", example);
		

		return "bbs/list";
	}
	
	/* 게시물 상세 */
	@RequestMapping(value = "/bbsRead")
	public String posts1Read(HttpServletRequest request, bbs bbs, 
			ModelMap modelMap) {
		
		
		String sn = request.getParameter("sn");

		bbs = bbsSvc.selectByPrimaryKey(Integer.parseInt(sn));

		modelMap.addAttribute("bbs", bbs);
		
		return "bbs/detail";
	}
	
	/* 게시물 저장, 업데이트 */
	@RequestMapping(value = "/bbsSave")
	public String bbsSave(HttpServletRequest request, bbs bbs, 
			ModelMap modelMap) {
		
		

		bbsSvc.updateByExampleBbs(bbs);

		return "redirect:bbsList";
	}
	
	@RequestMapping("/FileDown")
    public ModelAndView download(@RequestParam("filecol")String filecol){
        
        
		String path = "C:\\tom99\\webapps\\ROOT\\"; 
        String fullPath = path + filecol;
         
        File file = new File(fullPath);
        
        
         
        return new ModelAndView("download", "downloadFile", file);
    }


	


	
	
	@RequestMapping(value = "/bbcsList", method = {RequestMethod.GET, RequestMethod.POST})
	public String bbcsList(HttpServletRequest request,bbsExample example, ModelMap modelMap) {
		
		String code2 = "0";
		if (request.getParameter("code2") != null && !"0".equals(request.getParameter("code2"))) {
			code2 = request.getParameter("code2");

		}
		example.setCourseid(Integer.parseInt(code2));
		
		List<ChapterVO> courseList2 = chapterSvc.selListCourse();

		modelMap.addAttribute("courseList2", courseList2);

		example.pageCalculate( bbsSvc.countByExample2(example) );
		
		List<?> listview  = bbsSvc.selectByExample2(example);

		modelMap.addAttribute("listview", listview);
		modelMap.addAttribute("searchVO", example);
		

		return "bbs/list2";
	}


	
	
	@RequestMapping(value = "/bbcsRead")
	public String bbcsRead(HttpServletRequest request, bbs bbs, 
			ModelMap modelMap) {
		
		
		String sn = request.getParameter("sn");
		
		

		bbs = bbsSvc.selectByPrimaryKey(Integer.parseInt(sn));

		modelMap.addAttribute("bbs", bbs);
		
		return "bbs/detail2";
	}
	
	
	@RequestMapping(value = "/bbsDelete")
	public String bbsDelete(HttpServletRequest request, bbs bbs, 
			ModelMap modelMap) {
		
		
		String idx = request.getParameter("idx");
		
		

		bbsSvc.deleteByPrimaryKey(Integer.parseInt(idx));

		
		
		return "redirect:bbsList";
	}
	
	
	
	
	@RequestMapping(value = "/bbcsSave")
	public String bbcsSave(HttpServletRequest request, bbs bbs, 
			ModelMap modelMap) {
		
		bbs.setAnsyn(request.getParameter("ansyn"));

		bbsSvc.updateByExampleBbs(bbs);

		return "redirect:bbcsList";
	}







}
