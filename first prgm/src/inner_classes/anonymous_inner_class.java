//eg of anonymous inner class where overriding only one method in parent class
// anonymous inner class--instance use only one time usage 
// by this overriding c
package inner_classes;
class parent 
{
	void a()
	{ 
		System.out.println("this is parent class a method");
	}
	void b()
	{
		System.out.println("This is parent class b method");
	}
}
class b extends parent
{
	
}
public class anonymous_inner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent i=new parent()//anonymous_inner_class$1
				{
					void a()//has override the parent class void a()
					{
							System.out.println("This is anonymous class first object overridden a methods ");	
					}
				};
				System.out.println("Shows which class and name of the object it is created\n"+i.getClass().getName());
				i.a();//call first anonymous class 
				i.b();//call parent class b method
				parent j=new parent()//anonymous_inner_class$2
				{
			void a()
			{
				System.out.println("This is anonymous class second  object overridden a methods ");
			}
				};
				System.out.println("Shows which class and name of the object it is created\n"+j.getClass().getName());
				j.a();//call second anonymous class
				parent k=new b();// this is child object parent reference .
				System.out.println("Shows which class and name of the object it is created\n"+k.getClass().getName());
				k.a();//parent class a methods
	}

}
