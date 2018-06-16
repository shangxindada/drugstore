<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
  <title>上心医药 - 药品信息</title>
  <%@include file="common/head.jsp" %>
</head>
<body>
<%@include file="common/top.jsp" %>
<div class="am-cf admin-main">
  <%@include file="common/sidebar.jsp" %>
  <!-- content start -->
  <div class="admin-content">
    <div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">添加信息</strong> / <small>报损信息</small></div>
    </div>
    <form class="am-form" method="post" action="insertExpired">
	<div class="am-tabs am-margin" data-am-tabs>
	    <ul class="am-tabs-nav am-nav am-nav-tabs">
	      <li class="am-active">增加报损信息</li>
	    </ul>
	    <div class="am-tabs-bd">
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 药品编号</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="drugnumber" class="am-input-sm" >
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 药品名称</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="expdrugname" class="am-input-sm"  required="required">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 记录日期</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="date" name="expdate"   class="am-input-sm"  required="required">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 损坏原因</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="type" class="am-input-sm"  required="required">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 损坏数量</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="number" name="expnum" class="am-input-sm"  required="required">
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