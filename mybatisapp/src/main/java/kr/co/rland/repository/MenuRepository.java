package kr.co.rland.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MenuRepository {

	public void findAll() throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@db.newlecture.com:1521/xepdb1";
		String sql = "SELECT * FROM MEMBER";

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "matzip", "1004");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		rs.close();
		st.close();
		con.close();
		
	
	}
	
}
