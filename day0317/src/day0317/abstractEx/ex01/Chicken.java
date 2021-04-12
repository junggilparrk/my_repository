package day0317.abstractEx.ex01;

public class Chicken extends Animal {

	public Chicken() {
		name="깐부";
	}
	
	
	@Override
	public void bark() {
		System.out.println(name+"가 웁니다. 꼬꼬");
		
	}
	public boolean isFried() {
		return false;
	}

}
