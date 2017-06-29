
//
	class Animal
	{
	volatile public String name = "animal";
	String makeNoise() { return "generic noise"; }
	}
	class Dog extends Animal 
	{
final String name = "dog";
	public String makeNoise() { return "bark"; }
	}
	class Test
	{
	public static void main(String[] args)
	{ 
	Animal an = new Dog();
	System.out.println(an.name+" "+an.makeNoise());
	}
	}
