package collection;
//array list concept
import java.util.ArrayList;
import java.util.*;

public class c1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();		ArrayList b=new ArrayList();
		a.add("dhansekar");
		a.add('s');
		a.add(14);
		a.add(5.3);a.add('s');
		a.add(6.4f);
		a.add("6.4f");a.add('s');
		a.add("dhansekar");a.add('s');b.add('s');
		a.add(null);System.out.println(a);
		System.out.println(a.contains('s'));
		System.out.println(a.removeAll(b));
		for(int y=0;y<a.size()-1;y++)
		{
			System.out.println(a);
		}	
	}

}
