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
		
		// Print all the col of the matrix
		System.out.println(" Print all the columns of the matrix");
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