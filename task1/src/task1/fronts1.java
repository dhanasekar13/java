package task1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class fronts1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner si = new Scanner(System.in);
		int i = 0, a;
		try {
			do {
				System.
				out
				.
				println("what operation do you want to perform");

				System.out.println("1.create 2.view 3.dispay all detail\n "
						+ ""
						+ "4.want to view previous record stored 5.exit");
				a = si.nextInt();
				int b;
				switch (a) 
				{
				case 1:
					new db1();
					break;
				case 2:
					new db1("s");
					break;
				case 3:
					new db1(0, 0, 0);
					break;
				case 4:
					new db1(0,0);
					break;
				case 5:
					break;
				default:
					System.out.println("wrong operation ");
				}
			} while (a < 5);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println();
		}
	}
}