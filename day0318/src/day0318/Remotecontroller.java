package day0318;

public class Remotecontroller {
	Television tv;
	
	public Remotecontroller(Television tv) {
		this.tv=tv;
	}
	
	public void on() {
		tv.turnOn();
	}
	public void off() {
		tv.turnOff();
	}
}
