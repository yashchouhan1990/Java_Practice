package interface_concepts;

 interface Printable{
	 void print();
}

 class Iterface_demo implements Printable {
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
