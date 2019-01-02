package wrapper_classes;

public class Test_Wrapper {
	
	public static void main(String[] args) {
	
		// Converting Integer to int
	
		Integer a = new Integer(3);
		int data= a.intValue();  //converting Integer to int  
	// or
		int data1 = a;      //unboxing, now compiler will write a.intValue() internally    
		System.out.println(a +" "+data+" "+data1);
	
System.out.println("***************");

		//Converting int into Integer  

		int test=10;
		Integer i = Integer.valueOf(test);  //converting int into Integer  
	//	or
		Integer j= test; //autoboxing, now compiler will write Integer.valueOf(a) internally  
		
		System.out.println(test +" "+i+" "+j);
		
	}

}
