package com.login.imdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.imdb.DaoClass;
import com.proj.imdb.ConnectionFactory;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String Name=request.getParameter("name");
		 String Password=request.getParameter("pwd");
		 System.out.println(Name+" UI  "+Password);
		 DaoClass dao = new DaoClass();
		 
		 boolean status = false;
		 try {
			 
			status=dao.validate(Name,Password);
			System.out.println(status);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		// PrintWriter out = response.getWriter();
		 if(status==true)
		 {
			 response.sendRedirect("Comments.html");
		 }
		 else
		 {
			 response.sendRedirect("Reg.html");
		 }

		
	
	}

}
