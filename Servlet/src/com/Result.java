package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//request.setCharacterEncoding("EUC-KR"); - post방식 인코딩
		
		
		String text = request.getParameter("text");
		String id = request.getParameter("id");
		
		System.out.println(id+":"+text);
		
		//실행결과
		//호두아빠 : 안녕하세요
	}

}
