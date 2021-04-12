package day0318Ex2;

public class FifaOlineTest {

	public static void main(String[] args) {
		Game g=new Game();
		g.setFifa(new RealMadrid("레알마드리드", "안정환", "호날두", new OutsideShoot(), new SlidingTackle()));
		g.playGame();
		
		System.out.println();
		
		Game g1=new Game();
		g1.setFifa(new Barcelona("바르셀로나", "이천수", "메시", new CurbShoot(), new StandTackle()));
		g1.playGame();
		
		System.out.println();
		
		Game g2=new Game();
		g2.setFifa(new Chelsea("첼시", "황선홍", "지루", new HeadingShoot(), new BodyCheck()));
		g2.playGame();
	}

}
