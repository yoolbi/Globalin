package com.globalin.it;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(MainServlet.class);
		if (req.getRequestURI().contains("/form.do")) {
			req.getRequestDispatcher("/form.jsp").forward(req, resp);
		}
		if (req.getRequestURI().contains("/calc.do")) {
			int result = Integer.parseInt(req.getParameter("num1"))
						+Integer.parseInt(req.getParameter("num2"));
			req.setAttribute("result", result);
			req.getRequestDispatcher("/result.jsp").forward(req, resp);
		}
	}

}
