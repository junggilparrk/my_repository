package day0318Ex;

public class LolTest {
	public static void main(String[] args) {
		Garen g=new Garen("가렌");
		Sona s=new Sona("소나");
		
		GameControler i=new GameControler(g);
		i.playGame();
		i.stopGame();
		
		System.out.println();
		
		GameControler i1=new GameControler(s);
		i1.playGame();
		i.stopGame();
		
		
	}

}
