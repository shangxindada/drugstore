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
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">基本信息</strong> / <small>药品信息</small></div>
    </div>

	<div class="am-g">
      <div class="am-u-md-6 am-cf">
        <div class="am-btn-group am-btn-group-xs">
          <a href="drugInfoForm?drugNumber=" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新增</a>
        </div>
      </div>
      
	  <form class="am-topbar-form am-topbar-left am-form-inline" action="searchDrugInfo" role="search">
	  	
      <div class="am-form-group">
      	<select data-am-selected class="am-form-field am-input-sm" name="type">
  			<option value="a">类别</option>
 			<option value="b" selected>名称</option>
  			<option value="o">编号</option>
	  	</select>
        <input type="text" class="am-form-field am-input-sm" name="value" placeholder="搜索">
      </div>
    </form>	
    </div>

	<div class="am-g">
      <div class="am-u-sm-12">
        <form class="am-form">
          <table class="am-table am-table-striped am-table-hover table-main">
            <thead>
              <tr>
                <th class="table-title">药品编号</th><th class="table-type">药品名称</th><th>生产日期</th><th>保质期</th>
                	<th>供应商名称</th><th>售价</th><th>进价</th><th>库存</th><th>类别</th><th>备注</th><th class="table-set">操作</th>
              </tr>
          </thead>
          <tbody>
            <c:forEach items="${drugInfo}" var="list">
            	<tr>
              <td>${list.drugNumber}</td>
              <td>${list.drugName}</td>
              <td>${list.productDate}</td>
              <td>${list.safeDate}</td>
			  <td>${list.supplierName}</td>
              <td>${list.price}</td>
              <td>${list.purchasePrice}</td>
              <td>${list.stock}</td>
              <td>${list.type.type}</td>
              <td>${list.remakes}</td>
              <td>
                <div class="am-btn-toolbar">
                  <div class="am-btn-group am-btn-group-xs">
                    <a href="drugInfoForm?drugNumber=${list.drugNumber}&flag=" class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span> 编辑</a>
                    <a href="drugInfoForm?drugNumber=${list.drugNumber}&flag=d" class="am-btn am-btn-default am-btn-xs am-text-danger"><span class="am-icon-trash-o"></span> 删除</a>
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