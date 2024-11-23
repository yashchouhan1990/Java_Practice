package static_test;

class base{
	public static int x=7;
}

public class Static_var extends base {

	public static void main(String[] args) {
		 Static_var stat= new Static_var();
		 
		 System.out.println("Result : "+ stat.x);
	//OR	 
		 System.out.println("Result : "+ x);

	}

}

/*
Output-
Result : 7
Result : 7

*/