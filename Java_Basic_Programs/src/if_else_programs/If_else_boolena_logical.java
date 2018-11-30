package if_else_programs;

public class If_else_boolena_logical {
	public static void main(String s[])
    {
        boolean a, b, c;
        a = b = c = true;

        if( !a || ( b && c ) )
        {
            System.out.println("If executed");
        }
        else
        {
            System.out.println("else executed");
        }

    }    
}

/*
Output-
If executed

Explaination-
Initially three boolean variables a, b, c are declared and all three variables are assigned to true. Elaborating the first if condition: 
Condition : !a || (b && c) 
b && cis true && true = true 
!a = !true = false 
!a || (b && c) = false || true = true 
So if block will be executed and If executed is printed. 
As if is executed else will not be executed.

*/