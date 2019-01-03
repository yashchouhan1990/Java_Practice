package interface_concepts;

interface Printable_new1{
	void print();
}

interface Showable_new1 extends Printable_new1{
	void show();
}

public class Interface_inheritance implements Showable_new1  {
	
	@Override
	public void print() {
		System.out.println("Hi");
	}

	@Override
	public void show() {
		System.out.println("hello");
	}
	
	public static void main (String args[]){
		Interface_inheritance iit= new Interface_inheritance();
		iit.print();
		iit.show();
	}
	
}

/*
Output-

Hi
hello


*/