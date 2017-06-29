package com.ds;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class MynewServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html");
		
		String firstn=req.getParameter("var3");
		String lastn=req.getParameter("var4");
		String mailid=req.getParameter("var5");
		String password=req.getParameter("var6");
		if(firstn.isEmpty()||lastn.isEmpty()||mailid.isEmpty()||password.isEmpty())
		{
		
			RequestDispatcher r1=req.getRequestDispatcher("my1.html");
			r1.forward(req,resp);
		
		}
		else
		{
			//here property provide property name
		
		}
	}

}
