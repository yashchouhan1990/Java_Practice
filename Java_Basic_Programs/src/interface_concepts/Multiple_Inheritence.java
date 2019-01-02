package interface_concepts;

// The Java compiler adds public and abstract keywords
// before the interface met hod. Moreover, it adds public, static and final keywords before data members.
interface Pintable{
	void print();     // 
}

interface Showable{
	abstract void show();
	int Min= 123;
}

public class Multiple_Inheritence implements Pintable, Showable {
	
	public void print() {System.out.println("Hello");}
	public void show() { System.out.println("Welcome");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple_Inheritence m1 = new Multiple_Inheritence();
		m1.print();
		m1.show();
		System.out.println(m1.Min);

	}

}
