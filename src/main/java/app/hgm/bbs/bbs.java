package main.java.app.hgm.bbs;



import org.springframework.web.multipart.MultipartFile;


public class bbs {
	
	public String getIdx() {
		return idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}

	public String getPrdcode() {
		return prdcode;
	}

	public void setPrdcode(String prdcode) {
		this.prdcode = prdcode;
	}

	public String getTidx() {
		return tidx;
	}

	public void setTidx(String tidx) {
		this.tidx = tidx;
	}

	public String getLeccode() {
		return leccode;
	}

	public void setLeccode(String leccode) {
		this.leccode = leccode;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCatname() {
		return catname;
	}

	public void setCatname(String catname) {
		this.catname = catname;
	}

	public String getPrino() {
		return prino;
	}

	public void setPrino(String prino) {
		this.prino = prino;
	}

	public String getGrpno() {
		return grpno;
	}

	public void setGrpno(String grpno) {
		this.grpno = grpno;
	}

	public String getDepno() {
		return depno;
	}

	public void setDepno(String depno) {
		this.depno = depno;
	}

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	public String getMemid() {
		return memid;
	}

	public void setMemid(String memid) {
		this.memid = memid;
	}

	public String getMemgrp() {
		return memgrp;
	}

	public void setMemgrp(String memgrp) {
		this.memgrp = memgrp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	

	private String idx;
	private String prdcode;
	private String tidx;
	private String leccode;
	private String code;
	private String catname;
	private String prino;
	private String grpno;
	private String depno;
	private String star;
	private String memid;
	private String memgrp;
	private String name;
	
	private String subject;
	private String content;


	private String username;
	
	private int courseid;
	
	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setImgfile1(MultipartFile imgfile1) {
		this.imgfile1 = imgfile1;
	}

	private String wdate1;
	public String getWdate1() {
		return wdate1;
	}

	public void setWdate1(String wdate1) {
		this.wdate1 = wdate1;
	}

	public String getWdate2() {
		return wdate2;
	}

	public void setWdate2(String wdate2) {
		this.wdate2 = wdate2;
	}

	private String wdate2;
	
	private String imgfile;

	public String getImgfile() {
		return imgfile;
	}

	public void setImgfile(String imgfile) {
		this.imgfile = imgfile;
	}

	private MultipartFile imgfile1;

	public MultipartFile getImgfile1() {
		return imgfile1;
	}

	public void setImgfile(MultipartFile imgfile1) {
		this.imgfile1 = imgfile1;
	}

	private String email;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMemo2() {
		return memo2;
	}

	public void setMemo2(String memo2) {
		this.memo2 = memo2;
	}

	private String company;
	private String mobile;
	private String memo2;
	
	
	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs.sn
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    private Integer sn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs.userid
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs.bbstype
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    private String bbstype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs.title
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs.memo1
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    private String memo1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs.cnt
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    private Integer cnt;

    private String ansyn;
    public String getAnsyn() {
		return ansyn;
	}

	public void setAnsyn(String ansyn) {
		this.ansyn = ansyn;
	}

	private String afile1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs.afile2
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    private String afile2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs.wdate
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    private String wdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs.sn
     *
     * @return the value of bbs.sn
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    public Integer getSn() {
        return sn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs.sn
     *
     * @param sn the value for bbs.sn
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    public void setSn(Integer sn) {
        this.sn = sn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs.userid
     *
     * @return the value of bbs.userid
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs.userid
     *
     * @param userid the value for bbs.userid
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs.bbstype
     *
     * @return the value of bbs.bbstype
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    public String getBbstype() {
        return bbstype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs.bbstype
     *
     * @param bbstype the value for bbs.bbstype
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    public void setBbstype(String bbstype) {
        this.bbstype = bbstype == null ? null : bbstype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs.title
     *
     * @return the value of bbs.title
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs.title
     *
     * @param title the value for bbs.title
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs.memo1
     *
     * @return the value of bbs.memo1
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    public String getMemo1() {
        return memo1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs.memo1
     *
     * @param memo1 the value for bbs.memo1
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    public void setMemo1(String memo1) {
        this.memo1 = memo1 == null ? null : memo1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs.cnt
     *
     * @return the value of bbs.cnt
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    public Integer getCnt() {
        return cnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs.cnt
     *
     * @param cnt the value for bbs.cnt
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs.afile1
     *
     * @return the value of bbs.afile1
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    public String getAfile1() {
        return afile1;
    }

    
    public void setAfile1(String afile1) {
        this.afile1 = afile1 == null ? null : afile1.trim();
    }

    
    public String getAfile2() {
        return afile2;
    }

    
    public void setAfile2(String afile2) {
        this.afile2 = afile2 == null ? null : afile2.trim();
    }

    
    public String getWdate() {
        return wdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs.wdate
     *
     * @param wdate the value for bbs.wdate
     *
     * @mbg.generated Tue Dec 17 11:09:48 KST 2019
     */
    public void setWdate(String wdate) {
        this.wdate = wdate == null ? null : wdate.trim();
    }
}