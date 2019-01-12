package stringPrograms;

public class String_replace {

	public static void main(String[] args) {
		String str= "HIHIIHILOVEHIJAVA";
		String sub="HI";
		
		str=str.replaceAll(sub, " ");
		System.out.println("Output : "+ str.trim());

	}

}
