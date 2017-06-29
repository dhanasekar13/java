package com.ds;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;


@SuppressWarnings("serial")
public class BatchentitydbServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		DatastoreService ds=DatastoreServiceFactory.getDatastoreService();
		//THIS IS FOR KEY
				Key k1=KeyFactory.createKey("dhana1",53);
		Entity e1=new Entity("dhana1",01);
		Entity e2=new Entity("dhana2",01);
	//	Entity e3=new Entity("dhana3",01);
	//	Scanner s=new Scanner(System.in);
	//	ArrayList<Entity> le1=(ArrayList<Entity>) Arrays.asList(e1,e2,e3);
		PrintWriter o=resp.getWriter();
		
		String var1=req.getParameter("va1");
		String var2=req.getParameter("va2");
		String var3=req.getParameter("va3");
		String var4=req.getParameter("va4");
		e1.setProperty(var1,var2);
		e1.setProperty(var3,var4);
		List<Entity> le1=Arrays.asList(e1,e2);
		ds.put(le1);
		resp.setContentType("text/plain");
for(int i=0;i<le1.size();i++)
		o.println("the "+i+ "value contain " +le1.indexOf(i));
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		//THIS IS FOR KEY
		Key k1=KeyFactory.createKey("dhana1",53);
		
	}
	
}
