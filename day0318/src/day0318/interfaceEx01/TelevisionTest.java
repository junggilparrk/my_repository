package day0318.interfaceEx01;


public class TelevisionTest {
	public static void main(String[] args) {
		//티비로 켜고 꺼부자
		
		Television tv= new Television();
		tv.turnOn();
		tv.turnOff();
		
		Aircon aircon=new Aircon();
		aircon.turnOn();
		aircon.turnOff();
		
		
		//서로 다른 객체가 인터페이스로 묶인다.
		Remotecontroller remocon=new Remotecontroller(tv);
		remocon.on();
		
		Remotecontroller remocon1=new Remotecontroller(aircon);
		remocon1.on();
		
		
				
	}
	
}
