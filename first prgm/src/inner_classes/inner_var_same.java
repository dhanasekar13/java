//3 place having the same variable name with value
// local ,instance(inner class),outer class variable

package inner_classes;

public class inner_var_same {
class a
{int e=10999;
	public void af()
	{int e=50;
		System.out.println("local value  "+e);//for getting local value 
		System.out.println("inner class inner variable outside the methods   "+this.e);//for getting instance block variable
		System.out.println("outer class variable   "+new inner_var_same().e);
	}
}
int e=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new inner_var_same().new a().af();
	}

}
