<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	<meta charset="utf-8"/>
	<title>上心药店管理系统-注册页面</title>
	<link rel="stylesheet"  href="assets/css/admin.css">
	<link rel="stylesheet"  href="assets/css/main.css">

	</head>
    <body>
    	<div class="admin-formbox">
    		<div class="admin-title">注册</div>
			<form method = "post" action="register" >
				<div>
			 	<p class="admin-error">${error}</p>
				</div>
				<div class="admin-uname main-login main-input">
				<input type="text" name="userId" value="" id="username"/>
				</div>
				<div class="admin-pwd main-login main-input">
				<input type="password" name="userPsd" value="" id="password"/>	
				</div>
				<div class="main-login main-input" style="color:#417DC9">
				<input type="text" name="proof" />输入注册码
				</div>
				<div id="" class="admin-put">
					<input type="submit" value="注册"  class=""/>
				</div>	
			</form>	
			<a id="noremember" class="" href="login.jsp" >返回登录</a>
    	</div>
 	</body>
</html>