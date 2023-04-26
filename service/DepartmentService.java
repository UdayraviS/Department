package com.cruds.service;

import java.util.List;

import com.cruds.db.DepartmentDAO;
import com.cruds.entity.Department;

public class DepartmentService		// service layer calls the dao to create
{

	
	public static List<Department> getAll()
	{
		DepartmentDAO dao = new DepartmentDAO();
		return dao.getAll();
	}
	
	public static boolean create(Department d)
	{
		DepartmentDAO dao = new DepartmentDAO();
		return dao.create(d);
	}
	
	
}
