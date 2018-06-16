<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="utf-8"/>
	<title>上心药店管理系统-登录页面</title>
	<link rel="stylesheet"  href="assets/css/admin.css">
	<link rel="stylesheet"  href="assets/css/main.css">

</head>
	<div class="admin-formbox">
		<div class="admin-title">登录</div>
		<form method = "post" action="login" >
			<div>
			 <p class="admin-error">${error}</p>
			</div>
			<div class="admin-uname main-login main-input">
			<input type="text" name="userId" value="" id="username"/>
			</div>
			<div class="admin-pwd main-login main-input">
			<input type="password" name="userPsd" value="" id="password"/>	
			</div>
			<div class="admin-remeber">
			    <input id="remember-me"  type="checkbox">记住密码
			</div>
			<div id="" class="admin-put">
				<input type="submit" value="登录" class=""/>
				<input type="button" value="注册" onclick="window.open('register.jsp')" class=""/>
			</div>	
		</form>
	</div>
</html>