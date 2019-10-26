package neo_practice;

public class Q12_Exception_Handling_concept {

	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			int res=a/b;
		}

		catch(ArithmeticException a){
			System.out.println("Catch 1");
		}		
		catch(Exception e){
			System.out.println("Catch 2");
		}
		
		finally {
			System.out.println("Finally");
		}
	}
}
/*
Output-
Catch 1
Finally

*/