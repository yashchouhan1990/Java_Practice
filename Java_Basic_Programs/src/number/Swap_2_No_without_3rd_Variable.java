package number;

import java.util.Scanner;

public class Swap_2_No_without_3rd_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter First Number: ");
		a= sc.nextInt();
		System.out.println("Enter Second Number: ");
		b=sc.nextInt();
		sc.close();
		System.out.println("Number's before Swapping : ");
		System.out.println("First No = "+a +" Second No = "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("***********");
		System.out.println("Number's after Swapping :");
		System.out.println("First No = "+a +" Second No = "+b);
	}

}


/*
Output-

Number's before Swapping : 
First No = 2 Second No = 3
Number's after Swapping :
First No = 3 Second No = 2
 */