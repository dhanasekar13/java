package inner_classes;

public class class_interface_class_implemented 
{
	public void material()
	{
		System.out.println("dhanasekar you havve this material ");
		System.out.println("laser --1000");
		System.out.println("scanner--2000");
		System.out.println("x-ray--3000");
		System.out.println("all blood group of 5 items");
	}
	interface Hospital
	{
		public void material();
	}
	class Billroth implements Hospital
	{
		public void material()
		{
			System.out.println("The material neede are ");
			System.out.println("laser --1");
			System.out.println("scanner--2");
			System.out.println("x-ray--3");
		}
	}
	class Indian implements Hospital
	{
		public void material()
		{
			System.out.println("The material neede are ");
			System.out.println("blood of a+ve ---10 ");
			System.out.println("blood of 0-ve ---20 ");
			System.out.println("ECG ");
		}
	}
}
class neededinfo
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new	class_interface_class_implemented().material(); 	
System.out.println("needed items in Billroth hospital are\n");
new class_interface_class_implemented().new Billroth().material();
System.out.println("\nneeded items in Indian hospital are\n");
new class_interface_class_implemented().new Indian().material();
	}
}