package Geeks4Geeks;


class Point { 
    protected int x, y; 
   
    public Point(int _x, int _y) { 
        x = _x; 
        y = _y; 
    } 
} 
  
public class Default_constructor { 
    public static void main(String args[]) { 
   //   Point p = new Point();       ---> this line gives Compile Time error. 
  //    System.out.println("x = " + p.x + ", y = " + p.y); 
    }     
} 

/*
output- Compile time error

Output:
Compiler Error
In the above program, there are no access permission issues because the Test and Main are in same package 
and protected members of a class can be accessed in other classes of same package. The problem with the 
code is: there is not default constructor in Point. Like C++, if we write our own parametrized constructor
 then Java compiler doesn’t create the default constructor. So there are following two changes to Point class 
 that can fix the above program.
1) Remove the parametrized constructor.
2) Add a constructor without any parameter.
Java doesn’t support default arguments, so that is not an option.
*/