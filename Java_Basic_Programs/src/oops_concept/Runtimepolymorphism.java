package oops_concept;

class bike
{
	void run()
	{
		System.out.println("Bike is runnning");
	}
}

public class Runtimepolymorphism extends bike{
	
	void run()
	{
		System.out.println(" run Method of Runtimepolymorphism class is called");
	}
	
	public static void main(String []args)
	{
		bike b1=new Runtimepolymorphism();
		b1.run();
	}
}
/*
run Method of Runtimepolymorphism class is called
*/