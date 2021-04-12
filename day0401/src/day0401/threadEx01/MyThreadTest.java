package day0401.threadEx01;

import java.util.TreeSet;

public class MyThreadTest {
	public static void main(String[] args) {
		Thread t=new MyThread("초");
		
		//start()를 호출 하면  스레드가 하나 생겨서 run()을 실행 한다.
		
		t.start();
		System.out.println("초 종료!");
		
		Thread t2= new MyThread("땡");
		t2.start();
		System.out.println("땡 종료!");
	}
}
