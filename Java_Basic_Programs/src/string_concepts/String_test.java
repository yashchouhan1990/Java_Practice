package string_concepts;

public class String_test {

	public static void main(String[] args) {
		String str= " Yash Chouhan ";
		str.trim();
		str.toUpperCase();
		str.substring(3,4);
		System.out.println(str);

	}

}

/*
Output- 
 Yash Chouhan 
 
 As the changes were not saved in str hence str original value is printed.
*/