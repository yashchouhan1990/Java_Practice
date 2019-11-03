package stringPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Imp_Find_Duplicate_Elements_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]= {"java", "C", "PHP", "Perl", "C", "java"};
		
		//1. compare each element. Time complexity is O(nxn)
		for (int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if (arr[i].equals(arr[j]))
				System.out.println("Duplicate Element : "+arr[i]);
			}
		}
		
		System.out.println("***********");
		
		//2. using HashSet- It store unique values. Time Complexity is O(n)
		
		Set<String> set= new HashSet<String>();
		for(String name:arr)
		{
			if(set.add(name)==false)
			{
				System.out.println("Duplicate Element : "+ name);
			}
		}
		
		System.out.println("***********");
		
		
		//3. Using HashMap: 
		Map<String, Integer> map= new HashMap<String, Integer>();
		
		for(String name : arr){
			Integer count= map.get(name);
			if(count == null){
				map.put(name, 1);
			}
			else{
				map.put(name, ++count);
			}
		}
		
		// get the values from the HashMap
		Set<Entry<String, Integer>> entrySet= map.entrySet();
		for(Entry<String, Integer> entry: entrySet){
			if(entry.getValue()>1){
				System.out.println("Duplicate Element : "+entry.getKey());
			}
		}
	}
}
/*
Output-
Duplicate Element : java
Duplicate Element : C
***********
Duplicate Element : C
Duplicate Element : java
***********
Duplicate Element : java
Duplicate Element : C
*/
