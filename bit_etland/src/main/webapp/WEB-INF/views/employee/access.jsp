<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<section>    
<form class="form-horizontal">
  <div class="form-group">
    <small class="col-sm-2 control-label">Employee_ID</small>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="empno" name="empno" placeholder="Employee_ID" value="1000">
    </div>
  </div>
  <div class="form-group">
    <small class="col-sm-2 control-label">Name</small>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="name" name="name" placeholder="EmployeeName" value="김경민">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">ACCESS</button>
    </div>
  </div>
</form>
</section>
<script>
$('#confirm_btn').click(function(){
	var empno = $('#empno').val();
	var name = $('#name').val();
	$('#form')
	.attr('action', '${ctx}/employee.do')
	.submit();
});
</script>


