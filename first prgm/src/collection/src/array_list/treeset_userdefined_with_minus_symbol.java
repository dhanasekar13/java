//descending order using user defined sorting order by using comparator 
// -- by providing minus symbol in the compare method
//or other methds is providing second obj as first than providing reverse alteration here providing minus here willl do reveerse 
// --providing return value as 1 willl show record in the insertion order and allowing duplicates also
//   in the above if you provide the minus in return that it shows in reverse of insertion order.
package collection.src.array_list;

import java.util.TreeSet;
import java.util.Comparator;
import javax.swing.event.TreeExpansionEvent;

public class treeset_userdefined_with_minus_symbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet s=new TreeSet(new minus());//while creating the class have to mention the object which implements Comparator
s.add(50);
s.add(51);
s.add(52);
s.add(53);
s.add(54);
s.add(55);
s.add(56);
s.add(57);
System.out.println("by providing the minus"+"\n"+ "symbol it take the result in  "
		+ "DESCENDING"+s);
	}

}

class minus implements Comparator
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
}