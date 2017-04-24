package array;

public class array_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        s i=new s(2,"Dhana");
        s j=new s(4,"sekar");
        s k=new s(5,"sds");
        s[] l=new s[39];
        l[2]=i;
        l[3]=j;
        l[6]=k;
        l[23]=i;
        l[32]=j;
        l[38]=k;
        for (int d=0;d<l.length;d++){
        	if (l[d]==null)
        	{
        		System.out.println(d);
        	}
        }
        
        
	}

}
