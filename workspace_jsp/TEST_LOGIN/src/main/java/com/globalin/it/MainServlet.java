package com.globalin.it;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html"); // Set the content type of the response
		PrintWriter out = resp.getWriter(); // Obtain the PrintWriter object
		if(req.getRequestURI().contains("/request01_process.do")) {
			String id = req.getParameter("id");
		    String password = req.getParameter("passwd");
		    if (id != null && password != null && id.equals("scott") && password.equals("tiger")) {
//	            req.getRequestDispatcher("/request01_process.jsp").forward(req, resp);
		    	out.print("<h3>로그인성공</h3>");
	        } else {
//	        	req.getRequestDispatcher("/request02_process.jsp").forward(req, resp);
	        	out.print("<h3>로그인실패</h3>");
	        }
		}
	}

}
