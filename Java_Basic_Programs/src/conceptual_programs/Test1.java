package conceptual_programs;

public class Test1 {

	public static void main(String[] args) {
		 bar();
	}
	
	public static int foo(int a, String s)
	{
		s="Yellow";
		a=a+2;
		System.out.println("Values inside foo method: " +"a="+a+" s="+s);
		return a;    // only value of a is returning from this method
	}
	
	public static void bar()
	{
		int a =3;
		String s= "Blue";
		a= foo(a,s);       // values of a is changed as it the only vales returned from foo method
		System.out.println("Values inside boo method: " +"a="+a+" s="+s);
	}
}
/*
 * a=5 s=Blue
*/