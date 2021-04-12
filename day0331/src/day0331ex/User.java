package day0331ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
	public static void main(String[] args) {
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String id="root";
			String password="mysql";
			String url="jdbc:mysql://localhost:3306:mytestdb_b?"
					+"characterEncording=utf8&serverTimezone=Asia:Seoul";
			conn=DriverManager.getConnection(url,id,password);
			
			String query="select * from user";
			
			Statement sttm=conn.createStatement();
			
			ResultSet rs=sttm.executeQuery(query);
			
			while(rs.next()) {
				int useId=rs.getInt(1);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
