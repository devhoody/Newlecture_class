package com.newlecture.jdbc.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Data {
	
	private String name;
	private int age;
	
	public void search(String searchWord) throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@192.168.0.15:1521/xepdb1";
		String sql = "SELECT * FROM MEMBER WHERE NAME LIKE '%"+ searchWord+ "%'";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "RLAND", "0530");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			String name = rs.getString("name");
			int age = rs.getInt("age");
		}
		
		
		rs.close();
		st.close();
		con.close();
	}
	
	
}
