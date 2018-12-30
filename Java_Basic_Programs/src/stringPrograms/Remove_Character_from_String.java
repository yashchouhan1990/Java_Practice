package stringPrograms;

import java.util.Scanner;

public class Remove_Character_from_String {

	private static String revCharacter(String str, String rep){
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
		String finalString=revCharacter(str,rep);
		System.out.println("After replacement : " + finalString);
		sc.close();
	}

}
