package number;

import java.util.Scanner;

public class Swap_2_No_using_3rd_Variable {

	public static void main(String[] args) {
		int n1, n2, temp;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter First Number: ");
		n1= sc.nextInt();
		System.out.println("Enter Second Number: ");
		n2=sc.nextInt();
		sc.close();
		System.out.println("Number's before Swapping : ");
		System.out.println("First No = "+n1 +" Second No = "+n2);
		temp=n1; 
		n1=n2;
		n2=temp;
		System.out.println("Number's after Swapping :");
		System.out.println("First No = "+n1 +" Second No = "+n2);
	}
}

/*
Output-
Number's before Swapping : 
First No = 2 Second No = 3
Number's after Swapping :
First No = 3 Second No = 2
 */
