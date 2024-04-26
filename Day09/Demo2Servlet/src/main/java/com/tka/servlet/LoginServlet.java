package com.tka.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.tka.dao.StudentDAO;
import com.tka.entity.Student;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String strUsername= request.getParameter("username");
		String strPassword= request.getParameter("password");
		
		System.out.println("Username:: "+strUsername+"\n password:: "+strPassword);
		
		
		StudentDAO dao=new StudentDAO();
		
		Student s= dao.checkUser(strUsername, strPassword);
		PrintWriter pw=  response.getWriter();
			
			
		
		if(s!=null) {
			
			HttpSession session= request.getSession();
			session.setAttribute("username", s.getUsername());
			
			RequestDispatcher rd= request.getRequestDispatcher("Welcome");
			//pw.write("Valid User...");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd= request.getRequestDispatcher("login.html");
			response.setContentType("text/html");
			
			pw.write("<h2 style='color:red;' >Invalid User</h2>");
		
			rd.include(request, response);
			
//			
//			pw.write("InValid User...");
		}
		
		
		
//		pw.print("Hello Wemlcome...");
		
//		pw.write("Hello Welcome...");
		
//		pw.write("<html><head><title>MyFirst Web Page </title></head><body>");
//		pw.write("<h2 style='color:red;'> Hello Welcome</h2></body></html>");
		
		
		
		
	}

}
