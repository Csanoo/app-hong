package main.java.admin.satelite.kr;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ContentsVO {

    HttpServletRequest request;

    private String userid="";;
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }


    private Integer sn;
    public Integer getSn() {
        return sn;
    }
    public void setSn(Integer sn) {
        this.sn = sn;
    }

    private String project="";
    public String getProject() {
        return project;
    }
    public void setProject(String project) {
        this.project = project;
    }


    private String category="";
    public String category() {return category;}
    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    private String type="";
    public String type() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    private String imageUrl="";
    public String imageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getImageUrl() {
        return imageUrl;
    }


    private String videoUrl="";
    public String videoUrl() {
        return videoUrl;
    }
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
    public String getVideoUrl() {
        return videoUrl;
    }


    private String title="";
    public String title() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    private String ctSource="";
    public String ctSource() {
        return ctSource;
    }
    public void setCtSource(String ctSource) {
        this.ctSource = ctSource;
    }
    public String getCtSource() {
        return ctSource;
    }

    private String regDate="";
    public String getRegDate() {
        return regDate;
    }
    public void setRegdate(String regDate) {
        this.regDate = regDate;
    }


    private String code1="";
    public String getCode1() {
        return code1;
    }
    public void setCode1(String code1) {
        this.code1 = code1;
    }
    private String code2="";
    public String getCode2() {
        return code2;
    }
    public void setCode2(String code2) {
        this.code2 = code2;
    }

    private String code1memo="";
    public String getCode1memo() {
        return code1memo;
    }
    public void setCode1memo(String code1memo) {
        this.code1memo = code1memo;
    }

    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }

    private String url="";

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }


    private String memo="";


    private String mobile="";
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getWdate() {
        return wdate;
    }
    public void setWdate(String wdate) {
        this.wdate = wdate;
    }
    private String email="";
    private String wdate="";


    private String state="";
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }


    private String category01="";
    public void setCategory01(String category01) {
        this.category01 = category01;
    }
    public String getCategory01() {
        return category01;
    }

    private String category02="";
    public void setCategory02(String category02) {
        this.category02 = category02;
    }
    public String getCategory02() {
        return category02;
    }

    private String keyword="";
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    public String getKeyword() {
        return keyword;
    }

    private String regid="";;
    public String getRegid() {
        return regid;
    }
    public void setRegid(String regid) {
        this.userid = regid;
    }


    private String sText="";;
    public String getSText() {
        return sText;
    }
    public void setSText(String sText) {
        this.sText = sText;
    }

}
