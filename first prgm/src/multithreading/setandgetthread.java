//here we can set the name of thread and get the name of the thread 
//using set and get method

package multithreading;
class a extends Thread
{
	 public void run()
	{
		 
		System.out.println(" a thread");
	}
	/*public String getName() we cannot override the getName method because in thread getname method is set as final
	 {
		 return "dhanasekar";
	 }*/
}
public class setandgetthread {
public static void main(String[] args) {
	a i=new a();
	a j=new a();
	i.start();
	j.start();
	setandgetthread s=new setandgetthread();
	System.out.println(Thread.currentThread());//shows value for thread class with main method 
i.setName("dhanasekar");//setting up name of the thread 
System.out.println(Thread.currentThread());	
System.out.println(i.getName());//getting the name of thread
	System.out.println(Thread.currentThread());//inorder to get the current thread value use currentthread method if you didnt lprovide getname method then it shows main,6,main value 
System.out.println(i.getId());
System.out.println(j.getId());
System.out.println(i.isAlive());
System.out.println(j.isAlive());
System.out.println(Thread.activeCount());
}
}