package stringPrograms;

public class Convert_First_Character_Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "I am enjoying my self learning of Java";
		System.out.println("Original Sentence is : "+str);
		String words[]= str.split(" ");
		String capitalWord="";
		
		for(String w: words)
		{
			String firstLetter= w.substring(0, 1).toUpperCase();
			String restLetters=w.substring(1).toLowerCase();
			capitalWord+= firstLetter+ restLetters + " ";
		}
		
		System.out.println("Sentence is : "+capitalWord.trim());
			}

}
