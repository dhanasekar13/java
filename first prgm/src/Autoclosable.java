//autoclosable interface in java
//no need to use finally to close the file 
//autoclosable.close() will take care of this methods to cllose

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
//Object
public class Autoclosable
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub


try 
{
	FileInputStream is = new FileInputStream(new File("C://Users/User/Desktop/training/stuied material.txt"));

 InputStreamReader isr = new InputStreamReader(is);
 BufferedReader br2 = new BufferedReader(isr);
   String read;
 
   while ((read = br2.readLine()) != null) {
      System.out.println(read);
   }
 }
 catch (IOException ioe) {
   ioe.printStackTrace();
 }
	}

}
