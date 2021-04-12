package day0318.robbot3;

public class Game {
	private Robot robot;
	
	public void setRobot(Robot robot) {
		this.robot=robot;
	}
	//결합도가 낮아지고 응집도가 높아진다.
	
	public void playGame() {
		robot.fight();
	}
}
 