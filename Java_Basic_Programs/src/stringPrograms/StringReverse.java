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
			
		for(int i=s.length()-1; i>=0;i--)
		{
			reverse= reverse+ s.charAt(i);
		}
		System.out.println("String after reverse = "+ reverse);

	}

}
