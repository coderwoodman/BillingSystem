package com.coderwood.www;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServlet extends HttpServlet{
	
	public void init(ServletConfig config)throws ServletException{
		super.init(config);
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		PrintWriter  out=response.getWriter();
		out.println("hello");
		out.close();
	}
	
	public String getServletInfo(){
		return "coderwood";
	}
	
	public void destroy()
	{
	}
}