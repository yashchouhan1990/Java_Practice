package neo_practice;

import java.io.IOException;

public class Q16_Exception_Handling_Concept {

	public static void main(String[] args) throws IOException {
		try {
			System.out.println("Hi");
		}
		finally {
			System.out.println("Finally");
		}

	}

}
/*
Output-
Hi
Finally
 Programs run smoothly and no error is thrown
*/