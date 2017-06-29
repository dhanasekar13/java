
public class unaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int y=0,u=0,v=0;
System.out.println(y+"  "+u+"  "+v);
y=y+1;
u++;//same has the above statement 
++v;
System.out.println(y+"  "+u+"  "+v);//print same value for all the variable 
	new unaryoperator().t();
	}
	void t()
	{
		int q=0,w=0;
		
		int e=q++;
		int r=++w;
		int r1=3;
		int rr=++r1+r1++;//  4+4 code id read fromm left to right
int q1=3;//here for below  code first stmt q1++ where first it returns the value to 3 then update in q1 has 4 after the second stmt q1 value is increased by 1 then q1 is 4
		int rr1=q1++ + ++q1; //3+5
		System.out.println(rr+"  "+rr1);
		System.out.println("here post increment value is  "+e +" & pre increment value is "+r);
	}
	void t1()
	{
		unaryoperator i;
		i=new unaryoperator();//here these object is taken care by garbage collection
		i=new unaryoperator();
		
	}

}
//in the above code all the addition and unary operation looks like working as same
//bt there is an difference b/w u++ and ++v
//(u++)when unary operator append after a variable is known as postfix
//(++v)when unary operator append before a variable is known as prefix
// int u=0,v=0;
//int d=u++  here first the value of u comes and update the value to d and then only vallue of u is increased by 1
//int g=++v  here first value of v is increased by 1 then the value comes in the place of g 
//