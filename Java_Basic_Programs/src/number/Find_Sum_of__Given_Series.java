package number;

import java.util.Scanner;

public class Find_Sum_of__Given_Series {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter any number");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println("Sum is = "+sum);	
		sc.close();
	}


}
