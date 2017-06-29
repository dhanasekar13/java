package exception_handing;

public class throw_except {
	public static void hi() throws Exception {

		try {
			throw new dhanasekarException("hdi");
		} catch (ArithmeticException i) {
			System.out.println("first thread");
			throw i;
		}
	}

	public static void main(String[] args) throws Exception {

		// TODO Auto-generated method stub
		
			hi();
		

	}

}

class dhanasekarException extends Exception {
	dhanasekarException() {
		System.out.println("this is zero argument constructor");
	}

	dhanasekarException(String s) {
		System.out.println("this is one argument constructor");
	}
}