package exception_handing;
class a
{
	void d()
	{
		try 
		{
			System.out.println(2/0);
			System.out.println("dkjsjdsj");
			throw new ArithmeticException("dhana");
		}
		catch  (ArithmeticException t)
		{
			System.out.println("dhanar");
		}
		finally
		{
			System.out.println("dhanasekar");
		}
		
	}
}
public class throws1 extends a
{
    a i=new a();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{ a i=new a();
	i.d();
}
catch(ArithmeticException e)
{
	System.out.println("sekar"+e);
}
	}

}
