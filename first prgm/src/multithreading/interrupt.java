//interrupt method is used to interrupt the program 
//int that interrupted catch block we can run some other thread also
package multithreading;
class an extends Thread
{
	public void run()
	{for(int i=0;i<10;i++)
	{
		System.out.println("user defined--"+i);
		try
		{
			if(i==5)
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			ab j=new ab();
			j.start();
			/*try{
			  j.join();}
			catch(InterruptedException ie)
			{
				System.out.println("sdfs");
			}*/
		System.out.println("interrupted exeception");
	}
	}
	}
}
class ab extends Thread
{
	public void run()
	{
		for(int fi=0;fi<10;fi++)
		System.out.println("dhanasekasr");
	}
}
public class interrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
an i=new an();
i.start();

i.interrupt();//you can interrupt the thread any where
for(int u=0;u<10;u++)
	System.out.println(u);
	}

}
