package stringPrograms;

import java.util.HashSet;
import java.util.Set;

public class String_Permutation_1 {
	
	/**
	 * @author Crunchify.com
	 * 
	 */
	 
		public static void main(String[] args) {
			String s = "ABC";
			String s1 = "EBAY";
			String s2 = "Yahoo";
			String s3 = "";
			System.out.println("\nString " + s + ":\nPermutations: " + Permutations(s));
			System.out.println("\nString " + s1 + ":\nPermutations: " + Permutations(s1));
			System.out.println("\nString " + s2 + ":\nPermutations: " + Permutations(s2));
			System.out.println("\nString " + s2 + ":\nPermutations: " + Permutations(s3));
		}
	 
		public static Set<String> Permutations(String str) {
			Set<String> setResult = new HashSet<String>();
			if (str == null) {
				return null;
			} else if (str.length() == 0) {
				setResult.add("");
				return setResult;
			}
	 
			char firstChar = str.charAt(0);
			String rem = str.substring(1);
			Set<String> words = Permutations(rem);
			for (String newString : words) {
				for (int i = 0; i <= newString.length(); i++) {
					setResult.add(CharAdd(newString, firstChar, i));
				}
			}
			return setResult;
		}
	 
		public static String CharAdd(String str, char c, int j) {
			String first = str.substring(0, j);
			String last = str.substring(j);
			return first + c + last;
		}
	 

}
