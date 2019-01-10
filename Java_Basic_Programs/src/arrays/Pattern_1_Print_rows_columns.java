package arrays;

public class Pattern_1_Print_rows_columns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Print all the row of the matrix
		System.out.println(" Print all the rows of the matrix");
		int row=3, col=3, length=3;
		for(row=0;row<length;row++)
		{
			for(col=0;col<length;col++)
			{
				System.out.print(row+ " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		
		// Print all the col of the matrix
		System.out.println(" Print all the columns of the matrix");
		for(row=0;row<length;row++)
		{
			for(col=0;col<length;col++)
			{
				System.out.print(col+ " ");
			}
			System.out.println();
		}
	}

}

/*
  Print all the rows of the matrix
0 0 0 
1 1 1 
2 2 2 
-----------------------------
 Print all the columns of the matrix
0 1 2 
0 1 2 
0 1 2 
 */
 