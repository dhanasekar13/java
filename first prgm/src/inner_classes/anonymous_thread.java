package inner_classes;
//instead of creating A New class that extends thread class 
//we override the run method by anonymous inner class
public class anonymous_thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread i=new Thread()
{
	public void run()
	{
		for(int i=0;i<10;i++)
		System.out.println("thread class run method which is overriden");
	}
};
i.start();
for(int e=0;e<10;e++)
{
	System.out.println("main class thread");
}

	}

}
