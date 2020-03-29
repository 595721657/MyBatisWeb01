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
<h2 style="text-align: center;">账单展示</h2>
<div class="container">
<table class="table table-hover table-striped">
   <tr>
     <th>账单编号</th>
     <th>账单编码</th>
     <th>商品名称</th>
     <th>商品描述</th>
     <th>商品单位</th>
     <th>商品数量</th>
     <th>商品总额</th>
     <th>是否支付</th>
     <th>创建者</th>
     <th>创建时间</th>
     <th>更新者</th>
     <th>更新时间</th>
     <th>供应商ID</th>
     <th>操作</th>
   </tr>
   <c:forEach items="${bill }" var="b">
      <tr>
        <td>${b.id}</td>
        <td>${b.billCode}</td>
        <td>${b.productName}</td>
        <td>${b.productDesc}</td>
        <td>${b.productUnit }</td>
        <td>${b.productCount}</td>
        <td>${b.totalPrice }</td>
        <td>${b.isPayment }</td>
        <td>${b.createdBy }</td>
        <td><fmt:formatDate value="${b.creationDate}" pattern="YYYY-MM-dd HH:mm:ss"/></td>
        <td>${b.modifyBy}</td>
        <td><fmt:formatDate value="${b.modifyDate}" pattern="YYYY-MM-dd HH:mm:ss"/></td>
        <td>${b.providerId }</td>
        <td>*</td>
      </tr>
   </c:forEach>
</table>
</div>
</body>
</html>