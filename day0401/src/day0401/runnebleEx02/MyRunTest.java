package day0401.runnebleEx02;

public class MyRunTest {
	public static void main(String[] args) {
		MyRunnable myT1=new MyCount();// myRunnable Type에 Mycount를 상속 했으므로 생성 가능
		MyThread t1= new MyThread(myT1);
		
		t1.start();
	}
}
