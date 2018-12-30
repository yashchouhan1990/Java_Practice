package stringPrograms;

import java.util.Scanner;

public class String_Palindrom_Method {
	//1. Method 
	private static boolean Check_Palindrome(String str)
	{
		if(str == null)
			return false;
		else
		{
			StringBuilder sb= new StringBuilder(str);
			sb.reverse();
			return sb.toString().equals(str);	
		}
		
	}

	//2. Method
	private static boolean Test_Palindrome(String str)
	{
		if(str == null)
			return false;
		else
		{
			String rev= "";
			for (int i=str.length()-1; i>=0;i--)
				rev=rev+str.charAt(i);
			
			return rev.toString().equals(str);	
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to be checked for Palindrome : ");
		str=sc.nextLine();
		Boolean status=Check_Palindrome(str);
		if(status== true)
			System.out.println("String is Palindome");
		else
			System.out.println("String is not palindome");
		
		System.out.println("*************");
		
		Boolean check_status = Test_Palindrome(str);
		if(check_status== true)
			System.out.println("String is Palindome");
		else
			System.out.println("String is not palindome");
		
		sc.close();
	}

}
/*
Output-
String is not palindome
*************
String is not palindome
*/