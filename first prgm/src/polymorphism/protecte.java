package polymorphism;

  
public class protecte {

	protected void a()
	{
		System.out.println("dhana");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		protecte l=new bhu();
		l.a();

	}

}
class bhu extends protecte
{
	 public void a()
	{
		System.out.println("sekar");
		
	}
}