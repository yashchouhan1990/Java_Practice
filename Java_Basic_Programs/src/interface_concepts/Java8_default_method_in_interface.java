package interface_concepts;

interface Drawable_test{
	void draw();
	default void msg(){
		System.out.println("Default method");
	}
}

class Rectangle_test implements Drawable_test{

	@Override
	public void draw(){
		System.out.println("Drawing rectangle");
	}
}

public class Java8_default_method_in_interface {
	public static void main(String args[]){
		Rectangle_test tc= new Rectangle_test();
		tc.draw();
		tc.msg();
		
		// another way to use interface methods
	System.out.println("******");
		// Drawable_test d = new Drawable_test();   -- we can can create the instance of Drawable_test
		Drawable_test d = new Rectangle_test();
		d.draw();
		d.msg();
	}
}
