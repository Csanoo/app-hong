package main.java.edumgt.common.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class utiletc {
    
   
    public static String getShortString(String str, Integer len) {
        try {
            if (str.getBytes("UTF-8").length > len) {
                str = strCut(str, len) + "...";
            }
        } catch (UnsupportedEncodingException ex) {
            System.out.println("UnsupportedEncodingException: getShortString()");
        }

        return str;
    }

    // 배송상태

    public static String OrderStatus(String status)
    {

        if(status == "OR"){ status = "주문접수";}
        else if(status == "OY"){ status = "결제완료";}
        else if(status == "DR"){ status = "배송준비중";}
        else if(status == "DI"){ status = "배송처리";}
        else if(status == "DC"){ status = "배송완료";}
        else if(status == "OC"){ status = "주문취소";}
        else if(status == "RD"){ status = "취소요청";}
        else if(status == "RC"){ status = "취소완료";}
        else if(status == "CD"){ status = "교환요청";}
        else if(status == "CC"){ status = "교환완료";}

        return status;
    }

    /**
     * 한글 문자열 자르기 (실제 처리)
     */
    private static String strCut(String szText, int nlength) {
      String rval = szText;
      int oooF = 0;
      int oooL = 0;
      int rrrF = 0;
      int rrrL = 0;
      int nlengthPrev = 0;
      try {
          byte[] bytes = rval.getBytes("UTF-8"); // 바이트로 보관
          // x부터 y길이만큼 잘라낸다. 한글안깨지게.
          int jcount = 0;
          if (nlengthPrev > 0) {
              while (jcount < bytes.length) {
                  if ((bytes[jcount] & 0x80) != 0) {
                      oooF += 2;
                      rrrF += 3;
                      if (oooF + 2 > nlengthPrev) {
                          break;
                      }
                      jcount += 3;
                  } else {
                      if (oooF + 1 > nlengthPrev) {
                          break;
                      }
                      ++oooF;
                      ++rrrF;
                      ++jcount;
                  }
              }
          }
          jcount = rrrF;
          while (jcount < bytes.length) {
              if ((bytes[jcount] & 0x80) != 0) {
                  if (oooL + 2 > nlength) {
                      break;
                  }
                  oooL += 2;
                  rrrL += 3;
                  jcount += 3;
              } else {
                  if (oooL + 1 > nlength) {
                      break;
                  }
                  ++oooL;
                  ++rrrL;
                  ++jcount;
              }
          }
          rval = new String(bytes, rrrF, rrrL, "UTF-8"); // charset 옵션
      } catch (UnsupportedEncodingException ex) {
          System.out.println("UnsupportedEncodingException: strCut()");
      }
      return rval;
     }



    public static String getHexCode(String inputValue) {

        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch(Exception e) {
            e.printStackTrace();
        }

        String eip;
        byte[] bip;
        String temp = "";
        String tst = inputValue;
        bip = md5.digest(tst.getBytes());

        for(int i=0; i < bip.length; i++) {
            eip = "" + Integer.toHexString((int)bip[i] & 0x000000ff);
            //System.out.println(i + " : " + eid);
            if(eip.length() < 2) eip = "0" + eip;
            temp = temp + eip;
        }
        return temp;
    }
    public static String md5Encoding(String orgStr) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(orgStr.getBytes());
        byte[] encodedStr = md.digest();
        return new String(encodedStr);

    }


    public void makeBasketCookie(HttpServletResponse res, HttpServletRequest req) throws Exception {
        String ip = res.getHeader("HTTP_CLIENT_IP");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String strDt = dateFormat.format(date);
        String strid = ip + strDt;
        String value = md5Encoding(strid);

        Cookie[] cookies = req.getCookies();

        if (getCookieValue(cookies,"uniq_id").isEmpty()){
            Cookie cookie = new Cookie("uniq_id", value); // 쿠키 이름 지정하여 생성( key, value 개념)
            cookie.setMaxAge(60*60*24*30); //쿠키 유효 기간: 하루로 설정(60초 * 60분 * 24시간)
            cookie.setPath("/"); //모든 경로에서 접근 가능하도록 설정
            res.addCookie(cookie); //response에 Cookie 추가
        }

    }


    private String getCookieValue(Cookie[] cookies, String name){
        if(cookies == null){
            return null;
        }

        for(Cookie cookie : cookies) {
            if(cookie.getName().equals(name)){
                return cookie.getValue();
            }
        }
        return null;

    }

}
