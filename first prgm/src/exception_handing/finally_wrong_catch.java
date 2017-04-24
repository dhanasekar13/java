package exception_handing;

public class finally_wrong_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try 
{
	System.out.println(2/0);
}
catch(NullPointerException i)
{
	System.out.println("dsfj");
}
finally
{
	System.out.println("finally");
}
	}

}
