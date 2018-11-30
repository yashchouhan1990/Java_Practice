package conceptual_programs;

public class test {

	public static void main(String s[])
    {
        int i = 7806;
        int j = 0760;

        int total = i + j;

        System.out.println("Total is " + total);
    }
}


/*
Output-
Total is 8302

Explaination-
Execution of program starts from main. Inside main two integer variables i,j are initialized to 7806, 0760 respectively. Another integer variable total is assigned to sum of variables i, j. 7806 is a decimal number (base = 10) and 0760 is octal (base = 8) as any number preceeded with 0 becomes octal. To add both of them they must be made to same base. So convert 0760 to decimal as follows : 
7 * (8 ^ 2) + 6 * (8 ^ 1) + 0 * (8 ^ 0) = 496 
now total = 7806 + 496 = 8302 
The next statement is a display statement which prints the value of variable total.
*/

