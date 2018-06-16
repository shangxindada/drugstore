<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
  <title>上心医药 - 药品类别</title>
  <%@include file="common/head.jsp" %>
</head>
<body>
<%@include file="common/top.jsp" %>
<div class="am-cf admin-main">
  <%@include file="common/sidebar.jsp" %>
  
  <!-- content start -->
  <div class="admin-content">

    <div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">基本信息</strong> / <small>药品类别信息</small></div>
    </div>

	<div class="am-g">
      <div class="am-u-md-6 am-cf">
        <div class="am-btn-group am-btn-group-xs">
          <a href="drugTypeForm?id=" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新增</a>
        </div>
      </div>
    </div>

	<div class="am-g">
      <div class="am-u-sm-12">
        <form class="am-form">
          <table class="am-table am-table-striped am-table-hover table-main">
            <thead>
              <tr>
                <th class="table-title">编号</th><th class="table-type">类别</th><th class="table-set">操作</th>
              </tr>
          	</thead>
          <tbody>
            <c:forEach items="${drugType.list}" var="list">
            	<tr>
              <td>${list.typeId}</td>
              <td>${list.type}</td>
              <td>
                <div class="am-btn-toolbar">
                  <div class="am-btn-group am-btn-group-xs">
                    <a href="drugTypeForm?id=${list.typeId}&flag=" class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span> 编辑</a>
                    <a href="drugTypeForm?id=${list.typeId}&flag=d" class="am-btn am-btn-default am-btn-xs am-text-danger"><span class="am-icon-trash-o"></span> 删除</a>
                  </div>
                </div>
              </td>
            </tr>
            </c:forEach>
          </tbody>
        </table>
        	<ul class="am-pagination">
					  <li  class="${ drugType.pageNum == 1 ? 'am-disabled' : ''}"><a href="selectAllDrugType?pageNum=${drugType.pageNum -1}">&laquo;</a></li>
					  <c:forEach begin="1" end="${drugType.pages}" var="page">
					  <li class="${ drugType.pageNum == page ? 'am-active' : ''}"><a href="selectAllDrugType?pageNum=${page}">${page}</a></li>
						</c:forEach>
					  <li class="${ drugType.pageNum == drugType.pages ? 'am-disabled' : ''}"><a href="selectAllDrugType?pageNum=${drugType.pageNum + 1}">&raquo;</a></li>
					</ul>
          <hr />
          <p>注：这里是对药品信息的维护！</p>
        </form>
      </div>
    </div>
  </div>
  <!-- content end -->
  </div>
  <script type="text/javascript">
	/*function login(){
		var DrugType = new Object();
		$.ajax({
			url:"selectAllDrugType",
			type:"get",
			success:function(data){
				DrugType = data;
			}
		});
		
	}
	login();
	*/
	
</script>
</html>