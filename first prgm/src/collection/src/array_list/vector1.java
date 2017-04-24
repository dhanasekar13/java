package collection.src.array_list;

import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vector<Integer> y=new Vector<Integer>();
       System.out.println(y);
       System.out.println(y.capacity());
       y.add(4);
       y.addElement(3);
       y.add(1, 6);
       y.add(45);
       y.add(42);
       y.add(41);
       y.add(42);
       y.add(41);
       y.add(47);
       y.add(488);System.out.println(y);
       System.out.println(y.capacity());
       y.remove(2);
       
       y.add(4);
       y.add(4);
       y.removeElementAt(7);
       System.out.println(y);
       System.out.println(y.capacity());
	}

}
