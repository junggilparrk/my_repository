package day0317.car;


public class Car1 extends Car{
	
	

	public Car1(String name) {
		super(name);
		
	}

	@Override
	protected void startCar() {
		System.out.println(name+" 차에 차키를 넣어 시동을 겁니다.");
		
	}

	@Override
	protected void drive() {
		System.out.println("손으로 핸들을 움직여 운전을 합니다.");
		
	}

	@Override
	protected void stop() {
		System.out.println("브레이크를 밟아 멈춥니다.");
		
	}

	@Override
	protected void turnOff() {
		System.out.println("차키를 돌려 시동을 끕니다.");
		
	}
	

}
