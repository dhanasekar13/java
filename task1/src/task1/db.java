package task1;//AutoCloseable

import java.beans.Transient;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

//import collection.src.array_list.b;

import java.util.*;

class db1
{
	transient int a=9;//we cant serialize.
	static ArrayList<String> phoneno = new ArrayList<>();
	static ArrayList<String> name = new ArrayList<>();
	static ArrayList<String> Emailname = new ArrayList<>();
	static ArrayList<String> Address = new ArrayList<>();
	static ArrayList<String> dob = new ArrayList<>();

	BufferedReader na = new BufferedReader(new InputStreamReader(System.in));
	db1() throws IOException {
		System.out.println("Enter the Phone number-");
		String mam = na.readLine();
		phoneno.add(mam);

		FileOutputStream f1 = new FileOutputStream("C:/Users/User/Desktop/New folder (2)/s1/abc.txt");
		ObjectOutputStream o1 = new ObjectOutputStream(f1);
		o1.writeObject(phoneno);
		o1.close();
		f1.close();
		// for entering name
		System.out.println("Enter the Name");
		String str1 = na.readLine();
		name.add(str1);
		
		FileOutputStream f11 = new FileOutputStream("C:/Users/User/Desktop/New folder (2)/s1/abc2.txt");
		ObjectOutputStream o11 = new ObjectOutputStream(f11);
		o11.writeObject(name);
		o11.close();
		f11.close();
		// for entering email id
		System.out.println("Enter the Email id--");
		String str = na.readLine();
		Emailname.add(str);
		
		FileOutputStream f2 = new FileOutputStream("C:/Users/User/Desktop/New folder (2)/s1/abc3.txt");
		ObjectOutputStream o2 = new ObjectOutputStream(f2);
		o2.writeObject(Emailname);
		o2.close();
		f2.close();
		// for entering address
		System.out.println("Enter the -Address ");
		String str2 = na.readLine();
		Address.add(str2);
		
		FileOutputStream f3 = new FileOutputStream("C:/Users/User/Desktop/New folder (2)/s1/abc4.txt");
		ObjectOutputStream o3 = new ObjectOutputStream(f3);
		o3.writeObject(Address);
		o3.close();
		f3.close();
		// for entering date of birth
		System.out.println("Enter the date of birth-");
		String str3 = na.readLine();
		dob.add(str3);
		
		FileOutputStream f4 = new FileOutputStream("C:/Users/User/Desktop/New folder (2)/s1/abc5.txt");
		ObjectOutputStream o4 = new ObjectOutputStream(f4);
		o4.writeObject(dob);
		o4.close();
		f4.close();
	}

	@SuppressWarnings("unchecked")
	db1(int a, int b) throws IOException, ClassNotFoundException {
		try {
			FileInputStream f11 = new FileInputStream("C:/Users/User/Desktop/New folder (2)/s1/abc.txt");
			ObjectInputStream yui = new ObjectInputStream(f11);
			phoneno = (ArrayList<String>)yui.readObject();
			yui.close();
			f11.close();
			

			FileInputStream f4 = new FileInputStream("C:/Users/User/Desktop/New folder (2)/s1/abc5.txt");
			ObjectInputStream o4 = new ObjectInputStream(f4);
			dob = (ArrayList<String>) o4.readObject();
			o4.close();
			f4.close();
			

			FileInputStream f3 = new FileInputStream("C:/Users/User/Desktop/New folder (2)/s1/abc4.txt");
			ObjectInputStream o3 = new ObjectInputStream(f3);
			Address = (ArrayList<String>) o3.readObject();
			o3.close();
			f3.close();
			
			FileInputStream f2 = new FileInputStream("C:/Users/User/Desktop/New folder (2)/s1/abc3.txt");
			ObjectInputStream o2 = new ObjectInputStream(f2);
			Emailname = (ArrayList<String>) o2.readObject();
			o2.close();
			f2.close();
			
			FileInputStream f1 = new FileInputStream("C:/Users/User/Desktop/New folder (2)/s1/abc2.txt");
			ObjectInputStream o1 = new ObjectInputStream(f1);
			name = (ArrayList<String>) o1.readObject();
			o1.close();
			f1.close();
			

		} catch (IOException e) {
			System.out.println("error");
		} catch (ClassNotFoundException er) {
			System.out.println("error");
		}
	}

	db1(String a) throws IOException {
		System.out.println("Enter whose(name) detail to view");
		BufferedReader na = new BufferedReader(new InputStreamReader(System.in));
		String str = na.readLine();
		int v = name.indexOf(str);
		new db1(v);

	}

	db1(int a) {
		System.out.println(phoneno.get(a));
		System.out.println(name.get(a));
		System.out.println(Emailname.get(a));
		System.out.println(Address.get(a));
		System.out.println(dob.get(a));
	}

	db1(int a, String b) throws IOException {
		System.out.println("Enter whose info to update");
		String d = na.readLine();
		int v = name.indexOf(d);
		new db1(v);

	}

	db1(int a, int b, int c) throws IOException, Exception {
		// ArrayList l = new ArrayList<>();
		System.out.println("names-"+name);
		System.out.println(Emailname);
		System.out.println(phoneno);
		System.out.println(Address);
		System.out.println(dob);
		// l.addAll();
		// System.out.println(i.toString());
	}
}