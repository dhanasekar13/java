package wrapper;

public class classes {

	public static void main(String[] args) throws ClassNotFoundException
	{
		// TODO Auto-generated method stub
		byte op=96;
Byte b=new Byte("7");//if i declare a number directly is provides an error because by default it  is int
Integer i=new Integer("34");
Float f=new Float("5.4");
Float f1=new Float(5);
char dr=476;
Character c=new Character('8');
Short s=new Short("67");
System.out.println(b.toString());
System.out.println(i.toString());
System.out.println(c.toString());
System.out.println(s.toString());
System.out.println(b.toString());
System.out.println(f);
System.out.println(f1);
System.out.println('d');
Character ciu=new Character(dr);

System.out.println(ciu.toString());
Boolean jf=new Boolean(true);
Boolean jf1=new Boolean("TaUejhgjhgjh");
boolean ds=true;
boolean sd=false;
System.out.println();
Boolean jf2=new Boolean(ds);
Boolean jf3=new Boolean("falsrre");
System.out.println(jf);
System.out.println(jf1);
System.out.println(jf2);
System.out.println();
System.out.println(jf3);
System.out.println(jf2.equals(jf3));
System.out.println(jf2.compareTo(jf3));
Class.forName("dri");
	}

}
class dri
{static 
	{
		System.out.println("dkajhdkja");
	}
void b()
{
	System.out.println("dhana");
}

void a()
{
	new dri().b();
	
}
}