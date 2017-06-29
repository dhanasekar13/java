package task1withmap;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class createnew {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	static HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>> map = new HashMap<>();
	static HashMap<String, HashMap<String, HashMap<String, String>>> m1 = new HashMap<>();
	static HashSet<String> se=new HashSet<String>();
	// key, value
	// Hash<string1, HashMap<string,HashMap<string,string>>> ?

	// <?>
	static HashMap<String, HashMap<String, String>> m2 = new HashMap<>();
	static HashMap<String, String> m3 = new HashMap<>();
	static HashMap t1 = new HashMap();
	void a() {
		System.out.println(map);
	}

	String na, sc, ma, fb, ph;
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
		Set s11;
		Iterator it1 = s.iterator();
		while (it1.hasNext()) {
			Map.Entry m11 = (Map.Entry) it1.next();
			if (m11.getKey().equals(a)) {
				
				for(Map.Entry<String, HashMap<String, HashMap<String, HashMap<String, String>>>>  s123:map.entrySet())
				{
				//	map.put(s123, new HashMap<String, HashMap<String, HashMap<String, String>>>());
				}
					
/*
				for (Map.Entry<String, HashMap<String, HashMap<String, HashMap<String, String>>>> m2o : map
						.entrySet()) {
					System.out.println(
							"what do you want to change \n 1.name \n 2.second contact no \n 3.mail id \n 4.facebook id");
					String qq = su.readLine();
					if (qq.equals("1")) {
						System.out.println("Enter the new name");
						String qq1 = su.readLine();
						Object o1 = m2o.getKey();
						m1.put(qq1, m2);
					

					}
					if (qq.equals("2")) {
						System.out.println("Enter the new second no");
						String qq1 = su.readLine();
						Object o1 = m2o.getKey();
						m2.put(qq1, m3);

					}
					if (qq.equals("3")) {
						System.out.println("Enter the new mail id");
						String qq1 = su.readLine();

						Object o1 = m2o.getKey();
						m3.put(qq1, fb);

					}
					if (qq.equals("4")) {
						System.out.println("Enter the new facebook id");
						String qq1 = su.readLine();
						Object o1 = m2o.getKey();
						m3.put(ma, qq1);
					}*/
				}

				// name
				// second contact no
				// mail id
				// facebook id

				/*
				 * m3.put(ma, fb); // two string m2.put(sc, m3);// two strings
				 * 
				 * m1.put(na, m2);// one string and one map<string,string>
				 * map.put(ph, m1);
				 */

			}
		}
	
	void new1() throws IOException {
		System.out.println("Enter the phone number");
		ph = bf.readLine();
		System.out.println("Enter the name");
		na = bf.readLine();
		System.out.println("Enter second contact no");
		sc = bf.readLine();
		System.out.println("" + "Enter the mail id");
		ma = bf.readLine();
		System.out.println("Enter the facebook id");
		fb = bf.readLine();
		///by this method when we keep on updated values are added to first ended value since i made a Nested hashmap so keep on adding in the list  
		/*Map<Float, Map<Float, Integer>> map = new HashMap<>();

map.put(.0F, new HashMap(){{put(.0F,0);}});
map.put(.1F, new HashMap(){{put(.1F,1);}});

map.get(.0F).get(.0F);*/
		m3.put(ma, fb); // two string
		m2.put(sc, m3);// two strings

		m1.put(na, m2);// one string and one map<string,string>
		map.put(ph, m1);// one string and one map<string,string>
		// for string,string map abcc1
		FileOutputStream f1 = new FileOutputStream("C:/Users/User/Desktop/New folder (2)/s1/abcc1.txt");
		ObjectOutputStream o1 = new ObjectOutputStream(f1);
		o1.writeObject(m3);
		o1.close();
		f1.close();
		// for string,hashmap(String,string) abcc2
		FileOutputStream f11 = new FileOutputStream("C:/Users/User/Desktop/New folder (2)/s1/abcc2.txt");
		ObjectOutputStream o11 = new ObjectOutputStream(f11);
		o11.writeObject(m2);
		o11.close();
		f11.close();
		// loop2:string,hashmap(string,hashmap<string,string> abcc3
		FileOutputStream f2 = new FileOutputStream("C:/Users/User/Desktop/New folder (2)/s1/abcc3.txt");
		ObjectOutputStream o2 = new ObjectOutputStream(f2);
		o2.writeObject(m1);
		o2.close();
		f2.close();
		// string,loop2 abcc4
		FileOutputStream f3 = new FileOutputStream("C:/Users/User/Desktop/New folder (2)/s1/abcc4.txt");
		ObjectOutputStream o3 = new ObjectOutputStream(f3);
		o3.writeObject(map);
		o3.close();
		f3.close();
	}

	void c23() throws IOException, ClassNotFoundException {
		FileInputStream f11 = new FileInputStream("C:/Users/User/Desktop/New folder (2)/s1/abcc1.txt");
		ObjectInputStream yui = new ObjectInputStream(f11);
		m3 = (HashMap<String, String>) yui.readObject();
		yui.close();
		f11.close();
		FileInputStream f111 = new FileInputStream("C:/Users/User/Desktop/New folder (2)/s1/abcc2.txt");
		ObjectInputStream yui1 = new ObjectInputStream(f111);
		m2 = (HashMap<String, HashMap<String, String>>) yui1.readObject();
		yui.close();
		f11.close();
		FileInputStream f1111 = new FileInputStream("C:/Users/User/Desktop/New folder (2)/s1/abcc3.txt");
		ObjectInputStream yui11 = new ObjectInputStream(f1111);
		m1 = (HashMap<String, HashMap<String, HashMap<String, String>>>) yui11.readObject();
		yui.close();
		f11.close();
		FileInputStream f11o1 = new FileInputStream("C:/Users/User/Desktop/New folder (2)/s1/abcc4.txt");
		ObjectInputStream yuio1 = new ObjectInputStream(f11o1);
		map = (HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>) yuio1.readObject();
		yui.close();
		f11.close();

	}
}
