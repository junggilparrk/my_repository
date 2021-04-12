package day0322.setEx01;

import java.util.HashSet;
import java.util.Set;

public class CarSetTest {
	public static void main(String[] args) {
		
		
		Set<Car> carSet=new HashSet<Car>();
		carSet.add(new Car("영선카",100));
		carSet.add(new Car("진출카",90));
		carSet.add(new Car("명주카",80));
		
		System.out.println("추가전:"+carSet);
		carSet.add(new Car("영선카",100));
		System.out.println("추가후:"+carSet);
		//Set이라는 아이는 중복을 equals();메서드로 비교;
		Car c= new Car("의진",100);
		Car c1= new Car("의진",100);
		c.equals(c1);
		System.out.println(c);
		System.out.println(c1);
		if(c==c1) {
			System.out.println("두객체는 같다");
		}//주소 값을 비교
		String str1=new String("하이");
		String str2=new String("하이");
		if(str1==str2) {
			System.out.println("참인가?");
		}
		if(str1.equals(str2)) {
			System.out.println("참인가?");
		}
	}
}
