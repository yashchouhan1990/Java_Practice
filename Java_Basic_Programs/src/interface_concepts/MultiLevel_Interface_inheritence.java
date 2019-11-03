package interface_concepts;

interface Printable1{  
	void print();  
}  

interface Showable1 extends Printable1{  
	void show();  
}  

public class MultiLevel_Interface_inheritence implements Showable1{  
	public void print(){
		System.out.println("Hello");}
	
	public void show(){
		System.out.println("Welcome");}  
  
	public static void main(String args[]){  
	MultiLevel_Interface_inheritence obj = new MultiLevel_Interface_inheritence();  
	obj.print();  
	obj.show();  
	}  
} 
/*
Hello
Welcome
*/