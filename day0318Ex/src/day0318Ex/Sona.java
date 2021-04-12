package day0318Ex;

public class Sona implements LolInterface{
	private String name;
	
	public Sona(String name) {
		this.name=name;
	}
	
	@Override
	public void go() {
		System.out.println(name+"이 차라랑 소리와 함꼐 앞으로 이동합니다.");
		
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
		System.out.println(name+"이 차라랑 소리와 함꼐 파워 코드 스킬 발동합니다.");
		
	}

	@Override
	public void skillW() {
		System.out.println(name+"이 동료 및 자신에게 힐 스킬 발동합니다.");
		
	}

	@Override
	public void skillE() {
		System.out.println(name+"이 동료 및 자신에게 이속 증가 스킬 발동합니다.");
		
	}

	@Override
	public void skillR() {
		System.out.println(name+"이 궁극기 스킬을 발동합니다.");
		
	}
	@Override
	public void turnOff() {
		System.out.println("게임을 종료합니다.");
		
	}


}
