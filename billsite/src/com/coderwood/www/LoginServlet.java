package com.coderwood.www;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoginServlet extends HttpServlet{
	
	public void init(ServletConfig config)throws ServletException{
		super.init(config);
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		String username=request.getParameter("username");
        String password=request.getParameter("password");
		PrintWriter  out=response.getWriter();
		
		if(username.equals("coderwood")){
			response.sendRedirect("itemlist.jsp");
		}
		else{
			response.sendRedirect("index.jsp");
		}
			
		out.println(username+" "+password);
		out.close();
	}
	
	public String getServletInfo(){
		return "coderwood";
	}
	
	public void destroy()
	{
	}
}