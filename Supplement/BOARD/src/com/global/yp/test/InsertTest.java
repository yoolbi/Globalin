package com.global.yp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn =  DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/board"
				, "root"
				, "1234");
		System.out.println(conn);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input title:");
		String title =  scan.next();
		System.out.println("Input content:");
		String content =  scan.next();
		
		String sql = "insert into board (title, content) values (?, ?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, title);
		ps.setString(2, content);
		int count = ps.executeUpdate();
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
	}

}
