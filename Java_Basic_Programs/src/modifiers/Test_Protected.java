package modifiers;

class Test{
	protected int a=10;
	
	protected void display(){
		System.out.println("Inside the procted method");
		
	}
}

public class Test_Protected {

	public static void main(String[] args) {
	Test t= new Test();
	System.out.println(t.a);
	t.display();
	}
}
/*
10
Inside the procted method
*/