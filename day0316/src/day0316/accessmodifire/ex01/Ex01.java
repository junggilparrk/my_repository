package day0316.accessmodifire.ex01;

public class Ex01 {
	//access modifire
	//클래스간(필드,메서드)에 접근을 허용할 범위를 지정하는것
	//필드 또는 메서드에게 지정 할 수 있음
	//필드==속성 
	//클래스 바로 안에 선언하는 변수
	//static String name; //클래스 변수->객체 생성 X 사용가능
	//int age; // 객체를 생상해야 사용가능.
	public String publicStr;
	protected String protectedStr;
	String defaultStr;
	private String privateStr;//클래스 안에서만 접근이 가능하다.
	
	//메서드
	public void getInfo() {
		System.out.println("publicStr:"+publicStr);
		System.out.println("protectedStr:"+protectedStr);
		System.out.println("defaultStr:"+defaultStr);
		System.out.println("privateStr:"+privateStr);
	}
	
}
