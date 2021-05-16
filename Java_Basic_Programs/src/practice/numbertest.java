package practice;

import java.util.Scanner;

public class numbertest {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Input the first number: ");
		int num1 = in.nextInt();

		System.out.print("input the second number: ");
		int num2 = in.nextInt();

		System.out.print("input the thrid number:");
		int num3 = in.nextInt();

		if (num1>num2)
			if (num1>num3)
			{
				System.out.print("the greatest:" + num1);
			}
			if (num2>num1)
				if(num2>num3)
				{
					System.out.print("The greatest:" + num2);
				}
				if (num3>num1)
					if (num3>num2)
					{
						System.out.print("The greatest:" + num3);
					}	
}

}