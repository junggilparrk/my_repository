package day0318Ex;

public class Garen implements LolInterface{
	private String name;
	
	public Garen(String name) {
		this.name=name;
	}

	@Override
	public void go() {
		System.out.println(name+"이 데마시아를 외치며 앞으로 이동합니다.");
		
	}

	@Override
	public void back() {
		System.out.println(name+"이 뒤로 이동합니다.");
		
	}

	@Override
	public void turnLeft() {
		System.out.println(name+"이 왼쪽으로 이동합니다.");
		
	}

	@Override
	public void turnRight() {
		System.out.println(name+"이 오른쪽으로 이동합니다.");
		
	}

	@Override
	public void skillQ() {
		System.out.println(name+"이 내려찍기 스킬을 발동합니다.");
		
	}

	@Override
	public void skillW() {
		System.out.println(name+"이 횡베기 스킬을 발동합니다.");
		
	}

	@Override
	public void skillE() {
		System.out.println(name+"이 방어 스킬울 발동합니다.");
		
	}

	@Override
	public void skillR() {
		System.out.println(name+"이 데마시아 궁극기 스킬을 발동합니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("게임을 종료합니다.");
		
	}

}
