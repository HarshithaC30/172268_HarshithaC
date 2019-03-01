package com.register.imdb;

import java.io.*;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.imdb.DaoClass;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String Name=request.getParameter("name");
		   String Email=request.getParameter("email"); 
		   String Phone=request.getParameter("phone");
		   String Password=request.getParameter("password"); 
		   String Gender=request.getParameter("gender");

		   PrintWriter out = response.getWriter();
		  
		
		  boolean status=false;
		  
		  
		  try { 
			  status= new DaoClass().register(Name, Email, Phone, Password, Gender);
			  }  
		 catch (SQLException e1) { 
			 e1.printStackTrace(); 
			 }
		  
		  
		  if(status==true) {
		 response.sendRedirect("Login.html"); }
		 }
	

}
