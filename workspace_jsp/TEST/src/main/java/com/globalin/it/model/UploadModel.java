package com.globalin.it.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.UUID;

import javax.print.DocFlavor.STRING;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import jakarta.servlet.http.HttpServletRequest;

public class UploadModel {
	
	public void process(HttpServletRequest req) throws IOException {	
		//실제 서버 위치
		String realFolder = req.getServletContext().getRealPath("/") + "\\resources\\images";	
		//eclipse 소스 위치
		String eclipseFolder = "C:\\workspace_jsp\\TEST\\src\\main\\webapp\\resources\\images";
		System.out.println(realFolder);
		int maxSize = 5 * 1024 * 1024;
		String encType = "utf-8";
		MultipartRequest multi = new MultipartRequest(req, realFolder, maxSize, encType, new DefaultFileRenamePolicy());	
		List<String> oriFileNameList = new ArrayList();
		List<String> newFileNameList = new ArrayList();
		Enumeration files = multi.getFileNames();
		while(files.hasMoreElements()) {
			String fileName = (String)files.nextElement();
			oriFileNameList.add(multi.getOriginalFileName(fileName));
			newFileNameList.add(multi.getFilesystemName(fileName));
		}
		req.setAttribute("title", req.getParameter("title"));
		req.setAttribute("oriFileNameList",  oriFileNameList);
		req.setAttribute("newFileNameList",  newFileNameList);
		
	}
}
