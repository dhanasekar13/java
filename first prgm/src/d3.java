//removing duplicate 
		import java.util.*;
		import java.util.Scanner;
	class d3 {
		String s="";
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter the string ");
			String r=s.nextLine();
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		for(int i=0;i<r.length();i++)
		lhs.add(r.charAt(i));

		// print string after deleting duplicate elements
		for(Character ch : lhs)
		System.out.print(ch);
		}
		
	}


