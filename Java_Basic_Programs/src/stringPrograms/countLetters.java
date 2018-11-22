package stringPrograms;
import java.util.Scanner;
public class countLetters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "welcome to candid java tutorial";
		int count=0;
		for(int i=0; i < str.length()-1; i++)
		{
			if ((str.charAt(i) == ' ') && (str.charAt(i+1) != ' '))
			{
				count++;
			}
		}
	System.out.println("Number of words in a string = " + count);
	}
}
