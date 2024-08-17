package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/QuizMe")
public class QuizMe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	@Override 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
        String paramName, paramValue[];
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        //int cnt=0;
        String ans="";
            
        Enumeration e=request.getParameterNames();
        
        try
        {
        	int cnt=0;
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quizdb","root","root");
            stmt=con.createStatement();
            rs=stmt.executeQuery("select ans from quiz");
            
            while(rs.next() && e.hasMoreElements())
            {
                String un=rs.getString(1);
                paramName=(String)e.nextElement();
                
                paramValue=request.getParameterValues(paramName);
                for(int i=0;i<paramValue.length;i++)
                {
                    ans=paramValue[i];
                       
                }
                
                if(un.equals(ans))
                    cnt++;
                	
           }
            out.println("<h1>You have scored "+cnt+" points out of 3.</h1>"); 
            
            
        }
        catch(Exception a)
        {
            out.println("Sorry!!! Try again!!!");
        }
    }
    
	}

	
	


