package stringPrograms;
public class Count_Words_In_String {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str= "welcome to candid java tutorial";      // Note; There should be black space in start of String
		String str= "I L y v m";
		int count=0;
		
		char[] ch= new char[str.length()];
		System.out.println("Length of String is : "+str.length());
		for(int i=0; i < str.length(); i++)
		{
			ch[i]= str.charAt(i);
			 if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
			{
				count++;
			}
		}
	System.out.println("Number of words in a string = " + count);
	}
}

/*
Output-
Length of String is : 9
Number of words in a string = 5
*/