package day0318.interfaceEx01;

public class Television implements RemoteInterface{
	
	@Override
	public void turnOn() {
		//티비를 켜기 위한 로직이 수행됨.
		System.out.println("티비를 어쩌구저쩌구 해서 켠다");
	}
	
	//티비 끄는 기능
	@Override
	public void turnOff() {
		System.out.println("티비를 끈다");
	}
	
}
