package stringPrograms;

public class String_SubSequence_And_subString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str= "www.journsldev.com";
//		 System.out.println("Last 4 Characterof the String" + str.subSequence(beginIndex, endIndex));
		 System.out.println("Last 4 Character of the String :: " + str.subSequence(str.length()-4, str.length()));
		 System.out.println("First 4 Character of the String :: " + str.subSequence(0, 4));
		 System.out.println("Print website name :: " + str.subSequence(4,14));
		 
		 //subString vs subSequence
		 System.out.println("Print website name :: " + str.substring(4,14));
		 System.out.println(" subString == subSequence ?? : " + (str.substring(4,14) == str.subSequence(4,14)));
		 System.out.println(" subString equals subSequence ?? :" + (str.substring(4,14).equals(str.subSequence(4,14))));
	}
}
/*

Last 4 Character of the String :: com
First 4 Character of the String :: www.
Print website name :: journsldev
Print website name :: journsldev
 subString == subSequence ?? : false     // subString Returns a string that is a substring of this string where
  											subSequence Returns a character sequence that is a subsequence of this sequence.
 subString equals subSequence ?? :true 

== checks for reference of address
equals checks the actual string
*/