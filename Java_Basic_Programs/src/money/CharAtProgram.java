package money;

public class CharAtProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Welcome to javapoint protal";
		for(int i=0;i<=str.length()-1;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Char at "+i+" place "+str.charAt(i));
			}

	}

  }
}
