//interface -when ever a class implements an interface that class have to implement all the methods in the interface 
//but if you have interface inside interface each has one method 
//when a class implements any one interface it is possible to implement only that interface methods 
package inner_classes;
interface aii
{
	public void s();
	interface b
	{
		public void sd();
	}
}
class ai implements aii
{
	public void s()
	{
		System.out.println("outer interface");
	}
}
class bj implements aii.b
{
	public void sd()
	{
		System.out.println("inner interface");
	}
}
public class class_interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ai().s();
		new bj().sd();

	}

}
