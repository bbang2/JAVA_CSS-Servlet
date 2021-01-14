package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Plus")
public class Plus extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num1=request.getParameter("num1");
		String num2=request.getParameter("num2");
		
		int a=Integer.parseInt(num1);
		int b =Integer.parseInt(num2);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		out.println(num1+"+"+num2+"="+(a+b));
		out.println("</html>");
		out.println("</body>");
	}

}
