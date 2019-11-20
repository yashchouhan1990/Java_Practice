package mysqlDB_connection;

import java.sql.*;


public class Java_mysql_db_connection {

	public static void main(String[] args) {
		String username = "root";
		String dbname= "automation";
	    String password = "admin";
	    String url = "jdbc:mysql://localhost:3306/";
	    //?connectTimeout=5000
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection(url+dbname, username, password);
			Statement stmt= con.createStatement();
			ResultSet rs= stmt.executeQuery("Select * from employee");
			
			while(rs.next())
			System.out.println(rs.getInt(1) +" "+ rs.getString(2)+" "+ rs.getString(3)+ rs.getInt(4));
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}


/*   employee table---
Id, Name, Address, Age
'1', 'yash', 'pune', '29'
'2', 'harsh', 'ajmer', '25'
'3', 'archit', 'jaipur', '28'
'4', 'aayushi', 'jaipur', '23'
'5', 'geeta', 'ajmer', '54'
'6', 'sagar', 'ajmer', '26'
'7', 'karan', 'ajmer', '21'
'8', 'jairaj', 'ajmer', '20'

Output- 1 yash pune
2 harsh ajmer
3 archit jaipur
4 aayushi jaipur
5 geeta ajmer
6 sagar ajmer
7 karan ajmer
8 jairaj ajmer
*/