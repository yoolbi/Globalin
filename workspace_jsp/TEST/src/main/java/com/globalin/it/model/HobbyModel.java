package com.globalin.it.model;

import jakarta.servlet.http.HttpServletRequest;

public class HobbyModel {
	
	public void process(HttpServletRequest req) {
		String mName = req.getParameter("mName");
		String[] hobby = req.getParameterValues("hobby");
		req.setAttribute("mName", mName);
		req.setAttribute("hobbys", hobby);
	}
}
