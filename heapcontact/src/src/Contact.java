package src;
import java.util.HashMap;
import java.util.HashSet;

public class Contact {

	private  HashMap<String, HashSet<HashMap<String, HashSet<String>>>> contact=new HashMap<String, HashSet<HashMap<String, HashSet<String>>>>();
	public void newContact(String newUser, HashMap<String, HashSet<String>> entity)
	{
	   HashSet<HashMap<String, HashSet<String>>> newContact=contact.get(newUser);
	   if(newContact==null)
	   {
		   newContact=new HashSet<HashMap<String, HashSet<String>>>();
		   newContact.add(entity);
		   contact.put(newUser, newContact);
	   }
	   else
	   newContact.add(entity);
	  // newContact.c
	}
	public HashMap<String, HashSet<HashMap<String, HashSet<String>>>> getEnitreContact()
	{
		return contact;
	}
}

