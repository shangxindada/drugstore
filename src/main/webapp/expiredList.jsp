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
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">基本信息</strong> / <small>报损信息</small></div>
    </div>

	<div class="am-g">
      <div class="am-u-md-6 am-cf">
        <div class="am-btn-group am-btn-group-xs">
          <a href="expiredForm" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新增</a>
        </div>
      </div>
    </div>

	<div class="am-g">
      <div class="am-u-sm-12">
        <form class="am-form">
          <table class="am-table am-table-striped am-table-hover table-main">
            <thead>
              <tr>
                <th class="table-title">报损单号</th><th class="table-type">药品编号</th><th>药品名称</th><th>记录日期</th>
                	<th>损坏原因</th><th>损坏数量</th><th class="table-set">操作</th>
              </tr>
          </thead>
          <tbody>
            <c:forEach items="${expiredDrugs.list}" var="list">
            	<tr>
              <td>${list.expnumber}</td>
              <td>${list.drugnumber}</td>
              <td>${list.expdrugname}</td>
              <td>${list.expdate}</td>
			  <td>${list.type}</td>
              <td>${list.expnum}</td>
              <td>
                <div class="am-btn-toolbar">
                  <div class="am-btn-group am-btn-group-xs">
                    <a href="deleteExpired?expnumber=${list.expnumber}" class="am-btn am-btn-default am-btn-xs am-text-danger"><span class="am-icon-trash-o"></span> 删除</a>
                  </div>
                </div>
              </td>
            </tr>
            </c:forEach>
          </tbody>
        </table>
        <ul class="am-pagination">
		  <li  class="${ expiredDrugs.pageNum == 1 ? 'am-disabled' : ''}"><a href="selectAllExpired?num=${expiredDrugs.pageNum -1}">&laquo;</a></li>
		  <c:forEach begin="1" end="${expiredDrugs.pages}" var="page">
		  <li class="${ expiredDrugs.pageNum == page ? 'am-active' : ''}"><a href="selectAllExpired?num=${page}">${page}</a></li>
			</c:forEach>
		  <li class="${ expiredDrugs.pageNum == expiredDrugs.pages ? 'am-disabled' : ''}"><a href="selectAllExpired?num=${expiredDrugs.pageNum + 1}">&raquo;</a></li>
		</ul>
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