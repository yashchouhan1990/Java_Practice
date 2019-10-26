package neo_practice;

public class Q6_String_Concept {

	public static void main(String[] args) {
		String s1="automation testing";
		String s2="automation";
		String s3=new String(" testing");
		String s4= s2.concat(s3);
		System.out.println("String s4: "+s4);
		if(s1.equals(s4))
			System.out.println("String are equal");
		else
			System.out.println("String are NOT Equal");
 	}

}

/*
 Output-
String s4: automation testing
String are equal
 
 */
