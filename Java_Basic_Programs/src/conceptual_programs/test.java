package conceptual_programs;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Hello,\nworld");
		System.out.println("n=" + (-4 + 1/2 + 2*-3 + 5.0));
		
		int x = 5;
		int y = 10;
		int z = ++x * y--;
		System.out.println(z);
		
		System.out.println("1 + 2 = " + 1 + 2);
		System.out.println("1 + 2 = " + (1 + 2));
		
		int a=2, b=3;
		if (a==3)
		if (b==3)
			System.out.println("InsideIf");
		else
			System.out.println("insideelse");
			System.out.println("yash");
		System.out.println("****************");
		
		int i=10;
		int j=0;  // you have to initialize a j 
		if(i==10){
			j=20;
		}	
		else if(i==20){
			j=30;
		}
		System.out.println(j);

		
	}

}
