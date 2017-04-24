package interfac;
interface ahi
{
	interface b
	{
		void h();
	}
}
public class nest_interfac implements ahi,ahi.b
//other way writting above class is 
//public class nest_interfac implements ahi.a//ahi
{
public void h()
{
	System.out.println("hey");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nest_interfac k=new nest_interfac();
		k.h();

	}

}
