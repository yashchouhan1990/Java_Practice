package Geeks4Geeks;


class Writer 
{ 
    public  static void write() 
    { 
        System.out.println("Writing..."); 
    } 
} 
class Author extends Writer 
{ 
    public  static void write() 
    { 
        System.out.println("Writing book"); 
    } 
} 
  
public class Static_Method_Overriden_concept extends Author 
{ 
    public  static void write() 
    { 
        System.out.println("Writing code"); 
    } 
  
    public static void main(String[] args) 
    { 
        Author a = new Static_Method_Overriden_concept(); 
        a.write();			//case1
        
        Writer w = new Writer();
        w.write(); 	//case2
        
    } 
   
}

/*
case1
Writing book

case2
Writing...

Options :
A) Writing…
B) Writing book
C) Writing code
D) Compilation fails

Answer : B) Writing book		//case1 
Explanation : Since static methods can’t be overridden, it doesn’t matter which class object is created. 
As a is a Author referenced type, so always Author class method is called. If we remove write() method from 
Author class then Writer class method is called, as Author class extends Writer class.


*/