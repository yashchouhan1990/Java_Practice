package arrays;

import java.util.Arrays;

public class Find_Smallest_And_Larget_No_In_Araay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {12,3,4,-88,79,456};
		int smallest= arr[0];
		int largest= arr[0];
		//System.out.println(arr.length);
		for (int i=1; i<arr.length;i++)
		{
			if(arr[i]>largest)
				largest=arr[i];
			else if(arr[i]<smallest)
				smallest=arr[i];
		}
		System.out.println("Given array is : "+ Arrays.toString(arr));
		System.out.println("Smallest Number is : "+smallest);
		System.out.println("Largest Number is : "+largest);
	}
}

/*
Output-
Given array is : [12, 3, 4, -88, 79, 456]
Smallest Number is : -88
Largest Number is : 456

*/
