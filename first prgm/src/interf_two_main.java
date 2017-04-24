interface interf_two_main {
void ac();
void bc();
void cc();
	}

abstract class ty implements interf_two_main
{
  public void ac()
   {
	   System.out.println("abcdefg");
   }
}
class bzss implements interf_two_main //MAIN METHODS
{
public void ac()
{
	System.out.println("class-hijklmn");
}
public void bc()
{
	System.out.println("class-opqrstu");
}
public void cc()
{
	System.out.println("class-uvwxyz");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("class implements methhods");
new bzss().ac();
new bzss().bc();
new bzss().cc();
	}

}
class iju extends  ty  // MAIN METHOD
{
	public void bc()
	{
		System.out.println("opqrstu");
	}
	public void cc()
	{
		System.out.println("uvwxyz");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("abstract implements methhods");
new iju().ac();
new iju().bc();
new iju().cc();
}
}