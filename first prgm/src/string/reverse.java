//  if you want to change from string to stringbuffer just declare is enough
//  but by the same way if you want to change from stringbuffer to string by using this keyword only you can change 
//   ---reverse()
//   ---equal()
//   ---compareto()
//   ---equalignorecase()
//  note---equal() return  boolean data value
//      ---compareto() return int data value
//
package string;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sth="";
String s="dhanas";
StringBuffer b=new StringBuffer(s);
System.out.println(b);
System.out.println(b.reverse());
StringBuffer sb=new StringBuffer("dhanasekar");
String str=sb.toString();
System.out.println(str);

//if you want to perform reverse operation using charat()

int j=s.length();

for (int e=0;e<j;e++)
{
	
	sth=sth+s.charAt(e);
}
if(true)
{
	System.out.println(sth);
}



///compare to method 
//---if two values are equal returns 0
// ---other than equal if first string first value is greater than the second string then return +ve value if it is lesser than the it return -ve 


String q="dhana";
String w="dhana";
String iw="EHANA";
int u=q.compareTo(w);
System.out.println(u);
//this method is used to return true or false
System.out.println(q.equalsIgnoreCase(iw));
System.out.println(q.compareToIgnoreCase(iw));
System.out.println("kjhfkgkd".equalsIgnoreCase(iw));
System.out.println(q.equalsIgnoreCase("dsdjgffda"));
System.out.println("shdjhdhf".compareToIgnoreCase(iw));
System.out.println(q.compareToIgnoreCase("jhfgshdfj"));

	}

}
