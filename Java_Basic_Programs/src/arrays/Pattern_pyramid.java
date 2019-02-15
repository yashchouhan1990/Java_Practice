package arrays;

public class Pattern_pyramid {

	public static void main(String[] args) {
		int length=5;
		
		for(int row=0; row<length; row++)
		{
			for(int col=length-row; col>1; col--)
			{
				System.out.print("p ");
			}
			
			for(int col=0; col<=1; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
