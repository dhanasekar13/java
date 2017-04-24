package array;
class a
{
	int f;
	String d;
	a(int f,String d)
	{
		this.f=f;
		this.d=d;
	
	}
}
class b
{
	int a;
	String ds;
	b(int a,String ds)
	{
		this.a=a;
		this.ds=ds;
	
	}
}
public class mult_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object array able to store any type of data.
                   Object[] o=new Object[7];
                   o[0]=new b(7,"dhana");
                   o[2]=new a(4,"sekar");
                   o[3]=new a(5,"ds");
                   for(Object s:o)
                   {if(s instanceof b)
                   {b h=(b)s;
                	   System.out.println(h.a+h.ds);
                   }
                   if(s instanceof a)
                   {a ij=(a)s;
                	   System.out.println(ij.d+ij.f);
                   }if (s==null)
                	   
                   {a ij=(a)s;b h=(b)s;
                	   System.out.println(ij+""+h);
                   }
//wrapper classes
                   if(s instanceof Integer)
                   {
                	   System.out.println(s);
                   }
                   }
	}

}
