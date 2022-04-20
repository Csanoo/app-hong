<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<jsp:include page="/WEB-INF/jsp/layout/header.jsp" />
          <!-- Product section -->
          <div class="bg-white t-pad60 b-pad60">
           	  
               <div class="container pad-container">
                  
                    <div class="col-sm-6" style="padding:20px; border:1px solid #e5e5e5;float:none">
                    
                        <h3 class="title-left">로그인</h3>
                            
                            <form enctype="multipart/form-data" method="post" action="/logon" >
                                  <div class="row t-mgr20">
                                       <div class="col-md-12">
                                            <label>ID</label>
                                            <input type="text" name="userid" value="">
                                       </div>					
                                  </div>
                                  <div class="row t-mgr10">
                                       <div class="col-md-12">
                                            <label>Password</label>  <label style="float:right;"><a href="#">Forgot Password ?</a></label>
                                            <input type="password" name="password" value="">
                                       </div>					
                                  </div>
                                  <div class="row t-mgr10">
                                                                
                                       <div class="col-md-6">
                                            <input type="checkbox" name="" > <label>Remember me</label>
                                       </div>
                                       <div class="col-md-3 right" style="margin-right:35px;">
                                            <input type="submit" value="Login" class="btn">
                                       </div>
                                                                    
                                </div>
                            </form>
                    </div>

</div>
          <!--/ product section -->


<jsp:include page="/WEB-INF/jsp/layout/footer.jsp" />
