//HOOK THREAD--Excuted only before (normal/abnormal)-termination of the program 
// irrespective the program completed normally are not
package multithreading;
class thread11 extends Thread
{
	public void run()
	{
		System.out.println("normal user defined thread to hook thread");
	}
}
public class hookthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//inorder to make the user defined thread to hook thread need to run the addshutdownhook() 
		thread11 t=new thread11();
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(t);
		for(int i=0;i<10;i++)
		{
			try
			{
				Thread.sleep(1000);//making thread to sleep for 1 second and then exceuting the remaining stmt
		System.out.println("hi "+i);
		if(i==5){
			System.exit(0);// even thro abnormal termination also hook thread is executed
		}
			}
			catch(InterruptedException e)//these exception is only used when thread exception occurs only
			{
				System.out.println("thread "+i);
			}
	}
	}

}
