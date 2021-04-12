package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String id= "root";
			String password= "mysql";
			
			String url= "jdbc:mysql://localhost:3306/mytestdb_a?"
					+ "characterEncording=utf-8&severTimezone=Asia/Seoul";
			
			conn=DriverManager.getConnection(url,id,password);
			
			String query= "select * from phone";
			
			Statement sttm=conn.createStatement();
			
			ResultSet rs=sttm.executeQuery(query);
			
			while(rs.next()) {
				String phoneId=rs.getString(1);
				System.out.println(phoneId);
			}
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			while(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
