package oops_concept;

public class MethodOverloading {

	// 1. normal Methods
	int testOverloading(int a, int b)	{
		System.out.println("Method with 2 parameters is called");
		return a+b;	}
	
	int testOverloading(int a, int b, int c)	{
		System.out.println("Method with 3 parameters is called");
		return a+b+c;	}
	  
	public static void main(String args[])
	{
	//Calling normal method
	 MethodOverloading m = new MethodOverloading();
	 System.out.println(m.testOverloading(40, 60));
	 System.out.println(m.testOverloading(20, 30, 10));
     }
	
}
/*
Method with 2 parameters is called
100
Method with 3 parameters is called
60
*/


/*
Another example

class OverloadingExample{  

static int add(int a,int b)
{return a+b;}  

static int add(int a,int b,int c)
{return a+b+c;}  

} 




*/
