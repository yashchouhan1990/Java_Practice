package interface_concepts;

 interface Printable123{
	 void print();
}

 class Iterface_demo implements Printable123 {
	 public void print() 
	 {
		System.out.println("Hello"); 
	 }
	 
	 public static void main(String args[])
	 {
		 Iterface_demo demo= new Iterface_demo();
		 demo.print();
	 }
 }

 /*
 Output-

Hello

 */