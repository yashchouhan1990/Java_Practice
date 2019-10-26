package neo_practice;

public class Q13_Exeption_Handling_Concept {
	
	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			int res=a/b;
			System.out.println(res);
		}

		catch(Exception e){
			System.out.println("Catch 1");
		}
/*		catch(ArithmeticException a){
			System.out.println("Catch 2");
		}		
*/
		
		finally {
			System.out.println("Finally");
		}
	}

}
/*
 Compiler error given by 2nd catch block
 reason-Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
 
 */