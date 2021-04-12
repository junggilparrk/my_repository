package day0318Ex;

public class GameControler {
	private LolInterface l;
	
	public GameControler(LolInterface l) {
		this.l=l;
	}
	
	public void playGame() {
		l.go();
		l.back();
		l.turnLeft();
		l.turnRight();
		l.skillQ();
		l.skillW();
		l.skillE();
		l.skillR();
		
	}
	public void stopGame() {
		l.turnOff();
	}
}
