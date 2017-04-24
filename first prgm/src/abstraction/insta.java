/* abstract class 
 ----methods
 ----consructor
 ----static block and
 ----instance block
   */


package abstraction;

abstract class abdcg
{
	abstract void d();
	abdcg()
	{
		System.out.println("parent constructor");
	}
	{
		System.out.println("instance abstract method");
	}
	static 
	{
		System.out.println("static abstract method for parent");
		
	}
}
public class insta extends abdcg
{
   void d()
   {
	   System.out.println("sekar");
	      }
   insta()
   {
	   System.out.println("child constructor");
   }
   {
		System.out.println("instance abstract method for child");
	}
   static 
	{
		System.out.println("static abstract method for child");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new insta().d();

	}

}
