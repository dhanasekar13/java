/*singleton -one memory is shared by multiple object 
   using private we cannot able to access the object  

*/
package exception_handing;
 class AdderSingleton
{	
	private static AdderSingleton INSTANCE = null;	
	private AdderSingleton() {}
	public static AdderSingleton getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new AdderSingleton();
		}
		return INSTANCE;
	}
	
	public int addOne(int a) {
		return ++a;
	}
}

class Test {

	public static void main(String args[]) {
		AdderSingleton adder = AdderSingleton.getInstance();
		//AdderSingleton a = new AdderSingleton();
		System.out.println(""+adder);
				int result = adder.addOne(5);
		
		if(result == 6) System.out.println("OK");
		else System.out.println("FAIL!");
		
		AdderSingleton adder2 = AdderSingleton.getInstance();
		result = adder2.addOne(7);
		
		if(result == 8) System.out.println("OK");
		else System.out.println("FAIL!"+adder+adder2);
		
		System.out.println("FAIL!\n"+"\n"+adder+"\n"+adder2);
	}
}
