package com.globalin.it.controller;

import java.io.IOException;
import com.globalin.it.model.HobbyModel;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(MainServlet.class);
		//입력화면
		if (req.getRequestURI().contains("/form.do")) {
			req.getRequestDispatcher("/view/ch00_calc/form.jsp").forward(req, resp);
		}
		//처리
		if (req.getRequestURI().contains("/calc.do")) {
			int result = Integer.parseInt(req.getParameter("num1"))
						+Integer.parseInt(req.getParameter("num2"));
			req.setAttribute("result", result);
			req.getRequestDispatcher("/view/ch00_calc/result.jsp").forward(req, resp);
		}
		
		if(req.getRequestURI().contains("/login.do")) {
			req.getRequestDispatcher("/view/ch04_login/index.jsp").forward(req, resp);
		}
		
		if(req.getRequestURI().contains("/hobby.do")) {
			req.getRequestDispatcher("/view/ch06_hobby/form.jsp").forward(req, resp);
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html"); // Set the content type of the response
		PrintWriter out = resp.getWriter(); // Obtain the PrintWriter object
	
		if(req.getRequestURI().contains("/request01_process.do")) {
			String id = req.getParameter("id");
		    String password = req.getParameter("passwd");
		    if (id != null && password != null && id.equals("scott") && password.equals("tiger")) {
	            req.getRequestDispatcher("/view/ch04_login/request01_process.jsp").forward(req, resp);
//		    	out.print("<h3>로그인성공</h3>");
	        } else {
	        	req.getRequestDispatcher("/view/ch04_login/request02_process.jsp").forward(req, resp);
//	        	out.print("<h3>로그인실패</h3>");
	        }
		}
		
		if(req.getRequestURI().contains("/form_process.do")) {
			new HobbyModel().process(req);
			req.getRequestDispatcher("/view/ch06_hobby/form_process_jstl.jsp").forward(req, resp);
		}
	}

}
