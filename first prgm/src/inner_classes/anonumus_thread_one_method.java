//in this method a new thread is created inside it a runnble interface which implements the run method
//

package inner_classes;

public class anonumus_thread_one_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++)
					System.out.println("thread " + i);
			}
		}).start();
	}

}
