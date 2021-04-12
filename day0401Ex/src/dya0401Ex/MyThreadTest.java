package dya0401Ex;

import java.util.TreeSet;

public class MyThreadTest {
	public static void main(String[] args) {
		Thread t=new MyThread("초");
		Thread t1=new MyThread2("초");
		
		t.start();
		t1.start();
		t1.run();
	}
}
