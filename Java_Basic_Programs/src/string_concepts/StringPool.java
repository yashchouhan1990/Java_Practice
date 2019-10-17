package string_concepts;

public class StringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = new String("yash");
		String str2 = new String("yash");
		
		
		String str3="jack";                     // In this case only one object is created on String Constant Pool.
			
		String str4=new String("jack");    // In this case two objects are created, one on HEAP and other on String Constant Pool.
		
		String name="Hemant";                 // One object is created in String Constant Pool.
		
		String sName=name+"Khandal";    // Two objects ( "Khandal" and "HeamantKhandal") are created in String Constant Pool.
		
		String s=sName+"Java";               // Two objects ("Java" and "HemantKhandalJava" ) are created in String Constant Pool.
		
		String ss=new String("Hemant");  //Only One new String object is created on HEAP and 
		                               //that will internally reference "Hemant" which is created in line number 1 & already  present in String Constant Pool..

	}

}
