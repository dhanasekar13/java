
 class supe {
supe()
{
	System.out.println("hi dhansekar");
}
void m()
{
	System.out.println("m method");
}
}
class super1 extends supe
{
	super1()
	{
		super();
		System.out.println("base class constructor");
	}
	public static void main(String[] args) {
		new super1().m();
	}
}
class a113
{
	int a3=7;
}