package day0317.car;

public class Car2 extends Car {

	public Car2(String name) {
		super(name);
		
	}

	@Override
	protected void startCar() {
		System.out.println(name+" 차에 스타트 버튼으로 시동을 겁니다.");
		
	}

	@Override
	protected void drive() {
		System.out.println("자율주행으로 운전을 합니다." );
		
	}

	@Override
	protected void stop() {
		System.out.println("자동으로 차가 멈춥니다.");
		
	}

	@Override
	protected void turnOff() {
		System.out.println("스타트 버튼으로 시동을 끕니다.");
		
	}

}
