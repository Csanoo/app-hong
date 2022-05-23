package main.java.app.hgm.product;

import java.util.ArrayList;
import java.util.List;



import main.java.edumgt.common.util.PageVO;

public class ProductExample extends PageVO {
	
	private String catcode;
	public String getCatcode() {
		return catcode;
	}

	public void setCatcode(String catcode) {
		this.catcode = catcode;
	}

	public String getCatname() {
		return catname;
	}

	public void setCatname(String catname) {
		this.catname = catname;
	}

	private String catname;
	
	
	private String send_id;
	public String getSend_id() {
		return send_id;
	}

	public void setSend_id(String send_id) {
		this.send_id = send_id;
	}

	public String getSend_name() {
		return send_name;
	}

	public void setSend_name(String send_name) {
		this.send_name = send_name;
	}

	private String send_name;
	
	private String idx;

	public String getIdx() {
		return idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getPrdimg() {
		return prdimg;
	}

	public void setPrdimg(String prdimg) {
		this.prdimg = prdimg;
	}

	public String getPrdprice() {
		return prdprice;
	}

	public void setPrdprice(String prdprice) {
		this.prdprice = prdprice;
	}

	public String getPrdreserve() {
		return prdreserve;
	}

	public void setPrdreserve(String prdreserve) {
		this.prdreserve = prdreserve;
	}

	public String getOpttitle2() {
		return opttitle2;
	}

	public void setOpttitle2(String opttitle2) {
		this.opttitle2 = opttitle2;
	}

	public String getOptcode2() {
		return optcode2;
	}

	public void setOptcode2(String optcode2) {
		this.optcode2 = optcode2;
	}

	public String getOpttitle3() {
		return opttitle3;
	}

	public void setOpttitle3(String opttitle3) {
		this.opttitle3 = opttitle3;
	}

	public String getOptcode3() {
		return optcode3;
	}

	public void setOptcode3(String optcode3) {
		this.optcode3 = optcode3;
	}

	public String getOpttitle4() {
		return opttitle4;
	}

	public void setOpttitle4(String opttitle4) {
		this.opttitle4 = opttitle4;
	}

	public String getOptcode4() {
		return optcode4;
	}

	public void setOptcode4(String optcode4) {
		this.optcode4 = optcode4;
	}

	public String getOpttitle5() {
		return opttitle5;
	}

	public void setOpttitle5(String opttitle5) {
		this.opttitle5 = opttitle5;
	}

	public String getOptcode5() {
		return optcode5;
	}

	public void setOptcode5(String optcode5) {
		this.optcode5 = optcode5;
	}

	public String getOpttitle6() {
		return opttitle6;
	}

	public void setOpttitle6(String opttitle6) {
		this.opttitle6 = opttitle6;
	}

	public String getOptcode6() {
		return optcode6;
	}

	public void setOptcode6(String optcode6) {
		this.optcode6 = optcode6;
	}

	public String getOpttitle7() {
		return opttitle7;
	}

	public void setOpttitle7(String opttitle7) {
		this.opttitle7 = opttitle7;
	}

	public String getOptcode7() {
		return optcode7;
	}

	public void setOptcode7(String optcode7) {
		this.optcode7 = optcode7;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAcc_name() {
		return acc_name;
	}

	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getRepay() {
		return repay;
	}

	public void setRepay(String repay) {
		this.repay = repay;
	}

	public String getCa_date() {
		return ca_date;
	}

	public void setCa_date(String ca_date) {
		this.ca_date = ca_date;
	}

	public String getCc_date() {
		return cc_date;
	}

	public void setCc_date(String cc_date) {
		this.cc_date = cc_date;
	}

	public String getDel_type() {
		return del_type;
	}

	public void setDel_type(String del_type) {
		this.del_type = del_type;
	}

	public String getDel_price() {
		return del_price;
	}

	public void setDel_price(String del_price) {
		this.del_price = del_price;
	}

	public String getPrdtype() {
		return prdtype;
	}

	public void setPrdtype(String prdtype) {
		this.prdtype = prdtype;
	}

	public String getUserdel() {
		return userdel;
	}

	public void setUserdel(String userdel) {
		this.userdel = userdel;
	}

	private String orderid;

	private String prdimg;
	private String prdprice;
	private String prdreserve;

	private String opttitle2;
	private String optcode2;
	private String opttitle3;
	private String optcode3;
	private String opttitle4;
	private String optcode4;
	private String opttitle5;
	private String optcode5;
	private String opttitle6;
	private String optcode6;
	private String opttitle7;
	private String optcode7;
	private String amount;

	private String status;
	private String admin;
	private String bank;
	private String account;
	private String acc_name;
	private String reason;
	private String memo;
	private String repay;
	private String ca_date;
	private String cc_date;
	private String del_type;
	private String del_price;
	private String prdtype;
	private String userdel;
	
	private String prdcode;
	public String getPrdcode() {
		return prdcode;
	}

	public void setPrdcode(String prdcode) {
		this.prdcode = prdcode;
	}

	public String getPrdname() {
		return prdname;
	}

	public void setPrdname(String prdname) {
		this.prdname = prdname;
	}

	public String getMain_view() {
		return main_view;
	}

	public void setMain_view(String main_view) {
		this.main_view = main_view;
	}

	public String getViewcnt() {
		return viewcnt;
	}

	public void setViewcnt(String viewcnt) {
		this.viewcnt = viewcnt;
	}

	public String getSellprice() {
		return sellprice;
	}

	public void setSellprice(String sellprice) {
		this.sellprice = sellprice;
	}

	public String getPirnt() {
		return pirnt;
	}

	public void setPirnt(String pirnt) {
		this.pirnt = pirnt;
	}

	public String getRidi() {
		return ridi;
	}

	public void setRidi(String ridi) {
		this.ridi = ridi;
	}

	public String getRidi_address() {
		return ridi_address;
	}

	public void setRidi_address(String ridi_address) {
		this.ridi_address = ridi_address;
	}

	public String getInfo_name1() {
		return info_name1;
	}

	public void setInfo_name1(String info_name1) {
		this.info_name1 = info_name1;
	}

	public String getInfo_value1() {
		return info_value1;
	}

	public void setInfo_value1(String info_value1) {
		this.info_value1 = info_value1;
	}

	public String getInfo_name2() {
		return info_name2;
	}

	public void setInfo_name2(String info_name2) {
		this.info_name2 = info_name2;
	}

	public String getInfo_value2() {
		return info_value2;
	}

	public void setInfo_value2(String info_value2) {
		this.info_value2 = info_value2;
	}

	public String getInfo_name3() {
		return info_name3;
	}

	public void setInfo_name3(String info_name3) {
		this.info_name3 = info_name3;
	}

	public String getInfo_value3() {
		return info_value3;
	}

	public void setInfo_value3(String info_value3) {
		this.info_value3 = info_value3;
	}

	public String getInfo_name4() {
		return info_name4;
	}

	public void setInfo_name4(String info_name4) {
		this.info_name4 = info_name4;
	}

	public String getInfo_value4() {
		return info_value4;
	}

	public void setInfo_value4(String info_value4) {
		this.info_value4 = info_value4;
	}

	public String getOpttitle() {
		return opttitle;
	}

	public void setOpttitle(String opttitle) {
		this.opttitle = opttitle;
	}

	public String getOptcode() {
		return optcode;
	}

	public void setOptcode(String optcode) {
		this.optcode = optcode;
	}

	public String getPrdimg_g() {
		return prdimg_g;
	}

	public void setPrdimg_g(String prdimg_g) {
		this.prdimg_g = prdimg_g;
	}

	public String getPrdimg_r() {
		return prdimg_r;
	}

	public void setPrdimg_r(String prdimg_r) {
		this.prdimg_r = prdimg_r;
	}

	public String getPrdimg_l1() {
		return prdimg_l1;
	}

	public void setPrdimg_l1(String prdimg_l1) {
		this.prdimg_l1 = prdimg_l1;
	}

	public String getPrdimg_m1() {
		return prdimg_m1;
	}

	public void setPrdimg_m1(String prdimg_m1) {
		this.prdimg_m1 = prdimg_m1;
	}

	public String getPrdimg_s1() {
		return prdimg_s1;
	}

	public void setPrdimg_s1(String prdimg_s1) {
		this.prdimg_s1 = prdimg_s1;
	}

	public String getSearchkey() {
		return searchkey;
	}

	public void setSearchkey(String searchkey) {
		this.searchkey = searchkey;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	private String prdname;
	private String main_view;
	private String viewcnt;
	private String sellprice;
	private String pirnt;
	private String ridi;
	private String ridi_address;
	private String info_name1;
	private String info_value1;
	private String info_name2;
	private String info_value2;
	private String info_name3;
	private String info_value3;
	private String info_name4;
	private String info_value4;
	private String opttitle;
	private String optcode;
	private String prdimg_g;
	private String prdimg_r;
	private String prdimg_l1;
	private String prdimg_m1;
	private String prdimg_s1;
	private String searchkey;
	private String content;
	private String wdate;

	private String imgfile;

	public String getImgfile() {
		return imgfile;
	}

	public void setImgfile(String imgfile) {
		this.imgfile = imgfile;
	}

	private String faqhdr;

	public String getFaqhdr() {
		return faqhdr;
	}

	public void setFaqhdr(String faqhdr) {
		this.faqhdr = faqhdr;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Integer getOdrno() {
		return odrno;
	}

	public void setOdrno(Integer odrno) {
		this.odrno = odrno;
	}

	public String getMp4url() {
		return mp4url;
	}

	public void setMp4url(String mp4url) {
		this.mp4url = mp4url;
	}

	public String getYtburl() {
		return ytburl;
	}

	public void setYtburl(String ytburl) {
		this.ytburl = ytburl;
	}

	private String question;
	private String answer;
	private Integer odrno;
	private String mp4url;
	private String ytburl;

	protected String orderByClause;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database table career
	 *
	 * @mbg.generated Tue Dec 17 11:09:48 KST 2019
	 */
	protected boolean distinct;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database table career
	 *
	 * @mbg.generated Tue Dec 17 11:09:48 KST 2019
	 */
	protected List<Criteria> oredCriteria;

	
	public ProductExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table career
	 *
	 * @mbg.generated Tue Dec 17 11:09:48 KST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table career
	 *
	 * @mbg.generated Tue Dec 17 11:09:48 KST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table career
	 *
	 * @mbg.generated Tue Dec 17 11:09:48 KST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table career
	 *
	 * @mbg.generated Tue Dec 17 11:09:48 KST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table career
	 *
	 * @mbg.generated Tue Dec 17 11:09:48 KST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table career
	 *
	 * @mbg.generated Tue Dec 17 11:09:48 KST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table career
	 *
	 * @mbg.generated Tue Dec 17 11:09:48 KST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table career
	 *
	 * @mbg.generated Tue Dec 17 11:09:48 KST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table career
	 *
	 * @mbg.generated Tue Dec 17 11:09:48 KST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the
	 * database table career
	 *
	 * @mbg.generated Tue Dec 17 11:09:48 KST 2019
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andSnIsNull() {
			addCriterion("sn is null");
			return (Criteria) this;
		}

		public Criteria andSnIsNotNull() {
			addCriterion("sn is not null");
			return (Criteria) this;
		}

		public Criteria andSnEqualTo(Integer value) {
			addCriterion("sn =", value, "sn");
			return (Criteria) this;
		}

		public Criteria andSnNotEqualTo(Integer value) {
			addCriterion("sn <>", value, "sn");
			return (Criteria) this;
		}

		public Criteria andSnGreaterThan(Integer value) {
			addCriterion("sn >", value, "sn");
			return (Criteria) this;
		}

		public Criteria andSnGreaterThanOrEqualTo(Integer value) {
			addCriterion("sn >=", value, "sn");
			return (Criteria) this;
		}

		public Criteria andSnLessThan(Integer value) {
			addCriterion("sn <", value, "sn");
			return (Criteria) this;
		}

		public Criteria andSnLessThanOrEqualTo(Integer value) {
			addCriterion("sn <=", value, "sn");
			return (Criteria) this;
		}

		public Criteria andSnIn(List<Integer> values) {
			addCriterion("sn in", values, "sn");
			return (Criteria) this;
		}

		public Criteria andSnNotIn(List<Integer> values) {
			addCriterion("sn not in", values, "sn");
			return (Criteria) this;
		}

		public Criteria andSnBetween(Integer value1, Integer value2) {
			addCriterion("sn between", value1, value2, "sn");
			return (Criteria) this;
		}

		public Criteria andSnNotBetween(Integer value1, Integer value2) {
			addCriterion("sn not between", value1, value2, "sn");
			return (Criteria) this;
		}

		public Criteria andUseridfkIsNull() {
			addCriterion("useridfk is null");
			return (Criteria) this;
		}

		public Criteria andUseridfkIsNotNull() {
			addCriterion("useridfk is not null");
			return (Criteria) this;
		}

		public Criteria andUseridfkEqualTo(String value) {
			addCriterion("useridfk =", value, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkNotEqualTo(String value) {
			addCriterion("useridfk <>", value, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkGreaterThan(String value) {
			addCriterion("useridfk >", value, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkGreaterThanOrEqualTo(String value) {
			addCriterion("useridfk >=", value, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkLessThan(String value) {
			addCriterion("useridfk <", value, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkLessThanOrEqualTo(String value) {
			addCriterion("useridfk <=", value, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkLike(String value) {
			addCriterion("useridfk like", value, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkNotLike(String value) {
			addCriterion("useridfk not like", value, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkIn(List<String> values) {
			addCriterion("useridfk in", values, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkNotIn(List<String> values) {
			addCriterion("useridfk not in", values, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkBetween(String value1, String value2) {
			addCriterion("useridfk between", value1, value2, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkNotBetween(String value1, String value2) {
			addCriterion("useridfk not between", value1, value2, "useridfk");
			return (Criteria) this;
		}

		public Criteria andCrtypeIsNull() {
			addCriterion("crtype is null");
			return (Criteria) this;
		}

		public Criteria andCrtypeIsNotNull() {
			addCriterion("crtype is not null");
			return (Criteria) this;
		}

		public Criteria andCrtypeEqualTo(String value) {
			addCriterion("crtype =", value, "crtype");
			return (Criteria) this;
		}

		public Criteria andCrtypeNotEqualTo(String value) {
			addCriterion("crtype <>", value, "crtype");
			return (Criteria) this;
		}

		public Criteria andCrtypeGreaterThan(String value) {
			addCriterion("crtype >", value, "crtype");
			return (Criteria) this;
		}

		public Criteria andCrtypeGreaterThanOrEqualTo(String value) {
			addCriterion("crtype >=", value, "crtype");
			return (Criteria) this;
		}

		public Criteria andCrtypeLessThan(String value) {
			addCriterion("crtype <", value, "crtype");
			return (Criteria) this;
		}

		public Criteria andCrtypeLessThanOrEqualTo(String value) {
			addCriterion("crtype <=", value, "crtype");
			return (Criteria) this;
		}

		public Criteria andCrtypeLike(String value) {
			addCriterion("crtype like", value, "crtype");
			return (Criteria) this;
		}

		public Criteria andCrtypeNotLike(String value) {
			addCriterion("crtype not like", value, "crtype");
			return (Criteria) this;
		}

		public Criteria andCrtypeIn(List<String> values) {
			addCriterion("crtype in", values, "crtype");
			return (Criteria) this;
		}

		public Criteria andCrtypeNotIn(List<String> values) {
			addCriterion("crtype not in", values, "crtype");
			return (Criteria) this;
		}

		public Criteria andCrtypeBetween(String value1, String value2) {
			addCriterion("crtype between", value1, value2, "crtype");
			return (Criteria) this;
		}

		public Criteria andCrtypeNotBetween(String value1, String value2) {
			addCriterion("crtype not between", value1, value2, "crtype");
			return (Criteria) this;
		}

		public Criteria andCrtypeodrnoIsNull() {
			addCriterion("crtypeodrno is null");
			return (Criteria) this;
		}

		public Criteria andCrtypeodrnoIsNotNull() {
			addCriterion("crtypeodrno is not null");
			return (Criteria) this;
		}

		public Criteria andCrtypeodrnoEqualTo(Integer value) {
			addCriterion("crtypeodrno =", value, "crtypeodrno");
			return (Criteria) this;
		}

		public Criteria andCrtypeodrnoNotEqualTo(Integer value) {
			addCriterion("crtypeodrno <>", value, "crtypeodrno");
			return (Criteria) this;
		}

		public Criteria andCrtypeodrnoGreaterThan(Integer value) {
			addCriterion("crtypeodrno >", value, "crtypeodrno");
			return (Criteria) this;
		}

		public Criteria andCrtypeodrnoGreaterThanOrEqualTo(Integer value) {
			addCriterion("crtypeodrno >=", value, "crtypeodrno");
			return (Criteria) this;
		}

		public Criteria andCrtypeodrnoLessThan(Integer value) {
			addCriterion("crtypeodrno <", value, "crtypeodrno");
			return (Criteria) this;
		}

		public Criteria andCrtypeodrnoLessThanOrEqualTo(Integer value) {
			addCriterion("crtypeodrno <=", value, "crtypeodrno");
			return (Criteria) this;
		}

		public Criteria andCrtypeodrnoIn(List<Integer> values) {
			addCriterion("crtypeodrno in", values, "crtypeodrno");
			return (Criteria) this;
		}

		public Criteria andCrtypeodrnoNotIn(List<Integer> values) {
			addCriterion("crtypeodrno not in", values, "crtypeodrno");
			return (Criteria) this;
		}

		public Criteria andCrtypeodrnoBetween(Integer value1, Integer value2) {
			addCriterion("crtypeodrno between", value1, value2, "crtypeodrno");
			return (Criteria) this;
		}

		public Criteria andCrtypeodrnoNotBetween(Integer value1, Integer value2) {
			addCriterion("crtypeodrno not between", value1, value2, "crtypeodrno");
			return (Criteria) this;
		}

		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return (Criteria) this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return (Criteria) this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleIn(List<String> values) {
			addCriterion("title in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("title not in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andSubtitleIsNull() {
			addCriterion("subtitle is null");
			return (Criteria) this;
		}

		public Criteria andSubtitleIsNotNull() {
			addCriterion("subtitle is not null");
			return (Criteria) this;
		}

		public Criteria andSubtitleEqualTo(String value) {
			addCriterion("subtitle =", value, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleNotEqualTo(String value) {
			addCriterion("subtitle <>", value, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleGreaterThan(String value) {
			addCriterion("subtitle >", value, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleGreaterThanOrEqualTo(String value) {
			addCriterion("subtitle >=", value, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleLessThan(String value) {
			addCriterion("subtitle <", value, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleLessThanOrEqualTo(String value) {
			addCriterion("subtitle <=", value, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleLike(String value) {
			addCriterion("subtitle like", value, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleNotLike(String value) {
			addCriterion("subtitle not like", value, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleIn(List<String> values) {
			addCriterion("subtitle in", values, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleNotIn(List<String> values) {
			addCriterion("subtitle not in", values, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleBetween(String value1, String value2) {
			addCriterion("subtitle between", value1, value2, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleNotBetween(String value1, String value2) {
			addCriterion("subtitle not between", value1, value2, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSdateIsNull() {
			addCriterion("sdate is null");
			return (Criteria) this;
		}

		public Criteria andSdateIsNotNull() {
			addCriterion("sdate is not null");
			return (Criteria) this;
		}

		public Criteria andSdateEqualTo(String value) {
			addCriterion("sdate =", value, "sdate");
			return (Criteria) this;
		}

		public Criteria andSdateNotEqualTo(String value) {
			addCriterion("sdate <>", value, "sdate");
			return (Criteria) this;
		}

		public Criteria andSdateGreaterThan(String value) {
			addCriterion("sdate >", value, "sdate");
			return (Criteria) this;
		}

		public Criteria andSdateGreaterThanOrEqualTo(String value) {
			addCriterion("sdate >=", value, "sdate");
			return (Criteria) this;
		}

		public Criteria andSdateLessThan(String value) {
			addCriterion("sdate <", value, "sdate");
			return (Criteria) this;
		}

		public Criteria andSdateLessThanOrEqualTo(String value) {
			addCriterion("sdate <=", value, "sdate");
			return (Criteria) this;
		}

		public Criteria andSdateLike(String value) {
			addCriterion("sdate like", value, "sdate");
			return (Criteria) this;
		}

		public Criteria andSdateNotLike(String value) {
			addCriterion("sdate not like", value, "sdate");
			return (Criteria) this;
		}

		public Criteria andSdateIn(List<String> values) {
			addCriterion("sdate in", values, "sdate");
			return (Criteria) this;
		}

		public Criteria andSdateNotIn(List<String> values) {
			addCriterion("sdate not in", values, "sdate");
			return (Criteria) this;
		}

		public Criteria andSdateBetween(String value1, String value2) {
			addCriterion("sdate between", value1, value2, "sdate");
			return (Criteria) this;
		}

		public Criteria andSdateNotBetween(String value1, String value2) {
			addCriterion("sdate not between", value1, value2, "sdate");
			return (Criteria) this;
		}

		public Criteria andEdateIsNull() {
			addCriterion("edate is null");
			return (Criteria) this;
		}

		public Criteria andEdateIsNotNull() {
			addCriterion("edate is not null");
			return (Criteria) this;
		}

		public Criteria andEdateEqualTo(String value) {
			addCriterion("edate =", value, "edate");
			return (Criteria) this;
		}

		public Criteria andEdateNotEqualTo(String value) {
			addCriterion("edate <>", value, "edate");
			return (Criteria) this;
		}

		public Criteria andEdateGreaterThan(String value) {
			addCriterion("edate >", value, "edate");
			return (Criteria) this;
		}

		public Criteria andEdateGreaterThanOrEqualTo(String value) {
			addCriterion("edate >=", value, "edate");
			return (Criteria) this;
		}

		public Criteria andEdateLessThan(String value) {
			addCriterion("edate <", value, "edate");
			return (Criteria) this;
		}

		public Criteria andEdateLessThanOrEqualTo(String value) {
			addCriterion("edate <=", value, "edate");
			return (Criteria) this;
		}

		public Criteria andEdateLike(String value) {
			addCriterion("edate like", value, "edate");
			return (Criteria) this;
		}

		public Criteria andEdateNotLike(String value) {
			addCriterion("edate not like", value, "edate");
			return (Criteria) this;
		}

		public Criteria andEdateIn(List<String> values) {
			addCriterion("edate in", values, "edate");
			return (Criteria) this;
		}

		public Criteria andEdateNotIn(List<String> values) {
			addCriterion("edate not in", values, "edate");
			return (Criteria) this;
		}

		public Criteria andEdateBetween(String value1, String value2) {
			addCriterion("edate between", value1, value2, "edate");
			return (Criteria) this;
		}

		public Criteria andEdateNotBetween(String value1, String value2) {
			addCriterion("edate not between", value1, value2, "edate");
			return (Criteria) this;
		}

		public Criteria andGraduIsNull() {
			addCriterion("gradu is null");
			return (Criteria) this;
		}

		public Criteria andGraduIsNotNull() {
			addCriterion("gradu is not null");
			return (Criteria) this;
		}

		public Criteria andGraduEqualTo(String value) {
			addCriterion("gradu =", value, "gradu");
			return (Criteria) this;
		}

		public Criteria andGraduNotEqualTo(String value) {
			addCriterion("gradu <>", value, "gradu");
			return (Criteria) this;
		}

		public Criteria andGraduGreaterThan(String value) {
			addCriterion("gradu >", value, "gradu");
			return (Criteria) this;
		}

		public Criteria andGraduGreaterThanOrEqualTo(String value) {
			addCriterion("gradu >=", value, "gradu");
			return (Criteria) this;
		}

		public Criteria andGraduLessThan(String value) {
			addCriterion("gradu <", value, "gradu");
			return (Criteria) this;
		}

		public Criteria andGraduLessThanOrEqualTo(String value) {
			addCriterion("gradu <=", value, "gradu");
			return (Criteria) this;
		}

		public Criteria andGraduLike(String value) {
			addCriterion("gradu like", value, "gradu");
			return (Criteria) this;
		}

		public Criteria andGraduNotLike(String value) {
			addCriterion("gradu not like", value, "gradu");
			return (Criteria) this;
		}

		public Criteria andGraduIn(List<String> values) {
			addCriterion("gradu in", values, "gradu");
			return (Criteria) this;
		}

		public Criteria andGraduNotIn(List<String> values) {
			addCriterion("gradu not in", values, "gradu");
			return (Criteria) this;
		}

		public Criteria andGraduBetween(String value1, String value2) {
			addCriterion("gradu between", value1, value2, "gradu");
			return (Criteria) this;
		}

		public Criteria andGraduNotBetween(String value1, String value2) {
			addCriterion("gradu not between", value1, value2, "gradu");
			return (Criteria) this;
		}

		public Criteria andJikhamIsNull() {
			addCriterion("jikham is null");
			return (Criteria) this;
		}

		public Criteria andJikhamIsNotNull() {
			addCriterion("jikham is not null");
			return (Criteria) this;
		}

		public Criteria andJikhamEqualTo(String value) {
			addCriterion("jikham =", value, "jikham");
			return (Criteria) this;
		}

		public Criteria andJikhamNotEqualTo(String value) {
			addCriterion("jikham <>", value, "jikham");
			return (Criteria) this;
		}

		public Criteria andJikhamGreaterThan(String value) {
			addCriterion("jikham >", value, "jikham");
			return (Criteria) this;
		}

		public Criteria andJikhamGreaterThanOrEqualTo(String value) {
			addCriterion("jikham >=", value, "jikham");
			return (Criteria) this;
		}

		public Criteria andJikhamLessThan(String value) {
			addCriterion("jikham <", value, "jikham");
			return (Criteria) this;
		}

		public Criteria andJikhamLessThanOrEqualTo(String value) {
			addCriterion("jikham <=", value, "jikham");
			return (Criteria) this;
		}

		public Criteria andJikhamLike(String value) {
			addCriterion("jikham like", value, "jikham");
			return (Criteria) this;
		}

		public Criteria andJikhamNotLike(String value) {
			addCriterion("jikham not like", value, "jikham");
			return (Criteria) this;
		}

		public Criteria andJikhamIn(List<String> values) {
			addCriterion("jikham in", values, "jikham");
			return (Criteria) this;
		}

		public Criteria andJikhamNotIn(List<String> values) {
			addCriterion("jikham not in", values, "jikham");
			return (Criteria) this;
		}

		public Criteria andJikhamBetween(String value1, String value2) {
			addCriterion("jikham between", value1, value2, "jikham");
			return (Criteria) this;
		}

		public Criteria andJikhamNotBetween(String value1, String value2) {
			addCriterion("jikham not between", value1, value2, "jikham");
			return (Criteria) this;
		}

		public Criteria andJikchkIsNull() {
			addCriterion("jikchk is null");
			return (Criteria) this;
		}

		public Criteria andJikchkIsNotNull() {
			addCriterion("jikchk is not null");
			return (Criteria) this;
		}

		public Criteria andJikchkEqualTo(String value) {
			addCriterion("jikchk =", value, "jikchk");
			return (Criteria) this;
		}

		public Criteria andJikchkNotEqualTo(String value) {
			addCriterion("jikchk <>", value, "jikchk");
			return (Criteria) this;
		}

		public Criteria andJikchkGreaterThan(String value) {
			addCriterion("jikchk >", value, "jikchk");
			return (Criteria) this;
		}

		public Criteria andJikchkGreaterThanOrEqualTo(String value) {
			addCriterion("jikchk >=", value, "jikchk");
			return (Criteria) this;
		}

		public Criteria andJikchkLessThan(String value) {
			addCriterion("jikchk <", value, "jikchk");
			return (Criteria) this;
		}

		public Criteria andJikchkLessThanOrEqualTo(String value) {
			addCriterion("jikchk <=", value, "jikchk");
			return (Criteria) this;
		}

		public Criteria andJikchkLike(String value) {
			addCriterion("jikchk like", value, "jikchk");
			return (Criteria) this;
		}

		public Criteria andJikchkNotLike(String value) {
			addCriterion("jikchk not like", value, "jikchk");
			return (Criteria) this;
		}

		public Criteria andJikchkIn(List<String> values) {
			addCriterion("jikchk in", values, "jikchk");
			return (Criteria) this;
		}

		public Criteria andJikchkNotIn(List<String> values) {
			addCriterion("jikchk not in", values, "jikchk");
			return (Criteria) this;
		}

		public Criteria andJikchkBetween(String value1, String value2) {
			addCriterion("jikchk between", value1, value2, "jikchk");
			return (Criteria) this;
		}

		public Criteria andJikchkNotBetween(String value1, String value2) {
			addCriterion("jikchk not between", value1, value2, "jikchk");
			return (Criteria) this;
		}

		public Criteria andMemo1IsNull() {
			addCriterion("memo1 is null");
			return (Criteria) this;
		}

		public Criteria andMemo1IsNotNull() {
			addCriterion("memo1 is not null");
			return (Criteria) this;
		}

		public Criteria andMemo1EqualTo(String value) {
			addCriterion("memo1 =", value, "memo1");
			return (Criteria) this;
		}

		public Criteria andMemo1NotEqualTo(String value) {
			addCriterion("memo1 <>", value, "memo1");
			return (Criteria) this;
		}

		public Criteria andMemo1GreaterThan(String value) {
			addCriterion("memo1 >", value, "memo1");
			return (Criteria) this;
		}

		public Criteria andMemo1GreaterThanOrEqualTo(String value) {
			addCriterion("memo1 >=", value, "memo1");
			return (Criteria) this;
		}

		public Criteria andMemo1LessThan(String value) {
			addCriterion("memo1 <", value, "memo1");
			return (Criteria) this;
		}

		public Criteria andMemo1LessThanOrEqualTo(String value) {
			addCriterion("memo1 <=", value, "memo1");
			return (Criteria) this;
		}

		public Criteria andMemo1Like(String value) {
			addCriterion("memo1 like", value, "memo1");
			return (Criteria) this;
		}

		public Criteria andMemo1NotLike(String value) {
			addCriterion("memo1 not like", value, "memo1");
			return (Criteria) this;
		}

		public Criteria andMemo1In(List<String> values) {
			addCriterion("memo1 in", values, "memo1");
			return (Criteria) this;
		}

		public Criteria andMemo1NotIn(List<String> values) {
			addCriterion("memo1 not in", values, "memo1");
			return (Criteria) this;
		}

		public Criteria andMemo1Between(String value1, String value2) {
			addCriterion("memo1 between", value1, value2, "memo1");
			return (Criteria) this;
		}

		public Criteria andMemo1NotBetween(String value1, String value2) {
			addCriterion("memo1 not between", value1, value2, "memo1");
			return (Criteria) this;
		}

		public Criteria andMemo2IsNull() {
			addCriterion("memo2 is null");
			return (Criteria) this;
		}

		public Criteria andMemo2IsNotNull() {
			addCriterion("memo2 is not null");
			return (Criteria) this;
		}

		public Criteria andMemo2EqualTo(String value) {
			addCriterion("memo2 =", value, "memo2");
			return (Criteria) this;
		}

		public Criteria andMemo2NotEqualTo(String value) {
			addCriterion("memo2 <>", value, "memo2");
			return (Criteria) this;
		}

		public Criteria andMemo2GreaterThan(String value) {
			addCriterion("memo2 >", value, "memo2");
			return (Criteria) this;
		}

		public Criteria andMemo2GreaterThanOrEqualTo(String value) {
			addCriterion("memo2 >=", value, "memo2");
			return (Criteria) this;
		}

		public Criteria andMemo2LessThan(String value) {
			addCriterion("memo2 <", value, "memo2");
			return (Criteria) this;
		}

		public Criteria andMemo2LessThanOrEqualTo(String value) {
			addCriterion("memo2 <=", value, "memo2");
			return (Criteria) this;
		}

		public Criteria andMemo2Like(String value) {
			addCriterion("memo2 like", value, "memo2");
			return (Criteria) this;
		}

		public Criteria andMemo2NotLike(String value) {
			addCriterion("memo2 not like", value, "memo2");
			return (Criteria) this;
		}

		public Criteria andMemo2In(List<String> values) {
			addCriterion("memo2 in", values, "memo2");
			return (Criteria) this;
		}

		public Criteria andMemo2NotIn(List<String> values) {
			addCriterion("memo2 not in", values, "memo2");
			return (Criteria) this;
		}

		public Criteria andMemo2Between(String value1, String value2) {
			addCriterion("memo2 between", value1, value2, "memo2");
			return (Criteria) this;
		}

		public Criteria andMemo2NotBetween(String value1, String value2) {
			addCriterion("memo2 not between", value1, value2, "memo2");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the
	 * database table career
	 *
	 * @mbg.generated do_not_delete_during_merge Tue Dec 17 11:09:48 KST 2019
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the
	 * database table career
	 *
	 * @mbg.generated Tue Dec 17 11:09:48 KST 2019
	 */
	public static class Criterion {
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}