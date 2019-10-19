package exceptions;

import javax.management.RuntimeErrorException;

public class Exception_test {

	public static void main(String[] args) {
		System.out.println(print(1));
	}
	
	static Exception print(int i) {
		if(i>0)
		{
		return new Exception();
		}
		else
		{
			throw new RuntimeErrorException(null);
		}
		
	}

}

/*
Output-
java.lang.Exception

*/