//  string buffer doesnnt have a predefined compare methods 
//  so string buffer object is typecasted by calling the object in tostring methods
//
package collection.src.array_list;

import java.util.Comparator;
import java.util.TreeSet;

public class stringbuffer_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer st1=new StringBuffer("dhana");
StringBuffer st2=new StringBuffer("sekar");
StringBuffer st3=new StringBuffer("ds");
StringBuffer st4=new StringBuffer("sekar sekar");
StringBuffer st5=new StringBuffer("sekar dgd");
TreeSet<StringBuffer>  ts4=new TreeSet(new sortin());
ts4.add(st1);
ts4.add(st2);

ts4.add(st3);

ts4.add(st4);

ts4.add(st5);

ts4.add(st5);
System.out.println(ts4);//error-classcast exception  string buffer cannot be comaparable
	}
}
class sortin implements Comparator
{
	public int compare(Object obj,Object ob2)
	{
		//String i1=(String)obj;--shows error
		//String i2=(String)ob2;--shows error
		String i1=obj.toString();
		String i2=ob2.toString();//string have to be type casted by using this 
		//return 1;	//-insertion order
		//return 0; -only one object is written other are written
		//return -1; -reverse order
		//return i1.compareTo(i2); -ascending order
		return -i1.compareTo(i2);//for descending order
	
		
	}
}
/*class minus implements Comparator
{
	public int compare(Object ob1,Object ob2)
	{
		Integer i1=(Integer)ob1;
		Integer i2=(Integer)ob2;
		return -i1.compareTo(i2);	
      //return 1;   will provide in insertion order  as usuall
	  // return -1;  will provide result in reserve insertion order.
      // return 0;  will print first element as usuall and all other elemnts are duplicates of first element ,,how many time you insert.
		// return i2.compareTo(i1);  will print in descending order .
		//  return -i2.compareTo(i1); will print in ascending order (since minus is used)//
		
	}
}*/