package dya0401Ex;

public class MyThread2 extends Thread{
	
	private String str; //필드, 멤버변수

	
	public MyThread2(String str) {
		this.str=str;
	}
	

	
	@Override
	public void run() {
		for(int i=1; i<11; i++) {
			System.out.println(i+str);
			try {
				sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
	}
	
	
	
		
}
