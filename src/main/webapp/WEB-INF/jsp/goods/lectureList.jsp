<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/layout/header.jsp" />
<script>
  $('.selectpicker').selectpicker();
</script>

<div class="bg-white">
  <div class="container pad-container">
    <!-- projects filter -->
    <div class="filter">
      <a href="#" class="filter active" data-filter="*">전체</a>
      <a href="#" class="filter" data-filter=".170000">리얼 프셉</a>
      <a href="#" class="filter" data-filter=".140000">면접</a>
      <a href="#" class="filter" data-filter=".110000">자기소개서</a>
      <a href="#" class="filter" data-filter=".120000">필기</a>
      <a href="#" class="filter" data-filter=".130000">GSAT</a>
      <a href="#" class="filter" data-filter=".150000">국시</a>
      <a href="#" class="filter" data-filter=".100000">취업 자격증</a>
    </div>
    <!-- /projects filter -->
    <div class="container" style="width:200px;margin:0 0 0 auto">
      <form method="POST">
        <select name="orderby" onchange="this.form.submit();">
          <option value="">강의정렬방식</option>
          <option value="viewcnt desc" <c:if test="${searchVO.oderby eq 'viewcnt desc'}">selected</c:if> >조회수 순</option>
          <option value="leccode desc" <c:if test="${searchVO.oderby eq 'leccode desc'}">selected</c:if>>최근등록순 순</option>
          <option value="sellprice asc" <c:if test="${searchVO.oderby eq 'sellprice asc'}">selected</c:if>>최저가격 순</option>
          <option value="sellprice desc" <c:if test="${searchVO.oderby eq 'sellprice desc'}">selected</c:if>>최고가격 순</option>
        </select>
      </form>
    </div>
    <!-- projects grid -->
    <ul class="projects-grid project-grid-gut hover-white" id="project-grid">

      <c:forEach var="list" items="${courseList}">

        <li class="project-item mix ${list.catcode}">
          <a href="/goods/detail?leccode=${list.leccode}" class="fancybox" data-rel="portfolio" data-title-id="img-01">
            <div class="project-img">
              <img class="project-img" src="http://www.nurse-edu.co.kr/admin/data/lecimg/${list.lecimg_R}" alt="project" />
            </div>
            <div class="project-intro bg-gray">
              <h3 class="project-title text-truncate"> ${list.lecname}</h3>
              <div class="project-descr"><fmt:formatNumber value="${list.sellprice}"/>원</div>
            </div>
          </a>
        </li>

      </c:forEach>
    </ul>
    <!-- / projects grid -->
  </div>

</div>

<jsp:include page="/WEB-INF/jsp/layout/footer.jsp" />
