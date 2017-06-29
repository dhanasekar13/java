package com.ds;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		String firstN = req.getParameter("var1");
		String lastN = req.getParameter("var2");
		String contact = req.getParameter("var3");
		String address = req.getParameter("var4");
		String mailid = req.getParameter("var5");
		ArrayList<String> a1 = new ArrayList<>();
		ArrayList<String> a2 = new ArrayList<>();
		ArrayList<String> a3 = new ArrayList<>();
		ArrayList<String> a4 = new ArrayList<>();
		ArrayList<String> a5 = new ArrayList<>();
		PrintWriter o = resp.getWriter();
		a1.add(firstN);
		a2.add(lastN);
		a3.add(contact);
		a4.add(address);
		a5.add(mailid);
		if (firstN.isEmpty()) {
			o.println("<br><br><h1>sorry not registered</h1");
			o.println("<br><br><h1>since you not gievn your name</h1");
		}
		if (lastN.isEmpty()) {
			o.println("<br><br><h1>sorry not registered</h1");
			o.println("<br><br><h1>since you not gievn your name</h1");
		}
		if (contact.isEmpty()) {
			o.println("<br><br><h1>sorry not registered</h1");
			o.println("<br><br><h1>since you not gievn your name</h1");
		}
		if (address.isEmpty()) {
			o.println("<br><br><h1>sorry not registered</h1");
			o.println("<br><br><h1>since you not gievn your name</h1");
		}
		if(mailid.isEmpty())
		{
		o.println("<br><br><h1>sorry not registered</h1");
		o.println("<br><br><h1>since you not gievn your name</h1");
	}
		else
		{
			
			o.println("<h1>REGISTERED SUCCESSFULLY</h1>");
		}
		o.close();
	}
}
