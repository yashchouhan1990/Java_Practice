package conceptual_programs;

public class t2 {
	
	void meth(int i, int j)
	{
	i *= 2;
	i /= 2;
	}
	}

	class argumentPassing
	{
	public static void main(String args[])
	{
		
	t2 ob = new t2();
	int a = 10, b = 20;

	System.out.println("a and b before call :"+ a +" " + b);
	ob.meth(a,b);
	System.out.println("a and b after call : "+ a + " "+ b);
	}
}
