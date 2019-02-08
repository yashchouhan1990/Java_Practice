package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListtest {

	public static void main(String[] args) {
	//	ArrayList arylist= new ArrayList();
		ArrayList<String> al= new ArrayList<String>();
		al.add("Yash");
		al.add("Harsh");
		al.add("Anil");
		
		System.out.println(al);
/*
* output- [Yash, Harsh, Anil]
*/
	// traverse ArrayList elements using the Iterator interface
		Iterator<String> itr= al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
/*
 Output-
Yash
Harsh
Anil
	
 */
		//Traversing list through for-each loop
		System.out.println("Traversing list through for-each loop");
		for(String str:al)
		{
			System.out.println(str);
		}
		
/*
 Output-
Traversing list through for-each loop
Yash
Harsh
Anil
 * 		
 */
	}
}
