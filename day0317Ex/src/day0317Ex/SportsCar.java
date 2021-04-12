package day0317Ex;

public class SportsCar extends Car {
	private String maxSpeed;
	
	public SportsCar(String brand,String name,String price,String maxSpeed) {
		this.brand=brand;
		this.name=name;
		this.price=price;
		this.maxSpeed=maxSpeed;
	}
	
	public String getMaxSpeed() {
		return maxSpeed;
	}
	
	@Override
	public void go() {
		System.out.println(name+"가 "+maxSpeed+"로 시끄럽게 주행한다");
		
	}

	public String getInfo() {
		return "브랜드:"+brand+",이름:"+name+",가격:"+price+",최대속력"+maxSpeed;
	
	}

	
	 
}
