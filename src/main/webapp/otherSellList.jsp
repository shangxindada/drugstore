<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html class="no-js">
<head>
   <title>上心医药 - 销售信息</title>
   <%@include file="common/head.jsp"%>
</head>
<body>
	<%@include file="common/top.jsp"%>
	<div class="am-cf admin-main">
	<%@include file="common/sidebar.jsp"%>
		<!-- content start -->
  <div class="admin-content">

    <div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">基本信息</strong> / <small>销售单信息</small></div>
    </div>

	<div class="am-g">
      <div class="am-u-sm-12">
        <form class="am-form">
        	${message}
          <table class="am-table am-table-striped am-table-hover table-main">
            <thead>
              <tr>
                <th class="table-title">销售单号</th><th class="table-type">操作人员编号</th><th>日期</th><th>总价</th>
                	<th class="table-set">操作</th>
              </tr>
          </thead>
          <tbody>
            <c:forEach items="${otherSellInfo.list}" var="list">
            	<tr>
              <td>${list.sellid}</td>
              <td>${list.userid}</td>
              <td>${list.selldata}</td>
              <td>${list.allprice}</td>
              <td>
                <div class="am-btn-toolbar">
                  <div class="am-btn-group am-btn-group-xs">
                    <a href="selectOtherSell?sellid=${list.sellid}" class="am-btn am-btn-default am-btn-xs am-text-secondary "><span class="am-icon-pencil-square-o"></span> 查看</a>
                    <a href="deleteOtherSell?sellid=${list.sellid}" class="am-btn am-btn-default am-btn-xs am-text-danger <%=str %>"><span class="am-icon-trash-o"></span> 删除</a>
                  </div>
                </div>
              </td>
            </tr>
            </c:forEach>
          </tbody>
        </table>
        <ul class="am-pagination">
		  <li  class="${ otherSellInfo.pageNum == 1 ? 'am-disabled' : ''}"><a href="selectOtherSellInfo?pageNum=${otherSellInfo.pageNum -1}">&laquo;</a></li>
		  <c:forEach begin="1" end="${otherSellInfo.pages}" var="page">
		  <li class="${ otherSellInfo.pageNum == page ? 'am-active' : ''}"><a href="selectOtherSellInfo?pageNum=${page}">${page}</a></li>
			</c:forEach>
		  <li class="${ otherSellInfo.pageNum == otherSellInfo.pages ? 'am-disabled' : ''}"><a href="selectOtherSellInfo?pageNum=${otherSellInfo.pageNum + 1}">&raquo;</a></li>
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