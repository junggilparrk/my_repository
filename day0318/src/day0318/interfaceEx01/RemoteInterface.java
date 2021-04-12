package day0318.interfaceEx01;

//인터페이스
//몸체가 없는 메서드(추상메서드)만 갖고 있는 아이다.
//public String name(param);
//인스턴스 변수는 못 갖으나 상수는 갖을 수 있다.
//
//1.8까지는 모든 메서드가 추상이어야 했는데, 이후 버전에는 
//몸체가 있는 디폴트 메서드도 만들 수 있다.
//1.9이후 버전에는 프라이빗한 몸체가 있는 메서드도 가능.


public interface RemoteInterface {
	//인터페이스는 상수도 사용가능함
	//final 사용시 재대입 하는게 불가하다.
	public static final int REMOTE_NUMBER=123456;
	
	//인터페이스 추상 메서드는 public이어야 한다.
	//인터페이스상 디폴트는 public으로 자동 저장.

	public void turnOn();
	
	public void turnOff();
	 
	
}
