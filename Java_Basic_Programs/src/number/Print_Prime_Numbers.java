package number;

import java.util.Scanner;

public class Print_Prime_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,range, flag;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the range of Prime Numbers to be Printed ");
		range=sc.nextInt();
		System.out.println(" Prime Numbers are :");
		for( n=2; n<=range; n++)		// Loop for printing series up to N numbers
		{
			flag=1 ;
					
			for(int i=2; i<n; i++)
			{
				if(n%i==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				System.out.print(n +" ");
			}
		}	
		
		sc.close();
	
	}

}

/*
 Output-
 
 Enter the range of Prime Numbers to be Printed 
30
 Prime Numbers are :
2 3 5 7 11 13 17 19 23 29 
 */