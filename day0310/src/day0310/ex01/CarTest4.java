package day0310.ex01;

public class CarTest4 {
	public static void main(String[] args) {
		//메서드 사용
		Car car=new Car(),car2=new Car(),car3=new Car();
		car.color="검정";
		car.mileage=10000;
	
		//변수명.메서드명();
		car.start();//시동을 걸다라는 문장 출력
		System.out.println("마일리지"+car.mileage);
		car.go();//마일리지를 증가시킴
		System.out.println("증가 후 마일리지"+car.mileage);
		
		
		Car car1=new Car();
		car1.color="블루";
		car1.mileage=20000;
		
		car1.start();
		System.out.println(car1.mileage);
		car1.go();
		System.out.println(((car1.mileage)*2));
		
		car2.color="옐로우";
		car2.mileage=3000;
		car2.start();
		System.out.println(car2.color);
	}

}
