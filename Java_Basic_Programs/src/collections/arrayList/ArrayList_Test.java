package collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Test {

	public static void main(String[] args) {
		List arrayList = new ArrayList<>();
		
		arrayList.add("yash");
		arrayList.add("komal");
		arrayList.add(1);
		System.out.println(arrayList);
		
		
		List<String> arrayList1 = new ArrayList<>();
		arrayList1.add("testing");
		arrayList1.add("automation");
		arrayList1.add("selenium");
		
		Collections.sort(arrayList1);
		System.out.println(arrayList1);
		
		

	}

}

/*
[yash, komal, 1]
[automation, selenium, testing]
*/
