package Geeks4Geeks;


class Person  
{  
    private void who() 
    { 
        System.out.println("Inside private method Person(who)"); 
    } 
   
    public static void whoAmI() 
    { 
        System.out.println("Inside static method, Person(whoAmI)"); 
    } 
   
    public void whoAreYou() 
    { 
        who(); 
        System.out.println("Inside virtual method, Person(whoAreYou)"); 
    } 
} 
  
class Kid extends Person 
{  
    private void who() 
    { 
        System.out.println("Kid(who)"); 
    } 
   
    public static void whoAmI() 
    { 
        System.out.println("Kid(whoAmI)"); 
    } 
   
    public void whoAreYou() 
    { 
        who(); 
        System.out.println("Kid(whoAreYou)"); 
    } 
} 
public class Imp_Class_Inheritence_Concept 
{ 
    public static void main(String args[])  
    { 
        Person p = new Kid();   
        p.whoAmI();  
        p.whoAreYou();  
    } 
} 

/*
Inside static method, Person(whoAmI)
Kid(who)
Kid(whoAreYou)

Explanation: Static binding (or compile time) happens for static methods. Here p.whoAmI() calls the static method 
so it is called during compile time hence results in static binding and prints the method in People class.
Whereas p.whoAreYou() calls the method in Kid class since by default Java takes it as a virual method i.e, dynamic binding.

*/