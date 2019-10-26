package neo_practice;

class Student1{
	  public String studName;
	  public int age;
	  
	  public Student1(String _studName, int _age) {
		  this.studName= _studName;
		  this.age=_age;
	  }
	  
	  protected void printStudent() {
		  System.out.println("Student Name= "+studName+ "\n"+"Student age= "+age);
	  }
}

public class Q2_Contructors {

	public static void main(String[] args) {
		new Student1("Sam", 24).printStudent();

	}

}
/*
Output-
Student Name= Sam
Student age= 24

*/