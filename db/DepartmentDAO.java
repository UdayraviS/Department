package com.cruds.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cruds.entity.Department;

public class DepartmentDAO
{

	public List<Department>getAll()
	{
		String sql = "select deptID,deptName,deptManager from department";
		List<Department> list = new ArrayList<>();
		Department d = null;
		
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs!=null && rs.next())
			{
				d = new Department(rs.getInt(1),rs.getString(2),rs.getString(3));
				list.add(d);
			}
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean create(Department d)
	{
	String sql = "insert into department(deptID,deptName,deptManager) values(?,?,?)";
	int rows = 0;
	
	
	Connection conn  = DBConnectionManager.getConnection();
	
	
	try
	{
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, d.getDeptID());
		ps.setString(2, d.getDeptName());
		ps.setString(3, d.getDeptManager());
		
		rows = ps.executeUpdate();
	} 
	catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return rows>0;

	}
}
	
	
	
	
	
	
	

