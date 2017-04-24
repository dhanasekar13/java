package inner_classes;

public class anonymus_inner_class_implements_runnable {
	public static void main(String[] args) {
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			for(int o=0;o<10;o++)
			{
				System.out.println("implements runnable interface"+o);
			}
			}
		};
	Thread t=new Thread(r);
	t.start();
	try
	{
	t.join();//due to this join() after finishing this only control goes to rest of the program
	}
	catch(InterruptedException e)
	{
		System.out.println("interupted found");
	}
	for(int i=0;i<10;i++)
	{
		System.out.println("main method  "+i);
	}
	
	}
}
