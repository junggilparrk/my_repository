package day0401.threadEx01;

public class MyRunnable extends Parents implements Runnable {

	
	public MyRunnable(String name) {
		super(name);
		
	}

	@Override
	public void run() {
		for(int i=0; i<10;i++) {
		System.out.println(name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	
}
 