package exception_handing;

public class finall_nocatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			System.out.println(33/0);
		}
		finally
		{
			System.out.println("finall");
		}

	}

}
