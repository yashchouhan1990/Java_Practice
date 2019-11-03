package stringPrograms;

public class String_concationation {

	public static void main(String[] args) {
		String str= "java";
		str.concat(" coding");
		System.out.println("Output of str : "+str);
		
		String s= "Knowledge";
		s= s.concat(" Is Everything");
		System.out.println("Output of s : "+s);
		
		StringBuffer sb = new StringBuffer("Yash");
		sb.append(" Chouhan");
		System.out.println("StringBuffer Output: "+ sb);
	}

}

/*
Output-
Output of str : java
Output of s : Knowledge Is Everything

StringBuffer Output: Yash Chouhan

*/