//anonyumus class that implements an interface
interface abc {
	public void b();
}

class cd implements abc {
	
	public void b() {
		System.out.println("class that implemented interface");
	}
}

public class anonymus_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc i = new abc() {
			public void b() {
				System.out.println("anonyomus interface");
			}
		};
		cd jk = new cd();
	i.b();
		anonymus_interface p = new anonymus_interface();
		for (int ik = 0; ik < 10; ik++)
			System.out.println("sekar");

	}

}
