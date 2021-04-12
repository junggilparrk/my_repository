package day0318Ex2;

public abstract class FifaOnline {

		protected String name;
		protected String player;
		protected String character;
		Shooter shoot;
		Defender defend;
		
		

		
		public FifaOnline(String name,String player,String character,Shooter shoot,Defender defend) {
			this.name=name;
			this.player=player;
			this.character=character;
			this.shoot=shoot;
			this.defend=defend;
					
		}
		
		public void gameStart() {
			System.out.println("피파온라인을 시작합니다.");
			shoot();
			defend();
			shoot();
			defend();
			System.out.println("피파온라인을 종료합니다.");
			
		}
		
		public void shoot() {
			shoot.shoot();
		}
		
		public void defend() {
			defend.defend();
		}
		
	
}
//처음에 그냥 짠 소스를 다시 잘 만드는 방법을 리팩토링