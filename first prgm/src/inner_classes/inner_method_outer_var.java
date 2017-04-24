//inner class can directly access outer class variables (both static and non-static)
//no error occur
package inner_classes;

public class inner_method_outer_var {

class a
{
	public void aa()
	{
		System.out.println(r+e);
		
	}
}
int r=8;
static int e=4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new inner_method_outer_var().new a().aa();

	}

}
