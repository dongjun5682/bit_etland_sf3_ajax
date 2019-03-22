<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" href="${css}/customer/signin.css" />
<section class="login" id="login">
    <div class="container"> 
  <h3 class="text-center text-uppercase text-secondary mb-0">Customer Login</h3>
<form id="form">
  <div class="form-group">
    <small class="col-sm-2 control-label">UserID</small>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="customerId" name="customerId" placeholder="User Name" value="as">
    </div>
  </div>
  <div class="form-group">
    <small class="col-sm-2 control-label">Password</small>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="password" name="password" placeholder="Password" value="1234">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
    <button type="submit" class="btn btn-primary btn-xl" id="confirm_btn">Send</button>
    </div>
  </div>
</form>
</div>
</section>
<script>
$('#confirm_btn').click(function(){
	$('#form')
	.attr('method','POST')
	.attr('action','${ctx}/customer/signin')
	.submit();
});
</script>


