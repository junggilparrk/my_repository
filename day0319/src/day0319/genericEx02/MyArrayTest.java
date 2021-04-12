package day0319.genericEx02;

public class MyArrayTest {
	public static void main(String[] args) {
		MyArray<Car> myCars=new MyArray<>();
		Car c1=new Car("아반떼",20000000);
		Car c2=new Car("아이오닉",45000000);
		Car c3=new Car("벤츠s",5000000);
		myCars.add(c1, 0);
		myCars.add(c2, 5);
		myCars.add(c3,10);
		
		
		
	}
}
