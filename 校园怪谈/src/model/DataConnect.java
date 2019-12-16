package model;

import java.sql.*;

public class DataConnect {

	private static Statement stat;

	private static void init() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://129.211.42.69:3306/school novel";
		String name = "root";
		String pw = "123123";
		Connection con = DriverManager.getConnection(url, name, pw);
		stat = con.createStatement();
	}
	
	public static Statement getStat() throws ClassNotFoundException, SQLException{
		if (stat==null)
			init();
		return stat;
	}
}
