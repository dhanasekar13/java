package collection.src.array_list;
import java.util.*;

public class linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final LinkedList<Character>   l=new LinkedList<Character>();
 		final LinkedList<Character>   l1=new LinkedList<Character>();
 		sample e=new sample();
 	
        l.add('e');
        l1.add('h');l.add(null);//adding null element is possible
        l.add(1,'r');//add at the index
        l.addFirst('d');//directly add at first 
        l.addLast('w');//directly add the elemnt at last
        l.add('e');//duplicates are allowed 
      l.set(1, 's');
        System.out.println(l.size());
        l.addAll(4,l1);
        //l.addLast(e);
System.out.println(l);
l.addLast('u');
System.out.println(l);
}
}
