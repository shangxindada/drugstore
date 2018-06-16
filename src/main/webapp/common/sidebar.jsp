<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.shangxin.bean.User"%>
<!-- sidebar start -->
<%
	User user1 = (User)request.getSession().getAttribute("currentUser");
	int userLe1 = user1.getUserLe();
  	String str1 = userLe1==1 ? "" : "admin-hidden";	
%>
<div class="admin-sidebar">
  <ul class="am-list admin-sidebar-list">
    <li><a href="index.jsp"><span class="am-icon-home"></span> 首页</a></li>
    <li class="admin-parent">
      <a class="am-cf" data-am-collapse="{target: '#collapse-nav1'}"><span class="am-icon-file"></span> 基本信息 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
      <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav1">
        <li><a href="selectAllDrugType?pageNum=1" class="am-cf"><span class="am-icon-check"></span> 药品类别<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
        <li><a href="selectDrugInfoAll?pageNum=1"><span class="am-icon-puzzle-piece"></span> 药品信息</a></li>
        <li><a href="selectCustomerInfo?pageNum=1"><span class="am-icon-th"></span> 顾客信息</a></li>
        <li><a href="selectSupplierInfo?pageNum=1"><span class="am-icon-calendar"></span> 供应商信息</a></li>
      </ul>
    </li>
    <li class="admin-parent">
    	<a class="am-cf" data-am-collapse="{target: '#collapse-nav2'}"><span class="am-icon-file"></span> 药品入库 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
      <ul class="am-list am-collapsing admin-sidebar-sub am-in" id="collapse-nav2">
        <li><a href="purchaseForm" class="am-cf"><span class="am-icon-check"></span> 药品入库<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
        <li><a href="purchaseInfo?pageNum=1"><span class="am-icon-puzzle-piece"></span> 入库信息</a></li>
      </ul>
    </li>
    <li class="admin-parent">
    	<a class="am-cf" data-am-collapse="{target: '#collapse-nav3'}"><span class="am-icon-file"></span> 药品销售 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
      <ul class="am-list am-collapsing admin-sidebar-sub am-in" id="collapse-nav3">
        <li><a href="sellForm" class="am-cf"><span class="am-icon-check"></span> 销售<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
        <li><a href="selectOtherSellInfo?pageNum=1"><span class="am-icon-puzzle-piece"></span> 销售信息</a></li>
      </ul>
    </li>
    <li class="admin-parent <%=str1 %>" >
    	<a class="am-cf" data-am-collapse="{target: '#collapse-nav4'}"><span class="am-icon-sign-out "></span> 库存统计<span class="am-icon-angle-right am-fr am-margin-right"></span></a>
    	<ul class="am-list am-collapsing admin-sidebar-sub am-in" id="collapse-nav4">
        <li><a href="form" class="am-cf"><span class="am-icon-check"></span> 打印报表<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
        <li><a href="selectAllExpired?num=1"><span class="am-icon-puzzle-piece"></span> 报损信息</a></li>
      </ul>
    </li>
    <li class="admin-parent <%=str1 %>" >
    	<a class="am-cf" data-am-collapse="{target: '#collapse-nav5'}"><span class="am-icon-sign-out "></span> 用户管理<span class="am-icon-angle-right am-fr am-margin-right"></span></a>
    	<ul class="am-list am-collapsing admin-sidebar-sub am-in" id="collapse-nav5">
        <li ><a href="selectAllUser" class="am-cf"><span class="am-icon-check "></span> 用户信息管理<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
        <li ><a href="selectAllProof" ><span class="am-icon-puzzle-piece"></span> 注册码管理</a></li>
      </ul>
    </li>
  </ul>

  <div class="am-panel am-panel-default admin-sidebar-panel">
    <div class="am-panel-bd">
      <p><span class="am-icon-bookmark"></span> 公告</p>
      <p>时光静好，与君语；细水流年，与君同。</p>
    </div>
  </div>
</div>
<!-- sidebar end -->
