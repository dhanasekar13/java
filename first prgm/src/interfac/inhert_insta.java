package interfac;
interface anv
{
	void g();
}
interface b extends anv
{
	void h();
}interface c extends b
{
	void i();
}
public class inhert_insta implements c
{public void g()
	{
	System.out.println("dhana");
	}

public void h()
{
System.out.println("sekar");
}
public void i()
{
System.out.println("dhanasekar");
}	public static void main(String[] args) {
		// TODO Auto-generated method stub
new inhert_insta().i();
	}

}
