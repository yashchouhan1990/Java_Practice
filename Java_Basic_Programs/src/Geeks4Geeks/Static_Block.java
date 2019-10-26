package Geeks4Geeks;

public class Static_Block {

	static
    { 
        System.out.printf("%d", 1); 
    } 
    static
    { 
        System.out.printf("%d", 2); 
    } 
    static
    { 
        System.out.printf("%d", 3); 
    } 
    private static int myMethod() 
    { 
        return 4; 
    } 
    private int function() 
    { 
        return 5; 
    } 
  
    public static void main(String[] args) 
    { 
        System.out.printf("%d", (new Static_Block()).function() + myMethod()); 
    } 
} 

/*
Output- 1239

a) 123
b) 45
c) 12345
d) 1239

Answer (d)
Explanation:static blocks in Java are executed even before the call to main is made by the compiler. 
In the main method, a new object of javaclass is made and its function() method is called which return 4.
 Number 5 is returned by a call to static function
myMethod(). 4+5 = 9. Therefore, the output of the program is 1239, because 123 is printed
on the console even before main method executes and main method on execution returns 9.

*/