package day0312.inheritance.ex02;

public class Phone extends Muchine{
	String storage;
	
	void call() {
		System.out.println("전화를 걸다");
	}
	
	@Override
	String printInfo() {
		String p=super.printInfo();
		p=p+", 용량:"+storage;
		return p;
	}
	@Override
	void printinfo(String brand, String name, String price) {
		System.out.println("브랜드:"+brand+", 이름:"+name+", 가격 :"+price+"원"+", 용량:"+storage);	
	}
	}
	
	

