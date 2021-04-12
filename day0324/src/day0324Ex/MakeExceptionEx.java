package day0324Ex;

import java.io.IOException;

public class MakeExceptionEx {
	//makeArthmeticException메서드를 구현, 호출시 arithmeticException을 발현시키도록 구현
	//makeIOException() 메서드를 구현 호출시 IOException을 발생시키도록 하며, 호출하는 코드에서 예외를 처리하도록 위임.
	
	public void makeArthmeticException() {
		throw new ArithmeticException();
		
	}
	
	public String makeIOException()throws IOException {
		int num=(int)(Math.random()*2);
		if(num==0) {	
			throw new IOException();
		}
		return "반환 결과!";
	}
	
}
