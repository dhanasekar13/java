//daemon thread are executed until the main thread is available if the main thread is stopped then daemon thread is stopped

package multithreading;
class thread12 extends Thread
{
	public void run()
	{
		for(int h=0;h<10;h++)//even thro h have to run 10 times still main method got exceuted ony 3 times so deamon thread is also excuted less time
		System.out.println("get current thread value   -"+Thread.currentThread().getName());
	}
}
public class demonthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
thread12 t=new thread12();
t.setDaemon(true);
t.setName("first thread");
t.start();
thread12 t1=new thread12();
t1.setName("second thread ");
t1.start();
for(int i=0;i<3;i++)
System.out.println("d1");

	}

}
