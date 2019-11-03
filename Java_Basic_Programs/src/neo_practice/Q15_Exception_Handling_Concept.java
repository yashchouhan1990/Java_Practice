package neo_practice;

public class Q15_Exception_Handling_Concept {

	public static void main(String[] args) {
		// Case 1:
				try {
					System.out.println("Inside 1st Try block");
					throw new NullPointerException("Hello");
					// System.out.println("Hi");      ---> this line is unreachable hence compiler time error
				}
				catch (NullPointerException e) {
					System.out.println("Inside 1st Catch Block");
				}

		// Case 2 :
				try {
					System.out.println("Inside 2nd Try block");
					throw new NullPointerException("Heyy");
				}
				catch (ArithmeticException e) {
					System.out.println("Inside 2nd Catch Block");
				}

	}

}
/*
Inside 1st Try block
Inside 1st Catch Block

Inside 2nd Try block
Exception in thread "main" java.lang.NullPointerException: Heyy

Case2: is no executed as exception is thrown inside 2nd try block

*/