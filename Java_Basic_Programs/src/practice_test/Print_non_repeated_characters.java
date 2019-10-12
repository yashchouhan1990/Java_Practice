package practice_test;

public class Print_non_repeated_characters {
	
	public static void main(String args[])
	{
		String str= "I am in love with my country";
		String words[]=str.split(" ");

		int arr[]=new int[words.length];
		System.out.println(arr.length);
		for(int i=0; i<words.length; i++)
		{
			if(words[i] != " ")
			{
			arr[i]= words[i].length();
			System.out.print(arr[i]);
			}
		}
		
		System.out.println("***********");
		for(int k=0; k<arr.length; k++)
		{
		//	if(arr[k] != " ")
		//	{
			System.out.print(arr[k]);
		//	}
		}

		System.out.println("########");
	}
}

/*

Output-

city pune with love in Iam 

*/