//object array


package array;
class f
{
	int i;
	String s;
	f(int i,String s)
	{
		this.i=i;
		this.s=s;
	}
 public static void main(String[] args) {
	System.out.println("dhanasekar");
}
}
public class object_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
f[] i=new f[4];
for (f d:i)
{
	//System.out.println(d);
}
//after the 3 methods null pointer exception occurs
//inorder to overcome that exception 
//
f ii=new f(4,"dhana");
f jj=new f(5,"dhanasekar");
f kk=new f(7,"sekara");
f[] kh=new f[5];
kh[0]=ii;
kh[1]=jj;
kh[2]=kk;
for(f u:kh)
	System.out.println(u.i+""+u.s);
}
}