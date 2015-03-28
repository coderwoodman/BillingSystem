package com.coderwood.www;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MyServlet extends HttpServlet{
	
	public void init(ServletConfig config)throws ServletException{
		super.init(config);
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		try{
//			String resource="mybatis-config.xml";
//			InputStream inputStream=Resources.getResourceAsStream(resource);
//			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			
			PrintWriter  out=response.getWriter();
			out.println("ok");
			out.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}		
	}
	
	public void destroy()
	{
	}
}