package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class Count_Of_each_Character_In_String {

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
		
	}

}
/* 
 * Output-
r 2
s 2
e 4
f 1
G 1
g 1
k 2
o 1

 * 
 * 
 */
/*
class Count_Of_each_Character_In_String { 
    static void characterCount(String inputString) 
    { 
        // Creating a HashMap containing char 
        // as a key and occurrences as  a value 
        HashMap<Character, Integer> charCountMap 
            = new HashMap<Character, Integer>(); 
  
        // Converting given string to char array 
  
        char[] charArray = inputString.toCharArray(); 
  
        // checking each char of charArray 
        for (char c : charArray) { 
            if (charCountMap.containsKey(c)) { 
  
                // If char is present in charCountMap, 
                // incrementing it's count by 1 
                charCountMap.put(c, charCountMap.get(c) + 1); 
            } 
            else { 
  
                // If char is not present in charCountMap, 
                // putting this char to charCountMap with 1 as it's value 
                charCountMap.put(c, 1); 
            } 
        } 
  
        // Printing the charCountMap 
        for (Map.Entry entry : charCountMap.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        String str = "Geeksforgeeks"; 
        characterCount(str); 
    } 
} */