
public class con_break {

	        con_break(int a)
	        {
	        	System.out.println("one argumnent constructor");
	        }
	
	public static void main(String[] args) {
		// TODO Auto-generated method 

		con_break j=new con_break(10);
		int a=1;
		for (int n=0;n<10;n++)
		{a++;
		if(a==2)
			continue;
			if(a==5)
				break;
			System.out.println(a);
		}
		
	}

}
