package collection.src.array_list;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a=new ArrayList<>();
	a.add(3);
	a.add(30);
	a.add(31);
	a.add(32);
	a.add(33);
	a.add(34);
	a.add(35);
	a.add(36);
	a.add(37);
	a.add(38);System.out.println(a);//here output will be entire element in a object
	//for getting elements one by one (cursor ) is used
	Iterator it=a.iterator();
	while(it.hasNext())
	{
		Integer b=(Integer)it.next();
		if(b%2==0)
		{
			System.out.println(b);
		}
		else
		{
			// there if the number is not an even then delete
			it.remove();
		}
	}
	
	System.out.println(a);
	
	}
}
