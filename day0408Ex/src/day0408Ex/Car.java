package day0408Ex;

import java.io.Serializable;

public class Car implements Serializable {
	
	private static final long serialVersionUID = -1615424197005936150L;
	private String Type;
	private int maxSpeed;
	private int price;
	
	public Car(String type, int maxSpeed, int price) {
		super();
		Type = type;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
