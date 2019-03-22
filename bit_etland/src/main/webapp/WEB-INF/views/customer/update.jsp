<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<link rel="stylesheet"href="${css}/customer/update.css" />
<div class="grid-item" id="nav">
	<jsp:include page="../employee/nav.jsp"/>
</div>
<div class="grid-item" id="side_menu">
 	<img src="${img}/${image.imgName}.${image.imgExtention}"/>
</div>

<div class="grid-item" id="content">
<form id="form">
[${user.customerName}의 정보] <br /> 
아이디 : ${user.customerId} <br />
<input type="hidden" name="customerId" id="customerId" value ="${user.customerId}" />
이 름  : ${user.customerName} <br />
<input type="hidden" name="customerName" id="customerName" value ="${user.customerName}" />
생년월일 : ${user.ssn} <br />
<input type="hidden" name="ssn" id="ssn" value ="${user.ssn}" />
성 별 : 남 <br />
전화번호 : <input type="text" name="phone" id="phone" value="${user.phone}" /><br />
우편번호 : <input type="text" name="postalCode" id="postalCode" value="${user.postalCode}"/><br />
지번주소 : <input type="text" name="city" id="city"value="${user.city}" /><br />
상세주소 : <input type="text" name="address" id="address" value="${user.address}" /><br />
임시번호 : <input type="text" name="password" id="password" placeholder="임시 비밀번호" />
</form>
</div>	
<div class="grid-item" id="modify">
	<button type="button" class="btn btn-success" id="confirm_btn">확인</button>
</div>
<div class="grid-item" id="cancel">
	<button type="button" class="btn btn-danger" id="cancel_btn">취소</button>
</div>
<script>
$('#confirm_btn').click(function(){
	$('#form')
	.attr('method','POST')
	.attr('action','${ctx}/customer/update')
	.submit();
});

$('#cancel_btn').click(function(){
	alert('취소 클릭');
});

</script>