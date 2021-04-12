package day0324.exceptionEx03;
//사용자 정의 예외는 Exception을 상속 받아서 만든다.
public class MyException extends Exception{
	
	public MyException(String msg) {
		super(msg);
	}
	
	
}
