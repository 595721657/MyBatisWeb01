<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>展示所有数据</title>
<!-- 引入bootstrap的资源信息 -->
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/static/css/bootstrap.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.js"></script>
</head>
<body>
<h2 style="text-align: center;">角色展示</h2>
<div class="container">
<table class="table table-hover table-striped">
   <tr>
     <th>角色编号</th>
     <th>角色编码</th>
     <th>角色名称</th>
     <th>创建者</th>
     <th>创建时间</th>
     <th>更新者</th>
     <th>更新时间</th>
     <th>操作</th>
   </tr>
   <c:forEach items="${role }" var="r">
      <tr>
        <td>${r.id}</td>
        <td>${r.roleCode}</td>
        <td>${r.roleName}</td>
        <td>${r.createdBy }</td>
        <td><fmt:formatDate value="${r.creationDate}" pattern="YYYY-MM-dd HH:mm:ss"/></td>
        <td>${r.modifyBy}</td>
        <td><fmt:formatDate value="${r.modifyDate}" pattern="YYYY-MM-dd HH:mm:ss"/></td>
        <td>*</td>
      </tr>
   </c:forEach>
</table>
</div>
</body>
</html>