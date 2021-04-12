package day0401.threadEx01;

public class MyRunnableTest {
	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable("안녕하세요");
		Thread th=new Thread(mr);
		 
		
		th.start();
	}
}
