package collection.src.array_list;
import java.util.Comparator;
import java.util.TreeMap;

 class MyTreeExample {

public static void main(String a[]) {
TreeMap hm = new TreeMap();
hm.put("a", 123);
hm.put("b", 147);
hm.put("A", 79);
hm.put("Z", 123);
hm.put("j", 79);
hm.put("0",189);
hm.put("7", 192);
System.out.println(hm);

}
}
 class a implements Comparator
 {
	 public int compare(Object o1,Object o2)
	 {
		 String s1=o1.toString();

		 String s2=o2.toString();
		 return 1;
		 
	 }
 }