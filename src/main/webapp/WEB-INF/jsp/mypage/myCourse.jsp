<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/layout/header.jsp" />
        <div class="bg-white inner-banner features">
            <div class="container pad-container">
                <div class="row col-md-12">
                    <h1>마이페이지</h1>
                    <h3 id="myTitle"></h3>
                </div>
            </div>
        </div>
          <!-- leftside bar -->
          <div class="bg-white">

              <div class="container pad-container">

      			   <div class="row t-mgr30 b-mgr30">

                       <jsp:include page="/WEB-INF/jsp/layout/lmypage.jsp" />

                        <div class="col-sm-12 content">
                            <h3 class="title-left b-mgr30">강의구매목록</h3>
                            <!-- Tables -->
                            <div class="row t-mgr40 b-mgr40">
                                <table class="standard-table">
                                    <tr>
                                        <th>주문번호</th>
                                        <th>주문일자</th>
                                        <th>수강기간</th>
                                        <th>강의명</th>
                                        <th>결제금액</th>
                                        <th>주문상태</th>
                                        <th>강의보기</th>
                                    </tr>
                                    <c:forEach var="list" items="${courseList}" varStatus="status">
                                        <tr>
                                            <td>${list.attcode}</td>
                                            <td><fmt:parseDate value="${list.order_date}" var="dateValue" pattern="yyyy-MM-dd"/>
                                                <fmt:formatDate value="${dateValue}" pattern="yyyy-MM-dd"/>
                                            </td>
                                            <td>${list.sdate}~${list.edate}</td>
                                            <td>${list.lecname}</td>
                                            <td>${list.total_price}</td>
                                            <td>${list.status}</td>
                                            <td><a href="/lecture/leclist.php?ptype=view&leccode=${list.leccode}&attcode=${list.attcode}#leclist" target="_blank" class="btn-blue">보기
                                                </a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    <c:if test="${empty courseList}">
                                        <tr>
                                            <td colspan="7">구매내역이 없습니다.</td>
                                        </tr>
                                    </c:if>
                                </table>
                            </div>

                        </div>
     			 </div>

   			 </div>

          </div>


<jsp:include page="/WEB-INF/jsp/layout/footer.jsp" />

<script>
$(function(){
    $("#myTitle").text("강의구매목록");
    $("#myCourse").addClass("active");
});
</script>