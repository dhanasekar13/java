package run_time;

public class eg1 {

	void m(int a)
	{
		System.out.println("dhana");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     eg1 i=new eg2();
     i.m(8);
	}

}
class eg2 extends eg1
{
	void m(int a)
	{
	  System.out.println("Sekar");
	}
}
