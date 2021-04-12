package day0312.inheritance.ex02;

public class Car extends Muchine{
	String carType;
	int seater;
	String maxSpeed;
	
	void strarUp() {
		System.out.println("시동을 걸다");
	}
	void go() {
		System.out.println("최고 속력 00으로 간다");
	}
	
	@Override
	String printInfo() {
		String c=super.printInfo();
		c=c+", 차 종류:"+carType+", "+seater+"인승"+", 최고 속력:"+maxSpeed;
		return c; 
	}
	
	@Override
	void printinfo(String brand, String name, String price) {
		System.out.println("브랜드:"+brand+", 이름:"+name+", 가격 :"+price+"원"+", 차 종류:"+carType+", "+seater+"인승"+", 최고 속력:"+maxSpeed);
	}
}
