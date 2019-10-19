package conceptual_programs;


class MainClass{
	final String message() {
		return "hello";
	}
}
/*
public class FinalMethod_test extends MainClass {
	public static void main(String[] args) {
		System.out.println(message());

	}
	 String message() {
		return "World";
	}
}
*/


/*

Code will give compilatio error on line 12, 15
final method can not be overrriden
*/