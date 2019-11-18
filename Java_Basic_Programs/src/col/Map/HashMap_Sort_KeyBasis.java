package col.Map;



import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Sorting Map on basis of KEYS


public class HashMap_Sort_KeyBasis {
	
	public static void main(String[] args) {
		
		Map<String, Integer> mapsort= new HashMap<String, Integer>();
		mapsort.put("test", 1);
		mapsort.put("sample", 5);
		mapsort.put("data", 4);
		mapsort.put("asset", 2);
		mapsort.put("cost", 3);
		System.out.println("Unsorted map :"+mapsort);
		//output-Unsorted map :{cost=3, test=1, data=4, asset=2, sample=5}
		
		System.out.println("Sorting Map on basis of keys ...");
		
		Map<String, Integer> treemap= new TreeMap<String, Integer>(mapsort);
		
		System.out.println("Sorted Map: "+treemap);
		//output- Sorted Map: {asset=2, cost=3, data=4, sample=5, test=1}
		
	}
	
}
/*
Unsorted map :{cost=3, test=1, data=4, asset=2, sample=5}
Sorting Map on basis of keys ...
Sorted Map: {asset=2, cost=3, data=4, sample=5, test=1}

*/