package if_else_programs;

public class If_else_operator_2 {
	public static void main(String s[])
    {
        int a = 12 + 21 * 3 - 9 / 2;
        int b = 14 - 32 * 4 + 175 / 8 - 3;

        if(++a > 71 && --b < 20)
        {
            System.out.println("a = " + a + " b = " + b);
        }

        if(b-- == -97 || a-- < 100)
        {
            System.out.println("a = " + a + " b = " + b);
        }
    }

}

/*
Output-

a = 72 b = -97
a = 72 b = -98

Explaination-

Inside main, 2 integer variables a, b are declared. 
By following operator precedence, 
a = 12 + 21 * 3 - 9 / 2 = 12 + 63 - 9 / 2 = 12 + 63 - 4 = 75 - 4 = 71 
b = 14 - 32 * 4 + 175 / 8 - 3 = 14 - 128 + 175 / 8 - 3 = 14 - 128 + 21 - 3 = -114 + 21 - 3 = -93 - 3 = -96 
Then first if condition is checked, ++a > 71 && --b < 20 is 72 > 71 && -97 < 20 = true && true = true 
So, if is executed and value of a which is 72 and b which is -97 are printed.

Then next if condition is checked, 
b-- == -97 || a-- < 100 is 
-97 == -97 || a-- < 100 is 
(true || anything(either true or false)) = true 
(by short circuiting, as only first part(b-- == -97) of the or (||) condition suffices to evaluate the result, so the second part (a-- < 100) is not executed and hence a is not decremented) 
So only b decrements and display statement is executed and prints value of a and b as 72 and -98 respectively.


*/