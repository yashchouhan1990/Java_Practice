package string_concepts;

import java.util.Scanner;

public class MinuteHourTest {
	
/*	public static int StringChallenge(int num) {
	    // code goes here 
	    int hours, minute;
	    while(num>0)
			{
				minute=num%10;
				num=num/10;
				
			}

	    return num;
	  }
*/
	  public static void main (String[] args) {  
	    // keep this function call here   
		  int hours, minute;
		  int num;
	    Scanner s = new Scanner(System.in);
	    num=s.nextInt();
	   // System.out.print(StringChallenge(s.nextLine())); 
	    
	    while(num>0)
		{
			minute=num%10;
			num=num/10;
			System.out.println(minute);
		}

	    
	    
	  }



}
