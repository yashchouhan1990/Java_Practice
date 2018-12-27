package stringPrograms;

import java.util.HashSet;
import java.util.Set;

public class Find_Duplicate_Elements_In_Array {

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
		
		Set<String> store= new HashSet<String>();
		for(String name:arr)
		{
			if(store.add(name)==false)
			{
				System.out.println("Duplicate Element : "+ name);
			}
		}
		

	}

}
