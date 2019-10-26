package neo_practice;

public class Q11_String_Concept {

	public static void main(String[] args) {
		String str= "Automation Testing";
		boolean bol;
		bol= str.startsWith("Automation");
		System.out.println("First case: "+bol);
		
		System.out.println("***************");
		String s= "Automation Testing";
		boolean b;
		b= s.startsWith("automation");
		System.out.println("Second case: "+b);
		
	}

}
/*
 Output
First case: true
***************
Second case: false
*/