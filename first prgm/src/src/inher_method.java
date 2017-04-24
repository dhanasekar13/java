package src;//String

public class inher_method {
	
	void a()
	{
		System.out.println("abcdefghijk");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new d().b();

	}

}
class d extends inher_method
{
	void a()
	{
		System.out.println("dhanasekar");
	}
	void b()
	{
		a();
		super.a();
	}
}
