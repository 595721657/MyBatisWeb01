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
<h2 style="text-align: center;">收货人地址展示</h2>
<div class="container">
<table class="table table-hover table-striped">
   <tr>
     <th>地址编号</th>
     <th>联系人地址</th>
     <th>收货人地址明细</th>
     <th>邮编</th>
     <th>联系人电话</th>
     <th>创建者</th>
     <th>创建时间</th>
     <th>更新者</th>
     <th>更新时间</th>
     <th>用户ID</th>
     <th>操作</th>
   </tr>
   <c:forEach items="${address }" var="a">
      <tr>
        <td>${a.id}</td>
        <td>${a.contact}</td>
        <td>${a.addressDesc}</td>
        <td>${a.postCode}</td>
        <td>${a.tel }</td>
        <td>${a.createdBy}</td>
        <td><fmt:formatDate value="${a.creationDate}" pattern="YYYY-MM-dd HH:mm:ss"/></td>
        <td>${a.modifyBy}</td>
        <td><fmt:formatDate value="${a.modifyDate}" pattern="YYYY-MM-dd HH:mm:ss"/></td>
        <td>${a.userId }</td>
        <td>*</td>
      </tr>
   </c:forEach>
</table>
</div>
</body>
</html>