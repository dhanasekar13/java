//inheritance concept with variable with same variable name

package src;
public class inheritance {
	int a=1;
	static int b=2;
void m()
{
	System.out.println(a+b);//instance variable
}
void n(int a,int b)//local variable
{
	System.out.println(a+b);	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new b().m();
new b().n(10,20);
new b().a();
new b().c(20, 30);



	}

}
class b extends inheritance 
{int a=67;
static int b=89;
	void a()
	{
		System.out.println(a+b);		
	}
	void c(int a,int b){
		System.out.println(a+b);
		System.out.println(this.a+this.b);//for instance variable
		System.out.println(super.a+super.b);//for super class
	}
}
