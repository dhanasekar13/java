package collection.src.array_list;

import java.util.Stack;

public class stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack s=new Stack();
s.push(2);
s.push('e');
s.push("3");
s.push("sjkdfhs");
s.push("ds");
System.out.println(s);
System.out.println("capacity is    "+s.capacity());
System.out.println("size of stack    "+s.size());
s.pop();
System.out.println("returns  the first element   "+s.peek());
System.out.println(s);
System.out.println("since using different datatype it shows "+s.search("2"));
System.out.println(s.search(2));

	}

}
