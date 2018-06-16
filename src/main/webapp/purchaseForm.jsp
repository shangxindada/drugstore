<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html class="no-js">
<head>
   <title>上心医药 - 用户信息</title>
   <%@include file="common/head.jsp"%>
</head>
<body>
	<%@include file="common/top.jsp"%>
	<div class="am-cf admin-main">
	<%@include file="common/sidebar.jsp"%>
		<!-- content start -->
  <div class="admin-content">

    <div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">入库操作</strong> / <small>入库信息</small></div>
    </div>
	 <form class="am-form" method="post" action="insertWarehousingInfo">
	<div class="am-tabs am-margin" data-am-tabs>
	    <ul class="am-tabs-nav am-nav am-nav-tabs">
	      <li class="am-active">${message}</li>
	    </ul>
	    <div class="am-tabs-bd">
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 采购编号</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="" class="am-input-sm"  readonly="readonly">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 药品编号</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="drugnumber" class="am-input-sm" required="required">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 价格</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="price" class="am-input-sm"  required="required">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 数量</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="stock" class="am-input-sm"  required="required">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 采购日期</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="date" name="date"  class="am-input-sm"  required="required">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 备注</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="remakes" class="am-input-sm"  required="required">
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


	<div class="am-g">
      <div class="am-u-sm-12">
        <form class="am-form">
		  <hr />
          <p>注：这里是对药品信息的维护！</p>
        </form>
      </div>
    </div>
  </div>
  <!-- content end -->

	</div>

	<footer>
		<hr>
		<p class="am-padding-left">© 2016 zhdtedu, Inc.</p>
	</footer>



	<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]-->

	<!--[if (gte IE 9)|!(IE)]><!-->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/amazeui.js"></script>
	<script src="assets/js/amazeui.datetimepicker.min.js"></script>
	<!--<![endif]-->
	<script src="assets/js/app.js"></script>
	<script type="text/javascript">
		$('#datetimepicker').datetimepicker();
	</script>
</body>
</html>