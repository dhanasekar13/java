import java.*;
class Bvd
{
	void ab()
	{
		System.out.println("dhana");
	}

	void bc()
	{
		System.out.println("sekar");
	}
}
 class Abc extends Bvd
{
	void ab()
	{
		System.out.println("sekar");
	}
	void dc()
	{
		System.out.println("sekar");
	}
}

public class overridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bvd i=new Abc();
i.ab();
i.bc();
	}

}
