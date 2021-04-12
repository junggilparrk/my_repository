package day0310.ex01;

public class CarTest {

	public static void main(String[] args) {
		//클래스를 통해서 Car 객체 생성
		//사용자 정의 자료형
		Car[] car=new Car[1];
		//car1 변수에 객체를 생성하여 넣어주자
		car[0]=new Car("검정", 1000);
		
		//생성된 객체의 필드에 값을 넣어 주자
		
		
		System.out.println("car1의 컬러는 "+car[0].color);
		System.out.println("car1의 마일리지는 "+car[0].mileage);
		
		
		
		Car car2;
		car2=new Car("파랑",20000);
		
		
		System.out.println(car2.color);
		System.out.println(car2.mileage);
		
		
	
	}

}
