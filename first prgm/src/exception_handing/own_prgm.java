//user expection-UserD  //StringBuffer
package exception_handing;
import java.util.*;
public class own_prgm {
	
	
	
	
	
	public static void main(String[] args)throws Exception 
	{
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("enter your name");
    String i=s.nextLine();
    int k=i.length();
    int c=0;
  
        for(int a=0;a<k;a++)
    {
        	char character = i.charAt(a); 
                   	int ascii = (int) character; 
                   	if(ascii>64&ascii<97)
                   	{
                   		System.out.println("entered value contained capital letter");
                   		c=+1;
                   	}
                   	if (c==0)
                   	{
                   		throw new UserD("entered value doesnt  contained capital letter");
                   	}
    }
	
	
	}

}
