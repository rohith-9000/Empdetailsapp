package com.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/emp")
public class empdetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 Connection con=null;
     Statement  st=null;
        public empdetail() {
        	try{
            	
            	Class.forName("com.mysql.cj.jdbc.Driver");
            	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lpempdetails?useSSl=false","root","r145");
            	st=con.createStatement();
            	}
            	catch(ClassNotFoundException e)
            	{
            		System.out.println("type 4 for my sql not found");
            	}
            	catch(SQLException e)
            	{
            		System.out.println(e.getMessage());
            	}
            	} 	
        
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
				String fname=req.getParameter("fname");
				String Iname=req.getParameter("Iname");
				String uname=req.getParameter("uname");
		
	}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
