package day0317Ex;

public class Suv extends Car {
	public String seater;
	
	public Suv(String brand,String name,String price,String seater) {
		this.brand=brand;
		this.name=name;
		this.price=price;
		this.seater=seater;
	}
	

	@Override
	public void go() {
		System.out.println(name+"가 안정적이게 출발한다");
		
	}
	public String getInfo() {
		return "브랜드:"+brand+",이름:"+name+",가격:"+price+","+seater;
	}
	public void stop() {
		System.out.println(name+"가 안정적이게 멈춘다");
	}
	

}
