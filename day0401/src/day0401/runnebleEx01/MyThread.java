package day0401.runnebleEx01;

public class MyThread extends Perent implements Runnable{

	
	public MyThread(String name){
		super(name);
	}
	  
	
	
	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i+name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
}
