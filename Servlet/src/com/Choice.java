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
			
			if (food.equals("������")) {
				out.println("<img src='"+food+"'>");
				out.println("�ܿ￣ ���帶�� ������!");
			}else if(food.equals("���ȸ")) {
				out.println("<img src='bang.jpg'>");
				out.println("�ܿ￡�� �⸧���� ���ȸ,,,ũ��");
			}else if(food.equals("��ǣ������")) {
				out.println("<img src='nabe.jfif'>");
				out.println("�ܿ￣ ������ ��������~~");
			}// if�� �Ⱦ��� �ϴ� ��� >> 2. "out.println(<img src"'+food+"'>");
			out.println("</body>");
			out.println("</html>");
			
	}

}
