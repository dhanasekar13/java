package servlet.src;

import java.io.IOException;
import javax.servlet.http.*;
import java.io.*;
@SuppressWarnings("serial")
public class FirstservletServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, worjhj");
	PrintWriter o=resp.getWriter();
	o.println("\t\t\tdhanasekar");
	}
}
