package constructors;


 class cons{
	 cons(){
		 System.out.println("Its constructor");
	 }
	 
	 static {
		 System.out.println("Test1");
	 }

	 static {
		 System.out.println("Test2");
	 }

 
 }


public class Constructor_test1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cons c = new cons();
	//	c.cons();     // this line will give compile time error as cons is a constructor. So, calling it using object is not required. Once Obj is created, constructor will be called directly.
						
		cons c1 = new cons();

	}

}
/*
Output-
Test1
Test2
Its constructor
Its constructor

*/