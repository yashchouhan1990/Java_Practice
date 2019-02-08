package number;

import java.util.Scanner;

public class Check_PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, flag=1;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any number to check its Prime or not");
		n=sc.nextInt();
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=0;
				break;
			}
			
		}	
			if(flag==1)
			{
				System.out.println("Its a Prime Number");
			}
			else
			{
				System.out.println("Its Not a Prime Number");
			}
		sc.close();
	}
}

/* 
OutPut-
Enter any number to check its Prime or not
71
Its a Prime Number
*/