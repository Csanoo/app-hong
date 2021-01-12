<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html class=" ">
    <head>

        <meta http-equiv="content-type" content="text/html;charset=UTF-8" />
        <meta charset="utf-8" />
        <title>Crawler Admin</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
        <meta content="" name="description" />
        <meta content="" name="author" />

        <link rel="shortcut icon" href="/admin/design/assets/images/favicon.png" type="image/x-icon" />    <!-- Favicon -->
        <link rel="apple-touch-icon-precomposed" href="/admin/design/assets/images/apple-touch-icon-57-precomposed.png">	<!-- For iPhone -->
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="/admin/design/assets/images/apple-touch-icon-114-precomposed.png">    <!-- For iPhone 4 Retina display -->
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="/admin/design/assets/images/apple-touch-icon-72-precomposed.png">    <!-- For iPad -->
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="/admin/design/assets/images/apple-touch-icon-144-precomposed.png">    <!-- For iPad Retina display -->




        <!-- CORE CSS FRAMEWORK - START -->
        <link href="/admin/design/assets/plugins/pace/pace-theme-flash.css" rel="stylesheet" type="text/css" media="screen"/>
        <link href="/admin/design/assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="/admin/design/assets/plugins/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="/admin/design/assets/fonts/font-awesome/css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <link href="/admin/design/assets/css/animate.min.css" rel="stylesheet" type="text/css"/>
        <link href="/admin/design/assets/plugins/perfect-scrollbar/perfect-scrollbar.css" rel="stylesheet" type="text/css"/>
        <!-- CORE CSS FRAMEWORK - END -->

        <!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - START --> 
        <link href="/admin/design/assets/plugins/icheck/skins/square/orange.css" rel="stylesheet" type="text/css" media="screen"/>        <!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - END --> 


        <!-- CORE CSS TEMPLATE - START -->
        <link href="/admin/design/assets/css/style.css" rel="stylesheet" type="text/css"/>
        <link href="/admin/design/assets/css/responsive.css" rel="stylesheet" type="text/css"/>
        <!-- CORE CSS TEMPLATE - END -->

    </head>
    <!-- END HEAD -->

    <!-- BEGIN BODY -->
    <body class=" login_page">


        <div class="login-wrapper" >
            <div id="login" 
			class="login loginpage col-lg-offset-4 col-lg-4 col-md-offset-3 col-md-6 col-sm-offset-3 col-sm-6 col-xs-offset-2 col-xs-8"
			style="opacity: 1.0!important;filter:alpha(opacity=70);"
			>
                

                <form name="loginform" id="loginform" action="login" method="post">
                    <p>
                        <label for="user_login">관리자 아이디<br />
                            <input type="text" name="userid" id="user_login" class="input" value="" size="20" /></label>
                    </p>
                    <p>
                        <label for="user_pass">관리자 비번<br />
                            <input type="password" name="userpw" id="user_pass" class="input" value="" size="20" /></label>
                    </p>

                </form>


                    <p class="submit">
                        <button name="wp-submit" id="wp-submit" class="btn btn-orange btn-block" onClick="login()"
						style="background-color:#999;color:#fff">로그인
                        </button>
                    </p>
					
					
					
					

                
                
                <script>
                function login(){
                	if ( document.loginform.userid.value == '' || document.loginform.userpw.value == '' ) {alert("아이디/비번을 입력해 주세요.");}else{
                	    var frm = $("form[name='loginform']");
                        $.ajax({
                            type: "POST",
                            url: "/admin/login",
                            data: frm.serialize(),
                            dataType:'html',
                            success: function (jdata) {
                                if (jdata == 'FALSE') {
                                    alert("승인되지 않은 아이디이거나, 잘못된 비밀번호입니다.");
                                    return false;
                                } else {
                                    location.href= '/admin/project';
                                }
                            },
                            error: function (data) {
                               // alert('오류');
                                //return false;
                                location.href = "/admin/project";
                            }
                        });
                	}
                	
                }
                
                </script>

                


            </div>
        </div>





        <!-- LOAD FILES AT PAGE END FOR FASTER LOADING -->


        <!-- CORE JS FRAMEWORK - START --> 
        <script src="/admin/design/assets/js/jquery-1.11.2.min.js" type="text/javascript"></script> 
        <script src="/admin/design/assets/js/jquery.easing.min.js" type="text/javascript"></script> 
        <script src="/admin/design/assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script> 
        <script src="/admin/design/assets/plugins/pace/pace.min.js" type="text/javascript"></script>  
        <script src="/admin/design/assets/plugins/perfect-scrollbar/perfect-scrollbar.min.js" type="text/javascript"></script> 
        <script src="/admin/design/assets/plugins/viewport/viewportchecker.js" type="text/javascript"></script>  
        <!-- CORE JS FRAMEWORK - END --> 


        <!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - START --> 
        <script src="/admin/design/assets/plugins/icheck/icheck.min.js" type="text/javascript"></script><!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - END --> 


        <!-- CORE TEMPLATE JS - START --> 
        <script src="/admin/design/assets/js/scripts.js" type="text/javascript"></script> 
        <!-- END CORE TEMPLATE JS - END --> 

        <!-- Sidebar Graph - START --> 
        <script src="/admin/design/assets/plugins/sparkline-chart/jquery.sparkline.min.js" type="text/javascript"></script>
        <script src="/admin/design/assets/js/chart-sparkline.js" type="text/javascript"></script>
        <!-- Sidebar Graph - END --> 


        <!-- General section box modal start -->
        <div class="modal" id="section-settings" tabindex="-1" role="dialog" aria-labelledby="ultraModal-Label" aria-hidden="true">
            <div class="modal-dialog animated bounceInDown">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">Section Settings</h4>
                    </div>
                    <div class="modal-body">

                        Body goes here...

                    </div>
                    <div class="modal-footer">
                        <button data-dismiss="modal" class="btn btn-default" type="button">Close</button>
                        <button class="btn btn-success" type="button">Save changes</button>
                    </div>
                </div>
            </div>
        </div>
        <!-- modal end -->
    </body>
</html>

