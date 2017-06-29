package collection.src.array_list;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
TreeMap t=new TreeMap<>();//tree set doesnt accept the null value for key field
//for values we can use null any number of times there is no restriction whether it is 1.6 vs 1.7 version
t.put(23, 23);
//t.put(" ", 23);
//t.put(null, 32);//if you try to insert then override happen
System.out.println(t);
//t.put(" ", 1111);//it overide 
Thread.sleep(2000);
System.out.println(t);
HashMap r=new HashMap<>();//hashamap allows null only once to insert and after then it  will be duplicate the value
//r.put(null, 2323);//if null is declared first then it print first
r.put(00, 12);//this key 00 comes first eventhro null is declared
r.put(12, 23);
r.put(null, 987);
System.out.println(r);

		}

}
