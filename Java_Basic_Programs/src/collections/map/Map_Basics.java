package collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map_Basics {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(100, "yash");
		map.put(101, "komal");
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
		
		System.out.println(map);
		
		map.put(100, "God");		// As the map does not store duplicate keys. So key is updated with new value
		
		System.out.println(map);

	}

}

/*
Output
{100=yash, 101=komal}
{100=God, 101=komal}

*/