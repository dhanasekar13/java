/*  multiple try and multiple finally 
   whenever try block is executed finally block will execute

*/
package exception_handing;

public class mult_finally {

	void a()
	{
		try
		{
		System.out.println("try_---1");	
		}
		finally
		{
			System.out.println("finally-----1");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mult_finally i=new mult_finally();

		try
		{
			i.a();
		System.out.println("try_---2");	
		}
		finally
		{
			System.out.println("finally-----2");
		}
	}

}
