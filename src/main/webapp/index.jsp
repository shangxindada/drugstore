<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
  <title>上心药店系统 - 首页</title>
  <%@include file="common/head.jsp" %>
</head>
<body>
<%@include file="common/top.jsp" %>
<div class="am-cf admin-main">
  <%@include file="common/sidebar.jsp" %>
  <!-- content start -->
  <div class="admin-content">

    <div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">首页</strong> / <small>每日KPI</small></div>
    </div>

    <ul class="am-avg-sm-1 am-avg-md-4 am-margin am-padding am-text-center admin-content-list ">
      <li><a href="selectDrugInfoAll?pageNum=1" class="am-text-success"><span class="am-icon-btn am-icon-file-text"></span><br/>药品信息<br/>${newUser.cnt}</a></li>
      <li><a href="purchaseForm" class="am-text-warning"><span class="am-icon-btn am-icon-briefcase"></span><br/>入库<br/>${sellOrder.cnt}</a></li>
      <li><a href="sellForm" class="am-text-danger"><span class="am-icon-btn am-icon-recycle"></span><br/>销售<br/>${custBack.cnt}</a></li>
      <li><a href="selectCustomerInfo?pageNum=1" class="am-text-secondary"><span class="am-icon-btn am-icon-user-md"></span><br/>顾客信息<br/>${pvdBack.cnt}</a></li>
    </ul>

    <div class="am-g">
      <div class="am-u-md-6">
        <div class="am-panel am-panel-default">
          <div class="am-panel-hd am-cf" data-am-collapse="{target: '#collapse-panel-1'}">商品类别销量排行<span class="am-icon-chevron-down am-fr" ></span></div>
          <div class="am-panel-bd am-collapse am-in" id="collapse-panel-1">
          	<div id="main1" class="am-list" style="width: 600px;height:400px;"></div>
          </div>
        </div>
      </div>

      <div class="am-u-md-6">
        <div class="am-panel am-panel-default">
          <div class="am-panel-hd am-cf" data-am-collapse="{target: '#collapse-panel-2'}">商品库存量排行 <span class="am-icon-chevron-down am-fr" ></span></div>
          <div class="am-panel-bd am-collapse am-in" id="collapse-panel-2">
          	<div id="main2" class="am-list" style="width: 600px;height:400px;"></div>
          </div>
        </div>

      </div>
    </div>
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