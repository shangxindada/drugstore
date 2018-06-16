<%@page import="com.shangxin.bean.User"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	User user = (User)request.getSession().getAttribute("currentUser");
	String UserId = user.getUserId();
	if(null == user)
		response.sendRedirect("login.html");	
	int userLe = user.getUserLe();
  	String str = userLe==1 ? "" : "admin-hidden";	
%>
<header class="am-topbar admin-header">
  <div class="am-topbar-brand">
    <strong>上心医药</strong> <small>药店管理系统</small>
  </div>

  <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only" data-am-collapse="{target: '#topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span></button>

  <div class="am-collapse am-topbar-collapse" id="topbar-collapse">

    <ul class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list">
      <li class="am-dropdown" data-am-dropdown>
        <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
          <span class="am-icon-users "></span><%=UserId %><span class="am-icon-caret-down"></span>
          
        </a>
        <ul class="am-dropdown-content">
          <li><a href="selectUserInfo"><span class="am-icon-user"></span> 资料</a></li>
          <li><a href="login.jsp"><span class="am-icon-power-off"></span> 切换用户</a></li>
        </ul>
      </li>
      
    </ul>
  </div>
</header>