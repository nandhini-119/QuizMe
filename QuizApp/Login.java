package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.Dao.LoginDao;




@WebServlet("/Login")
public class Login extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			/*String dbName=null;
			String dbPassword=null;
			
			String sql="select *from one where name=? and password=?";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbuser","root","root");
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
		
			
			ResultSet rs=ps.executeQuery();
			PrintWriter out=response.getWriter();*/
			
			String name=request.getParameter("uname");
			String password=request.getParameter("pass");
			PrintWriter out=response.getWriter();
			LoginDao dao=new LoginDao();
			
			if(dao.check(name, password))
			
					{
				
				HttpSession session = request.getSession();
                session.setAttribute("username",name);
				response.sendRedirect("welcome.jsp");
				}
				else
				{
					out.println("Enter valid Details...");
					//response.sendRedirect("login.jsp");
				}
			}
			
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		
	}
	
}



