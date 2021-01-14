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
		/* service는 request, response라는 인터페이스 매개변수를 가지고 있음 */
		
			// 인코딩을 먼저 해줘야 한글쓰는게 먹힘
			response.setCharacterEncoding("EUC-KR");
			PrintWriter out = response.getWriter();
			
			out.println("<html>");
			out.println("<body>");
			
			String ip = request.getRemoteAddr();
			if (ip.equals("172.30.1.58")) {
				out.println("짝꿍님 오후도 파이팅~!!");
				out.println("<img src='iiii.jfif'");
				}
			else if(ip.equals("172.30.1.55")) {
				out.println("선생님 오후도 파이팅~!!");
				out.println("<img src='bye.jpg'");
				}
			else if (ip.equals("172.30.1.5") || (ip.equals("172.30.1.19"))||(ip.equals("172.30.1.47"))) {
				out.println("참이슬팀 화이팅");
				out.println("<img src='jin.jpg'");
			}
			else {
				out.println("우리반 여러분 화이팅");
				out.println("<img src='iiii.jfif'");
			}
			
			
			
			
			out.println("</body>");
			out.println("</html>");
					
			
		
		
	
		
		
//		String ip = request.getRemoteAddr();
//		String host = request.getLocalName();
//		System.out.println(host+ "/" +ip);
//		// 데이터받을 자료형은 자동완성보면 알수 있음
//
//		
//		System.out.println("Hello World!");
		
		
		
		
	}

}
