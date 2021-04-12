package day0331dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectTest {
	public static void main(String[] args) {
		//디비 접속 테스트
		//디비에 접속하기 위한 Driver클래스를 로드 해야한다.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//mysql에 접속하기 위한 id
			String id = "root";
			
			//mysql에 접속하기 위한 password
			String password ="mysql";
			
			//mysql에 접속하기 위한 URL 세팅
			//프로토콜// 아이피주소: 포트번호 / 데이터베이스 이름? 파라미터
			String url="jdbc:mysql://localhost:3306/sakila?"
					+"characterEncoding=utf-8&severTimezone=Asia/Seoul";
			
			//디비 접속할 정보를 다 만들었으니
			//디비에 연결 시켜주는 커넥터 객체를 받는다.
			//접속이되면 connection 객체를 반환 받는다.
			
				Connection conn= DriverManager.getConnection(url, id, password);
			
					
				System.out.println("커넥션 객체:"+conn);	
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {	
			e.printStackTrace();
		} 
		
	}
}
