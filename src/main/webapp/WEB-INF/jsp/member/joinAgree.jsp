<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<jsp:include page="/WEB-INF/jsp/layout/header.jsp" />
<div class="bg-white">

  <div class="container pad-container">

    <div class="row">

      <div class="col-sm-8 content">
        <p style="font-size:18px;" class="fw600">회원이세요? <a href="/login">로그인 해주세요</a>.</p>
        <br>
        <div class="panel-group" id="accordion">
          <div class="panel panel-default">

            <div class="panel-heading">
              <h4 class="panel-title"> <a data-toggle="collapse" class="panel-toggle active" data-parent="#accordion" href="#collapseOne"> <strong style="font-size:16px;">Billing Address</strong></a> </h4>
            </div>
            <div id="collapseOne" class="panel-collapse collapse in">
              <div class="panel-body">

                <form enctype="multipart/form-data" method="post" >
                  <div class="row">
                    <div class="col-md-12">
                      <label>ID</label>
                      <input type="text" name="id" value="" id="userId">
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-6">
                      <label>비밀번호</label>
                      <input type="text" name="passwd" value="">
                    </div>
                    <div class="col-md-6">
                      <label>비밀번호 확인</label>
                      <input type="text" name="passwd_cf" value="">
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-12">
                      <label>이름</label>
                      <input type="text" name="name" value="">
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-12">
                      <label>닉네임</label>
                      <input type="text" name="nick" value="">
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-12">
                      <label>휴대전화</label>
                      <input type="tel" class="form-control" name="hp" value="" placeholder="010-0000-0000">
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-3 right">
                      <input type="submit" value="Continue" class="btn">
                    </div>
                  </div>
                </form>

              </div>

            </div>
          </div>

          <div class="panel panel-default">
            <div class="panel-heading">
              <h4 class="panel-title"> <a data-toggle="collapse" class="panel-toggle" data-parent="#accordion" href="#collapseTwo"><strong style="font-size:16px;">Shipping Address</strong></a> </h4>
            </div>
            <div id="collapseTwo" class="panel-collapse collapse">
              <div class="panel-body">

                <form enctype="multipart/form-data" method="post" >
                  <div class="row t-mgr10">
                    <div class="col-md-12">
                      <input type="checkbox" checked name="" > <label>Ship to billing address?</label>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-12">
                      <label>Country</label>
                      <select name="country">
                        <option value="">Select a country</option>
                      </select>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-6">
                      <label>First Name</label>
                      <input type="text" name="fname" value="">
                    </div>
                    <div class="col-md-6">
                      <label>Last Name</label>
                      <input type="text" name="lname" value="">
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-12">
                      <label>Company Name</label>
                      <input type="text" name="company" value="">
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-12">
                      <label>Address</label>
                      <input type="text" name="address" value="">
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-12">
                      <label>City</label>
                      <input type="text" name="city" value="">
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-3 right">
                      <input type="submit" value="Continue" class="btn">
                    </div>
                  </div>
                </form>

              </div>

            </div>
          </div>

          <div class="panel panel-default">
            <div class="panel-heading">
              <h4 class="panel-title"> <a data-toggle="collapse" class="panel-toggle" data-parent="#accordion" href="#collapseThree"><strong style="font-size:16px;">Review & Payment</strong></a> </h4>
            </div>
            <div id="collapseThree" class="panel-collapse collapse">

              <div class="panel-body">

                <table class="cart">
                  <tr>
                    <th style="width:4%;">&nbsp;</th>
                    <th style="width:60%;">Product</th>
                    <th style="width:12%;">Price</th>
                    <th style="width:12%;">Quantity</th>
                    <th style="width:12%;">Total</th>
                  </tr>
                  <tr>
                    <td><button type="button" class="close" data-dismiss="alert">&times;</button></td>
                    <td><a href="product-single.html"><img src="images/content/products/product-1.jpg" class="img-thumb" alt=""/> &nbsp;&nbsp; Short Slevees T-Shirts</a></td>
                    <td>$49.99</td>
                    <td>1</td>
                    <td>$49.99</td>
                  </tr>
                  <tr>
                    <td><button type="button" class="close" data-dismiss="alert">&times;</button></td>
                    <td><a href="product-single.html"><img src="images/content/products/product-2.jpg" class="img-thumb" alt=""/> &nbsp;&nbsp; Short Slevees T-Shirts</a></td>
                    <td>$49.99</td>
                    <td>1</td>
                    <td>$49.99</td>
                  </tr>
                  <tr>
                    <td><button type="button" class="close" data-dismiss="alert">&times;</button></td>
                    <td><a href="product-single.html"><img src="images/content/products/product-3.jpg" class="img-thumb" alt=""/> &nbsp;&nbsp; Short Slevees T-Shirts</a></td>
                    <td>$49.99</td>
                    <td>1</td>
                    <td>$49.99</td>
                  </tr>
                  <tr>
                    <td><button type="button" class="close" data-dismiss="alert">&times;</button></td>
                    <td><a href="product-single.html"><img src="images/content/products/product-4.jpg" class="img-thumb" alt=""/> &nbsp;&nbsp; Short Slevees T-Shirts</a></td>
                    <td>$49.99</td>
                    <td>1</td>
                    <td>$49.99</td>
                  </tr>
                </table>

                <div class="sep40"></div>

                <div class="cart-total"  style="width:100%;">

                  <h3 class="title-left">Cart Totals</h3>

                  <div class="row t-mgr20">
                    <div class="col-md-6"><h4>Cart Subtotal</h4></div>
                    <div class="col-md-6"><h4><span>$49.99</span></h4> </div>
                  </div>

                  <div class="row t-mgr20">
                    <div class="col-md-6"><h4>Shipping</h4></div>
                    <div class="col-md-6"><h4><span>Free Shipping</span></h4> </div>
                  </div>

                  <div class="row t-mgr20 last">
                    <div class="col-md-6"><h4>Order Total</h4></div>
                    <div class="col-md-6"><h4><span style="font-size:40px;">$49.99</span></h4> </div>
                  </div>
                </div>

                <div class="sep40"></div>

                <div class="cart-total" style="width:100%;">

                  <h3 class="title-left">Payment</h3>

                  <div class="row last">
                    <div class="col-md-12">
                      <input type="checkbox" checked name="" > <label>Direct Bank Transfer</label><br>
                      <input type="checkbox"  name="" > <label>Cheque Payment</label><br>
                      <input type="checkbox"  name="" > <label>Paypal</label>
                    </div>
                  </div>

                </div>

              </div>

            </div>

          </div>

        </div>

      </div>

  </div>
</div>

<jsp:include page="/WEB-INF/jsp/layout/footer.jsp" />
