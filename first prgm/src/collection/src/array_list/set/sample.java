//hash set 

package collection.src.array_list.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class sample {

	public static void main(String[] args)
	{
		Integer i=new Integer(9);
		// TODO Auto-generated method stub
HashSet<Integer> h=new HashSet();//hash set
LinkedHashSet< Integer> lh=new LinkedHashSet<>(h);//linked hash set
//System.out.println(h.add(4));//true====//if you are printing the value its return type is true/false
//System.out.println(h.add(4));//false
h.add(5);//will not be added
h.add(4);
h.add(52);
h.add(53);
h.add(54);
h.add(55);
h.add(552);
lh.add(4);
lh.add(40);
lh.add(41);
lh.add(42);
lh.add(43);
lh.add(44);


//StringBuffer a=new StringBuffer("dbjhdgh");System.out.println(a);System.out.println(a.reverse());
//String q="tuygjhjhvhjdhanahgfgf";
//System.out.println(q.contains("*d"));
//System.out.println(q.matches(".*dh.*"));//check whether first many front are back letter 
/*try
{
System.out.println(10/0);
}
catch (ArithmeticException e)
{
	System.out.println("dhansekar");
}
*/System.out.println(h);//in hash set insertion order is not preserved --adding elemnt in 5th time doesnot show the elment in 5 th it depends on hash vallue
	System.out.println(lh);//in linked hash inserteed order is preserved
	}

}
