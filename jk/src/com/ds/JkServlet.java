package com.ds;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class JkServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		resp.getWriter().println("Hi mohan raj");
	}
}
