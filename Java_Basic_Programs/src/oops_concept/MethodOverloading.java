package oops_concept;

public class MethodOverloading {

	// 1. normal Methods
	int testOverloading(int a, int b)
		{		return a+b;	}
	
	int testOverloading(int a, int b, int c)
		{		return a+b+c;	}
	  
	public static void main(String args[])
	{
	//Calling normal method
	 MethodOverloading m = new MethodOverloading();
	 System.out.println(m.testOverloading(40, 60));
	 System.out.println(m.testOverloading(20, 30, 10));
     }
	
}



