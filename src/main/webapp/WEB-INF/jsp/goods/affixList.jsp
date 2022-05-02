<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<jsp:include page="/WEB-INF/jsp/layout/header.jsp" />
<div class="bg-white inner-banner features">
  <div class="container pad-container">
    <div class="row col-md-12">
      <h1>동영상 강의</h1>
      <h3>홍지문 간호학원 출신 간호사 동강 화이팅!</h3>
    </div>
  </div>
</div>
<div class="bg-white">

  <div class="container pad-container">

    <!-- projects filter -->
    <div class="filter">
      <a href="#" class="filter active" data-filter="*">전체</a>
      <a href="#" class="filter" data-filter=".branding">리얼 프셉</a>
      <a href="#" class="filter" data-filter=".design">면접</a>
      <a href="#" class="filter" data-filter=".photography">자기소개서</a>
      <a href="#" class="filter" data-filter=".branding">필기</a>
      <a href="#" class="filter" data-filter=".design">GSAT</a>
      <a href="#" class="filter" data-filter=".photography">국시</a>
      <a href="#" class="filter" data-filter=".photography">국시 강의패키지</a>
      <a href="#" class="filter" data-filter=".photography">취업 자격증</a>
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

      <!-- project item -->
      <li class="project-item mix photography">
        <a href="images/content/portfolio/full-project-1.jpg" class="fancybox" data-rel="portfolio" data-title-id="img-01">
          <div class="project-img">
            <img class="project-img" src="http://www.nurse-edu.co.kr/admin/data/lecimg/2108170001_M1.jpg" alt="project" />
          </div>
          <div class="project-intro bg-gray">
            <h3 class="project-title text-truncate">리얼프셉 실무 핵심 강의 공통편</h3>
            <div class="project-descr">480,000원 → 199,000원</div>
          </div>
        </a>
      </li>
      <!-- / project item -->

      <!-- project item -->
      <li class="project-item mix branding">
        <a href="portfolio-half.html">
          <div class="project-img">
            <img class="project-img" src="http://www.nurse-edu.co.kr/admin/data/lecimg/2203030001_R.jpg" alt="project" />
          </div>
          <div class="project-intro bg-gray">
            <h3 class="project-title text-truncate">채용 트렌드 분석 & 취업 성공 준비 전략</h3>
            <div class="project-descr">19,800원 → 9,900원	c</div>
          </div>
        </a>
      </li>
      <!-- / project item -->

      <!-- project item -->
      <li class="project-item mix design">
        <a href="http://www.nurse-edu.co.kr/admin/data/lecimg/2203070003_M1.jpg" class="fancybox" data-rel="portfolio" data-title-id="img-02">
          <div class="project-img">
            <img class="project-img" src="http://www.nurse-edu.co.kr/admin/data/lecimg/2105270001_R.png" alt="project" />
          </div>
          <div class="project-intro bg-gray">
            <h3 class="project-title text-truncate">채용 트렌드 분석 & 취업 성공 준비 전략</h3>
            <div class="project-descr">19,800원 → 9,900원	</div>
          </div>
        </a>
      </li>
      <!-- / project item -->

      <!-- project item -->
      <li class="project-item mix branding">
        <a href="portfolio-half.html">
          <div class="project-img">
            <img class="project-img" src="http://www.nurse-edu.co.kr/admin/data/lecimg/2107060001_R.png" alt="project" />
          </div>
          <div class="project-intro bg-gray">
            <h3 class="project-title">면접의 이해와 인성면접 [최신 개정]</h3>
            <div class="project-descr">50,000원 → 35,000원	</div>
          </div>
        </a>
      </li>
      <!-- / project item -->

      <!-- project item -->
      <li class="project-item mix photography">
        <a href="images/content/portfolio/full-project-1.jpg" class="fancybox" data-rel="portfolio" data-title-id="img-03">
          <div class="project-img">
            <img class="project-img" src="http://www.nurse-edu.co.kr/admin/data/lecimg/2105210001_M1.png" alt="project" />
          </div>
          <div class="project-intro bg-gray">
            <h3 class="project-title">Project Title</h3>
            <div class="project-descr">Project Desc</div>
          </div>
        </a>
      </li>
      <!-- / project item -->

      <!-- project item -->
      <li class="project-item mix design">
        <a href="portfolio-half.html">
          <div class="project-img">
            <img class="project-img" src="http://www.nurse-edu.co.kr/admin/data/lecimg/2001120001_M1.png" alt="project" />
          </div>
          <div class="project-intro bg-gray">
            <h3 class="project-title">Project Title</h3>
            <div class="project-descr">Project Desc</div>
          </div>
        </a>
      </li>
      <!-- / project item -->

      <!-- project item -->
      <li class="project-item mix photography">
        <a href="images/content/portfolio/full-project-1.jpg" class="fancybox" data-rel="portfolio" data-title-id="img-04">
          <div class="project-img">
            <img class="project-img" src="http://www.nurse-edu.co.kr/admin/data/lecimg/2111180009_R.jpg" alt="project" />
          </div>
          <div class="project-intro bg-gray">
            <h3 class="project-title">Project Title</h3>
            <div class="project-descr">Project Desc</div>
          </div>
        </a>
      </li>
      <!-- / project item -->

      <!-- project item -->
      <li class="project-item mix design">
        <a href="portfolio-half.html">
          <div class="project-img">
            <img class="project-img" src="http://www.nurse-edu.co.kr/admin/data/lecimg/1904240002_R.png" alt="project" />
          </div>
          <div class="project-intro bg-gray">
            <h3 class="project-title">Project Title</h3>
            <div class="project-descr">Project Desc</div>
          </div>
        </a>
      </li>
      <!-- / project item -->

      <!-- project item -->
      <li class="project-item mix photography">
        <a href="images/content/portfolio/full-project-1.jpg" class="fancybox" data-rel="portfolio" data-title-id="img-05">
          <div class="project-img">
            <img class="project-img" src="http://www.nurse-edu.co.kr/admin/data/lecimg/1904240002_R.png" alt="project" />
          </div>
          <div class="project-intro bg-gray">
            <h3 class="project-title">Project Title</h3>
            <div class="project-descr">Project Desc</div>
          </div>
        </a>
      </li>
      <!-- / project item -->

      <!-- project item -->
      <li class="project-item mix photography">
        <a href="portfolio-half.html">
          <div class="project-img">
            <img class="project-img" src="http://www.nurse-edu.co.kr/admin/data/lecimg/1706120001_R.png" alt="project" />
          </div>
          <div class="project-intro bg-gray">
            <h3 class="project-title">Project Title</h3>
            <div class="project-descr">Project Desc</div>
          </div>
        </a>
      </li>
      <!-- / project item -->

      <!-- project item -->
      <li class="project-item mix branding">
        <a href="images/content/portfolio/full-project-1.jpg" class="fancybox" data-rel="portfolio" data-title-id="img-06">
          <div class="project-img">
            <img class="project-img" src="http://www.nurse-edu.co.kr/admin/data/lecimg/2106190001_R.png" alt="project" />
          </div>
          <div class="project-intro bg-gray">
            <h3 class="project-title">Project Title</h3>
            <div class="project-descr">Project Desc</div>
          </div>
        </a>
      </li>
      <!-- / project item -->

      <!-- project item -->
      <li class="project-item mix design">
        <a href="portfolio-half.html">
          <div class="project-img">
            <img class="project-img img-fluid" src="http://www.nurse-edu.co.kr/admin/data/lecimg/2106190001_R.png" alt="project" />
          </div>
          <div class="project-intro bg-gray">
            <h3 class="project-title">Project Title</h3>
            <div class="project-descr">Project Desc</div>
          </div>
        </a>
      </li>
      <!-- / project item -->

    </ul>
    <!-- / projects grid -->
  </div>

</div>

<jsp:include page="/WEB-INF/jsp/layout/footer.jsp" />
