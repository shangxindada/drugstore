<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
  <title>上心医药 - 销售信息</title>
  <%@include file="common/head.jsp" %>
</head>
<body>
<%@include file="common/top.jsp" %>
<div class="am-cf admin-main">
  <%@include file="common/sidebar.jsp" %>
  <!-- content start -->
  <div class="admin-content">
    <div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">销售操作</strong> / <small>药品销售</small></div>
    </div>
    <form class="am-form" method="post" id="form">
	<div class="am-tabs am-margin" data-am-tabs>
	    <ul class="am-tabs-nav am-nav am-nav-tabs">
	      <li class="am-active">${message}</li>
	    </ul>
	    <div class="am-tabs-bd">
			<input hidden="hidden" name="number" id="" value="${number}" />
			<input hidden="hidden" name="userId" value="<%=user.getUserId() %>" />
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 销售单号</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="sellId" class="am-input-sm" value="${sellId}" readonly="readonly">
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
              <input type="text" name="sellprice" class="am-input-sm"  required="required">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-2 am-text-right"> 数量</div>
            <div class="am-u-sm-4 am-u-end">
              <input type="text" name="sellnum" class="am-input-sm"  required="required">
            </div>
          </div>
	    </div>
	</div>

	<div class="am-margin">
	    <input type="submit" class="am-btn am-btn-primary am-btn-xs btn--save" value="保存" />
	    <input type="submit" class="am-btn am-btn-primary am-btn-xs btn--preview" value="查看" />
	    <input type="reset" class="am-btn am-btn-primary am-btn-xs" value="取消" />
	    <!--<a href="insertOtherSellInfo"><input type="button" class="am-btn am-btn-primary am-btn-xs" value="查看"  /></a>-->
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
<script>
	var  form = $('#form');
	$('.btn--save').click(function(e) {
		e.stopPropagation();
		e.preventDefault();
		form.attr('action', 'insertSellInfo');
		form.submit();
	})
	$('.btn--preview').click(function(e) {
		e.stopPropagation();
		e.preventDefault();
		form.attr('action', 'insertOtherSellInfo');
		form.submit();
	})
</script>
<!--<![endif]-->
</body>
</html>