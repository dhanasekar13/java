//calling other- class inner class method
//by creating object for outer and inner class we can access the inner class methods
package inner_classes;
class outer
{
	class inner
	{
		public void a()
		{
			System.out.println("inner method");
		}
	}
}
public class inner_class_method_from_other_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new outer().new inner().a();//outer object  inner object and method
	}

}
