package oops_concept;

public class Constructor_Overloading {

	// Its not a good example-- check constructor student overloading example
	
	public Constructor_Overloading(int x, int y) {
		System.out.println("Sum of two number is : "+(x+y));
	}
	
	public Constructor_Overloading(int x, int y, int z) {
		System.out.println("Sum of three number is : "+(x+y+z));
	}
	// Private constructor
	private Constructor_Overloading(int x, int y, int z, int a) {
		System.out.println("Sum of four number is : "+(x+y+z+a));
	}
	
	protected Constructor_Overloading(int x, int y, int z, int a, int b) {
		System.out.println("Sum of five number is : "+(x+y+z+a+b));
	}
	
	public static void main(String[] args) {
		Constructor_Overloading con1 = new Constructor_Overloading(10, 20);
		Constructor_Overloading con2 = new Constructor_Overloading(10, 20, 30);
		
		Constructor_Overloading con_over1 = new Constructor_Overloading(10, 20, 30,40);
		Constructor_Overloading con_over2 = new Constructor_Overloading(10, 20, 30,40, 50);
	}
}

/*
 *
Output-
Sum of two number is : 30
Sum of three number is : 60
Sum of four number is : 100
Sum of five number is : 150
 */
