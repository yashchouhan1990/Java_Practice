package conceptual_programs;

public class argumentPassing1 {

	public static void main(String args[])
		{
			
		argumentPassing ob = new argumentPassing();
		int a = 10, b = 20;
		System.out.println("a and b before call :"+ a +" " + b);
		ob.meth(a,b);
		System.out.println("a and b after call : "+ a + " "+ b);
		}	
}

class argumentPassing{
	void meth(int i, int j)
	{
		i *= 2;
		i /= 2;
	}
}
/*
a and b before call :10 20
a and b after call : 10 20
 * 
 */
		
