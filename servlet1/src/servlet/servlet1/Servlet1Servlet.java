package servlet.servlet1;

import java.io.IOException;
import javax.servlet.http.*;
import java.io.*;
@SuppressWarnings("serial")
public class Servlet1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		//resp.getWriter().println("Hello, world");
	PrintWriter ou=resp.getWriter();
	ou.println("Hello India");
	try
	{
		String user=req.getParameter("user");
		ou.println("<h3> hello "+user+"</h3>");
	}
	finally
	{
		ou.close();
	}
	}
}
