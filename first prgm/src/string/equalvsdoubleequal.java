/*author
 * these has length and length method
 * size of---array------string------
 */


package string;

public class equalvsdoubleequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("dhana");
		StringBuffer di=new StringBuffer("dhana");
		int[] d={7,5,5,4,2,4};
		String i="sekar";
		String j="gsekar";
		String k="dhana";
		System.out.println(j.contentEquals(k));
		System.out.println(i==j);//reference 
		System.out.println(di.equals(k));//check the content 
		System.out.println(s.length());//length  of string
System.out.println(d.length);//length of an array
System.out.println(i.indexOf('a'));//whether this is available are nt if available  thn shows its position
System.out.println("      "+i.lastIndexOf('p')); //shows at last appeared location if there is no value available then it  shows -ve value
System.out.println(i.contains("kr"));//wheter these group of char available are not 
System.out.println(i.startsWith("s"));//whether it starts with these letter are string
System.out.println(i.endsWith("s"));//whether it ends  with these letter are string 
System.out.println("     dhanasekar     ".trim());
System.out.println("     dhanasekar     ");
	}

}
//differeence between equals and contentequal
 class Test
{
    public static void main(String[] args)
    {
        String str1 = "Hello";
        String str2 = new String("Hello");
        StringBuilder str3 = new StringBuilder(str1);
 
        System.out.println("str1.equals(str2): " + (str1.equals(str2)));
        System.out.println("str1.contentEquals(str2): " + (str1.contentEquals(str2)));
        System.out.println("str1.equals(str3): " + (str1.equals(str3)));
        System.out.println("str1.contentEquals(str3): " + (str1.contentEquals(str3)));
    }
}