package collections;

import java.util.ArrayList;
import java.util.List;

public class ListConcept_test {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Hello");
		list.add(1);
		list.add("Heyy");
		System.out.println(list.get(0) instanceof Object);
		System.out.println(list.get(1) instanceof Integer);
		System.out.println(list.get(2) instanceof String);
		System.out.println(list.get(2) instanceof Character);
		
		System.out.println("List is : "+list.toString());
	}

}

/*
 * Output-
true
true
true
false

List is : [Hello, 1, Heyy]

 * 
 * 
 */
