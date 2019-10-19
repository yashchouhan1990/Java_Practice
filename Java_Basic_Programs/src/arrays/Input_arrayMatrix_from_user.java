package arrays;

import java.util.Scanner;

public class Input_arrayMatrix_from_user {

	public static void main(String[] args) {

		int row,col;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the Square Matrix: ");
		
		int size=sc.nextInt();
		System.out.println("Enter the array elements");
		int[][] arr= new int[size][size];
		for (row=0; row<size;row++)
		{
			for(col=0; col<size; col++)
			{
				arr[row][col]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Elements of Array are:");
		for (row=0;row<arr.length;row++)
		{
			for(col=0;col<arr.length;col++)
			{
				System.out.print(arr[row][col]+ " ");        // Printing in the same line
			}
			System.out.println();
		}
		sc.close();
	}
}
/*
 Output-
 
 Enter size of the Square Matrix: 
3
Enter the array elements
1
2
3

4
5
6

7
8
9

Elements of Array are:
1 2 3 
4 5 6 
7 8 9 

 */
