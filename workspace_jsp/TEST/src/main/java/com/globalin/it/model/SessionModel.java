package com.globalin.it.model;

import jakarta.servlet.http.HttpServletRequest;

public class SessionModel {

	public void processLogin(HttpServletRequest req) {
		String id = req.getParameter("userId");
		String pw = req.getParameter("userPw");
		if ("sachiko".equals(id) && "1234".equals(pw)) {
			req.getSession().setAttribute("userId", id);
		}

	}

	public void processLogout(HttpServletRequest req) {
		req.getSession().invalidate();
	}
}
