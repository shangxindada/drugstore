<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html class="no-js">
<head>
   <title>上心医药 - 供应商信息</title>
   <%@include file="common/head.jsp"%>
</head>
<body>
	<%@include file="common/top.jsp"%>
	<div class="am-cf admin-main">
	<%@include file="common/sidebar.jsp"%>
		<!-- content start -->
  <div class="admin-content">

    <div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">基本信息</strong> / <small>供应商信息</small></div>
    </div>

	<div class="am-g">
      <div class="am-u-md-6 am-cf">
        <div class="am-btn-group am-btn-group-xs">
          <a href="supplierInfoForm?supplierid=" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新增</a>
        </div>
      </div>
    </div>

	<div class="am-g">
      <div class="am-u-sm-12">
        <form class="am-form">
          <table class="am-table am-table-striped am-table-hover table-main">
            <thead>
              <tr>
                <th class="table-title">供应商编号</th><th class="table-type">供应商名称</th><th>联系人</th><th>地址</th>
                	<th>联系人电话</th><th>药品生产许可证编号</th><th >营业执照编号</th> <th class="table-set">操作</th>
              </tr>
          </thead>
          <tbody>
            <c:forEach items="${supplierInfo.list}" var="list">
            	<tr>
              <td>${list.supplierId}</td>
              <td>${list.supplierName}</td>
              <td>${list.contacts}</td>
              <td>${list.supplierAddress}</td>
			  <td>${list.contactsPhone}</td>
			  <td>${list.licenseId}</td>
			  <td>${list.busLicenseId}</td>
              <td>
                <div class="am-btn-toolbar">
                  <div class="am-btn-group am-btn-group-xs">
                    <a href="supplierInfoForm?supplierid=${list.supplierId}&flag=" class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span> 编辑</a>
                    <a href="supplierInfoForm?supplierid=${list.supplierId}&flag=d" class="am-btn am-btn-default am-btn-xs am-text-danger"><span class="am-icon-trash-o"></span> 删除</a>
                  </div>
                </div>
              </td>
            </tr>
            </c:forEach>
          </tbody>
        </table>
        <ul class="am-pagination">
		  <li  class="${ supplierInfo.pageNum == 1 ? 'am-disabled' : ''}"><a href="selectSupplierInfo?pageNum=${supplierInfo.pageNum -1}">&laquo;</a></li>
		  <c:forEach begin="1" end="${supplierInfo.pages}" var="page">
		  <li class="${ supplierInfo.pageNum == page ? 'am-active' : ''}"><a href="selectSupplierInfo?pageNum=${page}">${page}</a></li>
			</c:forEach>
		  <li class="${ supplierInfo.pageNum == supplierInfo.pages ? 'am-disabled' : ''}"><a href="selectSupplierInfo?pageNum=${supplierInfo.pageNum + 1}">&raquo;</a></li>
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