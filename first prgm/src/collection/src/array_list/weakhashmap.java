package collection.src.array_list;

import java.util.HashMap;
import java.util.WeakHashMap;

//inorder to over comethis problem weak hash map is used to delete the empty method
class weakhashmap1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HashMap i = new HashMap<>();
		T1 j = new T1();
		i.put("dhanse", j);
		System.out.println(i);
		j = null;// empty the object
		System.gc();// running the garbage collection
		Thread.sleep(2000);// wait the program for 2 second
		System.out.println(i);// even thro running the garbage collection for
								// integer (t) value of hash is running without
								// any error

	}

}

class weakhashmap {
public static void main(String[] args) throws Exception {
	WeakHashMap t=new WeakHashMap<>();
	T1 f=new T1();
    t.put(f,"df");//if you declare by this method ony it will excutte the finalize method
	System.out.println(t);
	f=null;
	System.gc();
	Thread.sleep(2000);
	System.out.println(t);
}
}
class T1
{
	public String toString()
	{
		return "temp";
	}
	public void finalize()
	{
		System.out.println("finalize method is called");
	}
}