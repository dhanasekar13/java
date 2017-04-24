
public class inst_block {

	int a=3;
	static int b=5;
	inst_block()
	{
		a=9;
		b=9;
		System.out.println("zero args constructor block  "+a+"    "+b);
	}
	{
	
		
		System.out.println("instance  block  "+a+"    "+b);		
	}
	static
	{
		System.out.println("dhanasekar");
	}

	inst_block(int t)
	{
	
		System.out.println("zero args constructor block  "+a+"    "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new inst_block();
new inst_block(8);
	}

}
