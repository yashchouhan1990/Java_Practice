package number;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any year to check its a Leap Year or Not : ");
		year=sc.nextInt();
		
		if((year % 4 == 0) && (year%100 != 0) || (year % 400 == 0))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}

		sc.close();
	}

}
