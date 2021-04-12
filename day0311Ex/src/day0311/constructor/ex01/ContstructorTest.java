package day0311.constructor.ex01;

public class ContstructorTest {
	public static void main(String[] args) {
		//객체 생성
		//생성자가 없어도 생성이 되는건 자바가 기본생성자를 만들어 주기 때문이다.
		//기본생성자: 매개변수가 없는 생성자.
		ConstructorEx01 con01=new ConstructorEx01();
		System.out.println(con01);
		
		ConstructorEx02 con02=new ConstructorEx02();

		//매개변수를 받는 생성자를 정의한 클래스를 이용하여 객체를 만들때는 기본 생성자를 바로 쓸수 없다.
		//기본 생성자를 정의 하기 않으면 쓸수 없음
		//ConstructorEx03 con03=new ConstructorEx03();
		ConstructorEx03 con03=new ConstructorEx03("안녕하세요");
		
		//매개 변수가 있는 것과 없는 것 둘 다 정의한 경우
		ConstructorEx04 con04_1=new ConstructorEx04();
		ConstructorEx04 con04_2=new ConstructorEx04("안녕하세요");
	}
}
