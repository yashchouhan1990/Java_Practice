package interface_concepts;

interface Printable_new{
	void print();
}

interface Showable_new{
	void print();
}

//Printable and Showable interface have same methods but its implementation is provided by class TestTnterface1, so there is no ambiguity
public class Multi_inher_with_same_method implements Printable_new, Showable_new {
	@Override
	public void print() {
		System.out.println("Implementation of Same method in different interfaces is provided in this class");
	}
	
	public static void main(String args[])	{
		Multi_inher_with_same_method m1= new Multi_inher_with_same_method();
		m1.print();
	}
}
/*
Output-
Implementation of Same method in different interfaces is provided in this class
*/

