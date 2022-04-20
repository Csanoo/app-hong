package main.java.app.hgm.kr;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import main.java.common.satelite.kr.SearchVO;

@Controller
public class RssCtr {
    @Autowired
    private RssSvc rssSvc;

    @RequestMapping(value = "/rssReg")
    public String rssReg(HttpServletRequest request, SearchVO searchVO, ModelMap modelMap, HttpSession session) {


        searchVO.setDisplayRowCount(searchVO.getPageNo());
        searchVO.pageCalculate( rssSvc.selectrssCount(searchVO) ); // startRow, endRow

        List<?> listview  = rssSvc.selectrssList(searchVO);
        modelMap.addAttribute("listview", listview);
        modelMap.addAttribute("searchVO", searchVO);


        return "rss/list";

    }

    @RequestMapping(value = "/rssSave")
    public String projectSave(HttpServletRequest request,RssVO rssVO) {
        String USERID = "";
        if ( request.getSession().getAttribute("USERID") != null ) {
            USERID = (String)request.getSession().getAttribute("USERID");
        }
        rssVO.setRegUser(USERID);
        rssSvc.inserrss(rssVO);
        return "redirect:rssReg";
    }

    @ResponseBody
    @RequestMapping(value = "/rssChkDelete")
    public String prtChkDelete(HttpServletRequest request, SearchVO searchVO , Map<String,Object> commandMap,ProjectVO projectInfo,
                               ModelMap modelMap) throws Exception{
        String result = "TRUE";
        try {
            int cnt = Integer.parseInt(request.getParameter("CNT"));
            //System.out.println(cnt);
            String rprtOdr = request.getParameter("RPRT_ODR");
            String [] strArray = rprtOdr.split(",");
            for(int i=0; i<cnt; i++) {
                String sn = (String)strArray[i];
                rssSvc.chkRssDelete(sn);
            }
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            result = "FALSE";
        }
        return "TRUE";
    }

    @ResponseBody
    @RequestMapping(value = "/selUrlCt")
    public Integer selPrjTitCt(HttpServletRequest request, SearchVO searchVO , Map<String,Object> commandMap,ProjectVO projectInfo, ModelMap modelMap) throws Exception{

        try {
            String url = request.getParameter("url");
            return rssSvc.selUrlCt(url);

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            return 0;
        }

    }

    @RequestMapping(value = "/rssRead")
    public String banner1Read(HttpServletRequest request, RssVO rssInfo,SearchVO searchVO, ModelMap modelMap) {
        String sn = request.getParameter("sn");
        rssInfo = rssSvc.selectRssOne(sn);
        modelMap.addAttribute("rssInfo", rssInfo);

        return "rss/form";
    }




    @RequestMapping(value = "/rssModify")
    public String projectUp(SearchVO searchVO, HttpServletRequest request, RssVO rssVO, ModelMap modelMap) {
        String USERID = "";
        if ( request.getSession().getAttribute("USERID") != null ) {
            USERID = (String)request.getSession().getAttribute("USERID");
        }
        rssVO.setRegUser(USERID);
        Integer sn = Integer.parseInt(request.getParameter("sn"));
        String title = request.getParameter("title");
        String url = request.getParameter("url");


        rssVO.setTitle(title);
        rssVO.setUrl(url);
        rssVO.setSn(sn);

        rssSvc.updateRss(rssVO);

        return "redirect:rssReg";
    }


}
