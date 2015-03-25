<%

String name = request.getParameter("name");
String pwd = request.getParameter("password"); 

out.print("name:" + name + ",password:" + pwd); //在浏览器上显示输入地址中的用户名与密码

%> 