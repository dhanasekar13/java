import java.io.*;

import exception_handing.main_exception;
public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=new String("dhana");
		String b=new String("dhana");
		StringBuffer f=new StringBuffer("dhana");
		int i=new Integer(4);
		String c="dhana";
		String d="dhana";
		System.out.println(a==b);
		a.concat("sekar");
		System.out.println(a);
		System.out.println(i);
		f.append("sekar");
		System.out.println(f);
		System.out.println();

	}

}
class ab
{
	void a()
	{
		
	}
	void g()
	{
	}
	
}
class bi extends ab
{
	void a()
	{
		
	}
	void g(){}
}
class c
{  public static void main(String[] args) {
	int ag;

	ab i=new bi();
	i.a();
	i.g();
	
		System.out.println(i.toString());
	}
}

