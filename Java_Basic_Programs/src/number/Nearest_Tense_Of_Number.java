package number;

public class Nearest_Tense_Of_Number {

	public static void main(String[] args) {
		int n=89;
		
		int temp, rem, result, p=5;
		
		rem=n%10;
		n=n/10;
		
		if(rem>p)
		{
			rem=n%10;
			rem++;
			result=rem*10;
			System.out.println("result if : "+result);
			
		}
		else
		{
			rem=n%10;
			
			result=rem*10;
			System.out.println("result else: "+result);
		}
		

	}

}
