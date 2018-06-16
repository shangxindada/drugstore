<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
  <title>上心医药 - 供应商信息</title>
  <%@include file="common/head.jsp" %>
</head>
<body>
<%@include file="common/top.jsp" %>
<div class="am-cf admin-main">
  <%@include file="common/sidebar.jsp" %>
  <!-- content start -->
  <div class="admin-content">
    <div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">基本信息</strong> / <small>供应商信息</small></div>
    </div>
    <form class="am-form" method="post" action="doSupplierInfo"><input type="hidden" name="act" value="${not empty supplierInfo ? 'mdy' : 'add'}">
	<div class="am-tabs am-margin" data-am-tabs>
	    <ul class="am-tabs-nav am-nav am-nav-tabs">
	      <li class="am-active">${empty supplierInfo ? '新增' : '修改' }供应商</li>
	    </ul>
	    <div class="am-tabs-bd">
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 供应商编号</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="supplierId" class="am-input-sm" value="${supplierInfo.supplierId}" readonly="readonly">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 供应商名称</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="supplierName" class="am-input-sm" value="${supplierInfo.supplierName}" required="required">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 联系人</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="contacts" class="am-input-sm" value="${supplierInfo.contacts}" required="required">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 地址</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="supplierAddress" class="am-input-sm" value="${supplierInfo.supplierAddress}" required="required">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 联系人电话</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="contactsPhone" class="am-input-sm" value="${supplierInfo.contactsPhone}" required="required">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 药品生产许可证编号</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="licenseId" class="am-input-sm" value="${supplierInfo.licenseId}" required="required">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 营业执照编号</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="busLicenseId" class="am-input-sm" value="${supplierInfo.busLicenseId}" required="required">
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