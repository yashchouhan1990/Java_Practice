package stringPrograms;

public class Reverse_all_words_keep_sentence_same {

	public static void main(String[] args) {
		String str= "My name is yash chouhan";
		
		// Splitting the given String into words
		String[] words= str.split(" ");
		String reversestring="";
		
		for (int i=0; i<words.length; i++)
		{
			// Taking each word and reversing it
			String word=words[i];
			String reverseword="";
			for(int j= word.length()-1;j>=0; j--)
			{
				reverseword= reverseword+word.charAt(j);
			}
			// Appending reverseWord and reverseString
			reversestring= reversestring+reverseword+ " ";
		}
		// Finally printing the result
		System.out.println("Original String : "+ str);
		System.out.println("String after reverse: "+reversestring);
	}
}

/*
Output- 
Original String :My name is yash chouhan
String after reverse: yM eman si hsay nahuohc 
*/