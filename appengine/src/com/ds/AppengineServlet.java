package com.ds;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@SuppressWarnings("serial")
public class AppengineServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
	//creating an entity without identifer
		DatastoreService data1=DatastoreServiceFactory.getDatastoreService();
		Entity e=new Entity("ds");
		//by this way we make the entity as depulicated allowed entity
		//as long as every time reloaded the page it will update in the app engine database
		//every time value has been changed the entity it will be recorded.
		e.setProperty("dhanasekar", 100);
		e.setProperty("sekar", 101);
		data1.put(e);
		//so inorder to resist duplicate we have to use identifier
		//by this we track only the changed value in the entity
		Entity e1=new Entity("ds111",10001);//second parameter is kown as identifier
		e1.setProperty("user id",011);
		e1.setProperty("user name","dhanasekar1");
		e1.setProperty("user address","anna nagar1");
		data1.put(e1);
		
		//this will show only if it value of the entity is changed only
		//below is an batch entity if you want to store more value in set property uses batch
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
