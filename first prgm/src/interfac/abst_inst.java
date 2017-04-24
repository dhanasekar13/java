package interfac;
interface anc
{
	void s();
	void er();
	void ei();
}
abstract class x implements anc
{
	public void s()
	{
		System.out.println("dhana");
	}
}
public class abst_inst extends x
{
	public void er()
	{
		System.out.println("sekar");
	}
	public void ei()
	{
		System.out.println("dhanasekar");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
x j=new abst_inst();
j.s();
j.er();
j.ei();
	}

}
