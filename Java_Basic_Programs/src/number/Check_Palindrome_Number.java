package number;

import java.util.Scanner;

public class Check_Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,rem,rev=0, temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		n=sc.nextInt();
		temp=n;
		
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			rev= rev*10 + rem;
		}
		
		if (temp==rev)
			System.out.println("Its A Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");

	}

}
