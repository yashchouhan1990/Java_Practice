package stringPrograms;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String reverse="";
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to be reversed= ");
		s=sc.nextLine();
		
		// 1. By traversing from last to first
		int Stringlength= s.length();
		System.out.println("Length of String is : "+ Stringlength); 
		
		for(int i=s.length()-1; i>=0;i--)    // String index start from zero. That's y length-1.
		{
			reverse= reverse+ s.charAt(i);
		}
		System.out.println("String after reverse = "+ reverse);
		
		if(s.equalsIgnoreCase(reverse))
			System.out.println("Palindome");
		else
			System.out.println("Not a palindrome");
		
		// 2. Sung stringBuilder or stringBuffer class
		// OR Using StringBuffer and builder class
		
		System.out.println("*************");
		
		StringBuffer sb= new StringBuffer(s);
		System.out.println("Reversed String is : " +sb.reverse());

		System.out.println("#################");
		
		//3. we can compare characters in the String from both ends to find out if it’s palindrome or not.
		
		//int length= s.length();
		
		System.out.println("Length of String is : "+ Stringlength);
		System.out.println(Stringlength/2);
		for(int i=0; i<Stringlength/2; i++)
		{
			if(s.charAt(i) != s.charAt(Stringlength-i-1))
				System.out.println( "Not a palindrome");
		}
		System.out.println("Palindome");
	}

}
