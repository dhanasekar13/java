package abstraction;
class t
{
	t()
	{
		System.out.println("dhana parent");
	}
	t(int a)
	{
		System.out.println("dhana 1 arguemnt");
	}
}
public class dought extends t
{
dought()
{ 
	System.out.println("dhana child");
}
dought(int a)
{
	this();
	System.out.println("sekar");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	dought r=new dought();
		dought w=new dought(4);

	}

}
