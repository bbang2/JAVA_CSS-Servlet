package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Choice")
public class Choice extends HttpServlet {
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setCharacterEncoding("EUC-KR");
			PrintWriter out = response.getWriter();
			String food = request.getParameter("food");
			
			out.println("<html>");
			out.println("<body>");
			
			if (food.equals("떡볶이")) {
				out.println("<img src='"+food+"'>");
				out.println("겨울엔 포장마차 떡볶이!");
			}else if(food.equals("방어회")) {
				out.println("<img src='bang.jpg'>");
				out.println("겨울에는 기름좔좔 방어회,,,크으");
			}else if(food.equals("밀푀유나베")) {
				out.println("<img src='nabe.jfif'>");
				out.println("겨울엔 따끈한 나베국물~~");
			}// if문 안쓰고 하는 방법 >> 2. "out.println(<img src"'+food+"'>");
			out.println("</body>");
			out.println("</html>");
			
	}

}
