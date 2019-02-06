package practice;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "i love india";
		String words[]= str.split(" ");
		String captialword="";
		
		for(int i=0; i<words.length; i++)
		{
			String firstletter=words[i].substring(0, 1).toUpperCase();
			String restletters= words[i].substring(1).toLowerCase();
			captialword+=firstletter+restletters+" ";
		}
		System.out.println();

	}

}
