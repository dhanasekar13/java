package s1;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class P1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("\t\t\t\tDhanasekar you can do it ");
		try 
		{
			System.out.println(33/3);
			
		}
		finally
		{
			System.out.println("finall");
		}

	}
}
