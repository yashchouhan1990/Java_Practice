package number;

import java.util.Scanner;

public class Check_Even_Odd_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		n=sc.nextInt();
		if(n%2==0)
				System.out.println("Number is Even");
		else
			System.out.println("Number is ODD");
		sc.close();

	}

}
