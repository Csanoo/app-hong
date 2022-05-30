<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/layout/header.jsp" />

<div class="bg-white">
  <div class="container pad-container">
    <!-- projects filter -->
    <div class="filter">
      <a href="#" class="filter active" data-filter="*">전체</a>
      <a href="#" class="filter" data-filter=".121000">자소서 첨삭</a>
      <a href="#" class="filter" data-filter=".121110">자소서 1분 첨삭</a>
      <a href="#" class="filter" data-filter=".121100">면접 컨설팅</a>
    </div>
    <!-- /projects filter -->
    <div style="float:right">
      <select name="orderby" onchange="this.form.submit();">
        <option value="">강의정렬방식</option>
        <option value="viewcnt desc">조회수 순</option>
        <option value="leccode desc">최근등록순 순</option>
        <option value="sellprice asc">최저가격 순</option>
        <option value="sellprice desc">최고가격 순</option>
      </select>
    </div>
    <!-- projects grid -->
    <ul class="projects-grid project-grid-gut hover-white" id="project-grid">


      <c:forEach var="list" items="${courseList}">

        <li class="project-item mix ${list.catcode}">
          <a href="/goods/detailp?leccode=${list.prdcode}" class="fancybox" data-rel="portfolio" data-title-id="img-01">
            <div class="project-img">
              <img class="project-img" src="http://www.nurse-edu.co.kr/admin/data/prdimg/${list.prdimg_R}" alt="project" />
            </div>
            <div class="project-intro bg-gray">
              <h3 class="project-title text-truncate"> ${list.prdname}</h3>
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
