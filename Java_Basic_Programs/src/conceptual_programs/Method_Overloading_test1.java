package conceptual_programs;

public class Method_Overloading_test1 {

	public static void gfg(String s) {
		System.out.println("String");
	}
	
	public static void gfg(Object o) {
		System.out.println("Object");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		gfg(null);
	}
}

/*
Output-
String

Explanation : In case of method overloading, the most specific method is chosen at compile time.
 As ‘java.lang.String’ is a more specific type than ‘java.lang.Object’. In this case the method
  which takes ‘String’ as a parameter is chosen.
*/


/*
Program-2 

public class Method_Overloading_test1 {

	public static void gfg(String s) {
		System.out.println("String");
	}
	
	public static void gfg(Object o) {
		System.out.println("Object");
		
	}

	public static void gfg(Integer i) {
		System.out.println("Integer");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		gfg(null);
	}
}


Output- Compile Time Error

Explanation: In this case of method Overloading, the most specific method is choosen at compile time. As ‘java.lang.String’ and ‘java.lang.Integer’ is a more specific type than ‘java.lang.Object’,but between ‘java.lang.String’ and ‘java.lang.Integer’ none is more specific. In this case the Java is unable to decide which method to call.
*/

