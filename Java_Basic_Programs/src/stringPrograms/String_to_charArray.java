package stringPrograms;

public class String_to_charArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "learningJavabyMyOwn";
		
		// String to char array
		char[] chars= str.toCharArray();
		System.out.println("Length of char array : "+ chars.length);
		
		// Character at specific positing in String
		char c= str.charAt(1);
		System.out.println(" Character at specific positing in String : "+  c);

		char[] ch = new char[7];
		str.getChars(0, 1, ch, 0);
		System.out.println(chars);
	}

}

/*

Length of char array : 19
 Character at specific positing in String : e
learningJavabyMyOwn


*/