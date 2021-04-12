package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Url {
	public static void main(String[] args) {
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String id="root";
			String password="mysql";
			String url="jdbc:mysql://localhost:3306/sakila?"
					+ "charactorEncording=utf-8&severTimezone=Aisa/Seoul";
			
			conn=DriverManager.getConnection(url,id,password);
			
			String querly="select * from actor";
			
			Statement sttm=conn.createStatement();
			
			ResultSet rs=sttm.executeQuery(querly);
			
			while(rs.next()) {
				String sd=rs.getString(1);
				String sdd=rs.getString(2);
				String sdddd=rs.getString(3);
				System.out.println(sd+sdd+sdddd);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
