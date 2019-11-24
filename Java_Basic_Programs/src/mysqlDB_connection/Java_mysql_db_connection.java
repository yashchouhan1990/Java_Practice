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
	
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection(url, username, password);
			Statement stmt= con.createStatement();
			ResultSet rs= stmt.executeQuery("Select * from Tabletest");
			
			while(rs.next())
			System.out.println(rs.getInt(1) +" "+ rs.getString(2)+" "+ rs.getString(3));
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
