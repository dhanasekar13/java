package exception_handing;

public class throws_han {
/*	
if we did nt handle exception it throws erro
to handle it we use exception(try and catch)
 if doesnt want at tht method are that suitation you can exxplicitky mention using throws
 
 void h()
	{
		System.out.println("dhanasekar");
		Thread.sleep(4000);
	}*/
	
	void h() throws ArithmeticException ///when i throws the interrupted it transfer the error(interrupted exeption) to follow method
	{
		System.out.println("dhanasekar");
		
		System.out.println(10/0);
	}
	void b() throws InterruptedException//if in this method also not interested to handle the exception transfer it to other transrvaers
	{
		h();
	}
void g()
{ try
{
	b();

}
catch (InterruptedException y)
{
	System.out.println("hjhghj");
}
catch (Exception e)

{
	System.out.println("Arithematic expection is handled");
}

	finally
{
	System.out.println("dhana");
}	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new throws_han().g();
	}

}
