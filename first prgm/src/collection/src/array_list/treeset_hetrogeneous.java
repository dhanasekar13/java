package collection.src.array_list;

import java.util.Comparator;
import java.util.TreeSet;

public class treeset_hetrogeneous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet i=new TreeSet(new mysort());
i.add(5);
i.add("5");
i.add('d');
i.add("dhanase");
i.add("hghh");
i.add("sgj");
i.add('s');i.add('s');i.add('s');
	System.out.println(i);
	}
}
class mysort implements Comparator
{
	public int  compare(Object o1,Object o2)
	{ 
		String s1=o1.toString();
		String s2=o1.toString();
		return -1;
	}
	}