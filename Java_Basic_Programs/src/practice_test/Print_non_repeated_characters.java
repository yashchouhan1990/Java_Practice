package practice_test;

public class Print_non_repeated_characters {
	
	public static void main(String args[])
	{
		String str= "Iam in love with pune city";
		String words[]=str.split(" ");
		
		for(int i=words.length-1; i>=0; i--)
		{
			System.out.print(words[i]+ " ");
		}
	}
}

/*

Output-

city pune with love in Iam 

*/