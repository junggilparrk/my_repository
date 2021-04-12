package day0324.exceptionEx02;

import java.io.IOException;

public class MyInput {
	//사용자로부터 입력받은 값을 문자열로 반환해주는 메서드
	public String readString() {
		byte[] buf=new byte[100];
		//콘솔에서 문자를 읽어 buf에 넣을 거임.
		try {
			System.in.read(buf);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return new String(buf);
	}
} 
 