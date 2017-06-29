package com.ds;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

//import com.google.appengine.repackaged.com.google.api.client.util.store.DataStore;

@SuppressWarnings("serial")
public class MyProjectServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter o=resp.getWriter();
		resp.setContentType("text/html");
		String login=req.getParameter("var1");
		String paswrd=req.getParameter("var2");

//o.println(gt1);
//		o.println(gt2);

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
