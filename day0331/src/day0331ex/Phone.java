package day0331ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Phone {
	public static void main(String[] args)  {
		Connection conn= null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			String id= "root";
			String password="mysql";
			
			String url="jdbc:mysql://localhost:3306/mytestdb_a?"
					+"characterEncording=utf8&serverTimezone=Asia/Seoul";
		
			
			conn=DriverManager.getConnection(url,id,password);
			
			String query="select * from phone";
			
			Statement stmt=conn.createStatement();
			
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next()) {
			
				int phoneId=rs.getInt("phone_id");
				String name=rs.getString("name");
				int price=rs.getInt("price"); 
			
				System.out.println("phoneId : "+phoneId);
				System.out.println("name : "+name);
				System.out.println("price : "+price);
			
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
