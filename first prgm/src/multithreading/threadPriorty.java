//IN these prirority is used to get the value in the program
// but even thro settig the priority also output cannot be expected

package multithreading;
class g extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread());//if you provide by this output will has both thread[all threadname,priority,main method]
		System.out.println(Thread.currentThread().getName());//output only has thread name only
	}
}
public class threadPriorty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
g t1=new g();
t1.setName("Thread 1");
t1.setPriority(10);
t1.start();
g t2=new g();
t2.setName("Thread 2");
t2.setPriority(Thread.MIN_PRIORITY);

t2.start();
	}

}
