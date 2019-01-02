package stringPrograms;
public class Count_Words_In_String {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str= "welcome to candid java tutorial";      // Note; There should be black space in start of String
		String str= "I L U V M ";
		int count=0;
		for(int i=0; i < str.length()-1; i++)
		{
			System.out.println(str.charAt(i));
			if ((str.charAt(i) != ' ') && (str.charAt(i+1) == ' '))
			{
				count++;
			}
		}
	System.out.println("Number of words in a string = " + count);
	}
}

/*
Output-
Number of words in a string = 5
*/