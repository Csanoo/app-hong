<%@page import="egovframework.rte.fdl.property.impl.EgovPropertyServiceImpl"%>
<%@page import="humanframework.core.abst.HumanAbastractController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.io.*"%>
<%@page import="java.util.UUID"%>
<%@page import="java.text.SimpleDateFormat"%>
 <%@ taglib prefix="spring" 	uri="http://www.springframework.org/tags" %>

  <jsp:useBean id="propertiesService" scope="page" class="egovframework.rte.fdl.property.impl.EgovPropertyServiceImpl" />
<%

	//파일정보
    String sFileInfo = "";
    //파일명을 받는다 - 일반 원본파일명
    String filename = request.getHeader("file-name");
    //파일 확장자
    String filename_ext = filename.substring(filename.lastIndexOf(".") + 1);
    //확장자를소문자로 변경
    filename_ext = filename_ext.toLowerCase();
 
    //이미지 검증 배열변수
    String[] allow_file = { "jpg", "png", "bmp", "gif" };
 
    //돌리면서 확장자가 이미지인지 
    int cnt = 0;
    for (int i = 0; i < allow_file.length; i++) {
        if (filename_ext.equals(allow_file[i])) {
            cnt++;
        }
    }
 
    //이미지가 아님
    if (cnt == 0) {
        out.println("NOTALLOW_" + filename);
    } else {
        //이미지이므로 신규 파일로 디렉토리 설정 및 업로드   
        //파일 기본경로
      System.out.println(" ### 경로1 : "+request.getSession().getServletContext().getAttribute("WEB_UPLOAD_DIR"));
      System.out.println(" ### 경로2 : "+(String)request.getSession().getServletContext().getAttribute("WEB_UPLOAD_DIR"));
      System.out.println(" ### 경로 3 : "+ request.getSession().getAttribute("WEB_UPLOAD_DIR"));
      System.out.println(" ### 경로 4 : "+ (String)request.getSession().getAttribute("WEB_UPLOAD_DIR"));
      System.out.println(" ### 경로 5 : "+ request.getAttribute("WEB_UPLOAD_DIR"));
      System.out.println(" ### 경로 6 : "+ (String)request.getAttribute("WEB_UPLOAD_DIR"));
    //Properties prop = new Properties();
      
      //System.out.println(" ### 경로 7 : "+ prop.getProperty("WEB_UPLOAD_DIR"));
      
      System.out.println(" ### 경로 8 : "+ pageContext.getAttribute("WEB_UPLOAD_DIR"));
      System.out.println(" ### 경로 9 : "+ (String)pageContext.getAttribute("WEB_UPLOAD_DIR"));
      System.out.println(" ### 경로 10 : "+ pageContext.getServletContext().getInitParameter("WEB_UPLOAD_DIR"));
      System.out.println(" ### 경로 11 : "+ (String)pageContext.getServletContext().getInitParameter("WEB_UPLOAD_DIR"));
      System.out.println(" ### 경로 12 : "+ pageContext.getServletContext().getAttribute("WEB_UPLOAD_DIR"));
      System.out.println(" ### 경로 13 : "+ (String)pageContext.getServletContext().getAttribute("WEB_UPLOAD_DIR"));
      
       System.out.println(" ### 경로 15 : "+ (String)propertiesService.getString("WEB_UPLOAD_DIR")); 

        String dftFilePath = request.getSession().getServletContext().getRealPath("/"); 
      //   String dftFilePath = (String)request.getSession().getServletContext().getAttribute("WEB_UPLOAD_DIR");
     //  String dftFilePath = <spring:eval expression="@environment.getProperty('application_builtBy')" />; 
	 //  String dftFilePath = <spring:eval expression="@environment.getProperty('application_builtBy')" />; 
        //파일 기본경로 _ 상세경로
        String filePath = dftFilePath + "se2" + File.separator + "multiupload" + File.separator;
        File file = new File(filePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        String realFileNm = "";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String today = formatter.format(new java.util.Date());
        realFileNm = today + UUID.randomUUID().toString() + filename.substring(filename.lastIndexOf("."));
        String rlFileNm = filePath + realFileNm;
        ///////////////// 서버에 파일쓰기 ///////////////// 
        InputStream is = request.getInputStream();
        OutputStream os = new FileOutputStream(rlFileNm);
        int numRead;
        byte b[] = new byte[Integer.parseInt(request.getHeader("file-size"))];
        while ((numRead = is.read(b, 0, b.length)) != -1) {
            os.write(b, 0, numRead);
        }
        if (is != null) {
            is.close();
        }
        os.flush();
        os.close();
        ///////////////// 서버에 파일쓰기 /////////////////
 
        // 정보 출력
        sFileInfo += "&bNewLine=true";    
        sFileInfo += "&sFileName=" + filename;    
        sFileInfo += "&sFileURL=/se2/multiupload/"+realFileNm;
        out.println(sFileInfo);
    }
%>