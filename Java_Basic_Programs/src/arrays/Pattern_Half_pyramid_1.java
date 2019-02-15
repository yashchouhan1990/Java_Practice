package arrays;

public class Pattern_Half_pyramid_1 {

	public static void main(String[] args) {
		int row=5, col=5, length=5;
		
		for(row=0; row<length; row++)
		{
			for(col=0; col<length; col++)
			{
				if(row>=col)
				 System.out.print("* ");        	// 1. Stars
				// System.out.print(col+" ");    	// 2. col
				// System.out.print(row+" ");		// 3. row
			}
			System.out.println();
		}
	}
}

/*
Output-

1. Stars-
* 
* * 
* * * 
* * * * 
* * * * * 

2. Col-
0 
0 1 
0 1 2 
0 1 2 3 
0 1 2 3 4

3. Row-
0 
1 1 
2 2 2 
3 3 3 3 
4 4 4 4 4 


*/