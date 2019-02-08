package number;

import java.util.Scanner;

public class Reverse_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, rem, rev=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any number to get its reverse");
		n=sc.nextInt();
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			rev=rev*10+ rem;
		}
	
		System.out.println("Reverse of number = "+rev);
		sc.close();
		
		// other approach
		
		long n1= 123456;
		System.out.println(new StringBuffer(String.valueOf(n1)).reverse());
	}
}

/* 
OutPut-
Enter any number to get its reverse
123
Reverse of number = 321

*/
