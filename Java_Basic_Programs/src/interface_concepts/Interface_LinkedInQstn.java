package interface_concepts;

interface One{
	default void method() {
		System.out.println("One");
	}
}

interface Two{
	default void method() {
		System.out.println("two");
	}
	
}


public class Interface_LinkedInQstn implements One, Two{

	@Override
	public void method() {
		One.super.method();
		Two.super.method();
	}

	public static void main(String[] args) {
		Interface_LinkedInQstn in= new Interface_LinkedInQstn();
		in.method();
	}


}
/*
Output-
One
two

*/