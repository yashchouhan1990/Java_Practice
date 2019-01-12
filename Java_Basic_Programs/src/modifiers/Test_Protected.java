package modifiers;

class Test{
	protected int a=10;
	
	protected boolean display(){
		System.out.println("Inside the procted method");
		return false;
	}
}

public class Test_Protected {

	public static void main(String[] args) {
	Test t= new Test();
	System.out.println(t.a);
	System.out.println(t.display());
	}

}
