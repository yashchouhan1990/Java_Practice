package static_test;

public class Static_Variable_Concept {
	static int x=0;
	public static void main(String[] args) {
			System.out.println(fun());
		}

	static int fun() {
		return ++x;
	}
}
/*
 Output-
 1
 */



/*

public class Static_Variable_Concept {

	public static void main(String[] args) {
			System.out.println(fun());
		}

	static int fun() {
		static int x=0;	
		return x;
	}
}


Output-
Compile Time error
Static local variable are not allowed in Java
*/