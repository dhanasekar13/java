package inner_classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface car
{
	public String color();
	class defaultcolor implements car
	{
		public String color()
		{
			return "white";
		}
	}
	
}
public class interface_class implements car
{
	public String color() 
	{BufferedReader na = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("what color you choose");
		String s;
		try {
			s = na.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "red";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=new car.defaultcolor().color();
System.out.println(s);
String se=new interface_class().color();
System.out.println(se);
	}

}
