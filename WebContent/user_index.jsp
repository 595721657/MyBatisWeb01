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
<h2 style="text-align: center;">用户展示</h2>
<div class="container">
<table class="table table-hover table-striped">
   <tr>
     <th>用户编号</th>
     <th>用户编码</th>
     <th>用户名称</th>
     <th>用户密码</th>
     <th>性别</th>
     <th>出生日期</th>
     <th>手机</th>
     <th>地址</th>
     <th>用户角色</th>
     <th>创建者</th>
     <th>创建时间</th>
     <th>更新者</th>
     <th>更新时间</th>
     <th>操作</th>
   </tr>
   <c:forEach items="${user }" var="u">
      <tr>
        <td>${u.id}</td>
        <td>${u.userCode}</td>
        <td>${u.userName}</td>
        <td>${u.userPassword}</td>
        <td>
          <c:if test="${u.gender==1 }" var="isOK">
                     男
          </c:if>
          <c:if test="${!isOK }">
                    女
          </c:if>
        </td>
        <td><fmt:formatDate value="${u.birthday }" pattern="YYYY-MM-dd HH:mm:ss"/></td>
        <td>${u.phone}</td>
        <td>${u.address}</td>
        <td>${u.userRole}</td>
        <td>${u.createdBy}</td>
        <td><fmt:formatDate value="${u.creationDate}" pattern="YYYY-MM-dd HH:mm:ss"/></td>
        <td>${u.modifyBy}</td>
        <td><fmt:formatDate value="${u.modifyDate}" pattern="YYYY-MM-dd HH:mm:ss"/></td>
        <td>*</td>
      </tr>
   </c:forEach>
</table>
</div>
</body>
</html>