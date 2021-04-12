package robot02;

public class RobotTest {
	public static void main(String[] args) {
		/*
		 * //a //TeakwonV t=new TeakwonV(); Robot t=new TeakwonV(); t.fight();
		 * 
		 * System.out.println();
		 * 
		 * //b //Transformer tr=new Transformer(); Robot tr=new Transformer();
		 * tr.fight();
		 * 
		 * System.out.println();
		 * 
		 * //c //Gundam r=new Gundam(); Robot r=new Gundam(); r.fight();
		 */
	Game game=new Game(new TeakwonV());
	game.playGame();
	
	}
}
