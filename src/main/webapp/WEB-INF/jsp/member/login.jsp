<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<jsp:include page="/WEB-INF/jsp/layout/header.jsp" />
          <!-- Product section -->
          <div class="bg-white t-pad60 b-pad60">
           	  
               <div class="container pad-container">
                  
                    <div class="col-sm-6" style="padding:20px; border:1px solid #e5e5e5;float:initial;margin:0 auto;">
                    
                        <h3 class="title-left">로그인</h3>
                            
                            <form enctype="multipart/form-data" method="post" name="loginform" >
                                  <div class="row t-mgr20">
                                       <div class="col-md-12">
                                            <label>아이디</label>
                                            <label style="float:right"><a href="/join">회원가입</a></label>
                                            <input type="text" name="userid" value="">
                                       </div>					
                                  </div>
                                  <div class="row t-mgr10">
                                       <div class="col-md-12">
                                            <label>비밀번호</label>  <label style="float:right;"><a id="findpass">비밀번호찾기</a></label>
                                            <input type="password" name="userpw" value="">
                                       </div>					
                                  </div>
                                  <div class="row t-mgr10">
                                                                
                                       <div class="col-md-6" style="display:none">
                                            <input type="checkbox" name="" > <label>Remember me</label>
                                       </div>
                                       <div class="col-md-6 center" style="margin-right:35px;">
                                            <input type="button" value="로그인" class="btn" id="loginBtn">
                                       </div>
                                                                    
                                </div>
                            </form>
                    </div>

</div>
          <!--/ product section -->


<jsp:include page="/WEB-INF/jsp/layout/footer.jsp" />


      <div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="loginModalLabel" aria-hidden="true" style="top:100px">
          <div class="modal-dialog modal-dialog-centered" role="document">
              <div class="modal-content">
                  <div class="modal-header">
                      <h5 class="modal-title" id="loginModalLabel">비밀번호 찾기</h5>
                      <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                          <span aria-hidden="true">&times;</span>
                      </button>
                  </div>
                  <form id="findform">
                      <div class="modal-body">
                          <div class="form-group">
                              <label for="namechk" class="col-form-label">아이디:</label>
                              <input type="text" name="name" class="form-control" id="namechk">
                              <label for="namechk" class="col-form-label">이름:</label>
                              <input type="text" name="name" class="form-control" id="namechk">
                              <label for="emailchk" class="col-form-label">이메일:</label>
                              <input type="text" name="email" class="form-control" id="emailchk">
                          </div>
                      </div>
                      <div class="modal-footer">
                          <button type="button" class="btn btn-secondary" data-dismiss="modal">취</button>
                          <button type="button" class="btn btn-primary" id="s">찾기</button>
                      </div>
                  </form>
              </div>
          </div>
      </div>

              <script type="text/javascript">
                  $(document).ready(function(e) {
                      $("#findpass").on("click",function(){  $('#loginModal').modal('show');});

                      var pass1="letmein";

                   //
                      $('#loginModal').on('hidden.bs.modal', function(e) {
                       //   window.location.href = '../index.html'
                      });

                      //handle the form's "submit" event
                      $("#loginForm").submit(function(event) {
                          event.preventDefault(); //stop a full postback

                          var password = $("#modalpass").val(); //get the entered value from the password box

                          if (password == pass1)
                              alert('Access Granted!');
                          else {
                              alert('Password is incorrect.');

                          }
                      });
                  });

                  $("#loginBtn").on("click",function(){
                      if ( document.loginform.userid.value == '' || document.loginform.userpw.value == '' ) {alert("아이디/비번을 입력해 주세요.");}else{
                          var frm = $("form[name='loginform']");
                          $.ajax({
                              type: "POST",
                              url: "/member/logon",
                              data: frm.serialize(),
                              dataType:'html',
                              success: function (jdata) {
                                  if (jdata == 'FALSE') {
                                      alert("승인되지 않은 아이디이거나, 잘못된 비밀번호입니다.");
                                      return false;
                                  } else {
                                      console.log(jdata);

                                      location.href= '/';

                                  }
                              },
                              error: function (data) {
                                  alert("승인되지 않은 아이디이거나, 잘못된 비밀번호입니다.");
                                  return false;
                              }
                          });
                      }

                  });
              </script>