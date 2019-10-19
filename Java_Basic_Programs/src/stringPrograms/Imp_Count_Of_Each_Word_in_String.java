package stringPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Imp_Count_Of_Each_Word_in_String {

	public static void main(String[] args) {
		
		String str= "My name is yash My profile is Automation Test Engineer";
		
		String []array= str.split(" ");
		
		
		System.out.println("****Case1: Using HashSet to find duplicate words****");
//Case1: Using HashSet to find duplicate words
		
		Set<String> hashset = new HashSet<String>();
		for(String word: array) {
			
			if(hashset.add(word)==false)
				System.out.println("Duplicate Word: "+word);
			
		}
		
		
		System.out.println("*****Case2: Using MAP********");
		
// Case2: Using MAP
		 Map<String, Integer> map= new HashMap<String, Integer>();
		 
		 for(String word: array)
		 {
			 if(map.containsKey(word))
				 map.put(word, map.get(word)+1);
			 else
				 map.put(word, 1);
		 }
		 
		 for(Map.Entry entry : map.entrySet())
		 {
			 System.out.println(entry.getKey()+ " "+ entry.getValue());
		 }
		 
		 System.out.println("**************");
		 //OR

	/*	 for(Map.Entry<String, Integer> entry : map.entrySet())
		 {
			 System.out.println(entry.getKey()+ " "+ entry.getValue());
		 }
	*/
		 
		 //2. Print the non-repeated words in string
		 
		 for(Map.Entry entry1 : map.entrySet())
		 {
			 int n= (int) entry1.getValue();
			 if(n==1)
				 System.out.println(" Non Repeated Words: "+entry1.getKey()+ " "+ entry1.getValue());
		 }
	}
}

/*
Output-

****Case1: Using HashSet to find duplicate words****
Duplicate Word: My
Duplicate Word: is

*****Case2: Using MAP********
Automation 1
Engineer 1
yash 1
Test 1
profile 1
name 1
is 2
My 2
**************
 Non Repeated Words: Automation 1
 Non Repeated Words: Engineer 1
 Non Repeated Words: yash 1
 Non Repeated Words: Test 1
 Non Repeated Words: profile 1
 Non Repeated Words: name 1
*/