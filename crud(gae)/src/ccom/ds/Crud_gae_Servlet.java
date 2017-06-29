package ccom.ds;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.KeyFactory.Builder;

@SuppressWarnings("serial")
public class Crud_gae_Servlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");

		String var1=req.getParameter("var1");
		String var2=req.getParameter("var2");
		String var3=req.getParameter("var3");
		String var4=req.getParameter("var4");
		DatastoreService dhana1=DatastoreServiceFactory.getDatastoreService();
		//THIS IS FOR KEY
				Key key=KeyFactory.createKey("d100",53);
				Key key1=KeyFactory.createKey("d100",54);
				int i=0;
		Entity e1=new Entity("d100",90);
		
		//Entity e2=new Entity("d101",i);
		//Entity e3=new Entity("d102",i);
		//Entity e4=new Entity("d103",i);
		e1.setProperty("first block",var1);
		e1.setProperty("second block",var2);
		e1.setProperty("third block",var3);
		e1.setProperty("fourth block",var4);
		dhana1.put(e1);//
		//this will add the entity in the database
		//
		//
		//if you want to update the entity then 
		
		e1.setProperty("first block","dhanasekar");
		e1.setProperty("second block","you");
		e1.setProperty("third block","are");
		e1.setProperty("fourth block","updating the value");
		dhana1.put(e1);//
		Key k1=KeyFactory.createKey("d100",9 );
		System.out.println("the key value is "+k1);
		Key k2=new KeyFactory.Builder("d101","dhnas").addChild("d101", "dhanasekar").getKey();
		System.out.println(k2);
		//List<Entity> le1=Arrays.asList(e1,e2,e3,e4);
		//dhana1.put(le1);
	}
}
