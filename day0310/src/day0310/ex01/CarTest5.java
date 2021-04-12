package day0310.ex01;

public class CarTest5 {
	public static void main(String[] args) {
		Car obbacha=new Car();
		obbacha.color="빨강";
		obbacha.mileage=1000;
		
		Car abbacha=new Car();
		abbacha.color="회색";
		abbacha.mileage=100000;
		
		//각각의 차의 내용을 출력
		obbacha.printInfo();
		abbacha.printInfo();
		
		//obbacha의 color값을 변경
		obbacha.color="파랑";
		
		obbacha.printInfo();
		abbacha.printInfo();
		
		//객체의 복사
		Car mycha;
		mycha=obbacha;//reperence copy 얉은 복사
		System.out.println("mycha복사후");

		mycha.printInfo();
		obbacha.printInfo();
		abbacha.printInfo();
		
		mycha.color="노랑";
		
		mycha.printInfo();
		obbacha.printInfo();
		abbacha.printInfo();
		
		//객체의 소멸
		obbacha=null;//obbacha 갖고 있는 주소에 null로 대체한다.
		//위 시점에는 mycha라는 변수가 여전히 객체를 가리키고 있기 때문에 객체는 소멸하지 않는다
		//그러나 mycha도 끊는다면 객체가 소멸됨.
		mycha=null;
		
	}

}
