package com.Rohith;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/Registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Connection con=null;
       Statement  st=null;
    
    public RegistrationServlet() 
    	{
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
       
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	  try {
		String fname=req.getParameter("fname");
	   String lname=req.getParameter("lname");
	   String mail=req.getParameter("email");
	   String Uname=req.getParameter("Uname");
	   String pwd=req.getParameter("pwd");
	   long ph=req.Long.parseLong(req.getParameter("phone"));
	   st.executeUpdate("insert into Users(fname,lname,email,uname,password,phone)values('"+fname+"','"+lname+"''"+mail+"','"+Uname+"','"+pwd+"','"+ph+"')");
	   PrintWriter pw=res.getWriter();
	   out.write("<h1>Registration succ...</h1> <br>");
	   out.write("<a href= 'login.jsp'>Please Login</a>");
	  }
	 
	  catch(Exception e)
	  {
		System.out.println(e.getMessage());  
	  }

}
}
