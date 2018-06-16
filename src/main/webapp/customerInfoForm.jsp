<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
  <title>上心医药 - 顾客信息</title>
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
    <form class="am-form" method="post" action="doCustomerInfo"><input type="hidden" name="act" value="${not empty customerInfo ? 'mdy' : 'add'}">
	<div class="am-tabs am-margin" data-am-tabs>
	    <ul class="am-tabs-nav am-nav am-nav-tabs">
	      <li class="am-active">${empty customerInfo ? '新增' : '修改' }类别</li>
	    </ul>
	    <div class="am-tabs-bd">
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 顾客编号</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="customerid" class="am-input-sm" value="${customerInfo.customerid}" readonly="readonly">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 顾客姓名</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="customername" class="am-input-sm" value="${customerInfo.customername}" required="required">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 上次消费</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="lastconsumption" class="am-input-sm" value="${customerInfo.lastconsumption}" required="required">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 总消费</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="consumption" class="am-input-sm" value="${customerInfo.consumption}" required="required">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 联系电话</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="customerphone" class="am-input-sm" value="${customerInfo.customerphone}" required="required">
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