package stringPrograms;

import java.util.Scanner;

public class Remove_Character_from_String {

	private static String repCharacter(String str, String rep){
		if(str == null)
			return null;
		return str.replaceAll(rep, "");
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str, rep;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any String");
		str=sc.nextLine();
		
		System.out.println("Enter the character to be replace from the String");
		rep= sc.nextLine();
		String finalString=repCharacter(str,rep);
		System.out.println("After replacement : " + finalString);
		sc.close();
	}
/*	public static void main(String[] args) {
	 String str= "Hi there, How are you";
	 String rep= "H";
	 System.out.println("Output : "+ str.replaceAll(rep, ""));
		// Output : i there, ow are you
	 }
*/

	
}
