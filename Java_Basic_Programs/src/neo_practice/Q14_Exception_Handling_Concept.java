package neo_practice;

public class Q14_Exception_Handling_Concept {

	public static void main(String[] args) {
		
// Case 1 :
		try {
			System.out.println("Inside First Try block");
			throw new NullPointerException("Hello");
		}
		catch (ArithmeticException e) {
			System.out.println("Inside First Catch Block");
		}

// Case 2:
		try {
			System.out.println("Inside Second Try block");
			throw new NullPointerException("Hello");
		}
		catch (NullPointerException e) {
			System.out.println("Inside Second Catch Block");
		}

	}

}

/*
 Case1: 
Inside Try block
Exception in thread "main" java.lang.NullPointerException: Hello

Case2: is no executed as exception is thrown inside first try block

*/