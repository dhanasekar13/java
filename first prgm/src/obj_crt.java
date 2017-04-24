
public class obj_crt {
	void g()
	{
		System.out.println("aaaaaaaaaaaa");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       obj_crt i=new obj_crt();
       b j=new b();
       obj_crt k=new b();
       i.g();
       j.g();
       k.g();
       
	}

}
class b extends obj_crt
{
	void g()
	{
		System.out.println("dhanase");
	}
}