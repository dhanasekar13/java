package multithreading;
class t1 extends Thread
{  public void run()
	{
	System.out.println("thread one ");
	}
public void run(int a)
{
System.out.println("ffddgno");
}
}
public class emptythread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
t2 t=new t2();

//t.start();--error provide if a single thread runs multiple time
System.out.println("no second thread is excuted");
t.start();
t.run();
t.run();
//by specifing start(5) it shows error
System.out.println("no second thread is excuted");
	}

}
class t2 extends Thread
{  public void run()
	{
	t1 r=new t1();
	r.start();
	System.out.println("t2 thread");//only after this thread is exceuted other thread can be exceuted
	}
public void run(int a)
{
System.out.println("f");
}
}