package conceptual_programs;


 class A{
	int k;
	boolean istrue;
	static int p;
	
	public void printValue() {
		System.out.println(k);
		System.out.println(istrue);
		System.out.println(p);
	}
}
public class Default_Constructor {

	public static void main(String[] args) {
		A a = new A();
		a.printValue();
	}

}

/*

Output-
0
false
0

Default constructor provides the default values
*/