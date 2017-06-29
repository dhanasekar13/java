package com.ds;

import java.io.IOException;
import java.io.PipedWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Form2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PipedWriter pw=null;
		resp.setContentType("text/html");//multile purpose internet mail extension 
		//gives instruction to browser through web server  and servlet container to display received output in certain format
		//says to resp method that you receive any thing from here will be of form of text/html
		  
		resp.getWriter().println("dhanasekar");
	
	}
}
