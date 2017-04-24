// user defined sorting order-tree set
//  if inserted obj is  lesser than that value than return is +ve value (1)
// if inserted obj is greater than that value than return value is -ve valure(-1)
//  note:for first element compare() is nt going to look this method this will directly take the first value as root node
 package collection.src.array_list;

import java.util.Comparator;
import java.util.TreeSet;
class  mypre implements Comparator
{
	public int compare(Object obj5,Object obj6)
	{Integer i1=(Integer)obj5;
	Integer i2=(Integer)obj6;
		if(i1<i2)//if inserted value is lesser than first value than +ve value 
		{
			return 1;
		}
		else if(i1>i2)//if inserted value is greater than first valuue than -ve value
		{
			return -1;
		}
		else //both are same than return 0
		return 0;
	}
}
public class treeset_comparator 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet obj1=new TreeSet(new mypre());//have to mention in tree constructor than this is going to take user defined logic which is an comparator operator
TreeSet<Integer> obj2=new TreeSet();//here this object take an default comparable interface 
obj1.add(50);
obj1.add(51);
obj1.add(52);
obj1.add(53);
obj1.add(54);
obj1.add(55);
obj1.add(600);
obj1.add(602);
obj1.add(603);
obj1.add(605);
//obj2.addAll(obj1);
obj2.addAll(obj1);
System.out.println("descending order is"+obj1);
System.out.println("ascending order is "+obj2);
}

}
