package day0312.inheritance.ex02;

public class Muchine {
	String brand;
	String name;
	String price;
	
	
	
	
	String printInfo() {
	return "브랜드:"+brand+", 이름:"+name+", 가격 :"+price+"원";
	}
	void printinfo(String brand,String name,String price) {
		System.out.println("브랜드:"+brand+", 이름:"+name+", 가격 :"+price+"원");
	}
}
