package inner_classes;

public class NestedStaticInner {

	static class n1
	{
		public void a()
		{
			System.out.println("nested static inner method");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//inorder to access these static class we dont need to create object for outer class class directly
		n1 u=new n1();
		u.a();
	}

}
