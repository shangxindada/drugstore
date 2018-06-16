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
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">销售信息</strong> / <small>销售单信息</small></div>
    </div>

	<div class="am-g">
      <div class="am-u-sm-12">
        <form class="am-form" method="post" action="sellForm">
        	销售单号：<input type="text" value="${otherSellInfo.sellid}" name="sellid" class="am-input-sm" readonly="readonly">
        	操作员：<input type="text" name="userid" value="${otherSellInfo.userid}" class="am-input-sm" readonly="readonly">
        	总价：<input type="text" name="allprice" value="${otherSellInfo.allprice}" class="am-input-sm" readonly="readonly">
        	日期：<input type="text" name="selldata" value="${otherSellInfo.selldata}" class="am-input-sm" readonly="readonly">
          <table class="am-table am-table-striped am-table-hover table-main">
            <thead>
              <tr>
                <th class="table-title">销售编号</th><th class="table-type">药品编号</th><th>售价</th><th>数量</th>
                	<th class="table-set">操作</th>
              </tr>
          </thead>
          <tbody>
            <c:forEach items="${sellInfo}" var="list">
            	<tr>
              <td>${list.sellnumber}</td>
              <td>${list.drugnumber}</td>
              <td>${list.sellprice}</td>
              <td>${list.sellnum}</td>
              <td>
                <div class="am-btn-toolbar">
                  <div class="am-btn-group am-btn-group-xs">
                    <a href="deleteSellInfo?sellnumber=${list.sellnumber}" class="am-btn am-btn-default am-btn-xs am-text-danger ${type!=1 ? 'admin-hidden': ''}"><span class="am-icon-trash-o"></span> 删除</a>
                  </div>
                </div>
              </td>
            </tr>
            </c:forEach>
          </tbody>
        </table>
        <input type="submit" class="am-btn am-btn-primary am-btn-xs ${type!=1 ? 'admin-hidden': ''}" value="保存" />
        <input type="button" class="am-btn am-btn-primary am-btn-xs ${type!=1 ? 'admin-hidden': ''}" value="取消"
        	onclick="javascript:window.location.href='sellForm'"  />
        <input type="button" class="am-btn am-btn-primary am-btn-xs ${type==1 ? 'admin-hidden': ''}" value="返回"  
					    onclick="javascript:history.go(-1);"  >
		<input type="button" class="am-btn am-btn-primary am-btn-xs ${type==1 ? 'admin-hidden': ''} <%=str %>" value="删除"  
					    onclick="javascript:window.location.href='deleteOtherSell?sellid=${otherSellInfo.sellid}'"  >
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
	<!--<![endif]-->
	<script src="assets/js/app.js"></script>
	<script type="text/javascript">
		
	</script>
</body>
</html>