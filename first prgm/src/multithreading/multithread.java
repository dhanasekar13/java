// To start the userdefined thread  --main method is nesecarry
// To start the thread start() must be calledd from the main method
// by starting the start method in userthread object hence start method is not present in userthread so start() is called in Thread class where start () is present 
// that start has called the run() .
// but if  you call the run() then the class contains the run method is executed 
package multithreading;

class userthread extends Thread
{
public void run()
{for(int j=0;j<10;j++)
	System.out.println("dhanasekar");
	
}
}
public class multithread
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//user thread start code
	userthread  t=new userthread ();
	t.run();
		t.start();
		//logic of main thread
		for(int i=0;i<10;i++)
		System.out.println("sekar");
		
	}

}
