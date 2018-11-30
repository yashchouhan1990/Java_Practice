package if_else_programs;

public class If_else_relational_operator {

	public static void main(String s[])
    {
        int a = 7 * 3 + 6 / 2 - 5;
        int b = 21 - 8 + a % 3 * 11;
        
        System.out.println("Value of a="+a+" Value of b= "+b);

        if(a < b)
        {
            System.out.println("A is less than B");
        }

      // if(a = b)    // 1.
        if(a == b)   // 2.
        {
            System.out.println("A is equal to B");
        }

        if(a > b)
        {
            System.out.println("A is greater than B");
        }
    }
}

/*
Output-

Value of a=19 Value of b= 24
1. Compilation error as its an assignment operator
2. A is less than B

Explaination-
The second if has condition a = b which is assignment operation and not the equality check operation.
Equality check operator is double equal to (==). Since assignment operation does not have any type,
it leads to a compilation error.
*/
