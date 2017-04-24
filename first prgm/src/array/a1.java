package array;

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={3,4,5,6,77};
int sum=0;
for
(int u=0;u<a.length;u++)
{
	sum+=a[u];
}
System.out.println(sum);
int max=a[0],min=a[0];
for(int e=1;e<a.length;e++)

	{
	if(max<a[e])
	{
		max=a[e];
	}
	if(min>a[e])
	{
		min=a[e];
	}
	
	}
System.out.println("Mximum element in the array is"+max);
System.out.println("Minimum element in the array is"+min);
	}

}
