

	//descending order using user defined sorting order by using comparator 
	// -- by providing minus symbol in the compare method
	//or other methds is providing second obj as first than providing reverse alteration here providing minus here willl do reveerse 
	// --providing return value as 1 willl show record in the insertion order and allowing duplicates also
	//   in the above if you provide the minus in return that it shows in reverse of insertion order.
	package collection.src.array_list;

	import java.util.TreeSet;
	import java.util.Comparator;
	
	public class treesetalphabetic
	{

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
	TreeSet s=new TreeSet();//while creating the class have to mention the object which implements Comparator
	TreeSet rs=new TreeSet(new minus1());
	s.add("dhana");
	s.add("sekar");
	s.add("ds");
	s.add("dhanasekar");
	s.add("abcdef");
	s.add("fedcba");
	s.add("rakesanahd");
	s.add("hhhhh");
	rs.addAll(s);
	System.out.println("--alphabetic order--\n"+s+"\n--the reverse alphabetic order is\n"+rs);
		}

	}

	class minus1 implements Comparator
	{
		public int compare(Object ob1,Object ob2)
		{
			String i1=(String)ob1;
		    String i2=(String)ob2;
			return -i1.compareTo(i2);	
	      //return 1;   will provide in insertion order  as usuall
		  // return -1;  will provide result in reserve insertion order.
	      // return 0;  will print first element as usuall and all other elemnts are duplicates of first element ,,how many time you insert.
			// return i2.compareTo(i1);  will print in descending order .
			//  return -i2.compareTo(i1); will print in ascending order (since minus is used)//
			
		}
	}
