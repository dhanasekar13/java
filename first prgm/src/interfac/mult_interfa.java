package interfac;
interface aqw
{
	int a=8;
	void k();
}
interface hjk
{
	int a=7;//having two variable with same name abiquete problem
	void l();
}
public class mult_interfa implements aqw,hjk
{public void k()
	{
	System.out.println(aqw.a);//uses interface name . methods are variable name
	}
public void l()
{
System.out.println(hjk.a);//uses interface name . methods are variable name
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new mult_interfa().k();
new mult_interfa().l();
	}

}
