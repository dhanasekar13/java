package abstraction;

public class abcd extends ds
{
	void a(){
		System.out.println("dhanasekar");
	}
	void b(){
		System.out.println("dhana");
	}	
	void c(){
		System.out.println("sekar");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    new abcd().a();
    new abcd().b();
    new abcd().c();
    ds i=new abcd();

	
	}
}
abstract class ds 
{
	abstract void a();
	abstract void b();
	abstract void c();
		void d()
	{
		System.out.println("dhhan");
	}

}