<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet"href="${css}/customer/detail.css" />
<div class="grid-item" id="side_menu">
 	<form id="file_form">
 		<img id="detail_img" src="${img}/${image.imgName}.${image.imgExtention}"/>	
 		<input type="file" name="file_upload" id="file_upload"/>
 		<input type="submit" class="btn btn-success" id="file_upload_btn"/>
<%--  		<input type="hidden" name="cmd" value="cust_file_upload"/>
 		<input type="hidden" name="page" value="detail" />
 		<input type="hidden" name="customer_Id" value="${cus.customerId}"/> --%>
	</form>
</div>
<div class="grid-item" id="content">
<div id="detail_info">
[${user.customerName}의 정보] <br /> 
<div id="customerId">아이디 : ${user.customerId}</div>
<div>이 름  : ${user.customerName}</div>
<div>생년월일 : ${user.ssn}</div>
<div>성 별 : 남 </div>
<div>전화번호 : ${user.phone} </div>
<div>우편번호 : ${user.postalCode} </div>
<div>지번주소 : ${user.city}</div>
<div>상세주소 : ${user.address}</div>
</div>
</div>
<div class="grid-item" id="modify">
	<button type="button" class="btn btn-success" id="detail_modify">수정</button>
</div>
<div class="grid-item" id="reomve">
	<button type="button" class="btn btn-danger" id="detail_remove">회원탈퇴</button>
</div>

<script>
$('#detail_remove').click(function(){
	location.assign('${ctx}/customer.do?cmd=cust_remove&dir=home&page=main&customer_Id=${cus.customerId}');
});
$('#detail_modify').click(function(){
	alert('수정버튼 클릭');
	location.assign('${ctx}/move/customer/update');
});
$('#file_upload_btn').click(function(){
	$('#file_form')
	.attr('method','post')
	.attr('action','${ctx}/customer.do?cmd=cust_file_upload&page=detail&customer_Id=${cus.customerId}')
	.attr('enctype','multipart/form-data')
	.submit();
});
</script>