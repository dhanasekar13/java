package src;
import java.util.HashMap;
import java.util.HashSet;


public class Number {

	private HashMap<String, HashSet<String>> number = new HashMap<String, HashSet<String>>();

	public HashMap<String, HashSet<String>> getNumbers() {
		return number;
	}

	public void setNumber(String group, String num) {
		HashSet<String> hs = number.get(group);
		if (hs == null) {
			hs = new HashSet<String>();
			hs.add(num);
		} else {
			hs.add(num);
		}
		number.put(group, hs);
	}

}
