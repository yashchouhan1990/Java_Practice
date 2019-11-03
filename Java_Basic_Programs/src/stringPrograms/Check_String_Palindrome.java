package stringPrograms;

public class Check_String_Palindrome {

	public static void main(String[] args) {
		 String str = "sanas";
		 String strreverse="";
		 
		 for(int i=str.length()-1; i>=0; i--) {
			 strreverse+=str.charAt(i);
		 }
		 
		 if(str.equalsIgnoreCase(strreverse)) {
			 System.out.println("String is Palindrome ");
		 }
		 else
		 {
			 System.out.println("String is Not Palindrome  ");
		 }
		 
	}

}

/*
String is Palindrome 
*/