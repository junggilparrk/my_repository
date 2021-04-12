package day0324.exceptionEx02;

import java.io.IOException;

public class MyInputThrows {
	
	public String readString()throws IOException {// IO예외가 발생했을때 이메서드를 호출한 쪽에서 IO예외를 처리하도록 위입함.
	
		byte[] buf=new byte[100];
		
		System.in.read(buf);
 
		return new String(buf);
	}
}
