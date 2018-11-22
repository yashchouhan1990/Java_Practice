package oops_concept;

 class Upcasting {
	void test()
	{
		System.out.println("Parent Class");
	}
}

 class cars extends Upcasting
 {
	 public static void main(String args[])
	 {
		 Upcasting ref= new cars(); // here ref is reference variable of parent class and  ref variable is referring to object of child class
		 
	 }
 }
