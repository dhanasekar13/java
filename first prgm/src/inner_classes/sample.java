// --accessing inner class methods 
//--- by using outer(sample) object
//  calling local area method in static area of outer class 
package inner_classes;

public class sample // outer class
{void g()
	{
	System.out.println("mohn raj");
	}
	class innerclass//inner class 
     {
	
		public void g()//inner class methods
		{
			System.out.println("inner class methods g");
		}
		public void c()
		{
			System.out.println("second methods in inner class");
		}
	}
public static void main(String argts[])
{//hre output willl provide 
	sample s=new sample();
	sample.innerclass i=s.new innerclass();
	i.g();//inorder  to access this methods we need outer class object 
	sample.innerclass j=new sample().new innerclass();//here directly createdd an object without reference variable
	//even we can acces the methods directly by using
	new sample().new innerclass().c();
	i.c();
	sample h=new sample();
	h.g();
}
}

