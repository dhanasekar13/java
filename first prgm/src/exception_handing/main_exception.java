package exception_handing;
//delicate exception
public class main_exception {

	public static void main(String[] args)  throws InterruptedException,Exception
	
	{
		// TODO Auto-generated method stub
   Thread.sleep(10000);
   try 
   {
	  
   System.out.println(10/0);
   }
   catch(ArithmeticException u)
   {
	   System.out.println("hhhgh");
   }
   finally
   {
	
   System.out.println("dhsnd");}
	}

}
