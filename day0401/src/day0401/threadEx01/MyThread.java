package day0401.threadEx01;

public class MyThread extends Thread{

	private String str; //필드, 멤버변수

	//생성자
	public MyThread(String str) {
		this.str=str;
	}
	
	//병렬 처리를 위해서는 구현해야하는 메서드
	//run을 재정의(override) 해야한다. 이게 실행되면 하나의 스레드가 더 생겨서 실행한다.
	
	@Override
	public void run() {
		//1~9까지 1초씩 카운트
		for(int i=1; i<10; i++) {
			System.out.println(i+str);
			try {
				sleep(1000);//상속 받았기 떄문에 그냥 sleep을 쓸수 있음
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
	}
	
}
  