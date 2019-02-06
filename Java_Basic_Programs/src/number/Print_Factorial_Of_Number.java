package number;

import java.util.Scanner;

public class Print_Factorial_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, fact=1;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any number to get its Factorial");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of a Number = " +fact);
		sc.close();
	}
}
/* 
OutPut-
Enter any number to get its Factorial
5
Factorial of a Number is = 120

*/