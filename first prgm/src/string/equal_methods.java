package string;

public class equal_methods {
	equal_methods(String s)
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1=new StringBuffer("dhana");
		StringBuffer sb2=new StringBuffer("sekar");
		StringBuffer sb3=new StringBuffer("dhana");
String a="dhana";
String b="sekar";
String ai="dhana";
System.out.println(a.equals(b));//false
System.out.println(a.equals(ai));//true
equal_methods i=new equal_methods("dhana");
equal_methods j=new equal_methods("sekar");
equal_methods k=new equal_methods("dhana");
System.out.println(i.equals(j));
System.out.println(i.equals(k));

System.out.println(sb1.equals(j));
System.out.println(sb1.equals(k));

System.out.println(sb1.equals(sb2));
System.out.println(sb1.equals(sb3));
	}
}
class object
{
	public boolean equals(){
		return true;
	}
	
}
