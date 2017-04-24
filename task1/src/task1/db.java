package task1;//AutoCloseable

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

class db1 {

	static ArrayList<Long> phoneno = new ArrayList<>();
	static ArrayList<String> emailid = new ArrayList();
	static ArrayList<String> name = new ArrayList<>();
	static ArrayList<String> Emailname = new ArrayList();
	Scanner na = new Scanner(System.in);

	db1() throws IOException {
		System.out.println("Enter the Phone number-");
		long mam = na.nextLong();
		phoneno.add(mam);
		FileOutputStream f1 = new FileOutputStream("C:/Users/User/Desktop/New folder (2)/contact detail1/abc.txt");
		ObjectOutputStream o1 = new ObjectOutputStream(f1);
		o1.writeObject(phoneno);
	}

	db1(int a) {

		System.out.println(phoneno.get(a));

	}

	db1(int a, int b) {

	}

	db1(int a, int b, int c) throws IOException, Exception {
		ArrayList l = new ArrayList<>();
		FileInputStream fi = new FileInputStream("C:/Users/User/Desktop/New folder (2)/contact detail1/abc.txt");
		ObjectInputStream is = new ObjectInputStream(fi);
		db1 i = (db1) is.readObject();

		// l.addAll();
		System.out.println(i.toString());
	}
}

class db2 {
	Scanner na = new Scanner(System.in);
	static ArrayList name = new ArrayList();

	db2() throws IOException {
		System.out.println("Enter the Name");
		String str1 = na.nextLine();
		name.add(str1);
		FileOutputStream f1 = new FileOutputStream("C:/Users/User/Desktop/New folder (2)/contact detail1/abc2.txt");
		ObjectOutputStream o1 = new ObjectOutputStream(f1);
		o1.writeObject(name);

	}

	db2(int b) {
		System.out.println(name.get(b));
	}

	db2(String a) {
		System.out.println("Enter whose detail to view");
		String str = na.nextLine();

		int v = name.indexOf(str);
		new db1(v);
		new db2(v);
		new db3(v);
		new db4(v);
		new db5(v);
		new db6(v);
	}

	db2(int a, String b) {
		System.out.println("Enter whose info to update");
		String d = na.nextLine();
		int v = name.indexOf(d);
		new db1(v);
		new db2(v);
		new db3(v);
		new db4(v);
		new db5(v);
		new db6(v);
	}

	db2(int a, int b, int c) throws IOException, ClassNotFoundException {
		FileInputStream fi = new FileInputStream("C:/Users/User/Desktop/New folder (2)/contact detail1/abc2.txt");
		ObjectInputStream is = new ObjectInputStream(fi);
		db1 i = (db1) is.readObject();
		System.out.println(name);
	}
}

class db3 {
	Scanner na = new Scanner(System.in);
	static ArrayList Emailname = new ArrayList<>();

	db3() throws IOException {
		System.out.println("Enter the Email id--");
		String str = na.nextLine();
		Emailname.add(str);
		FileOutputStream f1 = new FileOutputStream("C:/Users/User/Desktop/New folder (2)/contact detail1/abc3.txt");
		ObjectOutputStream o1 = new ObjectOutputStream(f1);
		o1.writeObject(Emailname);
	}

	db3(int a) {
		System.out.println(Emailname.get(a));
	}

	db3(int a, int b, int c) {
		System.out.println(Emailname);
	}
}

class db4 {
	Scanner na = new Scanner(System.in);
	static ArrayList Emailname = new ArrayList<>();

	db4() throws IOException {
		System.out.println("Enter the -Address ");
		String str = na.nextLine();
		Emailname.add(str);
		FileOutputStream f1 = new FileOutputStream("C:/Users/User/Desktop/New folder (2)/contact detail1/abc4.txt");
		ObjectOutputStream o1 = new ObjectOutputStream(f1);
		o1.writeObject(Emailname);
	}

	db4(int a) {
		System.out.println(Emailname.get(a));
	}

	db4(int a, int b, int c) {
		System.out.println(Emailname);
	}
}

class db5 {
	Scanner na = new Scanner(System.in);
	static ArrayList Emailname = new ArrayList();

	db5() throws IOException {
		System.out.println("Enter the date of birth-");
		String str = na.nextLine();
		Emailname.add(str);
		FileOutputStream f1 = new FileOutputStream("C:/Users/User/Desktop/New folder (2)/contact detail1/abc5.txt");
		ObjectOutputStream o1 = new ObjectOutputStream(f1);
		o1.writeObject(Emailname);
	}

	db5(int a) {
		System.out.println(Emailname.get(a));
	}

	db5(int a, int b, int c) {
		System.out.println(Emailname);
	}
}

class db6 {
	Scanner na = new Scanner(System.in);
	static ArrayList Emailname = new ArrayList();

	db6() throws IOException {
		System.out.println("Enter the second phone number-");
		Long str = na.nextLong();
		Emailname.add(str);
		FileOutputStream f1 = new FileOutputStream("C:/Users/User/Desktop/New folder (2)/contact detail1/abc6.txt");
		ObjectOutputStream o1 = new ObjectOutputStream(f1);
		o1.writeObject(Emailname);
	}

	db6(int a) {
		System.out.println(Emailname.get(a));
	}

	db6(int a, int b, int c) {
		System.out.println(Emailname);
	}
}