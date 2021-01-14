package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MakeBang")
public class MakeBang extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num = request.getParameter("num");
		int a = Integer.parseInt(num);
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<table border=1>");
		
		out.println("<tr>");
		
		for (int i=1; i<=a; i++) {
			out.println("<td>");
			out.println(i); 
			out.println("</td>");
		}
		
				
		out.println("</tr>");
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
