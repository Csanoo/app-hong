<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<jsp:include page="/WEB-INF/jsp/layout/header.jsp" />
<script>
  $('.selectpicker').selectpicker();
</script>
<div class="bg-white inner-banner features">
  <div class="container pad-container">
    <div class="row col-md-12">
      <h1>동영상 강의</h1>
      <h3>홍지문 간호학원 출신 간호사 동강 화이팅!</h3>
    </div>
  </div>
</div>
<div class="bg-white">
  <div class="col-md-12">
    <!-- Product section -->
    <div class="bg-white t-pad30">
      <div class="container pad-container">

        <div class="row">

          <div class="col-sm-6">

            <div class="owl-slider-wrapper">
              <div class="owl-portfolio-slider">
                <div class="item"> <img src="images/content/products/product-slide-1.jpg" alt="" /> </div>
                <div class="item"> <img src="images/content/products/product-slide-2.jpg" alt="" /> </div>
              </div>
              <div class="owl-custom-nav"> <a class="slider-prev"></a> <a class="slider-next"></a> </div>
            </div>

          </div>

          <div class="col-sm-6 l-pad30 product-details">

            <h1> T-Shirt Casual Wear<span><a href="#">3 reviews</a></span></h1>
            <div class="rating">
              <i class="icon-star-1"></i>
              <i class="icon-star-1"></i>
              <i class="icon-star-1"></i>
              <i class="icon-star-1"></i>
              <i class="icon-star-empty-1"></i>
            </div>
            <div class="price">$49</div>
            <p> Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. </p>
            <p>Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Morbi in semper mauris. Nulla convallis pharetra felis, a ultrices massa tristique in. Phasellus purus sem, porttitor eget luctus sed, congue et purus. Integer sagittis augue a consequat ultrices.</p>
            <form enctype="multipart/form-data" method="post" class="cart t-mgr30">
              <div class="quantity">
                <input type="button" class="minus" value="-">
                <input type="text" class="input-text qty text" title="Qty" value="1" name="quantity">
                <input type="button" class="plus" value="+">
              </div>
            </form>
            <div class="clearfix"></div>

            <a href="#" class="btn">Add to cart </a>

          </div>

        </div>

        <div class="sep60"></div>

        <div class="tabs tabs-top left tab-container">

          <ul class="etabs">
            <li class="tab"><a href="#tab-1">Product Description</a></li>
            <li class="tab"><a href="#tab-2">Additional Information</a></li>
            <li class="tab"><a href="#tab-3">Reviews (3)</a></li>
          </ul>

          <div class="panel-container t-mgr10" style="border:1px solid #e5e5e5; padding:10px 20px; border-radius:2px;" >

            <div class="tab-block" id="tab-1">
              <p>Duis sit amet fermentum magna. Ut eget sem eget nunc blandit fermentum a non lectus. Phasellus cursus sapien at arcu feugiat, non commodo erat facilisis. Curabitur ac enim lobortis, tempor nisl sed, convallis dolor. </p>
              <p> Maecenas quis aliquet ipsum. Donec vel tempor arcu, eu faucibus sapien. Praesent velit lacus, vulputate eget placerat quis, hendrerit nec leo.</p>
              <p>Etiam convallis, felis quis dapibus dictum, libero mauris luctus nunc, non fringilla purus ligula non justo. Nullam elementum consequat lacus, sit amet pulvinar urna hendrerit sit amet. Sed aliquam eu ante a ultricies. Interdum et malesuada fames ac ante ipsum primis in faucibus. Fusce elementum felis lorem, eget scelerisque enim blandit quis. Praesent luctus pulvinar sollicitudin. Interdum et malesuada fames ac ante ipsum primis in faucibus. </p>

            </div>

            <div class="tab-block" id="tab-2">
              <div class="container">
                <table class="standard-table" style="width:100%;">
                  <tr>
                    <th>Product</th>
                    <th>Description</th>
                  </tr>
                  <tr>
                    <td>Size</td>
                    <td>Large</td>

                  </tr>
                  <tr>
                    <td>Color</td>
                    <td>Red</td>
                  </tr>
                  <tr>
                    <td>Material</td>
                    <td>Jersey</td>
                  </tr>
                </table>
              </div>
            </div>

            <div class="tab-block" id="tab-3">
              <div class="container">
                <section class="comments-sec">
                  <ol class="commentlist">

                    <li>
                      <div class="avatar"><img src="images/content/happy-clients-01.jpg" alt="" /> </div>
                      <div class="comment-des">
                        <h4 class="fw600">Jessica lyon</h4>
                        <p class="date">Jan 1st, 2015 03:15 PM - <a href="#">Reply</a></p>
                        <p>In lacinia aliquet est et luctus. Sed et hendrerit tortor. Ut id aliquam arcu. Nam a mauris porta, pharetra justo sit amet, vestibulum justo.</p>
                      </div>
                      <div class="clearfix"></div>
                      <ol class="childlist">
                        <li>
                          <div class="avatar"><img src="images/content/happy-clients-02.jpg" alt="" /> </div>
                          <div class="comment-des">
                            <h4  class="fw600">Tom Richard</h4>
                            <p class="date">Jan 1st, 2015 03:15 PM - <a href="#">Reply</a></p>
                            <p>In lacinia aliquet est et luctus. Sed et hendrerit tortor. Ut id aliquam arcu. Nam a mauris porta, pharetra justo sit amet, vestibulum justo.</p>
                          </div>
                          <div class="clearfix"></div>
                        </li>
                      </ol>
                    </li>

                    <li>
                      <div class="avatar"><img src="images/content/happy-clients-01.jpg" alt="" /> </div>
                      <div class="comment-des">
                        <h4 class="fw600">Jessica lyon</h4>
                        <p class="date">Jan 1st, 2015 03:15 PM - <a href="#">Reply</a></p>
                        <p>In lacinia aliquet est et luctus. Sed et hendrerit tortor. Ut id aliquam arcu. Nam a mauris porta, pharetra justo sit amet, vestibulum justo.</p>
                      </div>
                      <div class="clearfix"></div>
                    </li>

                    <li>
                      <div class="avatar"><img src="images/content/happy-clients-03.jpg" alt="" /> </div>
                      <div class="comment-des">
                        <h4 class="fw600">Peter Johns</h4>
                        <p class="date">Jan 1st, 2015 03:15 PM - <a href="#">Reply</a></p>
                        <p>In lacinia aliquet est et luctus. Sed et hendrerit tortor. Ut id aliquam arcu. Nam a mauris porta, pharetra justo sit amet, vestibulum justo.</p>
                      </div>
                    </li>

                  </ol>
                </section>
              </div>
            </div>

          </div>

        </div>

        <div class="clearfix"></div>
        <div class="sep60"></div>

        <h3 class="title-left">Related Products</h3>

        <div class="product-grid col4">

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
