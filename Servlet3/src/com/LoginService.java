package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginService")
public class LoginService extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("EUC-KR");
		response.setCharacterEncoding("EUC-KR");
		
		String loginId="ȣ�ξƺ�";
		String loginPw="1234";
		
		//client�� ��û�� id, pw�� �Է¹޾Ƽ�
		//�Է��� id�� pw�� ���� ���̵�� ��й�ȣ�� ��ġ�Ѵٸ�
		// ȣ�ξƺ��� ȯ���մϴ� �� ���������� ����
		// �ƴ϶�� �α��ο� �����Ͽ����ϴٸ� ���������� ����ּ���
		
		PrintWriter out = response.getWriter();
		
		String id= request.getParameter("id");
		String pw= request.getParameter("pw");
		
		out.println("<html> <body>");
		
		if (id.equals(loginId) && pw.equals(loginPw)) {
			out.println(loginId+"�� ȯ���մϴ�");
		}else {
			out.println("�α��ο� �����Ͽ����ϴ�..");
		}
		
		out.println("</body></html>");
		
	}

}
