package Geeks4Geeks;

class First 
{ 
    int i = 10; 
   
    public First(int j) 
    { 
        System.out.println(i);  
        this.i = j * 10; 
    } 
} 
   
class Second extends First 
{ 
    public Second(int j) 
    { 
        super(j);  
        System.out.println(i);  
        this.i = j * 20; 
    } 
} 
   
public class Class_Inheritence 
{ 
    public static void main(String[] args) 
    { 
        Second n = new Second(20);  
        System.out.println(n.i); 
    } 
} 

/*
Output-
10
200
400

Since in ‘Second’ class it doesn’t have its own ‘i’, the variable is inherited from the super class. 
Also, the constructor of parent is called when we create an object of Second.
*/