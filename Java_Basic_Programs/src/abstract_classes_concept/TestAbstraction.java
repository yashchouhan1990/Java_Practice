package abstract_classes_concept;

abstract class Shape{  
abstract void draw();  
}  
//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shape{  
void draw(){System.out.println("drawing circle");}  
}  
//In real scenario, method is called by programmer or user  
class TestAbstraction{  
public static void main(String args[]){  
Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method  
Shape s1= new Rectangle();
s.draw();  
s1.draw();

System.out.println("***********");
// Another way to use draw methods
Circle1 c1= new Circle1();
c1.draw();

Rectangle r1 = new Rectangle();
r1.draw();
}  
}  

/*
drawing circle
drawing rectangle
***********
drawing circle
drawing rectangle

*/