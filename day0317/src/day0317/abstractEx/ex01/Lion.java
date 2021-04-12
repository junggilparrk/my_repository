package day0317.abstractEx.ex01;

public class Lion extends Animal{
	//abstract 클래스를 상속받으면 빨간색 줄이 나옴.
	//추상 클래스를 상속 받은 클래스는 반드시 추상 메서드를 구현해야한다.
	//또 자기자신이 추상 클래스가 되면된다.
	
	public void setName(String name) {
		this.name=name;
	}
	
	@Override
	public void bark() {
		System.out.println("어흥!!");
	}

}
