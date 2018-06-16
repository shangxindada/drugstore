<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
  <title>上心医药 - 采购信息</title>
  <%@include file="common/head.jsp" %>
</head>
<body>
<%@include file="common/top.jsp" %>
<div class="am-cf admin-main">
  <%@include file="common/sidebar.jsp" %>
  <!-- content start -->
  <div class="admin-content">
    <div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">采购操作</strong> / <small>药品采购单</small></div>
    </div>
    <form class="am-form" method="post" action="insertProof">
	<div class="am-tabs am-margin" data-am-tabs>
	    <ul class="am-tabs-nav am-nav am-nav-tabs">
	      <li class="am-active">${message}</li>
	    </ul>
	    <div class="am-tabs-bd">
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 注册码</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="proofe" value="${proof}" class="am-input-sm" required="required">
            </div>
          </div>
		<div class="am-g am-margin-top-sm">
			<div class="am-u-sm-2 am-text-right" >权限</div>
			<div class="am-u-sm-4 am-u-end">
				<select id="sex" name="proofLe" >
					<option value="0">店员</option>
					<option value="1">管理员</option>
				</select>
			</div>
		 </div>
	    </div>
	</div>

	<div class="am-margin">
	    <input type="submit" class="am-btn am-btn-primary am-btn-xs" value="保存" />
	    <input type="reset" class="am-btn am-btn-primary am-btn-xs" value="取消" />
	    <a href="purchaseInfo?pageNum=1"><input type="button" class="am-btn am-btn-primary am-btn-xs" value="查看"  /></a>
	</div>
	</form>
	
  </div>
  <!-- content end -->
</div>
<footer>
  <hr>
  <p class="am-padding-left">© 2016 zhdtedu, Inc.</p>
</footer>

<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/amazeui.js"></script>
<!--<![endif]-->
</body>
</html>