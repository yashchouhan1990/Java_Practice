package arrays;

public class SortArray_In_ascendingOrder {

	public static void main(String[] args) {
		
		int temp=0;
		int arr[]= {4, 2, 1, 5, 9, 7};
		
		for(int i=0; i< arr.length; i++)
		{
			for(int j=i+1; j< arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0; i< arr.length; i++)
		{
		System.out.print(arr[i]+" ");
		}

	}

}
