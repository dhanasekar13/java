package task1withmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class createnew {
	void a() {
		System.out.println(map);
	}

	BufferedReader su = new BufferedReader(new InputStreamReader(System.in));

	void b(String a) {
		Set s = map.entrySet();
		Iterator it1 = s.iterator();
		while (it1.hasNext()) {
			Map.Entry m1 = (Map.Entry) it1.next();
			if (m1.getKey().equals(a)) {
				System.out.println(m1);
			}

		}
	}

	void v(String a) throws IOException {
		Set s = map.entrySet();
		Iterator it1 = s.iterator();
		while (it1.hasNext()) {
			Map.Entry m1 = (Map.Entry) it1.next();
			if (m1.getKey().equals(a)) {
				m1.getValue();
				System.out.println("Do you want to change the name");
				String ai = su.readLine();
				if (ai == "yes") {
System.out.println("enter the name");
String h=su.readLine();
					m1.setValue(h);
				}
				else
				{
					
				}
			}

		}

	}

	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	static HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>> map = new HashMap<>();
	HashMap<String, HashMap<String, HashMap<String, String>>> m1 = new HashMap<>();
	// key, value
	// Hash<string1, HashMap<string,HashMap<string,string>>> ? 
	
	// <?>
	HashMap<String, HashMap<String, String>> m2 = new HashMap<>();
	HashMap<String, String> m3 = new HashMap<>();
	HashMap t1 = new HashMap();
	
	
	
	

	void new1() throws IOException {
		System.out.println("Enter the phone number");
		String ph = bf.readLine();
		System.out.println("Enter the name");
		String na = bf.readLine();
		System.out.println("Enter second contact no");
		String sc = bf.readLine();
		System.out.println("" + "Enter the mail id");
		String ma = bf.readLine();
		System.out.println("Enter the facebook id");
		String fb = bf.readLine();
		m3.put(ma, fb); // two string
		m2.put(sc, m3);// two strings

		m1.put(na, m2);// one string and one map<string,string>
		map.put(ph, m1);// one string and one map<string,string>

	}
}
