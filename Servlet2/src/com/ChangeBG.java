package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ChangeBG")
public class ChangeBG extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String color = request.getParameter("color");
		
		out.println("<html>");
		out.println("<body>");
		
		//STYLE 태그로 한거
		out.println("<style>");
		out.println("body{ background-color:"+color+"}");
		out.println("</style>");
		
		// HTML로 한거
//		out.println("<body bgcolor='");
//		out.println(color);
//		out.println("'>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
