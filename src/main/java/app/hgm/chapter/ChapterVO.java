package main.java.app.hgm.chapter;

import org.springframework.web.multipart.MultipartFile;

public class ChapterVO {
	
	private String upfile;
	public String getUpfile() {
		return upfile;
	}

	public void setUpfile(String upfile) {
		this.upfile = upfile;
	}

	public String getUpfile_name() {
		return upfile_name;
	}

	public void setUpfile_name(String upfile_name) {
		this.upfile_name = upfile_name;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	private String upfile_name;
	private String html;
	
	
	private String code1;
	public String getCode1() {
		return code1;
	}

	public void setCode1(String code1) {
		this.code1 = code1;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	public String getCode3() {
		return code3;
	}

	public void setCode3(String code3) {
		this.code3 = code3;
	}

	public String getCodename() {
		return codename;
	}

	public void setCodename(String codename) {
		this.codename = codename;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	private String code2;
	private String code3;
	private String codename;
	private String code;
	
	private Integer sn;

	private String prv;
	
	private String memo;
	
	private String chpimg1;
	public String getChpimg1() {
		return chpimg1;
	}

	public void setChpimg1(String chpimg1) {
		this.chpimg1 = chpimg1;
	}

	public String getChpimg2() {
		return chpimg2;
	}

	public void setChpimg2(String chpimg2) {
		this.chpimg2 = chpimg2;
	}

	public MultipartFile getChpimg1file() {
		return chpimg1file;
	}

	public void setChpimg1file(MultipartFile chpimg1file) {
		this.chpimg1file = chpimg1file;
	}

	public MultipartFile getChpimg2file() {
		return chpimg2file;
	}

	public void setChpimg2file(MultipartFile chpimg2file) {
		this.chpimg2file = chpimg2file;
	}

	private String chpimg2;
	
	private MultipartFile chpimg1file;
	private MultipartFile chpimg2file;
	
	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	private String title;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private String mp4url;
	private String mp4url2;
	public String getMp4url2() {
		return mp4url2;
	}

	public void setMp4url2(String mp4url2) {
		this.mp4url2 = mp4url2;
	}

	public String getApikey() {
		return apikey;
	}

	public void setApikey(String apikey) {
		this.apikey = apikey;
	}

	private String apikey;

	public String getMp4url() {
		return mp4url;
	}

	public void setMp4url(String mp4url) {
		this.mp4url = mp4url;
	}

	public String getPrv() {
		return prv;
	}

	public void setPrv(String prv) {
		this.prv = prv;
	}

	private String cosn;

	public String getCosn() {
		return cosn;
	}

	public void setCosn(String cosn) {
		this.cosn = cosn;
	}

	private String coid;
	private String cotitle; // 강좌 제목
	private String chaptitle; // 강의 제목
	private Integer ord;
	
	private String ord2;
	public String getOrd2() {
		return ord2;
	}

	public void setOrd2(String ord2) {
		this.ord2 = ord2;
	}

	public String getRuntime2() {
		return runtime2;
	}

	public void setRuntime2(String runtime2) {
		this.runtime2 = runtime2;
	}

	private String runtime2;
	
	private Integer runtime;
	private String typecode;

	public Integer getSn() {
		return sn;
	}

	public void setSn(Integer sn) {
		this.sn = sn;
	}

	public String getCoid() {
		return coid;
	}

	public void setCoid(String coid) {
		this.coid = coid;
	}

	public String getCotitle() {
		return cotitle;
	}

	public void setCotitle(String cotitle) {
		this.cotitle = cotitle;
	}

	public String getChaptitle() {
		return chaptitle;
	}

	public void setChaptitle(String chaptitle) {
		this.chaptitle = chaptitle;
	}

	public Integer getOrd() {
		return ord;
	}

	public void setOrd(Integer ord) {
		this.ord = ord;
	}

	public Integer getRuntime() {
		return runtime;
	}

	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}

	public String getTypecode() {
		return typecode;
	}

	public void setTypecode(String typecode) {
		this.typecode = typecode;
	}

	@Override
	public String toString() {
		return "ChapterVO [sn=" + sn + ", coid=" + coid + ", cotitle=" + cotitle + ", chaptitle=" + chaptitle + ", ord="
				+ ord + ", runtime=" + runtime + ", typecode=" + typecode + "]/n";
	}

}
