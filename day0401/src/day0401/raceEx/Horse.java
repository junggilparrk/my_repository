package day0401.raceEx;

public class Horse extends Thread{
	private String name;
	
	public Horse(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		int s= (int)(Math.random()*10);
			try {
				sleep(s*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(name+"가 도착하였습니다.");
	}
}
