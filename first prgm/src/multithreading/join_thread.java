//join method is used to run the specified thread to run 
//until that specified thread is run completely called doesnt executed after the completion of process only called thread is executed
//here in the below program after the completion of join1 thread only join2 thread is executed after this thread runned commpleted only main thread is executed

package multithreading;
class join1 extends Thread
{
	public void run()
	{for(int u=0;u<10;u++)
		System.out.println("user defined---1--"+Thread.currentThread().getName());
	}
}
class join2 extends Thread
{

	public void run()
	{
		try
	{
			/*join1 i=new join1();
	i.start();
		i.join();
		*/
		
		for(int u=0;u<10;u++)
		{
		System.out.println("user defined--2--"+Thread.currentThread().getName());
		Thread.sleep(3000);
		}
	}catch(InterruptedException e)
	{
		System.out.println("dont worry");
	}
	}
}
public class join_thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
join1 i=new join1();
join2 j=new join2();
j.start();
//j.start();
try
{
j.join(2000);//if you provide value in join as express your thread till 2second if the thread cross 2 second then leave that thread and run the main thread
//after the comepletion of main thread only the remaining thread is runned
}
catch(InterruptedException e)
{
	System.out.println("dont worry");
}
//only after completion of above code below code will execute
for(int y=0;y<10;y++)
{
	System.out.println("main method");
}
//if i runned the program as above  even thro main method run still before  user defined --1 runs before user defined ---2 thread

	}

}
