package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sports")
public class Sports extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 동일한 name으로된 여러 개의 값을 가져올 때
		String[] sports = request.getParameterValues("sports");
		// sports의 값 전체를 콘솔에 출력하시오
//		for (int i=0; i<sports.length; i++) {
//			System.out.println(sports[i]);
//		}
		// 확장 for문
		for (String s : sports) {
			System.out.println(s);
		}
		
	}

}
