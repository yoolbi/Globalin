package com.global.yp.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardUpdate {

	public void update(String seq) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn =  DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/board"
				, "root"
				, "1234");
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("Input seq:");
//		String seq =  scan.next();
		System.out.println("Input title:");
		String title =  scan.next();
		System.out.println("Input content:");
		String content =  scan.next();
		
		String sql = "update board set title = ?, content = ? where seq = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, title);
		ps.setString(2, content);
		ps.setString(3, seq);
		int count = ps.executeUpdate();
		
		
		
		
		
		
		
		
		
		
	}

}
