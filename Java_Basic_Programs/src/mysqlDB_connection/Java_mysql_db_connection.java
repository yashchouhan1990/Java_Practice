package mysqlDB_connection;

import java.sql.*;


public class Java_mysql_db_connection {
/*
 
 Created!
You have successfully created a new database. The details are below.

Username: l23AHSjX9L

Database name: l23AHSjX9L

Password: 4dCPoBbzO8

Server: remotemysql.com

Port: 3306

URL: https://remotemysql.com/phpmyadmin/index.php?db=l23AHSjX9L

These are the username and password to log in to your database and phpMyAdmin

Make sure you keep your password secure. Ensure you keep back ups of your database in case it gets deleted.
 */
	public static void main(String[] args) {
<<<<<<< HEAD
/*		String username = "yashchouhan1990";
		String dbname= "auto1234testing";
	    String password = "yash@1990";
	    String url = "jdbc:mysql://www.db4free.net/phpMyAdmin/";
*/
		String username = "l23AHSjX9L";
		String dbname= "l23AHSjX9L";
	    String password = "4dCPoBbzO8";
	    String url = "https://remotemysql.com/phpmyadmin/index.php?db=l23AHSjX9L";
	    
	    
	 //  https://remotemysql.com/phpmyadmin/index.php?db=l23AHSjX9L
	  // //?connectTimeout=5000
=======
		String username = "root";
		String dbname= "automation";
	    String password = "admin";
	    String url = "jdbc:mysql://localhost:3306/";
	    //?connectTimeout=5000
>>>>>>> branch 'master' of https://github.com/yashchouhan1990/Java_Practice.git
	
		try {
<<<<<<< HEAD
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection(url, username, password);
=======
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection(url+dbname, username, password);
>>>>>>> branch 'master' of https://github.com/yashchouhan1990/Java_Practice.git
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