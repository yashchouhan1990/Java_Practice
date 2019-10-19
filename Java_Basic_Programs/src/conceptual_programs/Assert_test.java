package conceptual_programs;

public class Assert_test {

	public static void main(String[] args) {
		
		for(int i=2; i<4; i++)
			for(int j=2; j<4; j++)
				if(i<j)
					assert i!=j:i;
					System.out.println();

	}

}

/*

output-
The class compiles and runs and does not print anything
*/