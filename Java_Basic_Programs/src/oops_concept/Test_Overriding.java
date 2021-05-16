package oops_concept;

class BaseClass_Run{
	void run()
	{
		System.out.println("base class run method is called ..!!");
	}
}

public class Test_Overriding extends BaseClass_Run {
	void run(){
		System.out.println("Child class run method is called.. !!");
	}
	public static void main(String[] args) {
		Test_Overriding Test1 = new Test_Overriding();   // 
		Test1.run();
		
		BaseClass_Run bas = new Test_Overriding(); 		// Upcasting and run time polymorphism
		bas.run();
		
		
	}
}

/*
Output-
Child class run method is called.. !!
Child class run method is called.. !!
*/