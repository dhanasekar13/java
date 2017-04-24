//accessing inner class methods using outer class instance methods
// by just calling object outer class methods
package inner_classes;

public class inner_class_method_outer_class_instance_methods {
  class a
  {
	  public void af()
	  {
		  System.out.println("inner ");
	  }
  }
  public void as()
  {
	  System.out.println("outer methods");
	  new a().af();
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new inner_class_method_outer_class_instance_methods().new a().af();//inner class calling static method
		new inner_class_method_outer_class_instance_methods().as();// inner class methods using instance methods
	}

}
