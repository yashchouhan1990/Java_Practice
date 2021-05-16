package oops_concept;

public class Method_Overload {

	public static void adder(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void adder(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		adder(3,4);
		adder(4,5,6);
	}

}
