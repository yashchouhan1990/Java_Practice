package arrays;

public class test {

	public static void main(String args[]) {
		
		int arr[]= {1,2,3,3,2,1};
		int flag=0;
		for(int i=0; i<arr.length/2; i++)
		{
		
			if(arr[i] !=arr[arr.length-i-1])
			{
				flag=1;
				break;
			}
		}
		
		if(flag==1)
			System.out.println("Array is Not Palindrome");
		else
			System.out.println("Array is Palindrome");

	}
}
