package abstract_classes_concept;

abstract class Bike{

	abstract void run();
}

 class Abstract_demo extends Bike {

 	void run() {	System.out.println("Bike is running"); }
	
	public static void main(String []args)
	{
		Bike bk = new Abstract_demo();
		bk.run();
	}
	
}


