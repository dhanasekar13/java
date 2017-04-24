package polymorphism;

public class type_casting_object {
  void a()
  {
	  System.out.println("dhana");
  }
  void b()
  {
	  System.out.println("sekar");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bcds i=new bcds();
		type_casting_object j=new bcds();
		bcds po=(bcds) j;//reference var of type_casting_object and object of bcds
		po.c();

	}

}
class bcds extends type_casting_object
{
	  void a()
	  {
		  System.out.println("dhana");
	  }
	  void c()
	  {
		  System.out.println("sekar");
	  }
		
}