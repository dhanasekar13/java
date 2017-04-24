package polymorphism;

public class privat {
	
private void a()
{
	System.out.println("dhana");
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
privat iiii=new dd();
iiii.a();
	}

}
class dd extends privat
{
	void a()
	{
		System.out.println("sekar");
	}
}

//overridding fails in private modifier ......