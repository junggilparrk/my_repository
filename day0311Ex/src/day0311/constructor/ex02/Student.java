package day0311.constructor.ex02;

public class Student {
	//필드가 있는 클래스의 생성자 만들기
	String name;
	int age;
	
	public Student(String name,int age) {
		//필드에 전달 받은 값을 넣어준다.
		this.name=name;
		this.age=age;
	}
	public Student(String name) {
		this.name=name;
	}
	public Student(int age) {
		this.age=age;
	}
	public Student() {
		
	}
}

