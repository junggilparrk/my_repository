package day0310.ex01;

public class CarTest4 {
	public static void main(String[] args) {
		//메서드 사용
		Car car=new Car("검정",10000),car2=new Car("블루",20000),car3=new Car("옐로우",3000);
	
		//변수명.메서드명();
		car.start();//시동을 걸다라는 문장 출력
		System.out.println("마일리지"+car.mileage);
		car.go();//마일리지를 증가시킴
		System.out.println("증가 후 마일리지"+car.mileage);
		
		

		
		car2.start();
		System.out.println(car3.mileage);
		car2.go();
		System.out.println(((car3.mileage)*2));
		
	
	}

}
