package task1withmap;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class front {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner se=new Scanner(System.in);
		
		BufferedReader si = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader si = new BufferedReader(System.in);
		int a;
		try {
			do {
				String s="dha";
				StringBuffer ads=new StringBuffer("dha");
				if(s.equals(ads))
				{
					
				}
				System.out.println("what operation do you want to perform");

				System.out.println("1.create " + "2.view "+"3.update" +"4.dispay all detail\n " + ""
						+ "5.want to view previous record stored 5.exit");
				a = se.nextInt();
				int b;
				switch (a) {
				case 1:
					new createnew().new1();
					break;
				case 2:
					System.out.println("Enter the phone no.. to view ");
					String sq1=si.readLine();
					new createnew().b(sq1);
					break;
				case 3:
					System.out.println("Enter whose phone no.. to update");
					String sq=si.readLine();
					new createnew().v(sq);
					break;
				case 4:
					new createnew().a();
					
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

