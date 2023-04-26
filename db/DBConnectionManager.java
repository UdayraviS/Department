package com.cruds.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {

	static
	{
		try 
		{												//4th step
			Class.forName("com.mysql.jdbc.Driver");  //  // 1st step
		}
		catch(ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() //2nd step // connection is an interface, so we cant create object and instantiate interface directly.
	{
		Connection conn = null;							// 6th step
		try												// 5th step
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/department", "root", "Manvithauday07@");		// 3rd step
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	
	
	
	
}
