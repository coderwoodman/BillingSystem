    <%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
  <head>
    <title>列表页面</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">	
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
  </head>
  <body>
    <div class="container">
        <h1>项目列表${iteminfo1.itemID}</h1>    
        
        <div class="row">
            <button type="button" class="btn btn-primary"  data-toggle="button"> 添加</button>
        </div>
        <div class="row">
            <div class="span1">编号</div>
            <div class="span5">名称</div>
            <div class="span6">操作</div>
        </div>
               
        <c:forEach var="iteminfo" items="${iteminfos}">
        	<div class="row">
	            <div class="span1">${iteminfo}</div>
	            <div class="span5">${iteminfo}</div>
	            <div class="span6">操作</div>
        	</div>
        	<br/>
        </c:forEach>

    </div>
    <script src="js/jquery-2.1.3.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>

