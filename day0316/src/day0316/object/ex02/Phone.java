package day0316.object.ex02;

public class Phone {
	private String brand;
	private int price;
	
	//생성자
	public Phone(String brand,int price) {
		this.brand=brand;
		this.price=price;
	}
	
	//필드값 brand를 반환하는 메서드
	public String getBrand() {
		return brand;
	}
	
	//필드값 price를 반환하는 메서드
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		String str="브랜드:"+brand+", 가격: "+price;
		return str;
	}
	
}
