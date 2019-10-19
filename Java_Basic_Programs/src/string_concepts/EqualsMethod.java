package string_concepts;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] letters1= {"A","B","C"};
		String[] letters2= {"A","B","C"};
		String[] letters3= letters1;
		
		System.out.println(letters1.equals(letters2));
		System.out.println(letters1.equals(letters3));

	}

}

/*
Output

false
true

*/