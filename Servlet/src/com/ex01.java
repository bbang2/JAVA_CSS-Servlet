package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex01")
public class ex01 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/* service�� request, response��� �������̽� �Ű������� ������ ���� */
		
			// ���ڵ��� ���� ����� �ѱ۾��°� ����
			response.setCharacterEncoding("EUC-KR");
			PrintWriter out = response.getWriter();
			
			out.println("<html>");
			out.println("<body>");
			
			String ip = request.getRemoteAddr();
			if (ip.equals("172.30.1.58")) {
				out.println("¦��� ���ĵ� ������~!!");
				out.println("<img src='iiii.jfif'");
				}
			else if(ip.equals("172.30.1.55")) {
				out.println("������ ���ĵ� ������~!!");
				out.println("<img src='bye.jpg'");
				}
			else if (ip.equals("172.30.1.5") || (ip.equals("172.30.1.19"))||(ip.equals("172.30.1.47"))) {
				out.println("���̽��� ȭ����");
				out.println("<img src='jin.jpg'");
			}
			else {
				out.println("�츮�� ������ ȭ����");
				out.println("<img src='iiii.jfif'");
			}
			
			
			
			
			out.println("</body>");
			out.println("</html>");
					
			
		
		
	
		
		
//		String ip = request.getRemoteAddr();
//		String host = request.getLocalName();
//		System.out.println(host+ "/" +ip);
//		// �����͹��� �ڷ����� �ڵ��ϼ����� �˼� ����
//
//		
//		System.out.println("Hello World!");
		
		
		
		
	}

}
