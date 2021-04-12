package robot02;

public class Game {
	private Robot robot;
	
	
	public Game(Robot robot) {//다형성을 이용함(유지보수가 좋아짐)//태권브이//트랜스포머//건담
		this.robot=robot;
	}
	public void playGame() {
		robot.fight();
	}
}
