//simple example of method local inner class
//class method_local-for accessing instance methods 
//class method_local1-for accessing static methods

package inner_classes;

public class method_local {

	public  void m1()
	{
		class inner
		{
			public void m2()
			{
				System.out.println("mehtod local inner class");
			}			
		}
		inner i=new inner();
		i.m2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new method_local().m1();
	}

}
//eg-2
//here output is coming  without any error but method local variabble cannot be accessed by inner classs methods
class method_local1 {
int i=5;
static int j=6;
	public void m1()
	{
	int a=5;
	final int  b=43;
		class inner
		{
			
			public  void m2()
			{
				System.out.println(i);//5
				System.out.println(j);//6
				System.out.println(b);//43
				System.out.println(a);//5
			}			
		}
		inner i=new inner();
		i.m2();
	}

	public static void main(String[] args) {
new	method_local1().m1();
	}
}
///eg----3
//declaring the local method as static cannot inherit the instant methods same as instance variable in static blocks
//creating object in inner class can use and call the varible
class method_local2 {
int i=5;
static int j=6;
	public static  void m1()
	{
	int a=5;
	final int  b=43;
	method_local2 ij=new method_local2();//creating object any where outside the class also work
		class inner
		{
			//we cannot declare a static method inside the inner class
			public  void m2()
			{
				System.out.println(ij.i);//5
				System.out.println(j);//6
				System.out.println(b);//43
				System.out.println(a);//5
			}			
		}
		inner i=new inner();
		i.m2();
	}

	public static void main(String[] args) {
new	method_local2().m1();
	}
}