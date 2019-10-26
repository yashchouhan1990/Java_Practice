package neo_practice;

public class Q4_Method_Overloading {

	public static void Test(String str) {
		System.out.println("String");
	}

	public static void Test(Object o) {
		System.out.println("Object");
	}

	
	public static void main(String[] args) {
		Test(null);       

	}

}
/*
Output-

String -- most closest class objects are choosen
*/