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
		
		String loginId="호두아빠";
		String loginPw="1234";
		
		//client가 요청한 id, pw를 입력받아서
		//입력한 id와 pw가 기존 아이디와 비밀번호와 일치한다면
		// 호두아빠님 환영합니다 를 웹페이지에 띄우고
		// 아니라면 로그인에 실패하였습니다를 웹페이지에 띄워주세요
		
		PrintWriter out = response.getWriter();
		
		String id= request.getParameter("id");
		String pw= request.getParameter("pw");
		
		out.println("<html> <body>");
		
		if (id.equals(loginId) && pw.equals(loginPw)) {
			out.println(loginId+"님 환영합니다");
		}else {
			out.println("로그인에 실패하였습니다..");
		}
		
		out.println("</body></html>");
		
	}

}
