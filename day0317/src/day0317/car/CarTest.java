package day0317.car;

public class CarTest {

	public static void main(String[] args) {
		Car[] c=new Car[2];
		c[0]=new Car1("아반뗴");
		c[1]=new Car2("포르쉐");
		
		for(Car s:c) {
			s.run();
			System.out.println();
		}
		CarRun c1=new CarRun(c[0]);
		
		System.out.println();
		
		CarRun c2=new CarRun(c[1]);
	}

}
 