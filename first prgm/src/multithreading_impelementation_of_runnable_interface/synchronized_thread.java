//output will be unexcepted behaviour 
//cannot predicate the output because of thread scheduler
//--a single method is called by different thread in different form
//method is called not synchronized
package multithreading_impelementation_of_runnable_interface;
class ag
{
	static void e(String s) 
	{for(int y=0;y<10;y++)
	{
		System.out.println("thread called by\n "+s);
		try
		{
					Thread.sleep(1000);
		}
		catch(InterruptedException u)
		{
			System.out.println("error");
		}
	}
	}
	 synchronized static void e1(String s) 
	{for(int y=0;y<10;y++)
	{
		System.out.println("\nsynchronized thread called by \n"+s);
		try
		{
					Thread.sleep(1000);
		}
		catch(InterruptedException u)
		{
			System.out.println("error");
		}
	}
	}
}
public class synchronized_thread  extends Thread
{ public void run()
	{ag.e1("synchronized");
	ag.e("not --synchronized");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		th1 i=new th1();
		th2 j=new th2();
		synchronized_thread  k=new synchronized_thread();
		i.start();
		j.start();
		k.start();
		

	}

}
class th1 extends Thread
{
	public void run()
	{ag.e1("th1");
		ag.e("th1"); 
		for(int y=0;y<10;y++)
		{
			System.out.println("\nthread th1\n");
		}
	}
}
class th2 extends Thread
{
	public void run()
	{ag.e1("th2");
		ag.e("th2");
		for(int y=0;y<10;y++)
		{
			System.out.println("\nthread th1\n");
		}
	}
}