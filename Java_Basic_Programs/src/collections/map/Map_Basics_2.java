package collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map_Basics_2 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put( "Anil", 100);
		map.put( "Geeta", 200);
		map.put("priya", 300);
		map.put("yash", 400);
		
		System.out.println(map);
		
		map.put("God", 100);	// First value is key and second one is value	
		map.put("Anil", 500);	// As the map does not store duplicate keys. So key is updated with new value
		
		map.put(null, null);		//HashMap can stores one null Key and multiple null values
		System.out.println(map);

		map.put(null, null);		//null key is not added again as HM stores one null Key and multiple null values
		map.put("test", null);
		System.out.println(map);
		
		System.out.println("**************");
		
		Map<String, String> mapnew = new HashMap<String, String>();
		mapnew.put("yash", "chouhan");
		mapnew.put("Komal", "Ranjhani");
		System.out.println(mapnew);
		
		mapnew.put("yash", " ");
		System.out.println(mapnew);
	}

}
/*
{priya=300, Geeta=200, yash=400, Anil=100}
{priya=300, null=null, Geeta=200, yash=400, God=100, Anil=500}
{priya=300, null=null, Geeta=200, test=null, yash=400, God=100, Anil=500}
**************
{Komal=Ranjhani, yash=chouhan}
{Komal=Ranjhani, yash= }
*/