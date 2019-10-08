package regex;

public class Remove_junk_character_from_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "@#$%&*Yash$%$Chouhan#$#$#1234567890";
		str= str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		
		String s1= "@#$%&* Selenium !@#@!@#@ tesing !@#@!#@! Automation @#@12334343";
		s1=s1.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(s1);
	}
}

/*
Output-
^ -- means Not

YashChouhan1234567890
@#$%&*  !@#@!@#@  !@#@!#@!  @#@

*/