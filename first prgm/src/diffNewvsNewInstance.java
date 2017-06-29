class a1
{
	void b()
	{
		System.out.println("class a1 method");
	}
}
class a2
{
	void hg()
	{
System.out.println("class a2 method");
}
}
public class diffNewvsNewInstance {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//for creating object using new operator
		new a1().b();//this is for creating an a1 object for b method
		//if there is no class is avaible for which an object is going to create 
		//then exception will be unchecked exception--NOCLASSDEFFOUNDEXCEPTION
	//for creating command line instance method we use
		Object o=Class.forName(args[0]).newInstance();
		//if the same scenario is for new instance method then it shows checked exception-CLASSNOTFOUNDEXCEPTION
	System.out.println(o.getClass().getName());
		
	}

}
