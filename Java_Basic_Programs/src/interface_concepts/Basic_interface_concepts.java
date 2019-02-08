package interface_concepts;

/*
Java Interface also represents the IS-A relationship.
It cannot be instantiated just like the abstract class.
Since Java 8, we can have default and static methods in an interface.
Since Java 9, we can have private methods in an interface.

*/

interface Drawable_basic{
	 void draw();	
	//or  public abstract void draw();       compiler adds --> public abstract draw();
	int MIN=5;        // compiler adds --> public static final int MIN=5;
}

public class Basic_interface_concepts implements Drawable_basic {
	@Override
	public void draw() {
		System.out.println("drawing a scenary");
	}
	
	public static void main(String[] args) {
		// Drawable_basic db= new Drawable_basic();   -- interface cannot be instantiated.
		Drawable_basic db= new Basic_interface_concepts();       // This works
		db.draw();
		Basic_interface_concepts bcs= new Basic_interface_concepts();   // This works
		bcs.draw();
	}
}
/*
drawing a scenary
drawing a scenary
*/