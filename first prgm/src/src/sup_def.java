package src;

public class sup_def {
sup_def()
{
	System.out.println("parent class default consultant");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new child();

	}

}

class child extends sup_def
{
	child()
	{
		System.out.println("child class default consultant");
	}
}