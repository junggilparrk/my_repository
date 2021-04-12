package day0312.inheritance.ex02;

public class Person {
	String name;
	int age;
	
	public Person() {
		System.out.println("Person 생성자 호출");
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void introduce() {
		System.out.println("나는 "+name+"이라고해");
		System.out.println("내 나이는 "+age+"살이야");
	}
}
