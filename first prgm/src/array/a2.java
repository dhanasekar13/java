package array;

public class a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] a=new String[5];
a[0]="dhana";
a[1]="sekar";
a[2]="dhanasekar";
a[3]="ds";
a[4]="dhanadans";
String[] b=new String[5];
String[] c=new String[5];
int yi=0;
int ui=0;
for (int d=0;d<5;d++)
{
	if(d/2==0)
	{
		b[yi]=a[d];
		yi++;
	}
	else
	{
		c[ui]=a[d];
		ui++;
	}
}
	System.out.println("string value of b and c is");
	for(int y=0;y<5;y++)

{ 
		if(c[y]==null|b[y]==null)
{
	continue;
}else
{

		System.out.println("b value is"+b[y]+"\n"+"c value is "+c[y]);
}
		
		}

	}

}
