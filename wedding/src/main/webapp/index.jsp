<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>请贴系统</title>
	
	<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
	<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="/wedding/css/bootstrap-inv.min.css">
</head>
<body>
<div class="col-md-4 col-md-offset-3">
	<form class="form-horizontal" role="form" action="/wedding/admin/login" method="post">
		<div class="form-group">
		   <label for="firstname" class="col-xs-2 control-label">帐号</label>
		   <div class="col-xs-10">
		      <input type="text" class="form-control" name="username" placeholder="请输入帐号">
		   </div>
		</div>
		<div class="form-group">
		   <label for="lastname" class="col-xs-2 control-label">密码</label>
		   <div class="col-xs-10">
		      <input type="password" class="form-control" name="password" placeholder="请输入密码">
		   </div>
		</div>
		<div class="form-group">
		   <div class="col-xs-offset-2 col-xs-10">
		      <div class="checkbox">
		         <label>
		            <input type="checkbox" name="rememberme"> 请记住我
		         </label>
		      </div>
		   </div>
		</div>
		<div class="form-group">
		   <div class="col-xs-offset-2 col-xs-10">
		      <button type="submit" class="btn btn-default">登录</button>
		   </div>
		</div>
	</form>
</div>
</body>
</html>
