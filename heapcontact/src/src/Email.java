package src;
import java.util.HashMap;
import java.util.HashSet;


public class Email {

	private HashMap<String, HashSet<String>> email = new HashMap<String, HashSet<String>>();

	public HashMap<String, HashSet<String>> getEmails() {
		return email;
	}

	public void setEmail(String group, String id) {
		HashSet<String> hs = email.get(group);
		if (hs == null) {
			hs = new HashSet<String>();
			hs.add(id);
		} else {
			hs.add(id);
		}
		email.put(group, hs);
	}
}
