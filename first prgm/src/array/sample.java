//simple array concept like getting value from user and print 
//declaring an array
//
//
package array;
import java.util.Scanner;
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a={5,4,3,2,78};
        int[] b=new int[15];
       //    System.out.println("enter the how many value you want to tyoe");
           Scanner si=new Scanner(System.in);
           //int o=si.nextInt();
           System.out.println(" value of integer array");
                    for (int r=0;r<a.length;r++)
           {
                    	System.out.println(a[r]);
           }
                    System.out.println("enter the values of b integer");
   for (int d=0;d<=5;d++) 
   {
	   b[d]=si.nextInt();
   }
   for (int r:b)
   {
	   System.out.println(r);
   }
   
	}

}
