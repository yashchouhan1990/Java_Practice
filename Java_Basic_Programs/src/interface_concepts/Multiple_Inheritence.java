  package interface_concepts;

// The Java compiler adds public and abstract keywords
// before the interface met hod. Moreover, it adds public, static and final keywords before data members.
interface Pintable{
	void print();     // 
}

interface Showable{
	abstract void show();
}

 class test implements Printable{

	@Override
	public void print() {
		String str= "This class has implemented an interface adn overriden a method";
		System.out.println(str);
		
	}
	
}

public class Multiple_Inheritence implements Pintable, Showable  {
	
	public void print() {System.out.println("Hello");}
	public void show() { System.out.println("Welcome");}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple_Inheritence m1 = new Multiple_Inheritence();
		m1.print();
		m1.show();
		
		// Creating Test class Object and calling implemented method
		test t1 = new test();
		t1.print();
		
	}

}

/*
Output-
Hello
Welcome
This class has implemented an interface adn overriden a method
*/