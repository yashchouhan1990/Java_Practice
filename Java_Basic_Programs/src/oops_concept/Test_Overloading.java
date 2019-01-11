package oops_concept;


public class Test_Overloading {

	static int summer(int p, int q) {
		return p+q;
	}
	
	static int summer(int p, int q, int r){
		return p+q+r;
	}
	
	int adder(int a, int b)	{
		return a+b;
	}
	
	int adder(int a, int b, int c)	{
		return a+b+c;
	}
	
	public float adder(float a, float b)	{
		return a+b;
	}
	
	public static void main(String[] args) {
	Test_Overloading to= new Test_Overloading();

	System.out.println("Sum of two number is : " + to.adder(5, 8));
	System.out.println("Sum of three number is : " + to.adder(5, 3, 4));
	System.out.println("Sum of two float number is : " + to.adder(3, 6));
	
	System.out.println("Sum of two number is : "+ Test_Overloading.summer(4, 7));
	System.out.println("Sum of three number is : "+ Test_Overloading.summer(4, 7, 8));
	}

}

/*
Output-

Sum of two number is : 13
Sum of three number is : 12
Sum of two float number is : 9
Sum of two number is : 11
Sum of three number is : 19

*/