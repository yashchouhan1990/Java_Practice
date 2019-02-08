package number;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		int n,rem, temp, count=0,p, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to check its a Armstrong Number = ");
		n=sc.nextInt();
		temp=n;
			
		while(n>0)
		{
			n=n/10;
			count++;
		}
		n=temp;
	//	System.out.println(count);
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			p=1;
			for(int i=1; i<=count; i++)
			{
				p=p*rem;
			}
			sum=sum+p;
		}
	//	System.out.println(sum);
		if(sum==temp)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Not a Armstrong number");
		sc.close();
	}
}
/*
Enter any number to check its a Armstrong Number = 
153
Number is Armstrong
 */
