package number;

public class Factorial_using_recursion {

	static int factorial(int n) {
		
		if(n == 0)
			return 1;
		else
			return (n*factorial(n-1));
		
	}
	
	public static void main(String[] args) {
		
		int fact=1,n=5, result=0;
		
		fact= factorial(n);
		System.out.println("Factorial of "+n+" is : "+fact);

	}
	


}

