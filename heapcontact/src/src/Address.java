package src;
import java.util.HashMap;
import java.util.HashSet;


public class Address {

	private HashMap<String, HashSet<String>> address = new HashMap<String, HashSet<String>>();

	public HashMap<String, HashSet<String>> getAddress() {
		return address;
	}

	public void setAddress(String group, String add) {
		HashSet<String> hs = address.get(group);
		if (hs == null) {
			hs = new HashSet<String>();
			hs.add(add);
		} else {
			hs.add(add);
		}

		address.put(group, hs);
		
	}
}
