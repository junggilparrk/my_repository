package day0318.interfaceEx01;

public class Aircon implements RemoteInterface{

	@Override
	public void turnOn() {
		//에어컨 켜는 기능
		System.out.println("냉각기를 이용한다.");	
		System.out.println("실외기를 돌린다.");
		System.out.println("에어콘을 켠다.");
	}
	
	//에어컨 끄는 기능
	@Override
	public void turnOff() {
		System.out.println("실외기를 끈다.");
		System.out.println("에어콘을 끈다.");
	}
	
}
