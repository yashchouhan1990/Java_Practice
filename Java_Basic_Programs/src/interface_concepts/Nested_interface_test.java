package interface_concepts;

interface Printable_1{  
	 void print();  
	 interface MessagePrintable{  
	   void msg();  
	 }  
	}

public class Nested_interface_test implements Printable_1 {

	@Override
	public void print() {
		System.out.println("print pictures");
	}
	
	public void msg(){
		System.out.println("Implemented nested interface method");
	}
	
	public static void main(String[] args) {
		Printable_1 pp= new Nested_interface_test();
		pp.print();
		
		Nested_interface_test nes= new Nested_interface_test();
		nes.msg();
	}
}

/*
Output-
print pictures
Implemented nested interface method
*/