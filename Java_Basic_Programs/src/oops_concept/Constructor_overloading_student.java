package oops_concept;

public class Constructor_overloading_student {
	String name;
	int age;
	int id;
	
	public Constructor_overloading_student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public Constructor_overloading_student(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	void Display(){
		System.out.println(id+" "+" "+name+" "+age );
	}
	public static void main(String[] args) {
		Constructor_overloading_student cons1 = new Constructor_overloading_student(100, "Yash");
		Constructor_overloading_student cons2= new Constructor_overloading_student(101, "Anil", 65);
		cons1.Display();
		cons2.Display();
	}

}
/* Output-
100  Yash 0
101  Anil 65
 *  
 *  */

