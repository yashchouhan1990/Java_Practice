package stringPrograms;

public class Count_Letters_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "I am Lord";
		int count=0;
		int space=0;
		char[] ch= str.toCharArray();
		System.out.println("Total length of String is : " +ch.length);
		for(int i=0; i<ch.length; i++){
			if(ch[i] != ' ')	{
				count++;
				//System.out.println(ch[i]);
			}
			else	{
				space++;
			}
		}
		System.out.println("Number of letters in String is : "+count);
		System.out.println("Number of Spaces in String is : "+space);
	}
}

/*
Output-
Total length of String is : 10
Number of letters in String is : 7
Number of Spaces in String is : 3
*/