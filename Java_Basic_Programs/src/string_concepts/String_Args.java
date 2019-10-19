package string_concepts;

public class String_Args {

	public static void main(String[] args) {
		String str= "straberries";
		System.out.println(str.substring(2, 5));

	}

}

/*
s t r a b e r r i e s
0 1 2 3 4 5 6 7 8 9 10
 
 Output-
 rab
 
 Returns a string that is a substring of this string. The substring begins at the specified
  beginIndex and extends to the character at index endIndex - 1. Thus the length of the substring 
  is endIndex-beginIndex.

Examples:

 "hamburger".substring(4, 8) returns "urge"
 "smiles".substring(1, 5) returns "mile"
 
 
 */
