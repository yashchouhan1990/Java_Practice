package Geeks4Geeks;


public class Imp_Method_Overloading 
{ 
    private int data = 5; 
  
    public int getData() 
    { 
        return this.data; 
    } 
    public int getData(int value) 
    { 
        return (data+1); 
    } 
    public int getData(int value, int val) 
    { 
        return (data+1); 
    }
    public int getData(int... value) 
    { 
        return  (data+2); 
    } 
  
    public static void main(String[] args) 
    { 
    	Imp_Method_Overloading temp = new Imp_Method_Overloading(); 
        System.out.println(temp.getData(7, 8, 12)); 
    } 
} 

/*
Output- 7

a) Either Compile time or Runtime error
b) 8
c) 10
d) 7

Answer (d)
Explanation : (int… values) is passed as parameter to a method when you are not aware of the number of input parameter 
but know that the type of parameter(in this case it is int). When a new object is made in the main method, variable data 
is initialized to 5. A call to getData() method with attributes (7, 8 ,12), makes a call to the third getData() method,
 which increments the value of data variable by 2 and return 7.

*/