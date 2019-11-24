package static_concept;

public class Static_Class {

	static class Nested_Demo {
		public void my_method() {
		         System.out.println("This is my nested class");
		      }
		   }

	public static void main(String[] args) {
		
		Static_Class.Nested_Demo nested= new Static_Class.Nested_Demo();
		nested.my_method();
	}

}

/*
 
 Output- This is my nested class
 
You cannot use the static keyword with a class unless it is an inner class. A static inner class is a nested class
 which is a static member of the outer class. It can be accessed without instantiating the outer class, using other 
 static members. Just like static members, a static nested class does not have access to the instance variables and 
 methods of the outer class.

Syntax:

class MyOuter {
   static class Nested_Demo {
   }
 
 */

