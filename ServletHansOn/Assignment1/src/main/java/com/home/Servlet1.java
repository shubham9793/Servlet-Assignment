package com.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 	response.setContentType("text/html");  
		    PrintWriter pw = response.getWriter();  
		        
		  
		    String n=request.getParameter("id"); 
		    
		    if(n.equals("1")) {
		    pw.print("Welcome "+"Shubham");  
		 
		   Cookie c=new Cookie("id",n);//creating cookie object  
		   response.addCookie(c);//adding cookie in the response 
		   
		  
		    //creating submit button  
		    pw.print("<form action='Servlet2'method='post'>");  
		    pw.print("<input type='submit' value='OK'>");  
		    pw.print("</form>"); 
		    }
		    else {
		    	pw.println("Incurrect User Id");
		    }
		     
		    	pw.close();
	}

}
