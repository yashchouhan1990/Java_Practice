package Geeks4Geeks;


 class Base 
{ 
    private int multiplier(int data) 
    { 
        return data*5; 
    } 
} 
  
class Private_Method_Overloading extends Base 
{ 
    private static int data; 
    public Private_Method_Overloading() 
    { 
        data = 25; 
    } 
    public static void main(String[] args) 
    { 
        Base temp = new Private_Method_Overloading(); 
      //  System.out.println(temp.multiplier(data));		--> this line gives compile time error 
    } 
} 
/*

a) 125
b) 25
c) Runtime error
d) Compile time error

Answer (d)
Explanation: Since the method multiplier is marked as private, it isn’t inherited and therefore
 is not visible to the Derived.
*/