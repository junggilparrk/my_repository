package day0316.object.ex03.ex02;

public class Phone {
	private String brand;
	private int price;
	private String name;
	
	
	public Phone(String brand,int price,String name) {
		this.brand=brand;
		this.price=price;
		this.name=name;
	}
	
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	

}
