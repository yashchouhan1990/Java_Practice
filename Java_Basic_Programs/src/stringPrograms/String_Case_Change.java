package stringPrograms;

import java.util.Scanner;

public class String_Case_Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any String");
		str=sc.nextLine();
		
		System.out.println("String in Uppercase ::" +str.toUpperCase());
		System.out.println("String in lowercase ::" + str.toLowerCase());

	}

}
