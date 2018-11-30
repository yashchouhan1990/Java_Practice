package if_else_programs;

public class If_else_operators_good {
	
	public static void main(String [] args) 
    {
        boolean rabbit = true;
        boolean donkey = false;
        boolean leporidae = true;

        if (rabbit & donkey | donkey & leporidae | donkey)
            System.out.print("DOG ");

        if (rabbit & donkey | donkey & leporidae | donkey | rabbit)
            System.out.println("CAT ");
    }

}

/*
Output-
CAT
*/
