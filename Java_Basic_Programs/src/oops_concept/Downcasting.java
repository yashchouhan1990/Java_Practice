package oops_concept;

class Downcasting {
	
}

class test extends Downcasting
{
	static void method( Downcasting d)
	{
		if (d instanceof test)
		{
			test t= (test)d; //downcasting
		    System.out.println("Downcasting performed");
		}
	}
 
	
  public static void main(String args[])
  {
	Downcasting d = new test();
    test.method(d);
  }


}