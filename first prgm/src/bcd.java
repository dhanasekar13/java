

public class bcd {
	int c=2,d=6;
	static int a=30,b=30;
	void m1()
	{
	
		System.out.println(bcd.a+","+bcd.b);
		System.out.println(c+","+d);
	}

	void m2()
	{
		System.out.println(a+","+b);
		System.out.println(c+","+d);
	}
public static void main(String[] abcd)
{
	bcd i=new bcd();

    i.m1();
     i.m2();
	System.out.println(i.a+","+i.b);
	System.out.println(i.d+","+i.c);
}
}
