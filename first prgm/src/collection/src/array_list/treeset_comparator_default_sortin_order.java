//this is default sorting order in tree set 
//
package collection.src.array_list;

import java.util.TreeSet;


public class treeset_comparator_default_sortin_order {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Integer> obj1=new TreeSet<>();
TreeSet<Integer> obj2=new TreeSet<>();
obj2.add(50);
obj2.add(51);
obj2.add(52);
obj2.add(53);
obj2.add(54);
obj2.add(55);
obj1.add(600);
obj1.add(602);
obj1.add(603);
obj1.add(605);
obj2.addAll(obj1);
System.out.println(obj1+"\n"+obj2);
}

}


