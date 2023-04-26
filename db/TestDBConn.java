package com.cruds.db;

import java.sql.Connection;

public class TestDBConn {

	public static void main(String[] args) {

		Connection conn = DBConnectionManager.getConnection();
		if(conn!= null)
		{
			System.out.println("Connection Successful");
		}
		else
		{
			System.out.println("Connection failed, try again");
		}
	}
}
