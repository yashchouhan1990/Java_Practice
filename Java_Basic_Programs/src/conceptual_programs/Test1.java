package conceptual_programs;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 bar();
	}
	
	public static int foo(int a, String s)
	{
		s="Yellow";
		a=a+2;
		return a;
	}
	
	public static void bar()
	{
		int a =3;
		String s= "Blue";
		a= foo(a,s);
		System.out.println("a="+a+" s="+s);
	}

}

