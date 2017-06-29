package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FirstservletprgmServlet extends HttpServlet {
@Override

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		String fname=req.getParameter("vara");
		String number=req.getParameter("varb");
		PrintWriter o=resp.getWriter();
		o.println("hello "+fname);
		o.print("<center><h1>your contact no is"+number+"</center></h1>");
		o.println("");
	//	o.close();
	}
}
