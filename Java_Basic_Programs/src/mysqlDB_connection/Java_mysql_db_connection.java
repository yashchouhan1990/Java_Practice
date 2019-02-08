package mysqlDB_connection;

import java.sql.*;


public class Java_mysql_db_connection {

	public static void main(String[] args) {
		String username = "yashchouhan1990";
		String dbname= "auto1234testing";
	    String password = "yash@1990";
	    String url = "jdbc:mysql://www.db4free.net/phpMyAdmin/";
	    //?connectTimeout=5000
	
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection(url+dbname, username, password);
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
