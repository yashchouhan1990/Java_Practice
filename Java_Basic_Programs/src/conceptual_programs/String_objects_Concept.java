package conceptual_programs;

public class String_objects_Concept {

	public static void main(String[] args) {
		
		String str = "abc";
		String s= str;
		str= str+ "d";
		 
		System.out.println(str + " " + s + " " + (str==s));
		 
		 
		 StringBuffer sb= new StringBuffer("pqr");
		 StringBuffer sbtest= sb;
		 sb.append("s");
		 
		 System.out.println(sb + " " + sbtest + " " + (sb==sbtest));
		
	}

}
/*
Output-
abcd abc false
pqrs pqrs true


Explanation : In Java, String is immutable and string buffer is mutable. So string s2 and s1 both pointing to the same string abc. And, after making the changes the string s1 points to abcd and s2 points to abc, hence false. While in string buffer, both sb1 and sb2 both point to the same object. Since string buffer are mutable, making changes in one string also make changes to the other string. So both string still pointing to the same object after making the changes to the object (here sb2).
*/