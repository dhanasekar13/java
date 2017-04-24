package polymorphism;

public class ov_riding_co_var {
	ov_riding_co_var m()
	{
		System.out.println("parent class");
		return new ov_riding_co_var();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new c().m();
	}

}
class a
{
  void d()
  {
	  
  }
}
class b extends a
{
	
	int r()
	{
		return 0;
	}
}
class c extends ov_riding_co_var
{
	c m()
	{
		System.out.println("child class");
		return new c();
	}
	
}

