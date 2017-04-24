package interfac;
class iop
{
	interface bj
	{
	int a=9;
		void s();
	}
	public void s()
	{
		System.out.println("sdjdh");
	}
}
public class nest_class_interf extends iop
//here while using class you cannot type implements tends to class iop instead of iop.bj
{	public void s()
{
	System.out.println("dhanasekar");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  new nest_class_interf().s();
  new iop().s();
  System.out.println(iop.bj.a);
  ///you cannot create call the class interface object to the method it fails
	}

}
