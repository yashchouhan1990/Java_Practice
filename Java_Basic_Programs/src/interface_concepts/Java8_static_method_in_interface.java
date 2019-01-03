package interface_concepts;

interface Drawable_sample{
	void draw();
	static int cube(int a){
		return a*a*a;
	}
}

class Rectangle_sample implements Drawable_sample{

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}

public class Java8_static_method_in_interface {
	public static void main(String args[]){
		Rectangle_sample rs= new Rectangle_sample();
		rs.draw();
		int output= Drawable_sample.cube(5);
		System.out.println("Volume of Cube :"+ output );
		
		// another approach
		System.out.println("********");
		Drawable_sample ds= new Rectangle_sample();
		ds.draw();
		System.out.println("Volume of Cube :" +Drawable_sample.cube(6));
		
	}
}
/*
Output-
Drawing Rectangle
Volume of Cube :125
Drawing Rectangle
Volume of Cube :216
*/