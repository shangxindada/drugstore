<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
  <title>上心药店系统 - 资料</title>
  <%@include file="common/head.jsp" %>
</head>
<body>
<%@include file="common/top.jsp" %>
<div class="am-cf admin-main">
  <%@include file="common/sidebar.jsp" %>
  
  <div class="admin-content">

    <div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">个人资料</strong> / <small><%=UserId%></small></div>
    </div>
    <form class="am-form" method="get" action="updateUserInfo">
				<input type="hidden" id="Userids" value="<%=UserId%>">
				<input type="hidden" id="message" value="${error}"/>
				<div class="am-tabs am-margin" data-am-tabs>
					<ul class="am-tabs-nav am-nav am-nav-tabs">
						<li class="am-active">资料可编辑</li>
					</ul>
					<div class="am-tabs-bd">
						<div class="am-tab-panel am-fade am-in am-active" id="tab1">
						<div class="am-g am-margin-top">
							<div class="am-u-sm-2 am-text-right">个人编号</div>
							<div class="am-u-sm-4 am-u-end">
								<input type="text" id="usernumber" name="userNumber" value="${userInfo.userNumber}" class="am-input-sm"  readonly="readonly">	
							</div>
						</div>
						<div class="am-g am-margin-top-sm">
							<div class="am-u-sm-2 am-text-right">登录账号</div>
							<div class="am-u-sm-4 am-u-end">
								<input type="text" id="userid"  class="am-input-sm" value="<%=UserId%>"  readonly="readonly">
							</div>
						</div>
						<div class="am-g am-margin-top-sm">
							<div class="am-u-sm-2 am-text-right">姓名</div>
							<div class="am-u-sm-4 am-u-end">
								<input type="text" id="username" name="userName" class="am-input-sm" value="${userInfo.userName}" >
							</div>
						</div>
						<div class="am-g am-margin-top-sm">
							<div class="am-u-sm-2 am-text-right">性别</div>
							<div class="am-u-sm-4 am-u-end">
								<input value="${userInfo.sex}" id="testsex" hidden="hidden"/>
								<select id="sex" name="sex" >
									<option value="男">男</option>
									<option value="女">女</option>
								</select>
							</div>
						</div>
						<div class="am-g am-margin-top-sm">
							<div class="am-u-sm-2 am-text-right">年龄</div>
							<div class="am-u-sm-4 am-u-end">
								<input type="text" id="age" name="age" class="am-input-sm" value="${userInfo.age}">
							</div>
						</div>
						<div class="am-g am-margin-top-sm">
							<div class="am-u-sm-2 am-text-right">联系电话</div>
							<div class="am-u-sm-4 am-u-end">
								<input type="text" id="telephone" name="userPhone" class="am-input-sm" value="${userInfo.userPhone}">
							</div>
						</div>
						<div class="am-g am-margin-top-sm">
							<div class="am-u-sm-2 am-text-right">地址</div>
							<div class="am-u-sm-4 am-u-end">
								<input type="text" id="address" name="useraddress" class="am-input-sm" value="${userInfo.useraddress}">
							</div>
						</div>
						<div class="am-g am-margin-top-sm">
							<div class="am-u-sm-2 am-text-right">工资</div>
							<div class="am-u-sm-4 am-u-end">
								<input type="text" id="salary" name="salary" class="am-input-sm" value="${userInfo.salary}">
							</div>
						</div>
						<div class="am-g am-margin-top-sm">
							<div class="am-u-sm-2 am-text-right">职位</div>
							<div class="am-u-sm-4 am-u-end">
								<input type="text" id="postion" name="userPostion" class="am-input-sm" value="${userInfo.userPostion}">
							</div>
						</div>
						</div>
					</div>
				</div>

				<div class="am-margin">
					 <input type="submit" class="am-btn am-btn-primary am-btn-xs" value="保存" />
					 <input type="reset" class="am-btn am-btn-primary am-btn-xs" value="取消">
					 <input type="button" class="am-btn am-btn-primary am-btn-xs" value="返回"  
					    onclick="javascript:history.go(-1);"  >
				</div>
			</form>
    
  </div>
</div>

<footer>
   <hr>
   <p class="am-padding-left">© 2016 zhdtedu, Inc.</p>
</footer>

<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/amazeui.js"></script>
<script type="text/javascript">
	var sex = $("#testsex").val();
	if("男"==sex){
		$("#sex").val("男");
	}else{
		$("#sex").val("女");
	}
</script>
<!--<script type="text/javascript">
	function login(){
		var UserId = $("#userid").val();
		var message = $("#message").val();
		console.dir(message);
		if(""!=message){
			alert(message);
		}
		$.ajax({
			url:"selectByUserId",
			type:"get",
			data:{"UserId":UserId},
			success:function(data){
				$("#usernumber").val(data.userNumber);
				$("#username").val(data.userName);
				$("#age").val(data.age);
				$("#telephone").val(data.userPhone);
				$("#address").val(data.useraddress);
				$("#salary").val(data.salary);
				$("#postion").val(data.userPostion);
				if("男"==data.sex){
					$("#sex").val("男");
				}else{
					$("#sex").val("女");
				}
			}
		});
	}
	login();
	
	
</script>-->
</body>
</html>