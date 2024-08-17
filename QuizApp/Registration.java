package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
	
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String name=request.getParameter("uname");
			String password=request.getParameter("pass");
			String first=request.getParameter("fname");
			String last=request.getParameter("lname");
			String add=request.getParameter("addr");
			String cont=request.getParameter("contact");
			String sql="insert into one(uname,pass,fname,lname,addr,contact) values(?,?,?,?,?,?)";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbuser","root","root");
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, first);
			ps.setString(4, last);
			ps.setString(5, add);
			ps.setString(6, cont);
			ps.executeUpdate();
			PrintWriter out=response.getWriter();
			out.println("You have successfully registered...");
			
			
			} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
