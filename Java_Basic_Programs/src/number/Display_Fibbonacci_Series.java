package number;

import java.util.Scanner;

public class Display_Fibbonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fab=0, a=0, b=1, n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range of the Fibbonacci series");
		n=sc.nextInt();
		//while(fab<=n)
		for( int i=0; i<=n;i++)
		{

			System.out.print(fab + " ");
		
			fab=a+b;
			a=b;
			b=fab;
		}
		sc.close();
	}
}

/*
Output-
Enter the range of the Fibbonacci series
10
0 1 2 3 5 8 13 21 34 55 89 
*/
