package day0408Ex;

import java.io.Serializable;

public class Student implements Serializable{
	
//	private static final long serialVersionUID = 2562602264288840641L;
	private String name;
	private int age;
	private int classes;
	
	public Student(String name, int age, int classes) {
		super();
		this.name = name;
		this.age = age;
		this.classes = classes;
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

	public int getClasses() {
		return classes;
	}

	public void setClasses(int classes) {
		this.classes = classes;
	}
	
}
