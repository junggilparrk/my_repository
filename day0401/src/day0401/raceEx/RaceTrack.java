package day0401.raceEx;

public class RaceTrack {
	public static void main(String[] args) {
		//스레드를 이용하여 간단한 경마 게임을 만들어 보세요.
		//Horse 클래스를 스레드로 만들어
		//각 객체는 랜덤시간동안 슬립을 하도록 구현.
		//필드에 name을 갖도록 함.
		//5개의 horse 객체를 만들어 start()를 호출하면
		//랜덤한 시간동안 대기 000+도착!을 출력하도록 함.
		
		Thread[] h=new Thread[5];
		
		h[0]=new Horse("적토마");
		h[1]=new Horse("야생마");
		h[2]=new Horse("썬더볼트");
		h[3]=new Horse("백마");
		h[4]=new Horse("흑마");
		
	
		h[0].start();
		h[1].start();
		h[2].start();
		h[3].start();
		h[4].start();
		
		
		for(int i=1;i<6;i++) {
			(new Thread(new Horse(i+"번마"))).start();
		}
		
	}
}
