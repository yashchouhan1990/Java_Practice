package oops_concept;

 class Vehicle {
	
	void run()
	{
		System.out.println("Vehicle is running");
	}

}

 class MethodOverrriding extends Vehicle
 {
	 void run()
	 {
		 System.out.println("Bike is running");
	 }
	 
	 public static void main (String args[])
	 {
		MethodOverrriding v=new MethodOverrriding();
		v.run();
		 
	 }
 }

	

