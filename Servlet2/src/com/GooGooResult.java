package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GooGooResult")
public class GooGooResult extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String start= request.getParameter("start");
		String end= request.getParameter("end");
		int num1 = Integer.parseInt(start);
		int num2 = Integer.parseInt(end);
		
		String color = request.getParameter("color");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<table border=1>");
		
		for (int i=num1; i<=num2; i++) {
			out.println("<tr>");
			
			for (int j=1; j<10; j++) {
				out.println("<td bgcolor = '<"+ (color+(10*i))+ "'>");
				out.println(i + "*" + j + "=" + i*j);
				out.println("</td>");
				
			}out.println("</tr>");
		}
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
