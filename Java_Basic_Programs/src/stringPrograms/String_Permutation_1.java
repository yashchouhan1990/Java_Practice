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
			System.out.println("\nString " + s3 + ":\nPermutations: " + Permutations(s3));
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

/*
Output-

String ABC:
Permutations: [ACB, BCA, ABC, CBA, BAC, CAB]

String EBAY:
Permutations: [YEBA, YABE, YBAE, BEAY, BYAE, YEAB, AEBY, EAYB, AYBE, EBYA, ABEY, AYEB, YBEA, BYEA, YAEB, BAEY, EABY, ABYE, EYBA, AEYB, BEYA, EBAY, BAYE, EYAB]

String Yahoo:
Permutations: [ohYao, ohoaY, oaoYh, haYoo, haooY, oYoah, hoYao, hooaY, aoYoh, ohaYo, hYaoo, hYooa, ohoYa, hoaYo, Yaoho, hooYa, Yoaoh, aYoho, ooaYh, Yoaho, Yooha, oaYoh, haoYo, hYoao, ooYah, aYhoo, Yahoo, oYaoh, aoYho, aoohY, Yohao, aohYo, ohaoY, ohYoa, oahYo, oaohY, oaYho, oYhao, aohoY, oYaho, oYoha, Yhoao, ahoYo, Yohoa, oohYa, ooahY, ooYha, Yhaoo, Yhooa, hoaoY, hoYoa, oahoY, oohaY, aYooh, Yaooh, ahYoo, ahooY, oYhoa, Yooah, aooYh]

String :
Permutations: []
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Explanation
Permutation of String in Java Algorithm
To get all the permutations, we will first take out the first char from 
String and permute the remaining chars.

If String = “ABC”
First char = A and remaining chars permutations are BC and CB.

Now we can insert first char in the available positions in the permutations.
BC -> ABC, BAC, BCA
CB -> ACB, CAB, CBA
So we can write a recursive function call to return the permutations and then another 
function call to insert the first characters to get the complete list of permutations.

*/