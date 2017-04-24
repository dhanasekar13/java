// nested inner class 
// we can create many more inner clas but for each traversal need an object

package inner_classes;

public class nested_inner_classes
{
   class a
   {
	class b
	{
		class c
		{
			class d
			{
				public void p()
				{
					System.out.println("inner most class method");
				}
			}
		}
	}
   }
   //multiple inner class is also supported in java...
   class e
	{
		public void pi()
		{
			System.out.println("second inner classes most class method");
		}
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
new nested_inner_classes().new a().new b().new c().new d().p();
new nested_inner_classes().new e().pi();
	}

}
