package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cal")
public class Cal extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String opr = request.getParameter("opr");
		
	      int result = 0;
	      if(opr.equals("+")) {
	         result = num1+num2;
	      }else if(opr.equals("-")) {
	         result = num1-num2;
	      }else if(opr.equals("*")) {
	         result = num1*num2;
	      }else if(opr.equals("/")) {
	         result = num1/num2;
	      }
	      out.println("<html><body>");
	   
	      out.println(num1+opr+num2+"="+result);
	      
	      out.println("</body></html>");
	
	}

}
