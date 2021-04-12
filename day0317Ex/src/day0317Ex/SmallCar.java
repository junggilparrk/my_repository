package day0317Ex;

public class SmallCar extends Car {
	public String weight;
	
	public SmallCar(String brand,String name,String price,String weight) {
		this.brand=brand;
		this.name=name;
		this.price=price;
		this.weight=weight;
	}

	
	@Override
	public void go() {
		System.out.println(name+"가 부웅하고 출발한다");
		
	}
	public String getInfo() {
		return "브랜드:"+brand+",이름:"+name+",가격:"+price+",차 중량:"+weight;
	}
	
	public String getWeigt() {
		return weight;
	}
	
	

}
