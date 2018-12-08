package arrays;

public class Sum_Of_Array_diagonal_elements {

	public static void main(String[] args) {
		int lsum=0,rsum=0;
		//	int[][] arr= new int[3][3];
		int[][] arr= { 
						{1,2,3},
							{4,5,6},
								{7,8,9},
										};
		int size=arr.length;
		System.out.println("Size of Array=" + size);
		for(int row=0; row<arr.length; row++)
		{
			for (int col=0; col<arr.length; col++)
			{
				System.out.print(arr[row][col]+" ");
				if(row==col)
				{
					//System.out.print("Left Diagonal element is "+arr[row][col]);
					lsum=lsum+arr[row][col];
					
				}
				else if((row+col)==(size-1))
				{
					//System.out.print("Right Diagonal element is "+arr[row][col]);
					rsum= rsum + arr[row][col];
					
				}
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Sum of left Diagonal elements="+lsum); 
		System.out.println("Sum of right Diagonal elements="+rsum);
		System.out.println("Sum of both diagonals="+(lsum+rsum));
		
	}

}

/*
Output-
Size of Array=3
1 2 3 
4 5 6 
7 8 9 

Sum of left Diagonal elements=15
Sum of right Diagonal elements=10
Sum of both diagonals=25
 */
