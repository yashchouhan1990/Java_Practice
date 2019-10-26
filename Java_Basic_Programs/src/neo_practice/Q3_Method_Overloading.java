package neo_practice;

public class Q3_Method_Overloading {

	public static void Test(String str) {
		System.out.println("String");
	}

	public static void Test(Object o) {
		System.out.println("Object");
	}

	public static void Test(Integer i) {
		System.out.println("Integer");
	}

	
	public static void main(String[] args) {
//		Test(null);       --> this line will give compile time error

	}

}

/*
Output-
Compile time error-- As String and Integer class objects are of same priority so its a ambiguous situation
*/