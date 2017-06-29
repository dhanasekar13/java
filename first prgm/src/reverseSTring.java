import java.util.Scanner;

public class reverseSTring {
public int y;
	public void  s(int a)
	{
		a=300;
		//System.out.println(a);
		//return b;
	}
	public void q(reverseSTring e)
	{

		e.y=77;
	}
	public static void main(String[] args) {
int a=100;
new reverseSTring().s(a);//here value is passed
System.out.println("primitive value a is"+a);//value is not changed
//above method is known as call by value
reverseSTring o=new reverseSTring();
o.y=45;//this is reference 
new reverseSTring().q(o);//here address is passed
System.out.println("object value is "+o.y);//value is changed
//call by reference
	}

}
