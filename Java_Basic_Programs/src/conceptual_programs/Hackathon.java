package conceptual_programs;

import java.util.Scanner;

public class Hackathon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number 3 times");
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		int input3 = scanner.nextInt();
		scanner.close();

		System.out.println(input1);
		System.out.println(input2);
		System.out.println(input3);
	}

}
/*
output-
Enter any number 3 times
2
3
4
2
3
4
*/