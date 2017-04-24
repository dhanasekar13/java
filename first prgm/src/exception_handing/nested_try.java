/*  here nested try 
 * in first try block 
*/
package exception_handing;

public class nested_try 
{
public static void main(String[] args)
{try
{
	int o=9;
	System.out.println(o/1);
	try
	{
		int a=8;
		int b=0,c;
		System.out.println(a/8);
		try
		{
			int i[]={5};
			i[90]=90;
		}
		catch(ArrayIndexOutOfBoundsException u)
		{
			System.out.println("dhana");
		}
	}
	catch(ArithmeticException y)
	{
		System.out.println("sekr");
	}
}
catch(Exception e)
{
	System.out.println("array");
}
}

}
