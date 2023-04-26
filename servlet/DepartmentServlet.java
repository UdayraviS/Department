package com.cruds.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cruds.entity.Department;
import com.cruds.service.DepartmentService;

/**
 * Servlet implementation class DepartmentServlet
 */
@WebServlet("/DepartmentServlet")
public class DepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Department> list = DepartmentService.getAll();
		request.setAttribute("DEPTLIST", list);
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("dept.jsp");
		rd.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String deptID = request.getParameter("deptID");
		String deptName = request.getParameter("deptName");
		String deptManager = request.getParameter("deptManager");
		
		if(DepartmentService.create(new Department(Integer.parseInt(deptID),deptName,deptManager)))
		{
			request.setAttribute("MSG", "Created successfully");
			
			List<Department> list = DepartmentService.getAll();
			request.setAttribute("DEPTLIST", list);
			
			
			
			
		}
		else
		{
			request.setAttribute("MSG","Database error");
		}
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("dept.jsp");
		rd.forward(request, response);
		
		
		response.sendRedirect("http://localhost:8080/Department/DepartmentServlet");
		
		
		
	}

}
