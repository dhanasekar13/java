package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LoginformServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter o=resp.getWriter();
		String var1=req.getParameter("log1");
		String var2=req.getParameter("pass");
		
		Cookie ck=new Cookie(,var1);  
		Cookie ck1=new Cookie("password",var2);  
		resp.addCookie(ck);
		resp.addCookie(ck1);
		int n=0;
		if(var2.isEmpty())
		{
			o.println("fill the password"+n);
		}
		else
		{n=8;
			o.print("logined in successfully");
		}
	}
}
