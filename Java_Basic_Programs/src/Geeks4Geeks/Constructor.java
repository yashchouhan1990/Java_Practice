package Geeks4Geeks;


class Constructor 
{ 
    // constructor 
	Constructor() 
    { 
        System.out.println("Geeksforgeeks"); 
    } 
      
    static Constructor a = new Constructor(); //line 8 
  
    public static void main(String args[]) 
    { 
    	Constructor b; //line 12 
        b = new Constructor(); 
    } 
} 

/*
Output-
Geeksforgeeks
Geeksforgeeks

Explanation:
We know that static variables are called when a class loads and static variables are called only once. 
Now line 13 results to creation of object which inturn calls the constructor and “Geeksforgeeks” is printed second time.
If in line 8 static variable would not have been used the object would have been called 
recursively infinitely leading to StackOverFlow error. See this for a sample run.
*/