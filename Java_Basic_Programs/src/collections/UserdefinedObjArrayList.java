package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class UserdefinedObjArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  //Creating user-defined class objects 	
		Student s1= new Student("Yash", 25, 54);
		Student s2= new Student("lalit", 32, 50);
		Student s3= new Student("shailesh", 33, 59);
		
		//creating arraylist  		
		ArrayList<Student> arlst= new ArrayList<Student>(); 
		arlst.add(s1);
		arlst.add(s2);
		arlst.add(s3);
		
		//System.out.println(arlst);
		Iterator itr= arlst.iterator();
		while(itr.hasNext())
		{
			Student st=(Student)itr.next();
			System.out.println(st.name+ " "+ st.age+" "+st.rollno);
		}
	}

}
