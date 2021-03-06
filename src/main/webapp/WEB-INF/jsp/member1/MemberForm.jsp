<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<jsp:include page="/WEB-INF/jsp/common/LeftMenu2.jsp" />

            <section id="main-content" class=" ">
                <section class="wrapper" style='margin-top:60px;display:inline-block;width:100%;padding:15px 0 0 15px;'>

                    <div class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>
                        <div class="page-title">

                            <div class="pull-left">
                                <h1 class="title">관리자 계정 관리</h1>
                            </div>


                        </div>
                    </div>
                    <div class="clearfix"></div>

		<div class="col-lg-12">
			<section class="box ">
				<header class="panel_header">
					<h2 class="title pull-left">관리자 계정 수정</h2>
					<div class="actions panel_actions pull-right">
						<i class="box_toggle fa fa-chevron-down"></i> <i
							class="box_setting fa fa-cog" data-toggle="modal"
							href="#section-settings"></i> <i class="box_close fa fa-times"></i>
					</div>
				</header>
				<div class="content-body">
							<form name="form1" action="memberSave" method="post" enctype="multipart/form-data">
								<input name="userid" type="hidden" value="${mvo.userid}">
								<div class="row">
									<div class="col-md-12 col-sm-12 col-xs-12">
									<table id="customers">
										<tr>
											<td class="tdl" style="width: 15%">아이디</td>
											<td style="width: 35%" colspan="3">${mvo.userid}</td>
										</tr>
										<tr>
											<td class="tdl" style="width: 15%">이름</td>
											<td style="width: 35%"><input name="username" type="text"	value="${mvo.username}"	class="form-control" style="width: 200px"></td>
											<td class="tdl" style="width: 15%">사용여부</td>
											<td style="width: 35%">
												<input type="radio" name="state" value="Y" <c:if test="${mvo.state eq 'Y'}">checked</c:if> ><label>사용</label>
												<input type="radio" name="state" value="N" <c:if test="${mvo.state eq 'N'}">checked</c:if> ><label>사용안함</label>
											</td>
										</tr>
										<tr>
											<td class="tdl" style="width: 15%">비밀번호</td>
											<td style="width: 35%" >
												<input type="checkbox" name="passCk" id="passCk" value="Y" />비밀번호 변경
												<input name="userpw" type="password" value="${mvo.userpw}"	class="form-control" style="width: 200px" disabled>
											</td>
											<td class="tdl" style="width: 15%">비밀번호중복확인</td>
											<td style="width: 35%" >
												<input name="userpw1" type="password"   value=""   class="form-control" style="width: 200px" disabled>
											</td>
										</tr>
										<tr>
											<td class="tdl" style="width: 15%">회원타입</td>
											<td style="width: 35%" >
												<select name="usertype" class="form-control" style="width: 100px" id="usertype">
													<c:forEach var="listsel" items="${listsel}"   varStatus="status">
														<option value='${listsel.code2}' <c:if test="${mvo.usertype eq listsel.code2}">selected</c:if>>${listsel.title}</option>
													</c:forEach>
												</select>

											</td>
											<td class="tdl" style="width: 15%">Email</td>
											<td style="width: 35%" >
												<input name="email" type="text"	value="${mvo.email}" class="form-control" style="width: 250px">
											</td>
										</tr>
										<tr id="auth-menu" style="display:none;">
											<td class="tdl" style="width: 15%;">메뉴 권한 설정</td>
											<td colspan="3">
												<div class="form-group">
													<ul class="menu-chk">
														<li style="list-style: none"><input type="checkbox" name="menu01" id="menu01" class="chkMenu" <c:if test="${mvo.menu01 eq 'Y'}">checked</c:if> value="Y"><label for="menu01">컨텐츠 관리</label></li>
														<li style="list-style: none"><input type="checkbox" name="menu02" id="menu02" class="chkMenu" <c:if test="${mvo.menu02 eq 'Y'}">checked</c:if> value="Y"><label for="menu02">운영 관리</label></li>
														<li style="list-style: none"><input type="checkbox" name="menu03" id="menu03" class="chkMenu" <c:if test="${mvo.menu03 eq 'Y'}">checked</c:if> value="Y"><label for="menu03">크롤링 관리</label></li>
														<li style="list-style: none"><input type="checkbox" name="menu04" id="menu04" class="chkMenu" <c:if test="${mvo.menu04 eq 'Y'}">checked</c:if> value="Y"><label for="menu04">프로젝트 관리</label></li>
													</ul>
												</div>
											</td>
										</tr>
										</table>
									</div>
								</div>


<c:if test="${mvo.imgfile ne ''}">
<div><img src="/images/${mvo.imgfile}"></div>
</c:if>


								<div class="form-group" style="margin-top:20px">

									<button type="button" class="btn btn-gray"
										onclick="fn_formRtn()">목록</button>
									<button type="button" class="btn btn-orange"s
										onclick="fn_formSv()">저장</button>
								</div>
							</form>
					<header class="panel_header">
						<h2 class="title pull-left">관리 프로젝트 </h2>
					</header>
						<div class="content-body">
						<div class="row">
							<div class="col-md-12 col-sm-12 col-xs-12">
								<table class="table" id="dTable">
									<thead>

									<tr>
										<th>No</th>
										<th>사용여부</th>
										<th>로고</th>
										<th>프로젝트명</th>
										<th>URL</th>
										<th>콘텐츠</th>
										<th>등록일</th>
										<th>관리권한</th>
									</tr>
									</thead>
									<tbody>
									<c:forEach var="plist" items="${plist}" varStatus="status">
										<tr>
											<td>${status.index}</td>
											<td><c:if test="${plist.state} =='Y'">사용</c:if><c:if test="${plist.state} =='N'">점검</c:if></td>
											<td>${plist.title}</td>
											<td><img src="/upload/images/${plist.logoimg}" width="110"></td>
											<td><a href="/admin/projectDetail?sn=${plist.sn}">/admin/projectDetail?sn=${plist.sn}</a></td>
											<td style="width:60px">${plist.ct}</td>
											<td>${plist.regDate}</td>
											<td><button type="button" class="btn btn-orange" onclick="mDel(${plist.sn})">제외</button></td>
										</tr>
									</c:forEach>
									<c:if test="${status.end <= 0}">
										<tr>
											<td colspan="8">검색결과가 없습니다.</td>
										</tr>
									</c:if>
									</tbody>
								</table>

							</div>

							<div class="col-md-12 col-sm-12 col-xs-12" style='border-top: 2px solid #d8d8d8; padding-top: 20px;'>
								<jsp:include page="/WEB-INF/jsp/common/Paging.jsp" />
							</div>
						</div>
					</div>
							<script>
						function fn_formSv() {
                            var f =document.form1;
                            if($("#passCk").prop("checked")==true){
                                if (f.userpw.value == ""){
                                    alert("비밀번호를 입력해주세요.");
                                    return false;
								}
								if ( f.userpw.value != f.userpw1.value ) {
									alert("비밀번호를 확인해주세요.");
									return false;
								}
                            }

                            var flag;

                            $("input[class='chkMenu']").each( function () {
                                if (this.checked) {
                                    flag = !flag;
                                    return false;
                                }
                            });

                            if (!flag) {
                                alert("메뉴를 하나 이상 체크해주세요.");
                                return false;
                            }

                            if (!validateEmail(f.email.value)){
                                alert('이메일 형식을 확인해 주세요.');
                                f.email.focus();
                                return false;
                            }

                            document.form1.submit();

						}
						function fn_formRtn() {
							document.formList.submit();

						}
                        function mDel(sn){
                            $.ajax({
                                type: "POST",
                                url: "/admin/delMember",
                                data: {"userid":'${mvo.userid}',"sn":sn},
                                success: function (data) {
                                    alert("정상 처리되었습니다.");
                                    location.href = "/admin/member1Read?userid=${mvo.userid}";
                                },
                                error: function (data) {
                                    alert("오류 관리자에게 문의해주세요");
                                }
                            });
                        }
                        function validateEmail(email) {
                            var re = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
                            return re.test(email);
                        }
					</script>

						</div>
					</div>
				</div>
			</section>
		</div>


<form name="formList" action="memberList" method="post">
		<input type="hidden" name="searchType"
			value="<c:out value="${searchVO.searchType}"/>"> <input
			type="hidden" name="searchKeyword"
			value="<c:out value="${searchVO.searchKeyword}"/>"> <input
			type="hidden" name="orderKeyword"
			value="<c:out value="${fn:trim(searchVO.orderKeyword)}"/>"> <input
			type="hidden" name="page" value="<c:out value="${pageVO.page}"/>">
	</form>


	</section>
            </section>
            <!-- END CONTENT -->
            
            
            <jsp:include page="/WEB-INF/jsp/common/Footer2.jsp" />


<script type="text/javascript">
    $(function(){
        $("#passCk").on("change",function(){
            if($(this).prop("checked")==true){
                $("input[type='password']").prop("disabled",false);
            }else{
                $("input[type='password']").prop("disabled",true);
            }
        });
        $("#usertype").on("change",function(){
            var sn = $("#usertype option:selected").val();
            if(sn !='SA'){
                $("#auth-menu").show();
            }else{
                $("#auth-menu").hide();
            }
        });

        <c:if test="${mvo.usertype eq 'CP'}">
		$("#auth-menu").show();
		</c:if>


});
</script>