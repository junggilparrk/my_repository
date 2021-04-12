package day0319Ex;

public class Phone {
	private String name;
	private int price;
	
	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
