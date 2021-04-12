package day0310.ex01;
//자동차를 만들기 위한 설계도를 생성
public class Car {
	//필드(속성)
	String color;//색
	int mileage;//주행거리
	
	public Car(String color,int mileage) {
		this.color=color;
		this.mileage=mileage;
	}

	
	//메서드(동작)
	public void start() {
		System.out.println("시동을 걸다");
	}		
	//가다
	public void go() {
		//주행거리가 1씩 증가!
		mileage++;
	}
	//필드를 출력하는 메서드
	public void printInfo() {
	String str1="차 색: "+color;	
	String str="주행거리: "+ mileage;
		System.out.println(str1+str);
	}


}
