package interfac;
interface hjki
{int a=9;
	void a();
	class s
	{int a=8;
		public void a()
		{
			System.out.println("dhsns"+a);
		}
	}
}

public class dought implements hjki
{
public void a()
{
	System.out.println("dhdndn"+a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new dought().a();
new hjki.s().a();
	}

}
