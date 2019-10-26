package neo_practice;

import java.util.TreeSet;

public class Q10_TreeSet_Concept {

	public static void main(String[] args) {
		TreeSet t= new TreeSet<>();
		t.add("3");
		t.add("1");
		t.add("9");
		t.add("5");
		t.add("4");
		System.out.println(t);
		
		TreeSet ts= new TreeSet<>();
		ts.add(3);
		ts.add(1);
		ts.add(9);
		ts.add(5);
		ts.add(4);
		
		System.out.println(ts);
	}
}

/*
Output-
[1, 3, 4, 5, 9]
[1, 3, 4, 5, 9]
TreeSet sort the elements in the ascending order
*/