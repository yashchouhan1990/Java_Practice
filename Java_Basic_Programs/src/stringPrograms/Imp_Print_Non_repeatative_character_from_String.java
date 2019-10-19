package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class Imp_Print_Non_repeatative_character_from_String {


	public static void main(String[] args) {
		
		String str="Geeksforgreeks";
		// Creating a HashMap containing char as a key and occurrences as  a value  hashMap<Key, value> 
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		// Converting given string to char array 
		char[] charArray= str.toCharArray();
		
		  // checking each char of charArray 
		for(char c: charArray)
		{
			if(map.containsKey(c)){
				// If char is present in map, incrementing it's count by 1 
				map.put(c, map.get(c)+1);
			}
			else{
				// If char is not present in map, putting this char to charCountMap with 1 as it's value 
				map.put(c, 1);
			}
		}	

			for(Map.Entry entry : map.entrySet()){
				System.out.println(entry.getKey()+ " " +entry.getValue());
			}

			// Print the Non-repeated character from string
			System.out.println("**Print the Non-repeated character from string**");
			for (Map.Entry entry1 : map.entrySet())
			{ 
				int n=(int) entry1.getValue();
				if (n==1)
				{
					System.out.println("Non repeated character is : "+entry1.getKey());
				}
			}
		
	}
	
}

/*
 * 
Output--
r 2
s 2
e 4
f 1
G 1
g 1
k 2
o 1
**Print the Non-repeated character from string**
Non repeated character is : f
Non repeated character is : G
Non repeated character is : g
Non repeated character is : o


 */


