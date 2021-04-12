package day0318.robbot3;

public class GameTest {
	public static void main(String[] args) {
		Game gm=new Game();
		
		gm.setRobot(new TaekwonV("태권브이",new PunchAttack(),new FlyingMove()));
		gm.playGame();
		System.out.println();
		gm.setRobot(new Transformer("트랜스포머",new MissileAttack(),new WalkingMove()));
		gm.playGame();
		System.out.println();
		gm.setRobot(new Gundam("건담", new MissileAttack(), new FlyingMove()));
		
	}
}
  