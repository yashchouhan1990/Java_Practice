package arrays;

public class Pattern_2_half_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Print all the row of the matrix
		System.out.println(" Print all the rows of the matrix");
		int row=3, col=3, length=3;
		for(row=0;row<length;row++)
		{
			for(col=0;col<=row;col++)
			{
			//	System.out.print(row+ " ");
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		
		for(row=0;row<length;row++)
		{
			for(col=0;col<=row;col++)
			{
			//	System.out.print(row+ " ");
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		
		// Print all the Index values of the matrix
		System.out.println(" Print all the Index values of the matrix");
		for(row=0;row<length;row++)
		{
			for(col=0;col<length;col++)
			{
				System.out.print(""+row+col+" ");
			}
			System.out.println();
		}
	}
}
/*
Output-
 Print all the rows of the matrix
*
**
***
-----------------------------
*
**
***
-----------------------------
 Print all the columns of the matrix
00 01 02 
10 11 12 
20 21 22 

*/