package collection.src.array_list;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class a implements Serializable

{ 
	int ai=6;
	static int bi=5;
	a()
	{
		System.out.println(this.ai+bi);
	}
}
class b implements Serializable

{
	int a;
	static int b;
	b(int a,int b)
	{
		System.out.println(a+b);
	}
}
public class serialization 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
a  i=new a();
FileOutputStream fo=new FileOutputStream("abs.ser");
ObjectOutputStream os=new ObjectOutputStream(fo);
os.writeObject(i);

FileInputStream fi=new   FileInputStream("C:/Users/User/Desktop/New folder (2)/abc.txt");
ObjectInputStream is=new ObjectInputStream(fi);
b j=(b)is.readObject();
System.out.println(j);
	}

}
