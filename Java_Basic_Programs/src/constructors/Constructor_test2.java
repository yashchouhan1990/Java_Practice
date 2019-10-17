package constructors;

public class Constructor_test2 {
	
	int x=2;
	
	Constructor_test2(int i)
	{
		x=i;
	}

	public static void main(String[] args) {
		Constructor_test2 con= new Constructor_test2(5);
		System.out.println("Value of x: "+ con.x);
	}

}

/*
Output- 
Value of x: 5

Output of the above program is “x = 5”. The initialization with class declaration in Java is 
like initialization using Initializer List in C++. So, in the above program, the value assigned 
inside the constructor overwrites the previous value of x which is 2, and x becomes 5

*/