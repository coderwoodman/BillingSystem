    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ page import="java.util.*"%>
    <%@ page import ="java.sql.*" %>
    <%@ page import="com.mysql.jdbc.Driver" %>
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
        <h1>项目列表</h1>
        <div class="row">
            <button type="button" class="btn btn-primary"  data-toggle="button"> 添加</button>
        </div>
        <div class="row">
            <div class="span1">编号</div>
            <div class="span5">名称</div>
            <div class="span6">操作</div>
        </div>
		<%
  Connection conn = null;
  //加载数据库驱动类
   Class.forName("com.mysql.jdbc.Driver").newInstance();
   //数据库连接URL
   String url="jdbc:mysql://114.215.154.9:3306/billing";
   //数据库用户名和密码
   String user="root";
   String  password="topgroup";
   //根据数据库参数取得一个数据库连接值
   conn =  DriverManager.getConnection(url,user,password);    
   Statement statement = conn.createStatement(); 
   String sql="SELECT * FROM iteminfo"; 
   ResultSet rs = statement.executeQuery(sql); 
   //获得数据结果集合 
   ResultSetMetaData rmeta = rs.getMetaData(); 
   while(rs.next()) { 
	   out.print("<div class='row'>"); 
	   out.print("<div class='span1'>"+rs.getString(1)+"</div>"); 
	   out.print("<div class='span5'>"+rs.getString(2)+"</div>"); 
	   out.print("<div class='span6'>"+rs.getString(5)+"</div>"); 
	   out.print(" </div>"); 
	   } 
   rs.close(); 
   statement.close(); 
   conn.close(); 
   
   %>
    </div>
    <script src="js/jquery-2.1.3.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>

