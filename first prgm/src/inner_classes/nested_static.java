package inner_classes;
//running two main method using different class
public class nested_static {
static class a
{
	public static void main(String[] args) {
		System.out.println("Nested static class");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");

	}

}
//static access both instance and static variable
class g
{
	int s=9;
	static int ui=89;
	
	static class f
	{
		static int a=9;
		public static void main(String[] args) {
			g i=new g();
			System.out.println(i.s);
			System.out.println(ui);
		}
	}
}
//inorder the nested class need to specify the class name as g$f  
class a
{
	void b()
	{
		System.out.println("kjhf");
		
	}
}
class c extends a
{
	void b()
	{
		super.b();
	}
	
}