package abstract_classes_concept;

//Example of an abstract class that has abstract and non-abstract methods  
abstract class Bike1{  
 Bike1(){System.out.println("Bike1 : abstract class constructor running");}  
 abstract void run();  
 void changeGear(){System.out.println("gear changed");}  
}  
//Creating a Child class which inherits Abstract class  
class Honda extends Bike1{  
void run(){System.out.println("Honda is good brand..");}  // Abstract Method has been implemented
}  
//Creating a Test class which calls abstract and non-abstract methods  
class Abstract_cons_method_dm{  
public static void main(String args[]){  
Bike1 obj = new Honda();  
obj.run();  
obj.changeGear();  
}  
}  

/*
Output-
 Bike1 : abstract class constructor running
Honda is good brand..
gear changed


*/