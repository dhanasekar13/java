package array;
class s
{
	int ii;
	String jj;
	s(int i,String j)
	{
		this.ii=i;
		this.jj=j;
	}
}
public class null_pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
s[] i=new s[9];
s j=new s(2,"dhaa");
s k=new s(3,"sekar");
i[0]=j;
i[6]=k;
for (Object o:i)
{
	if(o instanceof s)
	{s ih=(s)o;
	System.out.println(ih.ii+""+ih.jj);
//	System.out.println(o);
}
	if(o==null)
{s io=(s)o;
		System.out.println(o);
	}
	}
	}

}
/*inorder to overcome this error we use object class
2dhaa
3sekar
Exception in thread "main" java.lang.NullPointerException
	at array.null_pointer.main(null_pointer.java:23)
*/