package stringPrograms;
public class Count_Words_In_String {
	public static void main(String[] args) {
		
		String str= "I Love you very much..";
		int count=0;
		System.out.println(str);
		// 1. Easy trick to count words in String 
		int length=str.split(" ").length;
		System.out.println("No of words in String is: "+ length);
		System.out.println("******");
		
		//2. Traversing and checking
		char[] ch= new char[str.length()];
		for(int i=0; i < str.length(); i++)
		{
			ch[i]= str.charAt(i);
			 if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
			{
				count++;
			}
		}
		System.out.println("Number of words in string = " + count);
		
		//3. Convert string to String array then Count array elements
		int count_no=0;
		String[] array=str.split(" ");
		
		for(int j=0; j<array.length; j++)
		{
			count_no++;
		}
		System.out.println("Count of words :"+count_no);
		
	}
}

/*
Output-
I Love you very much..
No of words in String is: 5
******
Number of words in string = 5
*/