package col.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 The example below shows:

How to check if a HashMap is empty | isEmpty()
How to find the size of a HashMap | size()
How to check if a given key exists in a HashMap | containsKey()
How to check if a given value exists in a HashMap | containsValue()
How to get the value associated with a given key in the HashMap | get()
How to modify the value associated with a given key in the HashMap | put()

Remove a key from a HashMap | remove(Object key)
Remove a key from a HashMap only if it is associated with a given value | remove(Object key, Object value)
 
 */
public class HashMap_BasicOperations {

	public static void main(String[] args) {
		
		Map<String, String> cityMap= new HashMap<>();
		
		//Check if a HashMap is Empty
		System.out.println("Is cityMap is empty: "+ cityMap.isEmpty());
		
		cityMap.put("Yash", "Ajmer");
		cityMap.put("Komal", "Pune");
		cityMap.put("Priya", "Delhi");
		cityMap.put("Mom", null);
		cityMap.put("Dad", null);
		System.out.println("CityMap details: "+ cityMap);
		
		// Find size of Map
		System.out.println("We have city information of "+cityMap.size()+" users");
		
		String userName= "Yash";
		//Check if the key exist in the HashMap
		if(cityMap.containsKey(userName))
		{
			//get the value assigned to the user
			String city= cityMap.get(userName);
			System.out.println(userName +" lives in "+ city);
		}
		else
		{
			System.out.println("City details not found for the user "+userName);
		}
		
		
		//Check if the Value exist in the HashMap
		if(cityMap.containsValue("Pune"))
		{
			System.out.println("yes Exists");
		}
		else
		{
			System.out.println("City does not exists");
		}

		
		// The get() method returns 'null' if the specified key was not found in the hashMap
		System.out.println("Geeta's city : "+cityMap.get("geeta"));
		
		
		//Remove Key
		System.out.println("Map Before remove: "+cityMap);
		cityMap.remove("Priya");
		System.out.println("Map After remove: "+cityMap);
		
        // remove() returns null if the mapping was not found for the supplied key
        String test = cityMap.remove("David");
        if(test == null) {
            System.out.println("Looks like David is not found");
        } else {
            System.out.println("Removed David from the mapping");
        }
		
        //Remove keys if their values are null
        System.out.println("Map Before removing null : "+cityMap);
        
        Iterator<Map.Entry<String, String>> itr= cityMap.entrySet().iterator();
        while(itr.hasNext())
        {
        	Map.Entry<String, String> curr= itr.next();
        	if(curr.getValue()== null)
        		itr.remove();
        }
	
        System.out.println("Map After removing null : "+cityMap);
   	}

}

/*
We have city information of 5 users
Yash lives in Ajmer
yes Exists
Geeta's city : null
Map Before remove: {Komal=Pune, Priya=Delhi, Yash=Ajmer, Dad=null, Mom=null}
Map After remove: {Komal=Pune, Yash=Ajmer, Dad=null, Mom=null}
Looks like David is not found
Map Before removing null : {Komal=Pune, Yash=Ajmer, Dad=null, Mom=null}
Map After removing null : {Komal=Pune, Yash=Ajmer}
*/