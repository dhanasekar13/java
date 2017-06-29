
public class superkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new g();
new g(10);
	}

}
class h
{
	h()
	{
		this(10);
		System.out.println("zero parameter constructor---2");
	}
	h(int a)
	{
		System.out.println("1 arg constructor---1--4");
	}
}
class g extends h
{
	g()
	{
		super();
		System.out.println("zero argument constructor--3");
	}
	g(int a)
	{
		super(10);
		System.out.println("one arguemnt constructor--5");
	}
}