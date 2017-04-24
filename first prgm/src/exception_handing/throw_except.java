package exception_handing;

public class throw_except {
	public static void hi()
	{

	try
	{
		throw new ArithmeticException("my throw");
	}
	catch (ArithmeticException i)
	{
		System.out.println("first thread");
		throw i;
	}
	}
	public static void main(String[] args) {

		// TODO Auto-generated method stub		
try
{
	hi();
}
catch (Exception i)
{
	System.out.println("second throw"+i);
}

	}

}
