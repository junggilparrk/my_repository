package day0318;


public class TelevisionTest {
	public static void main(String[] args) {
		//티비로 켜고 꺼부자
		
		Television tv= new Television();
		tv.turnOn();
		tv.turnOff();
		
		Aircon aircon=new Aircon();
		aircon.turnOn();
		aircon.turnOff();
		
		Remotecontroller remocon=new Remotecontroller(tv);
		remocon.on();
				
	}
	
}
