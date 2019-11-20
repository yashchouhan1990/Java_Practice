package mysqlDB_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Joins {

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
			ResultSet rs= stmt.executeQuery("Select employee.id, department.deptname from employee INNER JOIN department on employee.Id=department.Id where department.deptname='Qa'");
			
			while(rs.next())
			//System.out.println(rs.getInt(1) +" "+ rs.getString(2)+" "+ rs.getString(3)+ rs.getInt(4));
				System.out.println(rs.getInt(1) +" "+ rs.getString(2));
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
