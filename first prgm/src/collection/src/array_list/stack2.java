package collection.src.array_list;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;

public class stack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector l=new Vector();
l.add(5);
l.add(51);
l.add(52);
l.add(53);
l.add(54);
l.add(55);
l.add(56);
l.add(57);
l.add(58);
System.out.println(l);//here we get the data entirely but inorder to get a single data(enumeration) is used
Enumeration e=l.elements();
while (e.hasMoreElements()) 
{
	Integer h=(Integer)e.nextElement();
	if(h%2==0)
	{
		System.out.println(h);
	}
}



	}

}
