package day0317Ex;

public abstract class Car {
	public String name;
	public String brand;
	public String price;
	
	
	public String getName() {
		return name;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getPrice() {
		return price;
	}
	
	

	public abstract void go();
}
