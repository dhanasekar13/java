package array;

public class array_method_arg {
int[] a()
{
	System.out.println("first method");
	int[] b={10,20,30,40};
	return b;
}
void g(double[] d)
{
	System.out.println("second method with double as parameter");
	for(double dd:d)
	{
		System.out.println(dd);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array_method_arg u=new array_method_arg();
		int[] x=u.a();
		for(int xx:x)
		{
		System.out.println(xx);	
		}
		double[] i={45.4,34.5,76.6}
	;
		u.g(i);
	}

}
