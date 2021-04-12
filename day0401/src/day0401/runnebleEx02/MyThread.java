package day0401.runnebleEx02;

public class MyThread {
	private MyRunnable r;//인터페이스 마이 러너블을 쓸꺼다 러너블 안에는 run()메소드가 있고 메소든 Mycount에 상속 되어 있다 
	
	public MyThread(MyRunnable r) {
		this.r=r;
	}
	
	public void start() {
		r.run();
	}
}
