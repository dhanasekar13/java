package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import collection.src.array_list.iterator;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, Integer> h1=new HashMap<>();
HashMap h2=new HashMap<>();
h1.put("dhanasekar", 1);
h1.put("a", 2);
h1.put("b",1);
h1.put("g", 2);
String s="shanabh";
//String[] f=s.split("h");
//System.out.println(s);
//Collections u=new Collections(); you cant create object for collection beacause it is declared as private 
//StringTokenizer u=new StringTokenizer(s.toString());//System.out.println(u.toString());
//System.out.println(h1);//will printwhat are the data adder will be added
//System.out.println(h1.put("a", 5));//returned vallue
//System.out.println(h1);
Set s1=h1.entrySet();
System.out.println("first hash"+s1);//here we passed value to set
Iterator it1=s1.iterator();
//System.out.println(it1);
while(it1.hasNext())
{
Map.Entry m1=(Map.Entry)it1.next();
System.out.println(m1);
if(m1.getKey().equals("a"))
{
	m1.setValue(4000);
	
}
else
{
}
h2.put(m1.getKey(), m1.getValue());
}



System.out.println("new hash set--value-"+h1);
}
	}

