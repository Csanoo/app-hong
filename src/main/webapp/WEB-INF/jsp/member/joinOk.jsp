<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<jsp:include page="/WEB-INF/jsp/layout/header.jsp" />
<!-- Product section -->
<div class="bg-white t-pad60 b-pad60">

    <div class="container pad-container">

        <div class="col-sm-6" style="padding:20px; border:1px solid #e5e5e5;float:initial;margin:0 auto;">

            <h3 class="title-left">가입해주셔서 감사합니다.</h3>

            <div class="col-md-3 right" style="margin-right:35px;">
                        <input type="button" value="확인" class="btn" id="cfnBtn">
            </div>
        </div>

    </div>
    <!--/ product section -->

    <jsp:include page="/WEB-INF/jsp/layout/footer.jsp" />

<script type="text/javascript">
    $(function(){$("#cfnBtn").on("click",function(){location.href="/";});});
</script>