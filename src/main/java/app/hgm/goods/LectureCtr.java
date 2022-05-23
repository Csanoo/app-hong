package main.java.app.hgm.goods;

import main.java.edumgt.common.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LectureCtr {

    @RequestMapping(value = "/lectureList")
    public String LectureList( HttpServletRequest request, ModelMap modelMap,HttpSession session) {

        return "goods/lectureList";
    }

}
