package practice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lsum=0 , rsum=0;
		int[][] arr= new int[][]{
									{1,2,3},
									{4,5,6},
									{7,8,9}
											};
		int size=arr.length;
		System.out.println("Size=" +size);
		
		for(int row=0; row<arr.length; row++)
		{
			for (int col=0; col<arr.length; col++)
			{
				System.out.print(arr[row][col]+" ");
				if(row==col)
				{
					lsum=lsum+ arr[row][col];
				}
				else if(row+col==size-1)
				{
					rsum=rsum+arr[row][col];
				}
			}
			System.out.println();
		}
		
		System.out.println("Ldiagonal sum="+lsum);
		System.out.println("Rdiagonal sum="+rsum);
		System.out.println(" Total sum of diagonals"+(lsum+rsum));
		

	}

}
