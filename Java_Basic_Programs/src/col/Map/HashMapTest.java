package col.Map;

import java.util.HashMap;
import java.util.Map;

/*
 
 Following are few key points to note about HashMaps in Java -

A HashMap cannot contain duplicate keys.

Java HashMap allows null values and the null key.

HashMap is an unordered collection. It does not guarantee any specific order of the elements.

Java HashMap is not thread-safe. You must explicitly synchronize concurrent modifications to the HashMap.
 
 */

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> numberMapping= new HashMap<String, Integer>();
		
		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 3);
		
	    // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        numberMapping.putIfAbsent("Four", 4);
		System.out.println(numberMapping);
		//Output- {One=1, Four=4, Two=2, Three=3}
		
		Map<String, Integer> map= new HashMap<String, Integer>();
		map.put("yash", 100);
		map.put("yash", null);
		map.put("tom", null);
		
		map.put(null, 200);			// HashMap allows adding of only one Null key and multiple Null values
		map.put(null, 300);			// last added value of key is considered
		System.out.println(map);
		
		// Output- {null=300, tom=null, yash=null}
	}

}

/*
Output-
{One=1, Four=4, Two=2, Three=3}
{null=300, tom=null, yash=null}

*/