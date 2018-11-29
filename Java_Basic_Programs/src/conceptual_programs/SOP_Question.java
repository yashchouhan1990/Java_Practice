package conceptual_programs;

public class SOP_Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hellow World-"+3+4+5);   // If first part is string then second part is also treated as string
		
		System.out.println(3+4+5+ "-Hellow World");  //If first part is calculation then addition is performed
		
		System.out.println(30/5+ "-Hellow World");
		
		System.out.println(30%5+ "-Hellow World");
		
		System.out.println(30/5*2+ "-Hellow World");  //BODMASS Rule is applied
		
		System.out.println("Hellow world-"+ 3+ 4.3f);
		
		System.out.println(30+ 40.3f +"-Hellow world");

	}

}

/*

Output-
	12-Hellow World
	6-Hellow World
	0-Hellow World
	12-Hellow World
	Hellow world-34.3
	70.3-Hellow world
*/