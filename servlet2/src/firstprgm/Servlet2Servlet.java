package firstprgm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Servlet2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		//resp.getWriter().println(");
        try
        {
        	String user=req.getParameter("user");
        	PrintWriter out=resp.getWriter();
        	out.println("<h2> welcome "+user+"</h2>");
        	out.println("<form method=post action=check> Name <input type=text name=user> <input type=submit value=submit>");
        	
        	
        	
        }
        finally
        {
        	
        }
	
	}
}
