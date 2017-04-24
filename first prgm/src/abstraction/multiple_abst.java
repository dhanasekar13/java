package abstraction;
abstract class a
{
		abstract void m();
	abstract void n();
	abstract void o();
}
abstract class b extends a
{
	void m()
	{
		System.out.println("dhana");
	}
}
abstract class c extends b
{
	void n()
	{
		System.out.println("sekar");
	}
}
public class multiple_abst extends c
 {
void o()
{
	System.out.println("dhanasekar");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
multiple_abst i=new multiple_abst();
i.o();
i.m();
i.n();
	}

}
