package day0408.objectIOEx01;

import java.io.Serializable;

public class Person implements Serializable {//직렬화 할 수 있는 형태
	private static final long serialVersionUID = 4329812886816312546L;
	private String name;
	private int age;
	private long height;
	//클래스가 달리지면 읽었을 때 오류가 난다.
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public long getHeight() {
		return height;
	}

	public void setHeight(long height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
