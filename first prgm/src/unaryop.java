
 class unaryop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0,b=0,c,d;
c=a++;
System.out.println(c);d=a;
System.out.println(d);d=0;c=0;c=++b;d=0;
System.out.println(c);d=b;
System.out.println(d);
	}

}
class k
{
	static final int f(){
		return 4;
	}
	static int g=f();
	public static void main(String[] args) {
		System.out.println(g);
	}
}