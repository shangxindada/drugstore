<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html class="no-js">
<head>
   <title>上心医药 - 药品信息</title>
   <%@include file="common/head.jsp"%>
</head>
<body>
	<%@include file="common/top.jsp"%>
	<div class="am-cf admin-main">
	<%@include file="common/sidebar.jsp"%>
		<!-- content start -->
  <div class="admin-content">

    <div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">基本信息</strong> / <small>报表信息</small></div>
    </div>

	<div class="am-g">
      
	  <form class="am-topbar-form am-topbar-left am-form-inline" action="serchFrom" data-am-validator action="searchDrugInfo" role="search">
	  	
      <div class="am-form-group">
  		<input type="date" name="startDate" class="am-form-field am-input-group date" placeholder="起始时间"   required />
      	<input type="date" name="endDate" class="am-form-field" placeholder="结束时间"   required />
      	<select data-am-selected class="am-form-field am-input-sm" name="type">
  			<option value="a" selected>销售信息</option>
 			<option value="b">入库信息</option>
	  	</select>
        <input type="submit" class="am-btn am-btn-primary am-btn-xs" value="生成报表" />
      </div>
    </form>	
    </div>

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