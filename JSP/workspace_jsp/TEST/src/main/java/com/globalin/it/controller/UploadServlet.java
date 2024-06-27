package com.globalin.it.controller;

import java.io.IOException;

import com.globalin.it.model.UploadModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UploadServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(UploadServlet.class);
		if(req.getRequestURI().contains("/upload.abc")) {
			req.getRequestDispatcher("/view/ch07_file/upload.jsp").forward(req, resp);
		}
		if(req.getRequestURI().contains("/upload_process.abc")) {
			new UploadModel().process(req);
			req.getRequestDispatcher("/view/ch07_file/upload_process.jsp").forward(req, resp);
		}
	}


	
}
