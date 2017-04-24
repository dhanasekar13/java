//defining the thread by implementing the runnable interface 
//start the thread object by creating the thread with runnable object

package multithreading_impelementation_of_runnable_interface;
class runnable /*extends Thread */implements Runnable//this is also accepted 
{
	public void run()
	{
		System.out.println("user ddefined thread with runnable interface");
	}
}
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runnable r=new runnable();
		
Thread t=new Thread(r);//passing the runnable object into these thread only will call the run method of runnable interface
t.start();
	}

}
