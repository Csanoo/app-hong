<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/jsp/layout/header.jsp" />


<div class="bg-white">
  <div class="col-md-12">
    <!-- Product section -->
    <div class="bg-white t-pad30">
      <div class="container pad-container">

        <div class="row">

          <div class="col-sm-6">

            <div class="owl-slider-wrapper">
              <div class="owl-portfolio-slider">
                <div class="item"> <img src="http://www.nurse-edu.co.kr/admin/data/prdimg/${pvo.prdimg_l1}" alt="" /> </div>
                <div class="item"> <img src="http://www.nurse-edu.co.kr/admin/data/prdimg/${pvo.prdimg_r}" alt="" /> </div>
              </div>
              <div class="owl-custom-nav"> <a class="slider-prev"></a> <a class="slider-next"></a> </div>
            </div>

          </div>

          <div class="col-sm-6 l-pad30 product-details t-mgr20">
            <h2> ${pvo.prdname}</h2>
            <c:if test="${pvo.info_value1 ne ''}">
            <div class="info">${pvo.info_name1} : ${pvo.info_value1}</div>
            </c:if>
            <c:if test="${pvo.info_value2 ne ''}">
              <div class="info">${pvo.info_name2} : ${pvo.info_value2}</div>
            </c:if>
            <c:if test="${pvo.info_value3 ne ''}">
              <div class="info">${pvo.info_name3} : ${pvo.info_value3}</div>
            </c:if>


            <div class="price">
              <span class="after"><fmt:formatNumber value="${pvo.sellprice}" />원</span>
              <c:if test="${pvo.sellprice ne pvo.conprice }">
              <span class="before"><fmt:formatNumber value="${pvo.conprice}" /></span>
              </c:if>
            </div>
            <form enctype="multipart/form-data" method="post" class="cart t-mgr30" id="frmCart">
              <input type="hidden" value="${pvo.prdcode}" name="prdcode" id="prdcode">
              <div class="quantity">
                <input type="button" class="minus" value="-">
                <input type="text" class="input-text qty text" title="Qty" value="1" name="quantity">
                <input type="button" class="plus" value="+">
              </div>
            </form>
            <div class="clearfix"></div>

            <a class="btn" id="onCart">구매하기 </a>
          </div>

        </div>

        <div class="sep60"></div>

        <div class="tabs tabs-top left tab-container" style="width:100%">

          <ul class="etabs">
            <li class="tab"><a href="#tab-1">상세설명</a></li>
            <li class="tab"><a href="#tab-2">후기</a></li>
          </ul>

          <div class="panel-container t-mgr10" style="border:1px solid #e5e5e5; padding:10px 20px; border-radius:2px;" >

            <div class="tab-block" id="tab-1">
              ${pvo.content}
            </div>


            <div class="tab-block" id="tab-2">
              <div class="container">


                  <table class="standard-table">
                    <tr><th>번호</th><th>제목</th><th>별점</th><th>작성자</th><th>작성</th></tr>
                    <c:if test="${fn:length(rvlist) == 0}">
                      <tr>
                        <td colspan="5">리뷰가 없습니다.</td>
                      </tr>
                    </c:if>

                    <c:forEach var="rlist" items="${rvlist}" varStatus="status">
                      <tr>
                        <td>${status.index + 1}</td>
                        <td>${rlist.subject}</td>
                        <td>${rlist.star}</td>
                        <td>${rlist.name}</td>
                        <td>${rlist.wdate}</td>
                      </tr>
                    </c:forEach>

                  </table>

              </div>
            </div>
          </div>

        </div>

        <div class="clearfix"></div>
        <div class="sep60"></div>

        <h3 class="title-left" style="display: none;">관련상품</h3>

        <div class="product-grid col4"  style="display:none">

          <!-- product -->
          <article class="post brd0">
            <figure>
              <span class="sale">Sale</span>
              <a href="product-single.html"><img src="images/content/products/product-3.jpg" alt="" /></a>                                    </figure>
            <section class="post-content">

              <h5><a href="product-single.html">T-Shirt</a></h5>
              <div class="price">
                <del><span>$99</span></del>
                <span>$49</span>
              </div>
              <a href="product-single.html" class="btn btn-gray-brd">ADD TO CART</a>
            </section>

          </article>
          <!-- / product -->

          <!-- product -->
          <article class="post brd0">
            <figure>
              <a href="product-single.html"><img src="images/content/products/product-5.jpg" alt="" /></a>                                    </figure>
            <section class="post-content">

              <h5><a href="product-single.html">T-Shirt</a></h5>
              <div class="price">
                <span>$149</span>
              </div>
              <a href="product-single.html" class="btn btn-gray-brd">ADD TO CART</a>
            </section>

          </article>
          <!-- / product -->

          <!-- product -->
          <article class="post brd0">
            <figure>
              <a href="product-single.html"><img src="images/content/products/product-7.jpg" alt="" /></a>                                    </figure>
            <section class="post-content">

              <h5><a href="product-single.html">T-Shirt</a></h5>
              <div class="price">
                <span>$185</span>
              </div>
              <a href="product-single.html" class="btn btn-gray-brd">ADD TO CART</a>
            </section>

          </article>
          <!-- / product -->

          <!-- product -->
          <article class="post brd0">
            <figure>
              <span class="sale">Sale</span>
              <a href="product-single.html"><img src="images/content/products/product-8.jpg" alt="" /></a>                                    </figure>
            <section class="post-content">

              <h5><a href="product-single.html">T-Shirt</a></h5>
              <div class="price">
                <del><span>$199</span></del>
                <span>$149</span>
              </div>
              <a href="product-single.html" class="btn btn-gray-brd">ADD TO CART</a>
            </section>

          </article>
          <!-- / product -->

        </div>

      </div>
    </div>
    <!--/ product section -->
  </div>

</div>

<jsp:include page="/WEB-INF/jsp/layout/footer.jsp" />
<script>

    $(function(){
        $("#onCart").on("click",function () {
          var $prdcode = $("#prdcode").val();
          console.log($prdcode);
          $.ajax({
            type : "POST",
            url : "/cart",
            dataType : "json",
            data : {'prdCode' : $prdcode, 'prdtype' : 'P'},
            error : function(request,status, error) {
              console.log("code:" + request.status + "\n" + "message:" + request.responseText + "\n" + "error:" + error);
            },
            success : function(data) {
              console.log(data);
              if (data == 1) {
               // cartHeaderView();
                toastr.options.preventDuplicates = true;
                toastr.success("장바구니 추가완료");
              } else if (data == 2) {
                toastr.options.preventDuplicates = true;
                toastr.warning("이미 추가 된 상품입니다");
              }

            }
          });
        });

        $(window).scroll(function() {
            if ($(this).scrollTop() > 500) {
                $('#topmove-btn').fadeIn();
            } else {
                $('#topmove-btn').fadeOut();
            }
        });

        $("#topmove-btn").click(function() {
            $('html, body').animate({
                scrollTop : 0
            }, 400);
            return false;
        });

    });
</script>

<span id="btnTop">
    <div id="topmove-btn"><img src="/assets/scroll-top_click_mo.svg"></div>
</span>