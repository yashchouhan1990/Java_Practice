package neo_practice;

public class Q8_Static_variable_concept {

	private static String  str= "testing";
	
	public void print() {
		System.out.println("Result from print method: "+str);
	}
	
	public static void show() {
		System.out.println("Result from show method: "+str);
	}


	public static void main(String[] args) {
	//	print();       --> this method calling will give compile time error static method can not call the non-static method
		
		show();
		
	}

}

/*
Output of calling show method-
Result from show method: testing
*/
