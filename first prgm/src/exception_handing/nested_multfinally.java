//whenever try block fails finally block is executed at last whether catch block makes programnormally are not

package exception_handing;

 class nested_multfinally {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	System.out.println(10/0);
	try
	{
		System.out.println("nested try");
	}
	finally
	{
		System.out.println("finally nested---1");
	}
}
finally
{
	System.out.println("finally nested---2");
}
		
		
	}

}
class i
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	System.out.println("dhana");
	try
	{
		System.out.println("nested 2 main try");
	}
	finally
	{
		System.out.println("finally nested---1  2nd main ");
	}
}
finally
{
	System.out.println("finally nested---2   2nd main");
}
	}	
}