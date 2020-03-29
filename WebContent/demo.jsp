<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSMS数据库汇总</title>
<style type="text/css">
  *{
  margin: 0px auto;
  padding: 0;
  list-style-type: none;
  text-decoration: none;
  color: black;
  }
 .first{
    width: 200px;
    height: 100px;
 }
 .first li{
   border: 1px solid red; 
   text-align: center;  
   }
   .first li:hover{
   background-color: red;
   }
   .first a:hover{color: white;}
   h2{text-align: center;margin: 20px 0 20px 0;}
</style>
</head>
<body>
<h2>SSMS数据库表列表</h2>
<ul class="first">
  <li><a href="User?op=show">1.用户表</a></li>
  <li><a href="Provider?op=show">2.供应商表</a></li>
  <li><a href="Address?op=show">3.地址表</a></li>
  <li><a href="Bill?op=show">4.账单表</a></li>
  <li><a href="Role?op=show">5.角色表</a></li>
</ul>
</body>
</html>