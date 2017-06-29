
public class staticinstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new bb().s();
		
	}

}
class aa
{final static int s=8;
	static
	{
		
		System.out.println("aa class static block---1"+"   s  "+s);
		
	}
	{
		System.out.println("aa class instance block--3"+"    s   "+s);
		
	}
	aa()
	{
		System.out.println("aa class constructor---4"+"     s     "+s);
	}
}
class bb extends aa
{
	final static int a=9;
	static
	{
		System.out.println("bb class static block---2"+"    a    "+a);
		//System.exit(0);//if the system has exit keyword then progam terminate
	}
	{
		System.out.println("bb class instance block--5"+ "   a    "+a);
		
	}
	bb()
	{
		System.out.println("bb class constructor--6"+ "       a   "+a);
	}
	void s()
	{
		System.out.println("method in b class---7"+"     a      "+a);
	}
}