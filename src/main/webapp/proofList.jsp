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
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">用户信息</strong> / <small>注册码信息</small></div>
    </div>

	<div class="am-g">
      <div class="am-u-sm-12">
      	
      	<div class="am-g">
      		<div class="am-u-md-6 am-cf">
        	<div class="am-btn-group am-btn-group-xs">
          		<a href="doProof" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新增</a>
        	</div>
      		</div>
    	</div>
      	
        <form class="am-form">
          <table class="am-table am-table-striped am-table-hover table-main">
            <thead>
              <tr>
                <th class="table-title">注册码编号</th><th class="table-type">注册码</th><th>是否使用</th><th>生成日期</th>
                <th>权限</th><th class="table-set">操作</th>
              </tr>
          </thead>
          <tbody>
            <c:forEach items="${proofInfo}" var="list">
            	<tr>
              <td>${list.proofId}</td>
              <td>${list.proofe}</td>
              <td>${ list.isUse()? "否":"是"}</td>
              <td>${list.proofDate}</td>
              <td>${list.proofLe}</td>
              <td>
                <div class="am-btn-toolbar">
                  <div class="am-btn-group am-btn-group-xs">
                    <a href="deleteProof?proofId=${list.proofId}" class="am-btn am-btn-default am-btn-xs am-text-danger"><span class="am-icon-trash-o"></span> 删除</a>
                  </div>
                </div>
              </td>
            </tr>
            </c:forEach>
          </tbody>
        </table>
		          <hr />
          <p>注：这里是对商品信息的维护！</p>
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
	<!--<![endif]-->
	<script src="assets/js/app.js"></script>
	<script type="text/javascript">
		
	</script>
</body>
</html>