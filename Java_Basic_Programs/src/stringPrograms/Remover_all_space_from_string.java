package stringPrograms;

public class Remover_all_space_from_string {

	public static void main(String[] args) {
	
	 
	String s= "I am practicing Java Coding";
	System.out.println("Original String:-- "+ s);
	
	//1. Replace all method
	s= s.replaceAll(" ", "");
	System.out.println("String after removing space:-- "+ s);

	System.out.println("************");
	
	//2. using array concept
	String str = "Lets try other way";
	System.out.println("Original String:-- "+ str);
	String[] arraySting= str.split(" ");
	System.out.println("String after removing space: ");
	for(int i=0; i<arraySting.length; i++){
		System.out.print(arraySting[i]);
    	}
	}
}

/*
 * Output-

Original String:-- I am practicing Java Coding
String after removing space:-- IampracticingJavaCoding
************
Original String:-- Lets try other way
String after removing space: 
Letstryotherway
*/