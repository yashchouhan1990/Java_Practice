package static_concept;

public class Static_instance {

	static int test;
	static int x;
	static int y;
	static int p;
	
	int teddy=500;
	
	public static void main(String[] args) {
		int test=10;
		System.out.println("value of variable ="+test);

		int x=5;
		System.out.println("value of variable ="+ x);
		
		System.out.println("value of variable ="+ y);
		/*
		static int p=13;  //again static connect be assigned to p. P can be of final typee
		System.out.println("value of variable ="+ p); 
		*/
		
		/*
		System.out.println("value of variable ="+ teddy);  // static method cannot access non-static variables
		*/
	}

}
/*

Output-
	value of variable =10
	value of variable =5
	value of variable =0

*/