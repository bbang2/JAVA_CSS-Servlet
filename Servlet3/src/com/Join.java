package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Join")
public class Join extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("EUC-KR");
		request.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
				
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		String birth = request.getParameter("bday");
		String color = request.getParameter("color");
		String[] hobby = request.getParameterValues("hobby");
		String talk = request.getParameter("talk");
		
		out.println("<html> <body>");
		out.println("ID : " + id+"<br>");
		out.println("NAME : " + name+"<br>");
		out.println("EMAIL : " + email+"<br>");
		out.println("TEL : " + tel+"<br>");
		out.println("GENDER : " + gender+"<br>");
		out.println("COUNTRY : " + country+"<br>");
		out.println("BIRTH : " + birth+"<br>");
		out.println("COLOR : " + color+"<br>");
		out.println("HOBBY : ");
		for (int i=0; i<hobby.length; i++) {
			out.print(hobby[i]);
		}out.println("<br>");
		out.println("TALK : " + talk);
		
		out.println("</body> </html>");
	}

}
