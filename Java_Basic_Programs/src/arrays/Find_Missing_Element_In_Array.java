package arrays;

public class Find_Missing_Element_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {1,2,3,4,6,7,8,9,10};
		int sum=0, actualsum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of array : "+sum);
		for(int j=1; j<=10; j++)
		{
			actualsum=actualsum+j;
		}

		System.out.println("Original Sum : "+ actualsum);
		System.out.println("Missing Element is : "+ (actualsum-sum));
		
	}

}

/*  This is the logic
 *  
 *  1+2+4+5=12
 *  1+2+3+4+5=15
 * 
 * 5-12= 3 (Missing element)
 * 
 output-
Sum of array : 50
Original Sum : 55
Missing Element is : 5
 * 
 * 
 * */
