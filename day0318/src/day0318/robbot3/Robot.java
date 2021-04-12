package day0318.robbot3;

public class Robot {
	private String name;
	Attackable attack;
	Movavle move;
	
	
	public Robot(String name) {
		this.name=name;
	}
	
	public void fight() {
		System.out.println(name+"이 전투를 시작합니다.");
		attack();
		move();
		attack();
		System.out.println(name+ "이 전투를 종료합니다.");
	}
	public void attack(){
		attack.attack();
	}
	
	public void move() {
		move.move();
	}
}
