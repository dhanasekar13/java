
public class localvariable {
	static int a=35;
	void f(int a)
	{
		a=120;
		System.out.println(a);//local value
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		new localvariable().f(10);
		System.out.println(a);//this is because value will be declared locally with the block

	}

}
