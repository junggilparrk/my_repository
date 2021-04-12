package day0311ex02;

public class Student {
String name;
int age;
int kor;
int math;
int eng;

public Student(String name,int age) {
	this.name=name;
	this.age=age;
}
public Student(String name,int age,int kor, int math,int eng) {
	//필드에 this 초기 값이 있다면 this(name,age);로 쓸수 있음
	this.name=name;
	this.age=age;
	this.kor=kor;
	this.math=math;
	this.eng=eng;
}	
public Student(String name,int kor, int math,int eng) {
	//this(name,15);로 쓸수 있음.
	this.name=name;
	this.age=15;
	this.kor=kor;
	this.math=math;
	this.eng=eng;
}

}
