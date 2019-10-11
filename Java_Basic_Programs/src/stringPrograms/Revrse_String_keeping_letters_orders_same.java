package stringPrograms;

public class Revrse_String_keeping_letters_orders_same {

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

