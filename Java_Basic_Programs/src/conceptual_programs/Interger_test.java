package conceptual_programs;


public class Interger_test {

	static int adder(int i, int j)
	{
		return i+j;
	}
	
	static int adder(int i, int j, int k)
	{
		return i+j+k;
	}
	
	public static void main(String[] args) {
		int x=5;
		x=10;
		
		System.out.println("Value of X: "+x);
		Short s=20;
		System.out.println("Result of Additon: "+adder(s,30));

	}

}

/*

Value of X: 10
Result of Additon: 50
*/