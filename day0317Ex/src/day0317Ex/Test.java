package day0317Ex;

public class Test {
	public static void main(String[] args) {
		Car[] c1=new Car[3];
		c1[0]=new SportsCar("람보르기니", "에보 스파이더", "3억원", "140km/h");
		c1[1]=new Suv("삼성", "sm6", "1억원", "6인승");
		c1[2]=new SmallCar("대우", "마티즈", "3천만원", "150kg");
		
		for(Car c:c1) {
			c.go();
			System.out.println();
			System.out.println("브랜드명:"+c.getBrand()+",차이름:"+c.getName()+",차 가격:"+c.getPrice());
		}
		 
		
		System.out.println();
	
		
		SportsCar s=(SportsCar)c1[0];
		if(c1[0] instanceof SportsCar) {
			System.out.println(((SportsCar)c1[0]).getInfo());
		}
		System.out.println();
		
		System.out.println(s.getInfo());
		System.out.println("최고 속력:"+s.getMaxSpeed());

		
		System.out.println();

		
		Suv su=(Suv)c1[1];
		if(c1[1] instanceof Suv) {
			System.out.println(((Suv)c1[1]).getInfo());
		}
		System.out.println();
		
		System.out.println(su.getInfo());
		System.out.println("차량 인승:"+su.seater);
		su.stop();
		
		
		System.out.println();
		
		
		SmallCar sm=(SmallCar)c1[2];
		if(c1[2] instanceof SmallCar) {
			System.out.println(((SmallCar)c1[2]).getInfo());
		}
		System.out.println();
		
		System.out.println(sm.getInfo());
		System.out.println("차량 중량:"+sm.getWeigt());
	}
}
 