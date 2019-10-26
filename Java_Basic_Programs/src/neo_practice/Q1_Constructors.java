package neo_practice;

 class Student{
	  public String studName;
	  public int age;
	  
	  public Student(String _studName, int _age) {
		  this.studName= _studName;
		  this.age=_age;
	  }
	  
	  public void printStudent() {
		  System.out.println("Student Name="+studName+ "\n"+"Student age="+age);
	  }
}


public class Q1_Constructors {

	public static void main(String[] args) {
		new Student("Jack", 60).printStudent();
	}

}

/*
Output-
Student Name=Jack
Student age=60

*/