package conceptual_programs;

public class argumentPassing1 {

	public static void main(String args[])
		{
			
		argumentPassing ob = new argumentPassing();
		int a = 10, b = 20;
		System.out.println("a and b before call :"+ a +" " + b);
		ob.meth(a,b);
		System.out.println("a and b after call : "+ a + " "+ b);
		
		argumentPassing ob1 = new argumentPassing();
		
		System.out.println("Result: "+ob1.meth(40, 30));
		
		}	
}

class argumentPassing{
	int meth(int i, int j)
	{
		i *= 2;
		j /= 2;
		return i+j;
	}
}
/*
a and b before call :10 20
a and b after call : 10 20
 * 
 */
		
