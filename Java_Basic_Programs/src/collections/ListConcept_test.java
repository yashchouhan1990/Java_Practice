package collections;

import java.util.ArrayList;
import java.util.List;

public class ListConcept_test {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Hello");
		list.add(1);
		list.add("Heyy");
		System.out.print("String is an Instanceof Object : ");
		System.out.println(list.get(0) instanceof Object);
		
		System.out.print("number is an Instanceof Integer: ");
		System.out.println(list.get(1) instanceof Integer);
		
		System.out.print("number is an Instanceof Class: ");
		System.out.println(list.get(1) instanceof Object);
		
		System.out.print("String is an Instanceof String: ");
		System.out.println(list.get(2) instanceof String);
		
		System.out.print("String is an Instanceof Character: ");
		System.out.println(list.get(2) instanceof Character);
		
		System.out.println("List is : "+list.toString());
	}

}

/*
 * Output-
String is an Instanceof Object : true
number is an Instanceof Integer: true
number is an Instanceof Class: true
String is an Instanceof String: true
String is an Instanceof Character: false

List is : [Hello, 1, Heyy]
 * 
 * 
 */
