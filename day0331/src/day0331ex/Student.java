package day0331ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String id="root";
			String password="mysql";
			
			String url="jdbc:mysql://localhost:3306/mytestdb_a?"
					+"characterEncording=utf8&severTimezone=Asia/Seoul";
			
			conn=DriverManager.getConnection(url,id, password);
			
			String query="select * from Student";
			
			Statement stmt=conn.createStatement();
			
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next()) {
				int studentId =rs.getInt(1);
				String name= rs.getString(2);
				int phoneId= rs.getInt(3);
				String birthday= rs.getString(4);
				
				System.out.println("id : "+studentId+" name : "+name+" phoneId : "
				+phoneId+" birthday : "+birthday);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
