 package collection.src.array_list;
 import java.util.ArrayList;

public class sample {ArrayList<Integer> a=new ArrayList<Integer>(6);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<Integer> b=new ArrayList<Integer>(6);
sample s=new sample();
s.a.add(3);
s.a.add(6);
s.a.add(4);
s.a.add(5);
s.a.add(4);
s.a.add(5);

b.add(111554);
b.add(111445);
b.add(111545);
b.add(111343);
b.add(111656);
b.add(11144);
b.add(11545);
b.add(41145);
b.add(111543);

s.a.add(554);
s.a.add(465);
s.a.add(543);
s.a.addAll(b);
s.a.iterator();
System.out.println(s.a);
System.out.println(s.a.iterator());
boolean r=s.a.contains(1115554);
System.out.println(r);
System.out.println(s.a.toArray());
System.out.println(s.a.listIterator());
System.out.println(s.a.containsAll(b));
System.out.println(s.a);
	}

}
