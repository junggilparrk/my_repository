package day0401.runnebleEx01;

public class MyThreadTest {
	public static void main(String[] args) {
		
		Runnable myT1=new MyThread("초");
		
		Thread t1= new Thread(myT1);
		
		t1.start();
	}
}
