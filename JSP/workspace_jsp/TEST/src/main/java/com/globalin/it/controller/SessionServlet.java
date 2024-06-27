package com.globalin.it.controller;

import java.io.IOException;

import com.globalin.it.model.SessionModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SessionServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(this);
		if (req.getRequestURI().contains("/login.coffee")) {
			req.getRequestDispatcher("/view/ch13_session/login.jsp").forward(req, resp);
		}
		if (req.getRequestURI().contains("/login_process.coffee")) {
			new SessionModel().processLogin(req);
			req.getRequestDispatcher("/view/ch13_session/menu.jsp").forward(req, resp);
		}
		if (req.getRequestURI().contains("/logout_process.coffee")) {
			new SessionModel().processLogout(req);
			req.getRequestDispatcher("/view/ch13_session/menu.jsp").forward(req, resp);
		}
	}
}
