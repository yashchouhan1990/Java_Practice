package Geeks4Geeks;


class Alpha 
{ 
    public String type = "a "; 
    public Alpha() {  System.out.print("alpha "); } 
} 
  
public class On_Inheritence_Concept extends Alpha 
{ 
    public On_Inheritence_Concept()  {  System.out.print("On_Inheritence_Concept ");  } 
  
    void go() 
    { 
        type = "b "; 
        System.out.print(this.type + super.type); 
    } 
  
    public static void main(String[] args) 
    { 
        new On_Inheritence_Concept().go(); 
    } 
} 

/*
Options :
A) alpha beta b b
B) alpha beta a b
C) beta alpha b b
D) beta alpha a b

Answer : A) alpha beta b b
Explanation : The statement new Beta().go() executes in two phases. In first phase Beta class constructor is called. 
There is no instance member present in Beta class. So now Beta class constructor is executed. As Beta class extends 
Alpha class, so call goes to Alpha class constructor as first statement by default(Put by the compiler) is super()
 in the Beta class constructor. Now as one instance variable(type) is present in Alpha class, so it will get memory 
 and now Alpha class constructor is executed, then call return to Beta class constructor next statement. 
 So alpha beta is printed.
In second phase go() method is called on this object. As there is only one variable(type) in the object whose value is a. So it will be changed to b and printed two times. The super keyword here is of no use.

*/