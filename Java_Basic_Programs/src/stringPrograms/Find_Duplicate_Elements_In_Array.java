package stringPrograms;

public class Find_Duplicate_Elements_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]= {"java", "C", "PHP", "Perl", "C", "java"};
		
		for (int i=0; i<arr.length; i++)
		{
			for(int j=1; j<arr.length-1; j++)
			{
				if (arr[i].equals(arr[j])==false)
				System.out.println("Duplicate Element : "+arr[i]);
			}
		}

	}

}
