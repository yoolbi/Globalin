package com.global.yp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn =  DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/board"
				, "root"
				, "1234");
		System.out.println(conn);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Input title:");
//		String title =  scan.next();
//		System.out.println("Input content:");
//		String content =  scan.next();
		
		String sql = "select * from board";
		PreparedStatement ps = conn.prepareStatement(sql);
//		ps.setString(1, title);
//		ps.setString(2, content);
		ResultSet rs = ps.executeQuery();
		System.out.println(rs);
		while(rs.next()) {
			System.out.print(rs.getString("seq")+"|");
			System.out.print(rs.getString("title")+"|");
			System.out.print(rs.getString("content")+"|");
			System.out.print(rs.getString("createdate"));
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
