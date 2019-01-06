package interface_concepts;

//Interface declaration: by first user  
interface Drawable{
	void draw();
}

//Implementation: by second user  
class Rectangle implements Drawable{
	public void draw(){
		System.out.println("Drawing a Rectangle");
	}
}

class Circle implements Drawable{
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a Circle");
	}
}

//Using interface: by third user  
public class Interface_1  {
	public static void main (String args[])
	{
		Drawable d = new Circle();
		d.draw();
		
		System.out.println("*********");
		
		Drawable d1= new Rectangle();
		d1.draw();
	}
}

/*
Output-

Drawing a Circle
*********
Drawing a Rectangle
*/
