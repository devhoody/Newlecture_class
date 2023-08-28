package com.newlecture.jdbc.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		String url = "jdbc:oracle:thin:@db.newlecture.com:1521/xepdb1";
		String sql = "SELECT * FROM MEMBER ";

//		1. 드라이버 로드 ⇒ driver manager
//		2. 연결 생성하기 ⇒ connection
//		3. 문장 실행하기 ⇒ statement
//		4. 결과집합 사용하기 ⇒ Resultset

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "RLAND", "0530");
			st = con.createStatement();
			rs = st.executeQuery(sql);

			System.out.println("-*ID*\t -*NAME*-\t -*AGE*-");

			while (rs.next()) {
				String name = rs.getString("NAME");

				int id = rs.getInt("id");
				int age = rs.getInt("age");

				System.out.printf("%-2d   %-10s   %2d\n", id, name, age);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		} 
		finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("모든 것을 닫아준다.");
		}
		System.out.println("프로그램 종료");
	}

}
