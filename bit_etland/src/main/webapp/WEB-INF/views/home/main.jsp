<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<section class="login" id="login">
    <div class="container">
      <h2 class="text-center text-uppercase text-secondary mb-0">Login Select</h2>
      <hr class="star-dark mb-5">
   		 <div class="grid-item" id="left">
    	고객 전용<br /><br />
    	<a href="#" id="cust_join" >회원가입</a><br />
    	<a href="#" id="cust_login" >로 그 인</a>
    </div>
    <div class="grid-item" id="right">
    	직원 전용<br /><br />
    	<a href="#" id="emp_register" >사원등록</a><br />
    	<a href="#" id="emp_access">접속승인</a>
    </div>
      </div>
  </section>
 
<script>
$('#cust_login').click(function(){
	location.assign('${ctx}/move/customer/signin');
});
$('#cust_join').click(function(){
	location.assign('${ctx}/move/customer/signup');
});
$('#emp_register').click(function(){
	location.assign('${ctx}/move/employee/register');
});
$('#emp_access').click(function(){
	location.assign('${ctx}/move/employee/access');
});
$('#oop_access').click(function(){
	/* app.main(); */
	//app.food();
	info.main();
});

</script>