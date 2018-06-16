<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
  <title>上心医药 - 药品类别</title>
  <%@include file="common/head.jsp" %>
</head>
<body>
<%@include file="common/top.jsp" %>
<div class="am-cf admin-main">
  <%@include file="common/sidebar.jsp" %>
  <!-- content start -->
  <div class="admin-content">
    <div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">基本信息</strong> / <small>药品类别</small></div>
    </div>
    <form class="am-form" method="post" action="insertDrugType"><input type="hidden" name="act" value="${not empty type ? 'mdy' : 'add'}">
	<div class="am-tabs am-margin" data-am-tabs>
	    <ul class="am-tabs-nav am-nav am-nav-tabs">
	      <li class="am-active">${empty type ? '新增' : '修改' }类别</li>
	    </ul>
	    <div class="am-tabs-bd">
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 类别编号</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="typeId" class="am-input-sm" value="${type.typeId }" readonly="readonly">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 类别名称</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="type" class="am-input-sm" value="${type.type}" required="required">
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