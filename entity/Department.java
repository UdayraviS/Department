package com.cruds.entity;

public class Department
{

	private int deptID;
	private String deptName;
	private String deptManager;
	
	// Constructor using fields
	public Department(int deptID, String deptName, String deptManager)	 
	{
		super();
		this.deptID = deptID;
		this.deptName = deptName;
		this.deptManager = deptManager;
	}
	
	// Constructors from superclass

	public Department() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	
	// getteres and setters
	
	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptManager() {
		return deptManager;
	}

	public void setDeptManager(String deptManager) {
		this.deptManager = deptManager;
	}

	
	// Generate to string
	@Override
	public String toString() {
		return "Department [deptID=" + deptID + ", deptName=" + deptName + ", deptManager=" + deptManager + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
